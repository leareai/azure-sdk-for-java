// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AvroWriteSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AvroWriteSettingsTests {
    @Test
    public void testDeserialize() {
        AvroWriteSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AvroWriteSettings\",\"recordName\":\"xjsgbi\",\"recordNamespace\":\"ukdveksbuhoduc\",\"\":{}}")
                .toObject(AvroWriteSettings.class);
        Assertions.assertEquals("xjsgbi", model.recordName());
        Assertions.assertEquals("ukdveksbuhoduc", model.recordNamespace());
    }

    @Test
    public void testSerialize() {
        AvroWriteSettings model =
            new AvroWriteSettings().withRecordName("xjsgbi").withRecordNamespace("ukdveksbuhoduc");
        model = BinaryData.fromObject(model).toObject(AvroWriteSettings.class);
        Assertions.assertEquals("xjsgbi", model.recordName());
        Assertions.assertEquals("ukdveksbuhoduc", model.recordNamespace());
    }
}