/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.management.monitor.v2019_11_01.MetricNamespace;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricNamespaceName;

class MetricNamespaceImpl extends WrapperImpl<MetricNamespaceInner> implements MetricNamespace {
    private final MonitorManager manager;
    MetricNamespaceImpl(MetricNamespaceInner inner, MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
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
    public MetricNamespaceName properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
