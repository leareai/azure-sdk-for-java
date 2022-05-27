// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.OnlineEndpointDataInner;
import com.azure.resourcemanager.machinelearning.models.EndpointAuthKeys;
import com.azure.resourcemanager.machinelearning.models.EndpointAuthToken;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpointData;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpointDetails;
import com.azure.resourcemanager.machinelearning.models.PartialManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.PartialOnlineEndpoint;
import com.azure.resourcemanager.machinelearning.models.PartialOnlineEndpointPartialTrackedResource;
import com.azure.resourcemanager.machinelearning.models.PartialSku;
import com.azure.resourcemanager.machinelearning.models.RegenerateEndpointKeysRequest;
import com.azure.resourcemanager.machinelearning.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class OnlineEndpointDataImpl
    implements OnlineEndpointData, OnlineEndpointData.Definition, OnlineEndpointData.Update {
    private OnlineEndpointDataInner innerObject;

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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public OnlineEndpointDetails properties() {
        return this.innerModel().properties();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public OnlineEndpointDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String endpointName;

    private PartialOnlineEndpointPartialTrackedResource updateBody;

    public OnlineEndpointDataImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public OnlineEndpointData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOnlineEndpoints()
                .createOrUpdate(resourceGroupName, workspaceName, endpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public OnlineEndpointData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOnlineEndpoints()
                .createOrUpdate(resourceGroupName, workspaceName, endpointName, this.innerModel(), context);
        return this;
    }

    OnlineEndpointDataImpl(
        String name, com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerObject = new OnlineEndpointDataInner();
        this.serviceManager = serviceManager;
        this.endpointName = name;
    }

    public OnlineEndpointDataImpl update() {
        this.updateBody = new PartialOnlineEndpointPartialTrackedResource();
        return this;
    }

    public OnlineEndpointData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOnlineEndpoints()
                .update(resourceGroupName, workspaceName, endpointName, updateBody, Context.NONE);
        return this;
    }

    public OnlineEndpointData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOnlineEndpoints()
                .update(resourceGroupName, workspaceName, endpointName, updateBody, context);
        return this;
    }

    OnlineEndpointDataImpl(
        OnlineEndpointDataInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.endpointName = Utils.getValueFromIdByName(innerObject.id(), "onlineEndpoints");
    }

    public OnlineEndpointData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOnlineEndpoints()
                .getWithResponse(resourceGroupName, workspaceName, endpointName, Context.NONE)
                .getValue();
        return this;
    }

    public OnlineEndpointData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOnlineEndpoints()
                .getWithResponse(resourceGroupName, workspaceName, endpointName, context)
                .getValue();
        return this;
    }

    public EndpointAuthKeys listKeys() {
        return serviceManager.onlineEndpoints().listKeys(resourceGroupName, workspaceName, endpointName);
    }

    public Response<EndpointAuthKeys> listKeysWithResponse(Context context) {
        return serviceManager
            .onlineEndpoints()
            .listKeysWithResponse(resourceGroupName, workspaceName, endpointName, context);
    }

    public void regenerateKeys(RegenerateEndpointKeysRequest body) {
        serviceManager.onlineEndpoints().regenerateKeys(resourceGroupName, workspaceName, endpointName, body);
    }

    public void regenerateKeys(RegenerateEndpointKeysRequest body, Context context) {
        serviceManager.onlineEndpoints().regenerateKeys(resourceGroupName, workspaceName, endpointName, body, context);
    }

    public EndpointAuthToken getToken() {
        return serviceManager.onlineEndpoints().getToken(resourceGroupName, workspaceName, endpointName);
    }

    public Response<EndpointAuthToken> getTokenWithResponse(Context context) {
        return serviceManager
            .onlineEndpoints()
            .getTokenWithResponse(resourceGroupName, workspaceName, endpointName, context);
    }

    public OnlineEndpointDataImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public OnlineEndpointDataImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public OnlineEndpointDataImpl withProperties(OnlineEndpointDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public OnlineEndpointDataImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public OnlineEndpointDataImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public OnlineEndpointDataImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateBody.withKind(kind);
            return this;
        }
    }

    public OnlineEndpointDataImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public OnlineEndpointDataImpl withIdentity(PartialManagedServiceIdentity identity) {
        this.updateBody.withIdentity(identity);
        return this;
    }

    public OnlineEndpointDataImpl withProperties(PartialOnlineEndpoint properties) {
        this.updateBody.withProperties(properties);
        return this;
    }

    public OnlineEndpointDataImpl withSku(PartialSku sku) {
        this.updateBody.withSku(sku);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
