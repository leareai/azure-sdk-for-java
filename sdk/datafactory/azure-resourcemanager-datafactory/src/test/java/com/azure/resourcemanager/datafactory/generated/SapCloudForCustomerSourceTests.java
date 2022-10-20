// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSource;
import org.junit.jupiter.api.Test;

public final class SapCloudForCustomerSourceTests {
    @Test
    public void testDeserialize() {
        SapCloudForCustomerSource model =
            BinaryData
                .fromString("{\"type\":\"SapCloudForCustomerSource\",\"\":{}}")
                .toObject(SapCloudForCustomerSource.class);
    }

    @Test
    public void testSerialize() {
        SapCloudForCustomerSource model = new SapCloudForCustomerSource();
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerSource.class);
    }
}