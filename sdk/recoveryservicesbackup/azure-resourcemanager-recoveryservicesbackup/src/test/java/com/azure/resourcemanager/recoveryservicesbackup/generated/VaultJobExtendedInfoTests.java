// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultJobExtendedInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VaultJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaultJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"propertyBag\":{\"qtanarfdlpuk\":\"dyynfsvkhgb\",\"neizjcpe\":\"py\",\"hpfpazjzoywjxhp\":\"gkhnmgbrouxddbh\"}}")
                .toObject(VaultJobExtendedInfo.class);
        Assertions.assertEquals("dyynfsvkhgb", model.propertyBag().get("qtanarfdlpuk"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaultJobExtendedInfo model =
            new VaultJobExtendedInfo()
                .withPropertyBag(
                    mapOf("qtanarfdlpuk", "dyynfsvkhgb", "neizjcpe", "py", "hpfpazjzoywjxhp", "gkhnmgbrouxddbh"));
        model = BinaryData.fromObject(model).toObject(VaultJobExtendedInfo.class);
        Assertions.assertEquals("dyynfsvkhgb", model.propertyBag().get("qtanarfdlpuk"));
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
