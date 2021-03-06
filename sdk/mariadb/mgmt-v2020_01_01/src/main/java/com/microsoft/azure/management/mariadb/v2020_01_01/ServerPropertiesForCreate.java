/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The properties used to create a new server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode", defaultImpl = ServerPropertiesForCreate.class)
@JsonTypeName("ServerPropertiesForCreate")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Default", value = ServerPropertiesForDefaultCreate.class),
    @JsonSubTypes.Type(name = "PointInTimeRestore", value = ServerPropertiesForRestore.class),
    @JsonSubTypes.Type(name = "GeoRestore", value = ServerPropertiesForGeoRestore.class),
    @JsonSubTypes.Type(name = "Replica", value = ServerPropertiesForReplica.class)
})
public class ServerPropertiesForCreate {
    /**
     * Server version. Possible values include: '5.6', '5.7'.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /**
     * Enable ssl enforcement or not when connect to server. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /**
     * Whether or not public network access is allowed for this server. Value
     * is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessEnum publicNetworkAccess;

    /**
     * Storage profile of a server.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /**
     * Get server version. Possible values include: '5.6', '5.7'.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set server version. Possible values include: '5.6', '5.7'.
     *
     * @param version the version value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the sslEnforcement value
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param sslEnforcement the sslEnforcement value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccessEnum publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get storage profile of a server.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

}
