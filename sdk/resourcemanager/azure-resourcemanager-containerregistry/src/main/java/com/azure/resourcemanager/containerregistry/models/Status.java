// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The status of an Azure resource at the time the operation was called. */
@Immutable
public final class Status {
    /*
     * The short label for the status.
     */
    @JsonProperty(value = "displayStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String displayStatus;

    /*
     * The detailed message for the status, including alerts and error messages.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The timestamp when the status was changed to the current value.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /** Creates an instance of Status class. */
    public Status() {
    }

    /**
     * Get the displayStatus property: The short label for the status.
     *
     * @return the displayStatus value.
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Get the message property: The detailed message for the status, including alerts and error messages.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the timestamp property: The timestamp when the status was changed to the current value.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
