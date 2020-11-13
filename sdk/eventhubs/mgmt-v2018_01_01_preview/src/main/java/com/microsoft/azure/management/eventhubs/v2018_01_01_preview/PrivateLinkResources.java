/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.PrivateLinkResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateLinkResources.
 */
public interface PrivateLinkResources extends HasInner<PrivateLinkResourcesInner> {
    /**
     * Gets lists of resources that supports Privatelinks.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResourcesListResult> getAsync(String resourceGroupName, String namespaceName);

}
