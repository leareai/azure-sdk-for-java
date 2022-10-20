// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SynapseNotebookActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import com.azure.resourcemanager.datafactory.models.NotebookReferenceType;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SynapseNotebookActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        SynapseNotebookActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"notebook\":{\"type\":\"NotebookReference\"},\"sparkPool\":{\"type\":\"BigDataPoolReference\"},\"parameters\":{\"ysvlpyeuukppd\":{\"type\":\"bool\"},\"olxvhhyqqe\":{\"type\":\"string\"},\"grznmginmtsd\":{\"type\":\"int\"}},\"numExecutors\":73247428}")
                .toObject(SynapseNotebookActivityTypeProperties.class);
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.BOOL, model.parameters().get("ysvlpyeuukppd").type());
        Assertions.assertEquals(73247428, model.numExecutors());
    }

    @Test
    public void testSerialize() {
        SynapseNotebookActivityTypeProperties model =
            new SynapseNotebookActivityTypeProperties()
                .withNotebook(new SynapseNotebookReference().withType(NotebookReferenceType.NOTEBOOK_REFERENCE))
                .withSparkPool(
                    new BigDataPoolParametrizationReference()
                        .withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE))
                .withParameters(
                    mapOf(
                        "ysvlpyeuukppd",
                        new NotebookParameter().withType(NotebookParameterType.BOOL),
                        "olxvhhyqqe",
                        new NotebookParameter().withType(NotebookParameterType.STRING),
                        "grznmginmtsd",
                        new NotebookParameter().withType(NotebookParameterType.INT)))
                .withNumExecutors(73247428);
        model = BinaryData.fromObject(model).toObject(SynapseNotebookActivityTypeProperties.class);
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.BOOL, model.parameters().get("ysvlpyeuukppd").type());
        Assertions.assertEquals(73247428, model.numExecutors());
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