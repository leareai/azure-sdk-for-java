// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.DiagnosticsPackageInner;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsPackageListResult;
import java.util.Arrays;

public final class DiagnosticsPackageListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsPackageListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"status\":\"NotStarted\",\"reason\":\"bkbfkgukdkex\"},\"id\":\"pofm\",\"name\":\"axcfjpgddtocjjx\",\"type\":\"vpmouexhdzxib\"},{\"properties\":{\"provisioningState\":\"Deleting\",\"status\":\"Collected\",\"reason\":\"qbzvddntwnd\"},\"id\":\"cbtwnpzaoqvuh\",\"name\":\"hcffcyddglmjthjq\",\"type\":\"wpyeicxmqciwqvh\"}],\"nextLink\":\"ixuigdtopbobj\"}")
                .toObject(DiagnosticsPackageListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsPackageListResult model =
            new DiagnosticsPackageListResult()
                .withValue(Arrays.asList(new DiagnosticsPackageInner(), new DiagnosticsPackageInner()));
        model = BinaryData.fromObject(model).toObject(DiagnosticsPackageListResult.class);
    }
}
