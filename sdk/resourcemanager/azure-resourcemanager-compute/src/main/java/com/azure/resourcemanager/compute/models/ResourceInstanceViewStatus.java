// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Instance view status. */
@Fluent
public final class ResourceInstanceViewStatus {
    /*
     * The status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The short localizable label for the status.
     */
    @JsonProperty(value = "displayStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String displayStatus;

    /*
     * The detailed status message, including for alerts and error messages.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The time of the status.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime time;

    /*
     * The level code.
     */
    @JsonProperty(value = "level")
    private StatusLevelTypes level;

    /**
     * Get the code property: The status code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the displayStatus property: The short localizable label for the status.
     *
     * @return the displayStatus value.
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Get the message property: The detailed status message, including for alerts and error messages.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the time property: The time of the status.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Get the level property: The level code.
     *
     * @return the level value.
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Set the level property: The level code.
     *
     * @param level the level value to set.
     * @return the ResourceInstanceViewStatus object itself.
     */
    public ResourceInstanceViewStatus withLevel(StatusLevelTypes level) {
        this.level = level;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
