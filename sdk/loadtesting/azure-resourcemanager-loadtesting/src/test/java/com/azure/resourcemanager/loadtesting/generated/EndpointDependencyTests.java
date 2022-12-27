// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loadtesting.models.EndpointDependency;
import org.junit.jupiter.api.Test;

public final class EndpointDependencyTests {
    @Test
    public void testDeserialize() throws Exception {
        EndpointDependency model =
            BinaryData
                .fromString(
                    "{\"domainName\":\"swjdkirso\",\"description\":\"qxhcrmn\",\"endpointDetails\":[{\"port\":1543175438},{\"port\":683362936},{\"port\":442113246}]}")
                .toObject(EndpointDependency.class);
    }

    @Test
    public void testSerialize() throws Exception {
        EndpointDependency model = new EndpointDependency();
        model = BinaryData.fromObject(model).toObject(EndpointDependency.class);
    }
}
