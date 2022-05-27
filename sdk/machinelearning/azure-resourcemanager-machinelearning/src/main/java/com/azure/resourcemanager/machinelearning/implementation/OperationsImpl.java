// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.OperationsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.AmlOperationInner;
import com.azure.resourcemanager.machinelearning.models.AmlOperation;
import com.azure.resourcemanager.machinelearning.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AmlOperation> list() {
        PagedIterable<AmlOperationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AmlOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<AmlOperation> list(Context context) {
        PagedIterable<AmlOperationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AmlOperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
