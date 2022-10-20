// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TypeConversionSettings;
import org.junit.jupiter.api.Test;

public final class TypeConversionSettingsTests {
    @Test
    public void testDeserialize() {
        TypeConversionSettings model = BinaryData.fromString("{}").toObject(TypeConversionSettings.class);
    }

    @Test
    public void testSerialize() {
        TypeConversionSettings model = new TypeConversionSettings();
        model = BinaryData.fromObject(model).toObject(TypeConversionSettings.class);
    }
}