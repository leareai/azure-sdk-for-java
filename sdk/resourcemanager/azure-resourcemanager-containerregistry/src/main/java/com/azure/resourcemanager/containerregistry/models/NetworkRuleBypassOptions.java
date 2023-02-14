// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Whether to allow trusted Azure services to access a network restricted registry. */
public final class NetworkRuleBypassOptions extends ExpandableStringEnum<NetworkRuleBypassOptions> {
    /** Static value AzureServices for NetworkRuleBypassOptions. */
    public static final NetworkRuleBypassOptions AZURE_SERVICES = fromString("AzureServices");

    /** Static value None for NetworkRuleBypassOptions. */
    public static final NetworkRuleBypassOptions NONE = fromString("None");

    /**
     * Creates a new instance of NetworkRuleBypassOptions value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkRuleBypassOptions() {
    }

    /**
     * Creates or finds a NetworkRuleBypassOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkRuleBypassOptions.
     */
    @JsonCreator
    public static NetworkRuleBypassOptions fromString(String name) {
        return fromString(name, NetworkRuleBypassOptions.class);
    }

    /**
     * Gets known NetworkRuleBypassOptions values.
     *
     * @return known NetworkRuleBypassOptions values.
     */
    public static Collection<NetworkRuleBypassOptions> values() {
        return values(NetworkRuleBypassOptions.class);
    }
}
