package com.azure.ai.vision.face;

import com.azure.core.http.rest.RequestOptions;

class ClientUtils {
    public static void AddRequireQueryParameters(RequestOptions requestOptions, String parameterName, Object paramterObject) {
        if (paramterObject == null) {
            throw new NullPointerException("Query Parameter '"+parameterName+"' is null");
        }

        requestOptions.addQueryParam(parameterName, paramterObject.toString());
    }
}
