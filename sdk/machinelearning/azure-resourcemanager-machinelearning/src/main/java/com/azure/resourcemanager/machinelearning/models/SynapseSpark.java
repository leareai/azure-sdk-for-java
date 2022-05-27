// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A SynapseSpark compute. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("SynapseSpark")
@Fluent
public final class SynapseSpark extends Compute {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private SynapseSparkProperties properties;

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public SynapseSparkProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the SynapseSpark object itself.
     */
    public SynapseSpark withProperties(SynapseSparkProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseSpark withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseSpark withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SynapseSpark withDisableLocalAuth(Boolean disableLocalAuth) {
        super.withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
