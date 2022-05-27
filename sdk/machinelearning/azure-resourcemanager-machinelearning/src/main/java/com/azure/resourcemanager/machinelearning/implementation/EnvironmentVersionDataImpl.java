// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentVersionDataInner;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersionData;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersionDetails;

public final class EnvironmentVersionDataImpl
    implements EnvironmentVersionData, EnvironmentVersionData.Definition, EnvironmentVersionData.Update {
    private EnvironmentVersionDataInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public EnvironmentVersionDetails properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public EnvironmentVersionDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    private String version;

    public EnvironmentVersionDataImpl withExistingEnvironment(
        String resourceGroupName, String workspaceName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.name = name;
        return this;
    }

    public EnvironmentVersionData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentVersions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentVersionData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentVersions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
                .getValue();
        return this;
    }

    EnvironmentVersionDataImpl(
        String name, com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerObject = new EnvironmentVersionDataInner();
        this.serviceManager = serviceManager;
        this.version = name;
    }

    public EnvironmentVersionDataImpl update() {
        return this;
    }

    public EnvironmentVersionData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentVersions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentVersionData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentVersions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
                .getValue();
        return this;
    }

    EnvironmentVersionDataImpl(
        EnvironmentVersionDataInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "environments");
        this.version = Utils.getValueFromIdByName(innerObject.id(), "versions");
    }

    public EnvironmentVersionData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentVersions()
                .getWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentVersionData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentVersions()
                .getWithResponse(resourceGroupName, workspaceName, name, version, context)
                .getValue();
        return this;
    }

    public EnvironmentVersionDataImpl withProperties(EnvironmentVersionDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
