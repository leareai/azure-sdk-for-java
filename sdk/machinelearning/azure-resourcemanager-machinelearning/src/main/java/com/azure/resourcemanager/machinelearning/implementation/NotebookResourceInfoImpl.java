// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.NotebookResourceInfoInner;
import com.azure.resourcemanager.machinelearning.models.NotebookPreparationError;
import com.azure.resourcemanager.machinelearning.models.NotebookResourceInfo;

public final class NotebookResourceInfoImpl implements NotebookResourceInfo {
    private NotebookResourceInfoInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager;

    NotebookResourceInfoImpl(
        NotebookResourceInfoInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public NotebookPreparationError notebookPreparationError() {
        return this.innerModel().notebookPreparationError();
    }

    public NotebookResourceInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
