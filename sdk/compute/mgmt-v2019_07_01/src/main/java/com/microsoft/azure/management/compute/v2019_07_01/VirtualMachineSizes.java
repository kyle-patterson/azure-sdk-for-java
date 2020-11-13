/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2019_07_01.LocationVirtualMachineSize;

/**
 * Type representing VirtualMachineSizes.
 */
public interface VirtualMachineSizes {
    /**
     * This API is deprecated. Use [Resources Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationVirtualMachineSize> listAsync(String location);

}
