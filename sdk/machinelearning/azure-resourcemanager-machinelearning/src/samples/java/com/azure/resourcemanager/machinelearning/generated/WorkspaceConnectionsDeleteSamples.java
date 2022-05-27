// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for WorkspaceConnections Delete. */
public final class WorkspaceConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/WorkspaceConnection/delete.json
     */
    /**
     * Sample code: DeleteWorkspaceConnection.
     *
     * @param manager Entry point to MachineLearningServicesManager.
     */
    public static void deleteWorkspaceConnection(
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager) {
        manager
            .workspaceConnections()
            .deleteWithResponse("resourceGroup-1", "workspace-1", "connection-1", Context.NONE);
    }
}
