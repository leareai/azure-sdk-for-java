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
import java.util.List;

/**
 * Response of list dynamic person group person.
 */
@Immutable
public final class ListPersonResult implements JsonSerializable<ListPersonResult> {
    /*
     * Array of PersonDirectory Person ids.
     */
    @Generated
    private final List<String> personIds;

    /**
     * Creates an instance of ListPersonResult class.
     * 
     * @param personIds the personIds value to set.
     */
    @Generated
    private ListPersonResult(List<String> personIds) {
        this.personIds = personIds;
    }

    /**
     * Get the personIds property: Array of PersonDirectory Person ids.
     * 
     * @return the personIds value.
     */
    @Generated
    public List<String> getPersonIds() {
        return this.personIds;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("personIds", this.personIds, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListPersonResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListPersonResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ListPersonResult.
     */
    @Generated
    public static ListPersonResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> personIds = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("personIds".equals(fieldName)) {
                    personIds = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new ListPersonResult(personIds);
        });
    }
}
