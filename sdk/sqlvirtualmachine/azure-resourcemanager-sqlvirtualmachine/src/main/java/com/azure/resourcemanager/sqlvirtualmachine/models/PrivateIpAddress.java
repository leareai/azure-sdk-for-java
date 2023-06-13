// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private IP address bound to the availability group listener. */
@Fluent
public final class PrivateIpAddress {
    /*
     * Private IP address bound to the availability group listener.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Subnet used to include private IP.
     */
    @JsonProperty(value = "subnetResourceId")
    private String subnetResourceId;

    /** Creates an instance of PrivateIpAddress class. */
    public PrivateIpAddress() {
    }

    /**
     * Get the ipAddress property: Private IP address bound to the availability group listener.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: Private IP address bound to the availability group listener.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the PrivateIpAddress object itself.
     */
    public PrivateIpAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the subnetResourceId property: Subnet used to include private IP.
     *
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the subnetResourceId property: Subnet used to include private IP.
     *
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the PrivateIpAddress object itself.
     */
    public PrivateIpAddress withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
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
