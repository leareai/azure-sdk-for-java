// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for CodeContainers Delete. */
public final class CodeContainersDeleteSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/CodeContainer/delete.json
     */
    /**
     * Sample code: Delete Code Container.
     *
     * @param manager Entry point to MachineLearningServicesManager.
     */
    public static void deleteCodeContainer(
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager) {
        manager.codeContainers().deleteWithResponse("testrg123", "testworkspace", "testContainer", Context.NONE);
    }
}
