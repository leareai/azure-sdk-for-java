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
 * Person resource for person directory.
 */
@Immutable
public final class PersonDirectoryPerson implements JsonSerializable<PersonDirectoryPerson> {
    /*
     * Person ID of the person.
     */
    @Generated
    private String personId;

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
     * Creates an instance of PersonDirectoryPerson class.
     * 
     * @param name the name value to set.
     */
    @Generated
    private PersonDirectoryPerson(String name) {
        this.name = name;
    }

    /**
     * Get the personId property: Person ID of the person.
     * 
     * @return the personId value.
     */
    @Generated
    public String getPersonId() {
        return this.personId;
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
     * Reads an instance of PersonDirectoryPerson from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonDirectoryPerson if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PersonDirectoryPerson.
     */
    @Generated
    public static PersonDirectoryPerson fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String personId = null;
            String name = null;
            String userData = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("personId".equals(fieldName)) {
                    personId = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("userData".equals(fieldName)) {
                    userData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            PersonDirectoryPerson deserializedPersonDirectoryPerson = new PersonDirectoryPerson(name);
            deserializedPersonDirectoryPerson.personId = personId;
            deserializedPersonDirectoryPerson.userData = userData;

            return deserializedPersonDirectoryPerson;
        });
    }
}
