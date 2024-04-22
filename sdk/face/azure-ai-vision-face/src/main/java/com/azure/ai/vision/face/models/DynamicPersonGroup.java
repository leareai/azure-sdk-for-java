// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A container that references Person Directory "Create Person".
 */
@Immutable
public final class DynamicPersonGroup implements JsonSerializable<DynamicPersonGroup> {
    /*
     * ID of the dynamic person group.
     */
    @Generated
    private String dynamicPersonGroupId;

    /*
     * User defined name, maximum length is 128.
     */
    @Generated
    private final String name;

    /*
     * Optional user defined data. Length should not exceed 16K.
     */
    @Generated
    private String userData;

    /**
     * Creates an instance of DynamicPersonGroup class.
     * 
     * @param name the name value to set.
     */
    @Generated
    private DynamicPersonGroup(String name) {
        this.name = name;
    }

    /**
     * Get the dynamicPersonGroupId property: ID of the dynamic person group.
     * 
     * @return the dynamicPersonGroupId value.
     */
    @Generated
    public String getDynamicPersonGroupId() {
        return this.dynamicPersonGroupId;
    }

    /**
     * Get the name property: User defined name, maximum length is 128.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the userData property: Optional user defined data. Length should not exceed 16K.
     * 
     * @return the userData value.
     */
    @Generated
    public String getUserData() {
        return this.userData;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("userData", this.userData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DynamicPersonGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DynamicPersonGroup if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DynamicPersonGroup.
     */
    @Generated
    public static DynamicPersonGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String dynamicPersonGroupId = null;
            String name = null;
            String userData = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dynamicPersonGroupId".equals(fieldName)) {
                    dynamicPersonGroupId = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("userData".equals(fieldName)) {
                    userData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            DynamicPersonGroup deserializedDynamicPersonGroup = new DynamicPersonGroup(name);
            deserializedDynamicPersonGroup.dynamicPersonGroupId = dynamicPersonGroupId;
            deserializedDynamicPersonGroup.userData = userData;

            return deserializedDynamicPersonGroup;
        });
    }
}
