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
 * Face resource for face list.
 */
@Immutable
public final class FaceListFace implements JsonSerializable<FaceListFace> {
    /*
     * Face ID of the face.
     */
    @Generated
    private String persistedFaceId;

    /*
     * User-provided data attached to the face. The length limit is 1K.
     */
    @Generated
    private String userData;

    /**
     * Creates an instance of FaceListFace class.
     */
    @Generated
    private FaceListFace() {
    }

    /**
     * Get the persistedFaceId property: Face ID of the face.
     * 
     * @return the persistedFaceId value.
     */
    @Generated
    public String getPersistedFaceId() {
        return this.persistedFaceId;
    }

    /**
     * Get the userData property: User-provided data attached to the face. The length limit is 1K.
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
        jsonWriter.writeStringField("userData", this.userData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FaceListFace from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FaceListFace if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FaceListFace.
     */
    @Generated
    public static FaceListFace fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String persistedFaceId = null;
            String userData = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("persistedFaceId".equals(fieldName)) {
                    persistedFaceId = reader.getString();
                } else if ("userData".equals(fieldName)) {
                    userData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            FaceListFace deserializedFaceListFace = new FaceListFace();
            deserializedFaceListFace.persistedFaceId = persistedFaceId;
            deserializedFaceListFace.userData = userData;

            return deserializedFaceListFace;
        });
    }
}
