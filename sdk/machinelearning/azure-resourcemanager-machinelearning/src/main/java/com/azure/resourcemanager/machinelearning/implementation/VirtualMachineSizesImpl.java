// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.VirtualMachineSizesClient;
import com.azure.resourcemanager.machinelearning.fluent.models.VirtualMachineSizeListResultInner;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSizeListResult;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSizes;

public final class VirtualMachineSizesImpl implements VirtualMachineSizes {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineSizesImpl.class);

    private final VirtualMachineSizesClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager;

    public VirtualMachineSizesImpl(
        VirtualMachineSizesClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineSizeListResult list(String location) {
        VirtualMachineSizeListResultInner inner = this.serviceClient().list(location);
        if (inner != null) {
            return new VirtualMachineSizeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineSizeListResult> listWithResponse(String location, Context context) {
        Response<VirtualMachineSizeListResultInner> inner = this.serviceClient().listWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineSizeListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VirtualMachineSizesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
