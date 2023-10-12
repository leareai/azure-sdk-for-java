// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.models.BackupStatusRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataSourceType;

/** Samples for BackupStatus Get. */
public final class BackupStatusGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-04-01/examples/AzureIaasVm/GetBackupStatus.json
     */
    /**
     * Sample code: Get Azure Virtual Machine Backup Status.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getAzureVirtualMachineBackupStatus(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupStatus()
            .getWithResponse(
                "southeastasia",
                new BackupStatusRequest()
                    .withResourceType(DataSourceType.VM)
                    .withResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Compute/VirtualMachines/testVm"),
                com.azure.core.util.Context.NONE);
    }
}
