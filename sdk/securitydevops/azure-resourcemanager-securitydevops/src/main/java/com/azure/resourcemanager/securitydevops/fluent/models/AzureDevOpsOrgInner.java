// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsOrgProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure DevOps Org Proxy Resource. */
@Fluent
public final class AzureDevOpsOrgInner extends ProxyResource {
    /*
     * AzureDevOps Org properties.
     */
    @JsonProperty(value = "properties")
    private AzureDevOpsOrgProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AzureDevOpsOrgInner class. */
    public AzureDevOpsOrgInner() {
    }

    /**
     * Get the properties property: AzureDevOps Org properties.
     *
     * @return the properties value.
     */
    public AzureDevOpsOrgProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: AzureDevOps Org properties.
     *
     * @param properties the properties value to set.
     * @return the AzureDevOpsOrgInner object itself.
     */
    public AzureDevOpsOrgInner withProperties(AzureDevOpsOrgProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}