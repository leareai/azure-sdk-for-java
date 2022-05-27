// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Reference to an asset via its path in a datastore. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "referenceType")
@JsonTypeName("DataPath")
@Fluent
public final class PartialDataPathAssetReference extends PartialAssetReferenceBase {
    /*
     * ARM resource ID of the datastore where the asset is located.
     */
    @JsonProperty(value = "datastoreId")
    private String datastoreId;

    /*
     * The path of the file/directory in the datastore.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the datastoreId property: ARM resource ID of the datastore where the asset is located.
     *
     * @return the datastoreId value.
     */
    public String datastoreId() {
        return this.datastoreId;
    }

    /**
     * Set the datastoreId property: ARM resource ID of the datastore where the asset is located.
     *
     * @param datastoreId the datastoreId value to set.
     * @return the PartialDataPathAssetReference object itself.
     */
    public PartialDataPathAssetReference withDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * Get the path property: The path of the file/directory in the datastore.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of the file/directory in the datastore.
     *
     * @param path the path value to set.
     * @return the PartialDataPathAssetReference object itself.
     */
    public PartialDataPathAssetReference withPath(String path) {
        this.path = path;
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
    }
}
