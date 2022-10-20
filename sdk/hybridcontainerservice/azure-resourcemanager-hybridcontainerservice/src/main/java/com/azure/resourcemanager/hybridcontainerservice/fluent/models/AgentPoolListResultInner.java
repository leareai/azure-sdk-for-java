// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AgentPoolListResult model. */
@Fluent
public final class AgentPoolListResultInner {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<AgentPoolInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AgentPoolListResultInner class. */
    public AgentPoolListResultInner() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<AgentPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AgentPoolListResultInner object itself.
     */
    public AgentPoolListResultInner withValue(List<AgentPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the AgentPoolListResultInner object itself.
     */
    public AgentPoolListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}