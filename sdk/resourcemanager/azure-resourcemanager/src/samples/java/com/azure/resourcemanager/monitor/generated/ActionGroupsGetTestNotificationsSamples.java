// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for ActionGroups GetTestNotifications. */
public final class ActionGroupsGetTestNotificationsSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2022-06-01/examples/getTestNotifications.json
     */
    /**
     * Sample code: Get notification details at subscription level.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNotificationDetailsAtSubscriptionLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getActionGroups()
            .getTestNotificationsWithResponse("11000222191287", Context.NONE);
    }
}