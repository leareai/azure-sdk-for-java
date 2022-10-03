// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.models;

import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthListResponseInner;
import java.util.List;

/** An immutable client-side representation of GitHubOAuthListResponse. */
public interface GitHubOAuthListResponse {
    /**
     * Gets the value property: Singleton list response containing one GitHubOAuthResponse response.
     *
     * @return the value value.
     */
    List<GitHubOAuthResponse> value();

    /**
     * Gets the inner com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthListResponseInner object.
     *
     * @return the inner object.
     */
    GitHubOAuthListResponseInner innerModel();
}