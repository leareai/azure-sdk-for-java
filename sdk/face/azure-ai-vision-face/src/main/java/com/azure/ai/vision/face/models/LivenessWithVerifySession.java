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
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Session result of detect liveness with verify.
 */
@Immutable
public final class LivenessWithVerifySession implements JsonSerializable<LivenessWithVerifySession> {
    /*
     * The unique ID to reference this session.
     */
    @Generated
    private String id;

    /*
     * DateTime when this session was created.
     */
    @Generated
    private final OffsetDateTime createdDateTime;

    /*
     * DateTime when this session was started by the client.
     */
    @Generated
    private OffsetDateTime sessionStartDateTime;

    /*
     * Whether or not the session is expired.
     */
    @Generated
    private final boolean sessionExpired;

    /*
     * Unique Guid per each end-user device. This is to provide rate limiting and anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be null.
     */
    @Generated
    private String deviceCorrelationId;

    /*
     * Seconds the session should last for. Range is 60 to 86400 seconds. Default value is 600.
     */
    @Generated
    private Integer authTokenTimeToLiveInSeconds;

    /*
     * The current status of the session.
     */
    @Generated
    private final FaceSessionStatus status;

    /*
     * The latest session audit result only populated if status == 'ResultAvailable'.
     */
    @Generated
    private LivenessSessionAuditEntry result;

    /**
     * Creates an instance of LivenessWithVerifySession class.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @param sessionExpired the sessionExpired value to set.
     * @param status the status value to set.
     */
    @Generated
    private LivenessWithVerifySession(OffsetDateTime createdDateTime, boolean sessionExpired,
        FaceSessionStatus status) {
        this.createdDateTime = createdDateTime;
        this.sessionExpired = sessionExpired;
        this.status = status;
    }

    /**
     * Get the id property: The unique ID to reference this session.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the createdDateTime property: DateTime when this session was created.
     * 
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the sessionStartDateTime property: DateTime when this session was started by the client.
     * 
     * @return the sessionStartDateTime value.
     */
    @Generated
    public OffsetDateTime getSessionStartDateTime() {
        return this.sessionStartDateTime;
    }

    /**
     * Get the sessionExpired property: Whether or not the session is expired.
     * 
     * @return the sessionExpired value.
     */
    @Generated
    public boolean isSessionExpired() {
        return this.sessionExpired;
    }

    /**
     * Get the deviceCorrelationId property: Unique Guid per each end-user device. This is to provide rate limiting and
     * anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be
     * null.
     * 
     * @return the deviceCorrelationId value.
     */
    @Generated
    public String getDeviceCorrelationId() {
        return this.deviceCorrelationId;
    }

    /**
     * Get the authTokenTimeToLiveInSeconds property: Seconds the session should last for. Range is 60 to 86400 seconds.
     * Default value is 600.
     * 
     * @return the authTokenTimeToLiveInSeconds value.
     */
    @Generated
    public Integer getAuthTokenTimeToLiveInSeconds() {
        return this.authTokenTimeToLiveInSeconds;
    }

    /**
     * Get the status property: The current status of the session.
     * 
     * @return the status value.
     */
    @Generated
    public FaceSessionStatus getStatus() {
        return this.status;
    }

    /**
     * Get the result property: The latest session audit result only populated if status == 'ResultAvailable'.
     * 
     * @return the result value.
     */
    @Generated
    public LivenessSessionAuditEntry getResult() {
        return this.result;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeBooleanField("sessionExpired", this.sessionExpired);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("sessionStartDateTime",
            this.sessionStartDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.sessionStartDateTime));
        jsonWriter.writeStringField("deviceCorrelationId", this.deviceCorrelationId);
        jsonWriter.writeNumberField("authTokenTimeToLiveInSeconds", this.authTokenTimeToLiveInSeconds);
        jsonWriter.writeJsonField("result", this.result);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LivenessWithVerifySession from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LivenessWithVerifySession if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LivenessWithVerifySession.
     */
    @Generated
    public static LivenessWithVerifySession fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdDateTime = null;
            boolean sessionExpired = false;
            FaceSessionStatus status = null;
            OffsetDateTime sessionStartDateTime = null;
            String deviceCorrelationId = null;
            Integer authTokenTimeToLiveInSeconds = null;
            LivenessSessionAuditEntry result = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("sessionExpired".equals(fieldName)) {
                    sessionExpired = reader.getBoolean();
                } else if ("status".equals(fieldName)) {
                    status = FaceSessionStatus.fromString(reader.getString());
                } else if ("sessionStartDateTime".equals(fieldName)) {
                    sessionStartDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("deviceCorrelationId".equals(fieldName)) {
                    deviceCorrelationId = reader.getString();
                } else if ("authTokenTimeToLiveInSeconds".equals(fieldName)) {
                    authTokenTimeToLiveInSeconds = reader.getNullable(JsonReader::getInt);
                } else if ("result".equals(fieldName)) {
                    result = LivenessSessionAuditEntry.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            LivenessWithVerifySession deserializedLivenessWithVerifySession
                = new LivenessWithVerifySession(createdDateTime, sessionExpired, status);
            deserializedLivenessWithVerifySession.id = id;
            deserializedLivenessWithVerifySession.sessionStartDateTime = sessionStartDateTime;
            deserializedLivenessWithVerifySession.deviceCorrelationId = deviceCorrelationId;
            deserializedLivenessWithVerifySession.authTokenTimeToLiveInSeconds = authTokenTimeToLiveInSeconds;
            deserializedLivenessWithVerifySession.result = result;

            return deserializedLivenessWithVerifySession;
        });
    }
}
