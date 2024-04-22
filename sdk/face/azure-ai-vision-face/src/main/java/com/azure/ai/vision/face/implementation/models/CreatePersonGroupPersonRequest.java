// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The CreatePersonGroupPersonRequest model.
 */
@Fluent
public final class CreatePersonGroupPersonRequest implements JsonSerializable<CreatePersonGroupPersonRequest> {
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
     * Creates an instance of CreatePersonGroupPersonRequest class.
     * 
     * @param name the name value to set.
     */
    @Generated
    public CreatePersonGroupPersonRequest(String name) {
        this.name = name;
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
     * Set the userData property: Optional user defined data. Length should not exceed 16K.
     * 
     * @param userData the userData value to set.
     * @return the CreatePersonGroupPersonRequest object itself.
     */
    @Generated
    public CreatePersonGroupPersonRequest setUserData(String userData) {
        this.userData = userData;
        return this;
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
     * Reads an instance of CreatePersonGroupPersonRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreatePersonGroupPersonRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreatePersonGroupPersonRequest.
     */
    @Generated
    public static CreatePersonGroupPersonRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            String userData = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("userData".equals(fieldName)) {
                    userData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            CreatePersonGroupPersonRequest deserializedCreatePersonGroupPersonRequest
                = new CreatePersonGroupPersonRequest(name);
            deserializedCreatePersonGroupPersonRequest.userData = userData;

            return deserializedCreatePersonGroupPersonRequest;
        });
    }
}
