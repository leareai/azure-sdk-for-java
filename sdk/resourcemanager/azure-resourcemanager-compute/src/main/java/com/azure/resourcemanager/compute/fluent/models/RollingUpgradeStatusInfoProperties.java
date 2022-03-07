// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.models.ApiError;
import com.azure.resourcemanager.compute.models.RollingUpgradePolicy;
import com.azure.resourcemanager.compute.models.RollingUpgradeProgressInfo;
import com.azure.resourcemanager.compute.models.RollingUpgradeRunningStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the latest virtual machine scale set rolling upgrade. */
@Immutable
public final class RollingUpgradeStatusInfoProperties {
    /*
     * The rolling upgrade policies applied for this upgrade.
     */
    @JsonProperty(value = "policy", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradePolicy policy;

    /*
     * Information about the current running state of the overall upgrade.
     */
    @JsonProperty(value = "runningStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeRunningStatus runningStatus;

    /*
     * Information about the number of virtual machine instances in each
     * upgrade state.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeProgressInfo progress;

    /*
     * Error details for this upgrade, if there are any.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Get the policy property: The rolling upgrade policies applied for this upgrade.
     *
     * @return the policy value.
     */
    public RollingUpgradePolicy policy() {
        return this.policy;
    }

    /**
     * Get the runningStatus property: Information about the current running state of the overall upgrade.
     *
     * @return the runningStatus value.
     */
    public RollingUpgradeRunningStatus runningStatus() {
        return this.runningStatus;
    }

    /**
     * Get the progress property: Information about the number of virtual machine instances in each upgrade state.
     *
     * @return the progress value.
     */
    public RollingUpgradeProgressInfo progress() {
        return this.progress;
    }

    /**
     * Get the error property: Error details for this upgrade, if there are any.
     *
     * @return the error value.
     */
    public ApiError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policy() != null) {
            policy().validate();
        }
        if (runningStatus() != null) {
            runningStatus().validate();
        }
        if (progress() != null) {
            progress().validate();
        }
        if (error() != null) {
            error().validate();
        }
    }
}
