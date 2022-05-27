// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.FlavorData;
import com.azure.resourcemanager.machinelearning.models.ModelType;
import com.azure.resourcemanager.machinelearning.models.ModelVersionDetails;
import java.util.HashMap;
import java.util.Map;

/** Samples for ModelVersions CreateOrUpdate. */
public final class ModelVersionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/ModelVersion/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Model Version.
     *
     * @param manager Entry point to MachineLearningServicesManager.
     */
    public static void createOrUpdateModelVersion(
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager) {
        manager
            .modelVersions()
            .define("string")
            .withExistingModel("test-rg", "my-aml-workspace", "string")
            .withProperties(
                new ModelVersionDetails()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withIsAnonymous(false)
                    .withFlavors(mapOf("string", new FlavorData().withData(mapOf("string", "string"))))
                    .withModelType(ModelType.CUSTOM_MODEL)
                    .withModelUri("string"))
            .create();
    }

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
