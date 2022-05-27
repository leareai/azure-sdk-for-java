// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.UsageInner;
import com.azure.resourcemanager.machinelearning.models.Usage;
import com.azure.resourcemanager.machinelearning.models.UsageName;
import com.azure.resourcemanager.machinelearning.models.UsageUnit;

public final class UsageImpl implements Usage {
    private UsageInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager;

    UsageImpl(
        UsageInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String amlWorkspaceLocation() {
        return this.innerModel().amlWorkspaceLocation();
    }

    public String type() {
        return this.innerModel().type();
    }

    public UsageUnit unit() {
        return this.innerModel().unit();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public UsageName name() {
        return this.innerModel().name();
    }

    public UsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
