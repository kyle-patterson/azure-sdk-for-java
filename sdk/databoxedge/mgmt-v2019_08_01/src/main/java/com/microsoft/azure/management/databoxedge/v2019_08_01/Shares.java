/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.SharesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Shares.
 */
public interface Shares extends SupportsCreating<Share.DefinitionStages.Blank>, HasInner<SharesInner> {
    /**
     * Refreshes the share metadata with the data from the cloud.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable refreshAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Gets a share by name.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Share> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Lists all the shares in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Share> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the share on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}
