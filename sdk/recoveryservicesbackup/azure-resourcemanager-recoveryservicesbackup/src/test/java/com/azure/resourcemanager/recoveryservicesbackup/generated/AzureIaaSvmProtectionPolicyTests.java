// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasvmPolicyType;
import com.azure.resourcemanager.recoveryservicesbackup.models.InstantRPAdditionalDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSvmProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSvmProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"backupManagementType\":\"AzureIaasVM\",\"instantRPDetails\":{\"azureBackupRGNamePrefix\":\"hjoxo\",\"azureBackupRGNameSuffix\":\"msksbp\"},\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"tieringPolicy\":{\"xxlxsffgcvizq\":{\"tieringMode\":\"TierAfter\",\"duration\":1488909990,\"durationType\":\"Years\"},\"youpfgfbkj\":{\"tieringMode\":\"TierAfter\",\"duration\":1803667290,\"durationType\":\"Days\"}},\"instantRpRetentionRangeInDays\":660829030,\"timeZone\":\"hgkfmin\",\"policyType\":\"V1\",\"protectedItemsCount\":1272513184,\"resourceGuardOperationRequests\":[\"tsttktlahbq\",\"ctxtgzukxi\",\"mmqtgqqqxhr\",\"xrxc\"]}")
                .toObject(AzureIaaSvmProtectionPolicy.class);
        Assertions.assertEquals(1272513184, model.protectedItemsCount());
        Assertions.assertEquals("tsttktlahbq", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("hjoxo", model.instantRPDetails().azureBackupRGNamePrefix());
        Assertions.assertEquals("msksbp", model.instantRPDetails().azureBackupRGNameSuffix());
        Assertions.assertEquals(TieringMode.TIER_AFTER, model.tieringPolicy().get("xxlxsffgcvizq").tieringMode());
        Assertions.assertEquals(1488909990, model.tieringPolicy().get("xxlxsffgcvizq").duration());
        Assertions.assertEquals(RetentionDurationType.YEARS, model.tieringPolicy().get("xxlxsffgcvizq").durationType());
        Assertions.assertEquals(660829030, model.instantRpRetentionRangeInDays());
        Assertions.assertEquals("hgkfmin", model.timeZone());
        Assertions.assertEquals(IaasvmPolicyType.V1, model.policyType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSvmProtectionPolicy model =
            new AzureIaaSvmProtectionPolicy()
                .withProtectedItemsCount(1272513184)
                .withResourceGuardOperationRequests(Arrays.asList("tsttktlahbq", "ctxtgzukxi", "mmqtgqqqxhr", "xrxc"))
                .withInstantRPDetails(
                    new InstantRPAdditionalDetails()
                        .withAzureBackupRGNamePrefix("hjoxo")
                        .withAzureBackupRGNameSuffix("msksbp"))
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy())
                .withTieringPolicy(
                    mapOf(
                        "xxlxsffgcvizq",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.TIER_AFTER)
                            .withDuration(1488909990)
                            .withDurationType(RetentionDurationType.YEARS),
                        "youpfgfbkj",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.TIER_AFTER)
                            .withDuration(1803667290)
                            .withDurationType(RetentionDurationType.DAYS)))
                .withInstantRpRetentionRangeInDays(660829030)
                .withTimeZone("hgkfmin")
                .withPolicyType(IaasvmPolicyType.V1);
        model = BinaryData.fromObject(model).toObject(AzureIaaSvmProtectionPolicy.class);
        Assertions.assertEquals(1272513184, model.protectedItemsCount());
        Assertions.assertEquals("tsttktlahbq", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("hjoxo", model.instantRPDetails().azureBackupRGNamePrefix());
        Assertions.assertEquals("msksbp", model.instantRPDetails().azureBackupRGNameSuffix());
        Assertions.assertEquals(TieringMode.TIER_AFTER, model.tieringPolicy().get("xxlxsffgcvizq").tieringMode());
        Assertions.assertEquals(1488909990, model.tieringPolicy().get("xxlxsffgcvizq").duration());
        Assertions.assertEquals(RetentionDurationType.YEARS, model.tieringPolicy().get("xxlxsffgcvizq").durationType());
        Assertions.assertEquals(660829030, model.instantRpRetentionRangeInDays());
        Assertions.assertEquals("hgkfmin", model.timeZone());
        Assertions.assertEquals(IaasvmPolicyType.V1, model.policyType());
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
