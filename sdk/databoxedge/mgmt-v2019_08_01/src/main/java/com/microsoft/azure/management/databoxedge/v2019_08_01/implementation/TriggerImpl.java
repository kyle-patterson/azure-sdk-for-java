/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_08_01.Trigger;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class TriggerImpl extends CreatableUpdatableImpl<Trigger, TriggerInner, TriggerImpl> implements Trigger, Trigger.Definition, Trigger.Update {
    private final DataBoxEdgeManager manager;
    private String deviceName;
    private String name;
    private String resourceGroupName;

    TriggerImpl(String name, DataBoxEdgeManager manager) {
        super(name, new TriggerInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    TriggerImpl(TriggerInner inner, DataBoxEdgeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.deviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataBoxEdgeDevices");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "triggers");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        //
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Trigger> createResourceAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Trigger> updateResourceAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TriggerInner> getInnerAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.getAsync(this.deviceName, this.name, this.resourceGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TriggerImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

}
