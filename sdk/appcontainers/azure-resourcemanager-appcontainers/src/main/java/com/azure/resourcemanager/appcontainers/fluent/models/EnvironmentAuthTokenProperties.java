// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Environment auth token resource specific properties. */
@Immutable
public final class EnvironmentAuthTokenProperties {
    /*
     * Auth token value.
     */
    @JsonProperty(value = "token", access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    /*
     * Token expiration date.
     */
    @JsonProperty(value = "expires", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expires;

    /** Creates an instance of EnvironmentAuthTokenProperties class. */
    public EnvironmentAuthTokenProperties() {
    }

    /**
     * Get the token property: Auth token value.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Get the expires property: Token expiration date.
     *
     * @return the expires value.
     */
    public OffsetDateTime expires() {
        return this.expires;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}