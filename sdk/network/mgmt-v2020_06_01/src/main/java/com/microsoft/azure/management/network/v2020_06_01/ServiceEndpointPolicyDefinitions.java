/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ServiceEndpointPolicyDefinitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServiceEndpointPolicyDefinitions.
 */
public interface ServiceEndpointPolicyDefinitions extends SupportsCreating<ServiceEndpointPolicyDefinition.DefinitionStages.Blank>, HasInner<ServiceEndpointPolicyDefinitionsInner> {
    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceEndpointPolicyDefinition> getAsync(String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Gets all service endpoint policy definitions in a service end point policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceEndpointPolicyDefinition> listByResourceGroupAsync(final String resourceGroupName, final String serviceEndpointPolicyName);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

}
