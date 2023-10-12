// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointRehydrationInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryMapping;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSQLPointInTimeRestoreWithRehydrateRequest\",\"recoveryPointRehydrationInfo\":{\"rehydrationRetentionDuration\":\"ralcxpjbyypsj\",\"rehydrationPriority\":\"High\"},\"pointInTime\":\"2021-02-06T11:00:27Z\",\"shouldUseAlternateTargetLocation\":true,\"isNonRecoverable\":false,\"alternateDirectoryPaths\":[{\"mappingType\":\"Log\",\"sourceLogicalName\":\"qxfx\",\"sourcePath\":\"l\",\"targetPath\":\"mpzqjhhhq\"}],\"recoveryType\":\"Offline\",\"sourceResourceId\":\"vcacoyv\",\"propertyBag\":{\"zusjsz\":\"s\",\"lzijiufehgmvflnw\":\"bscm\"},\"targetInfo\":{\"overwriteOption\":\"FailOnConflict\",\"containerId\":\"rerlniy\",\"databaseName\":\"lyfwxzutg\",\"targetDirectoryForFileRestore\":\"twhghmupgxyjtc\"},\"recoveryMode\":\"FileRecovery\",\"targetVirtualMachineId\":\"bujftaben\"}")
                .toObject(AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("vcacoyv", model.sourceResourceId());
        Assertions.assertEquals("s", model.propertyBag().get("zusjsz"));
        Assertions.assertEquals(OverwriteOptions.FAIL_ON_CONFLICT, model.targetInfo().overwriteOption());
        Assertions.assertEquals("rerlniy", model.targetInfo().containerId());
        Assertions.assertEquals("lyfwxzutg", model.targetInfo().databaseName());
        Assertions.assertEquals("twhghmupgxyjtc", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("bujftaben", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(false, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("qxfx", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("l", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("mpzqjhhhq", model.alternateDirectoryPaths().get(0).targetPath());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-06T11:00:27Z"), model.pointInTime());
        Assertions.assertEquals("ralcxpjbyypsj", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest model =
            new AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest()
                .withRecoveryType(RecoveryType.OFFLINE)
                .withSourceResourceId("vcacoyv")
                .withPropertyBag(mapOf("zusjsz", "s", "lzijiufehgmvflnw", "bscm"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.FAIL_ON_CONFLICT)
                        .withContainerId("rerlniy")
                        .withDatabaseName("lyfwxzutg")
                        .withTargetDirectoryForFileRestore("twhghmupgxyjtc"))
                .withRecoveryMode(RecoveryMode.FILE_RECOVERY)
                .withTargetVirtualMachineId("bujftaben")
                .withShouldUseAlternateTargetLocation(true)
                .withIsNonRecoverable(false)
                .withAlternateDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.LOG)
                                .withSourceLogicalName("qxfx")
                                .withSourcePath("l")
                                .withTargetPath("mpzqjhhhq")))
                .withPointInTime(OffsetDateTime.parse("2021-02-06T11:00:27Z"))
                .withRecoveryPointRehydrationInfo(
                    new RecoveryPointRehydrationInfo()
                        .withRehydrationRetentionDuration("ralcxpjbyypsj")
                        .withRehydrationPriority(RehydrationPriority.HIGH));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("vcacoyv", model.sourceResourceId());
        Assertions.assertEquals("s", model.propertyBag().get("zusjsz"));
        Assertions.assertEquals(OverwriteOptions.FAIL_ON_CONFLICT, model.targetInfo().overwriteOption());
        Assertions.assertEquals("rerlniy", model.targetInfo().containerId());
        Assertions.assertEquals("lyfwxzutg", model.targetInfo().databaseName());
        Assertions.assertEquals("twhghmupgxyjtc", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("bujftaben", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(false, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("qxfx", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("l", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("mpzqjhhhq", model.alternateDirectoryPaths().get(0).targetPath());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-06T11:00:27Z"), model.pointInTime());
        Assertions.assertEquals("ralcxpjbyypsj", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
