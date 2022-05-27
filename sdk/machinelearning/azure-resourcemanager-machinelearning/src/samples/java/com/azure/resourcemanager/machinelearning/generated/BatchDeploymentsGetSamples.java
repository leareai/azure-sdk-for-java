// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for BatchDeployments Get. */
public final class BatchDeploymentsGetSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/BatchDeployment/get.json
     */
    /**
     * Sample code: Get Batch Deployment.
     *
     * @param manager Entry point to MachineLearningServicesManager.
     */
    public static void getBatchDeployment(
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager) {
        manager
            .batchDeployments()
            .getWithResponse("test-rg", "my-aml-workspace", "testEndpointName", "testDeploymentName", Context.NONE);
    }
}
