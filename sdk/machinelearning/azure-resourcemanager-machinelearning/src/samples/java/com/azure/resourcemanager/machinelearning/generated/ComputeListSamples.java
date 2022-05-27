// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Compute List. */
public final class ComputeListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Compute/list.json
     */
    /**
     * Sample code: Get Computes.
     *
     * @param manager Entry point to MachineLearningServicesManager.
     */
    public static void getComputes(com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager) {
        manager.computes().list("testrg123", "workspaces123", null, Context.NONE);
    }
}
