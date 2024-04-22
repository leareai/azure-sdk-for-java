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

/**
 * Properties describing exposure level of the image.
 */
@Immutable
public final class ExposureProperties implements JsonSerializable<ExposureProperties> {
    /*
     * An enum value indicating level of exposure.
     */
    @Generated
    private final ExposureLevel exposureLevel;

    /*
     * A number indicating level of exposure level ranging from 0 to 1. [0, 0.25) is under exposure. [0.25, 0.75) is good exposure. [0.75, 1] is over exposure.
     */
    @Generated
    private final double value;

    /**
     * Creates an instance of ExposureProperties class.
     * 
     * @param exposureLevel the exposureLevel value to set.
     * @param value the value value to set.
     */
    @Generated
    private ExposureProperties(ExposureLevel exposureLevel, double value) {
        this.exposureLevel = exposureLevel;
        this.value = value;
    }

    /**
     * Get the exposureLevel property: An enum value indicating level of exposure.
     * 
     * @return the exposureLevel value.
     */
    @Generated
    public ExposureLevel getExposureLevel() {
        return this.exposureLevel;
    }

    /**
     * Get the value property: A number indicating level of exposure level ranging from 0 to 1. [0, 0.25) is under
     * exposure. [0.25, 0.75) is good exposure. [0.75, 1] is over exposure.
     * 
     * @return the value value.
     */
    @Generated
    public double getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("exposureLevel", this.exposureLevel == null ? null : this.exposureLevel.toString());
        jsonWriter.writeDoubleField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExposureProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExposureProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExposureProperties.
     */
    @Generated
    public static ExposureProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExposureLevel exposureLevel = null;
            double value = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("exposureLevel".equals(fieldName)) {
                    exposureLevel = ExposureLevel.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    value = reader.getDouble();
                } else {
                    reader.skipChildren();
                }
            }
            return new ExposureProperties(exposureLevel, value);
        });
    }
}
