package com.azure.ai.vision.face;

import com.azure.core.http.*;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollingContext;
import com.azure.core.util.polling.SyncPoller;

import java.time.Duration;
import java.util.function.Function;

class SyncPollerOperation {
    private static final String OPERATION_LOCATION_HEADER_KEY = "operation-location";
    private static final String POLLING_LOCATION = "polling-location";

    public static <TActivationResponse, TActivationResult, TOperationStatus, TOperationResult> SyncPollerContainer<TActivationResult, TOperationStatus, TOperationResult> beginOperation(
        RequestOptions requestOptions,
        HttpPipeline httpPipeline,
        Class<TOperationStatus> clazz,
        Response<TActivationResponse> activationResponse,
        TActivationResult activationResult,
        Function<TOperationStatus, LongRunningOperationStatus> statusConverter,
        Function<PollingContext<TOperationStatus>, TOperationResult> fetchResultOperation) {

        Context context = requestOptions.getContext();
        final Context requestContext = context != null ? context : Context.NONE;
        SyncPoller<TOperationStatus, TOperationResult> syncPoller = SyncPoller.createPoller(Duration.ofSeconds(1),
            pollingContext -> GetPollingResultFromActivationResponse(pollingContext, activationResponse),
            pollingContext -> GetPollingResult(
                pollingContext, httpPipeline, requestContext, clazz, statusConverter),
            SyncPollerOperation::UnsupportCancel,
            fetchResultOperation);

        return new SyncPollerContainer<>(activationResult, syncPoller);
    }

    private static <TOperationStatus> PollResponse<TOperationStatus> GetPollingResultFromActivationResponse(
        PollingContext<TOperationStatus> pollingContext,
        Response<?> activationResponse) {
        String operationLocation = activationResponse.getHeaders().getValue(HttpHeaderName.fromString(OPERATION_LOCATION_HEADER_KEY));
        pollingContext.setData(POLLING_LOCATION, operationLocation);
        return new PollResponse<>(LongRunningOperationStatus.IN_PROGRESS, null);
    }

    private static <TOperationStatus> PollResponse<TOperationStatus> GetPollingResult(
        PollingContext<TOperationStatus> pollingContext,
        HttpPipeline httpPipeline,
        Context requestContext,
        Class<TOperationStatus> clazz,
        Function<TOperationStatus, LongRunningOperationStatus> statusConverter) {
        String operationLocation = pollingContext.getData(POLLING_LOCATION);
        HttpRequest pollingRequest = new HttpRequest(HttpMethod.GET, operationLocation);
        TOperationStatus operationStatus;
        try (HttpResponse pollingResponse = httpPipeline.sendSync(pollingRequest, requestContext)) {
            BinaryData responseBody = pollingResponse.getBodyAsBinaryData();
            operationStatus = responseBody.toObject(clazz);

            String newOperationLocation = pollingResponse.getHeaders().getValue(HttpHeaderName.fromString(OPERATION_LOCATION_HEADER_KEY));
            if (newOperationLocation != null) {
                pollingContext.setData(POLLING_LOCATION, operationLocation);
            }
        }

        LongRunningOperationStatus longRunningOperationStatus = statusConverter.apply(operationStatus);
        return new PollResponse<>(
            longRunningOperationStatus,
            operationStatus);
    }

    private static <TOperationStatus> TOperationStatus UnsupportCancel(PollingContext<TOperationStatus> pollingContext, PollResponse<TOperationStatus> pollResponse) {
        return pollResponse.getValue();
    }
}

