// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VMSkuListResultInner;
import com.azure.resourcemanager.hybridcontainerservice.models.VMSkuListResult;
import java.util.Collections;
import java.util.List;

public final class VMSkuListResultImpl implements VMSkuListResult {
    private VMSkuListResultInner innerObject;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    VMSkuListResultImpl(
        VMSkuListResultInner innerObject,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> vmSKUs() {
        List<String> inner = this.innerModel().vmSKUs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public VMSkuListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }
}