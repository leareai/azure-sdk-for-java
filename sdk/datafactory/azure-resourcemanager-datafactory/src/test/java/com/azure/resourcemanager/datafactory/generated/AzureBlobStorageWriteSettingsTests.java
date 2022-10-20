// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobStorageWriteSettings;
import org.junit.jupiter.api.Test;

public final class AzureBlobStorageWriteSettingsTests {
    @Test
    public void testDeserialize() {
        AzureBlobStorageWriteSettings model =
            BinaryData
                .fromString("{\"type\":\"AzureBlobStorageWriteSettings\",\"\":{}}")
                .toObject(AzureBlobStorageWriteSettings.class);
    }

    @Test
    public void testSerialize() {
        AzureBlobStorageWriteSettings model = new AzureBlobStorageWriteSettings();
        model = BinaryData.fromObject(model).toObject(AzureBlobStorageWriteSettings.class);
    }
}