// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The GroupRequest model.
 */
@Immutable
public final class GroupRequest implements JsonSerializable<GroupRequest> {
    /*
     * Array of candidate faceIds created by "Detect". The maximum is 1000 faces.
     */
    @Generated
    private final List<String> faceIds;

    /**
     * Creates an instance of GroupRequest class.
     * 
     * @param faceIds the faceIds value to set.
     */
    @Generated
    public GroupRequest(List<String> faceIds) {
        this.faceIds = faceIds;
    }

    /**
     * Get the faceIds property: Array of candidate faceIds created by "Detect". The maximum is 1000 faces.
     * 
     * @return the faceIds value.
     */
    @Generated
    public List<String> getFaceIds() {
        return this.faceIds;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("faceIds", this.faceIds, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GroupRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GroupRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GroupRequest.
     */
    @Generated
    public static GroupRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> faceIds = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("faceIds".equals(fieldName)) {
                    faceIds = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new GroupRequest(faceIds);
        });
    }
}
