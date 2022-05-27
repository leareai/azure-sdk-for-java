// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.OnlineEndpointsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointAuthKeysInner;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointAuthTokenInner;
import com.azure.resourcemanager.machinelearning.fluent.models.OnlineEndpointDataInner;
import com.azure.resourcemanager.machinelearning.models.EndpointAuthKeys;
import com.azure.resourcemanager.machinelearning.models.EndpointAuthToken;
import com.azure.resourcemanager.machinelearning.models.EndpointComputeType;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpointData;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpoints;
import com.azure.resourcemanager.machinelearning.models.OrderString;
import com.azure.resourcemanager.machinelearning.models.RegenerateEndpointKeysRequest;

public final class OnlineEndpointsImpl implements OnlineEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(OnlineEndpointsImpl.class);

    private final OnlineEndpointsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager;

    public OnlineEndpointsImpl(
        OnlineEndpointsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OnlineEndpointData> list(String resourceGroupName, String workspaceName) {
        PagedIterable<OnlineEndpointDataInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new OnlineEndpointDataImpl(inner1, this.manager()));
    }

    public PagedIterable<OnlineEndpointData> list(
        String resourceGroupName,
        String workspaceName,
        String name,
        Integer count,
        EndpointComputeType computeType,
        String skip,
        String tags,
        String properties,
        OrderString orderBy,
        Context context) {
        PagedIterable<OnlineEndpointDataInner> inner =
            this
                .serviceClient()
                .list(
                    resourceGroupName,
                    workspaceName,
                    name,
                    count,
                    computeType,
                    skip,
                    tags,
                    properties,
                    orderBy,
                    context);
        return Utils.mapPage(inner, inner1 -> new OnlineEndpointDataImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String endpointName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName);
    }

    public void delete(String resourceGroupName, String workspaceName, String endpointName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName, context);
    }

    public OnlineEndpointData get(String resourceGroupName, String workspaceName, String endpointName) {
        OnlineEndpointDataInner inner = this.serviceClient().get(resourceGroupName, workspaceName, endpointName);
        if (inner != null) {
            return new OnlineEndpointDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OnlineEndpointData> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context) {
        Response<OnlineEndpointDataInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, endpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OnlineEndpointDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EndpointAuthKeys listKeys(String resourceGroupName, String workspaceName, String endpointName) {
        EndpointAuthKeysInner inner = this.serviceClient().listKeys(resourceGroupName, workspaceName, endpointName);
        if (inner != null) {
            return new EndpointAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EndpointAuthKeys> listKeysWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context) {
        Response<EndpointAuthKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, workspaceName, endpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EndpointAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void regenerateKeys(
        String resourceGroupName, String workspaceName, String endpointName, RegenerateEndpointKeysRequest body) {
        this.serviceClient().regenerateKeys(resourceGroupName, workspaceName, endpointName, body);
    }

    public void regenerateKeys(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        RegenerateEndpointKeysRequest body,
        Context context) {
        this.serviceClient().regenerateKeys(resourceGroupName, workspaceName, endpointName, body, context);
    }

    public EndpointAuthToken getToken(String resourceGroupName, String workspaceName, String endpointName) {
        EndpointAuthTokenInner inner = this.serviceClient().getToken(resourceGroupName, workspaceName, endpointName);
        if (inner != null) {
            return new EndpointAuthTokenImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EndpointAuthToken> getTokenWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context) {
        Response<EndpointAuthTokenInner> inner =
            this.serviceClient().getTokenWithResponse(resourceGroupName, workspaceName, endpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EndpointAuthTokenImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OnlineEndpointData getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, endpointName, Context.NONE).getValue();
    }

    public Response<OnlineEndpointData> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, endpointName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, context);
    }

    private OnlineEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    public OnlineEndpointDataImpl define(String name) {
        return new OnlineEndpointDataImpl(name, this.manager());
    }
}
