// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/** Samples for BackupResourceStorageConfigsNonCrr Get. */
public final class BackupResourceStorageConfigsNonCrrGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-04-01/examples/Common/BackupStorageConfig_Get.json
     */
    /**
     * Sample code: Get Vault Storage Configuration.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getVaultStorageConfiguration(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupResourceStorageConfigsNonCrrs()
            .getWithResponse("PySDKBackupTestRsVault", "PythonSDKBackupTestRg", com.azure.core.util.Context.NONE);
    }
}
