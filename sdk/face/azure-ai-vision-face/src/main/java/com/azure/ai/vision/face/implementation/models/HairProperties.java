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
 * Properties describing hair attributes.
 */
@Immutable
public final class HairProperties implements JsonSerializable<HairProperties> {
    /*
     * A number describing confidence level of whether the person is bald.
     */
    @Generated
    private final double bald;

    /*
     * A boolean value describing whether the hair is visible in the image.
     */
    @Generated
    private final boolean invisible;

    /*
     * An array of candidate colors and confidence level in the presence of each.
     */
    @Generated
    private final List<HairColor> hairColor;

    /**
     * Creates an instance of HairProperties class.
     * 
     * @param bald the bald value to set.
     * @param invisible the invisible value to set.
     * @param hairColor the hairColor value to set.
     */
    @Generated
    private HairProperties(double bald, boolean invisible, List<HairColor> hairColor) {
        this.bald = bald;
        this.invisible = invisible;
        this.hairColor = hairColor;
    }

    /**
     * Get the bald property: A number describing confidence level of whether the person is bald.
     * 
     * @return the bald value.
     */
    @Generated
    public double getBald() {
        return this.bald;
    }

    /**
     * Get the invisible property: A boolean value describing whether the hair is visible in the image.
     * 
     * @return the invisible value.
     */
    @Generated
    public boolean isInvisible() {
        return this.invisible;
    }

    /**
     * Get the hairColor property: An array of candidate colors and confidence level in the presence of each.
     * 
     * @return the hairColor value.
     */
    @Generated
    public List<HairColor> getHairColor() {
        return this.hairColor;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("bald", this.bald);
        jsonWriter.writeBooleanField("invisible", this.invisible);
        jsonWriter.writeArrayField("hairColor", this.hairColor, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HairProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HairProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HairProperties.
     */
    @Generated
    public static HairProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            double bald = 0.0;
            boolean invisible = false;
            List<HairColor> hairColor = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bald".equals(fieldName)) {
                    bald = reader.getDouble();
                } else if ("invisible".equals(fieldName)) {
                    invisible = reader.getBoolean();
                } else if ("hairColor".equals(fieldName)) {
                    hairColor = reader.readArray(reader1 -> HairColor.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new HairProperties(bald, invisible, hairColor);
        });
    }
}
