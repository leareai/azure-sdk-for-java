// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedClusterPoolUpgradeProfileUpgradesItem model. */
@Fluent
public final class ManagedClusterPoolUpgradeProfileUpgradesItem {
    /*
     * The Kubernetes version (major.minor.patch).
     */
    @JsonProperty(value = "kubernetesVersion")
    private String kubernetesVersion;

    /*
     * Whether the Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the ManagedClusterPoolUpgradeProfileUpgradesItem object itself.
     */
    public ManagedClusterPoolUpgradeProfileUpgradesItem withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get the isPreview property: Whether the Kubernetes version is currently in preview.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether the Kubernetes version is currently in preview.
     *
     * @param isPreview the isPreview value to set.
     * @return the ManagedClusterPoolUpgradeProfileUpgradesItem object itself.
     */
    public ManagedClusterPoolUpgradeProfileUpgradesItem withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
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
