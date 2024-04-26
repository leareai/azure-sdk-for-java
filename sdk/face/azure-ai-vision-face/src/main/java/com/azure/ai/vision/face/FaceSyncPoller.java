package com.azure.ai.vision.face;


import com.azure.ai.vision.face.models.FaceOperationState;
import com.azure.ai.vision.face.models.FaceOperationStatus;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollingContext;

class FaceSyncPoller {
    public static <TActivationResponse, TActivationResult> SyncPollerContainer<TActivationResult, FaceOperationStatus, Void> beginOperation(
        RequestOptions requestOptions,
        HttpPipeline httpPipeline,
        Response<TActivationResponse> activationResponse,
        TActivationResult activationResult) {
        return SyncPollerOperation.beginOperation(
            requestOptions,
            httpPipeline,
            FaceOperationStatus.class,
            activationResponse,
            activationResult,
            FaceSyncPoller::toLongRunningOperationStatus,
            FaceSyncPoller::FetchNullResult);
    }

    private static LongRunningOperationStatus toLongRunningOperationStatus(FaceOperationStatus operationStatus) {
        FaceOperationState status = operationStatus.getStatus();
        if (FaceOperationState.RUNNING == status) {
            return  LongRunningOperationStatus.IN_PROGRESS;
        } else if (FaceOperationState.SUCCEEDED  == status) {
            return  LongRunningOperationStatus.SUCCESSFULLY_COMPLETED;
        }

        throw new IllegalStateException("status: " + status);
    }

    private static <T, U> U FetchNullResult(PollingContext<T> pollingContext) {
        return null;
    }
}
