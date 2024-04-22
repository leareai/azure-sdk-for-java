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
import java.util.List;

/**
 * The IdentifyFromLargePersonGroupRequest model.
 */
@Fluent
public final class IdentifyFromLargePersonGroupRequest
    implements JsonSerializable<IdentifyFromLargePersonGroupRequest> {
    /*
     * Array of query faces faceIds, created by the "Detect". Each of the faces are identified independently. The valid number of faceIds is between [1, 10].
     */
    @Generated
    private final List<String> faceIds;

    /*
     * largePersonGroupId of the target Large Person Group, created by "Create Large Person Group". Parameter personGroupId and largePersonGroupId should not be provided at the same time.
     */
    @Generated
    private final String largePersonGroupId;

    /*
     * The range of maxNumOfCandidatesReturned is between 1 and 100. Default value is 10.
     */
    @Generated
    private Integer maxNumOfCandidatesReturned;

    /*
     * Customized identification confidence threshold, in the range of [0, 1]. Advanced user can tweak this value to override default internal threshold for better precision on their scenario data. Note there is no guarantee of this threshold value working on other data and after algorithm updates.
     */
    @Generated
    private Double confidenceThreshold;

    /**
     * Creates an instance of IdentifyFromLargePersonGroupRequest class.
     * 
     * @param faceIds the faceIds value to set.
     * @param largePersonGroupId the largePersonGroupId value to set.
     */
    @Generated
    public IdentifyFromLargePersonGroupRequest(List<String> faceIds, String largePersonGroupId) {
        this.faceIds = faceIds;
        this.largePersonGroupId = largePersonGroupId;
    }

    /**
     * Get the faceIds property: Array of query faces faceIds, created by the "Detect". Each of the faces are identified
     * independently. The valid number of faceIds is between [1, 10].
     * 
     * @return the faceIds value.
     */
    @Generated
    public List<String> getFaceIds() {
        return this.faceIds;
    }

    /**
     * Get the largePersonGroupId property: largePersonGroupId of the target Large Person Group, created by "Create
     * Large Person Group". Parameter personGroupId and largePersonGroupId should not be provided at the same time.
     * 
     * @return the largePersonGroupId value.
     */
    @Generated
    public String getLargePersonGroupId() {
        return this.largePersonGroupId;
    }

    /**
     * Get the maxNumOfCandidatesReturned property: The range of maxNumOfCandidatesReturned is between 1 and 100.
     * Default value is 10.
     * 
     * @return the maxNumOfCandidatesReturned value.
     */
    @Generated
    public Integer getMaxNumOfCandidatesReturned() {
        return this.maxNumOfCandidatesReturned;
    }

    /**
     * Set the maxNumOfCandidatesReturned property: The range of maxNumOfCandidatesReturned is between 1 and 100.
     * Default value is 10.
     * 
     * @param maxNumOfCandidatesReturned the maxNumOfCandidatesReturned value to set.
     * @return the IdentifyFromLargePersonGroupRequest object itself.
     */
    @Generated
    public IdentifyFromLargePersonGroupRequest setMaxNumOfCandidatesReturned(Integer maxNumOfCandidatesReturned) {
        this.maxNumOfCandidatesReturned = maxNumOfCandidatesReturned;
        return this;
    }

    /**
     * Get the confidenceThreshold property: Customized identification confidence threshold, in the range of [0, 1].
     * Advanced user can tweak this value to override default internal threshold for better precision on their scenario
     * data. Note there is no guarantee of this threshold value working on other data and after algorithm updates.
     * 
     * @return the confidenceThreshold value.
     */
    @Generated
    public Double getConfidenceThreshold() {
        return this.confidenceThreshold;
    }

    /**
     * Set the confidenceThreshold property: Customized identification confidence threshold, in the range of [0, 1].
     * Advanced user can tweak this value to override default internal threshold for better precision on their scenario
     * data. Note there is no guarantee of this threshold value working on other data and after algorithm updates.
     * 
     * @param confidenceThreshold the confidenceThreshold value to set.
     * @return the IdentifyFromLargePersonGroupRequest object itself.
     */
    @Generated
    public IdentifyFromLargePersonGroupRequest setConfidenceThreshold(Double confidenceThreshold) {
        this.confidenceThreshold = confidenceThreshold;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("faceIds", this.faceIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("largePersonGroupId", this.largePersonGroupId);
        jsonWriter.writeNumberField("maxNumOfCandidatesReturned", this.maxNumOfCandidatesReturned);
        jsonWriter.writeNumberField("confidenceThreshold", this.confidenceThreshold);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdentifyFromLargePersonGroupRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdentifyFromLargePersonGroupRequest if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IdentifyFromLargePersonGroupRequest.
     */
    @Generated
    public static IdentifyFromLargePersonGroupRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> faceIds = null;
            String largePersonGroupId = null;
            Integer maxNumOfCandidatesReturned = null;
            Double confidenceThreshold = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("faceIds".equals(fieldName)) {
                    faceIds = reader.readArray(reader1 -> reader1.getString());
                } else if ("largePersonGroupId".equals(fieldName)) {
                    largePersonGroupId = reader.getString();
                } else if ("maxNumOfCandidatesReturned".equals(fieldName)) {
                    maxNumOfCandidatesReturned = reader.getNullable(JsonReader::getInt);
                } else if ("confidenceThreshold".equals(fieldName)) {
                    confidenceThreshold = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }
            IdentifyFromLargePersonGroupRequest deserializedIdentifyFromLargePersonGroupRequest
                = new IdentifyFromLargePersonGroupRequest(faceIds, largePersonGroupId);
            deserializedIdentifyFromLargePersonGroupRequest.maxNumOfCandidatesReturned = maxNumOfCandidatesReturned;
            deserializedIdentifyFromLargePersonGroupRequest.confidenceThreshold = confidenceThreshold;

            return deserializedIdentifyFromLargePersonGroupRequest;
        });
    }
}
