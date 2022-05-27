// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Workspaces ListByResourceGroup. */
public final class WorkspacesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Workspace/listByResourceGroup.json
     */
    /**
     * Sample code: Get Workspaces by Resource Group.
     *
     * @param manager Entry point to MachineLearningServicesManager.
     */
    public static void getWorkspacesByResourceGroup(
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager) {
        manager.workspaces().listByResourceGroup("workspace-1234", null, Context.NONE);
    }
}
