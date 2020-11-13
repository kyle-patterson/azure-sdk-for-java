// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.implementation.ConnectionStringProperties;
import com.azure.core.credential.TokenCredential;

import java.net.URI;

/**
 * A utility class that parses a connection string into sections.
 * A Service Bus connection string is a set of key value pairs separated by semi-colon. A typical example is
 * "Endpoint=sb://sbnamespace.servicebus.windows.net/;SharedAccessKeyName=someKeyName;SharedAccessKey=someKeyValue".
 *
 * A connection may have the following sections:
 * <ul>
 *     <li>Endpoint, which is mandatory. The hostname part of it is the "Fully qualified namespace".</li>
 *     <li>SharedAccessKeyName and SharedAccessKey, optional, used to authenticate the access to the ServiceBus.</li>
 *     <li>SharedAccessSignature, optional, an alternative way to authenticate the access to the ServiceBus.</li>
 *     <li>EntityPath, optional, the queue name or the topic name under the service namespace</li>
 * </ul>
 *
 * When you have a ServiceBus connection string, you can use {@link ServiceBusClientBuilder#connectionString(String)}
 * to build a client. But if you'd like to use a {@link com.azure.core.credential.TokenCredential} to access a
 * ServiceBus, you can use this utility class to take the fully qualified namespace and optionally the entity path
 * (queue/topic name) from the connection string and then use
 * {@link ServiceBusClientBuilder#credential(String, TokenCredential)}.
 */
public final class ServiceBusConnectionStringProperties {
    private final URI endpoint;
    private final String entityPath;
    private final String sharedAccessKeyName;
    private final String sharedAccessKey;
    private final String sharedAccessSignature;

    private ServiceBusConnectionStringProperties(ConnectionStringProperties properties) {
        this.endpoint = properties.getEndpoint();
        this.entityPath = properties.getEntityPath();
        this.sharedAccessKeyName = properties.getSharedAccessKeyName();
        this.sharedAccessKey = properties.getSharedAccessKey();
        this.sharedAccessSignature = properties.getSharedAccessSignature();
    }

    /**
     * Parse a ServiceBus connection string into an instance of this class.
     * @param connectionString The connection string to be parsed.
     * @return An instance of this class.
     * @throws NullPointerException if {@code connectionString} is null.
     * @throws IllegalArgumentException if the {@code connectionString} is empty or malformatted.
     */
    public static ServiceBusConnectionStringProperties parse(String connectionString) {
        return new ServiceBusConnectionStringProperties(new ConnectionStringProperties(connectionString));
    }

    /**
     * Get the "EntityPath" value of the connection string.
     * @return The entity path, or {@code null} if the connection string doesn't have an "EntityPath".
     */
    public String getEntityPath() {
        return entityPath;
    }

    /**
     * Get the "Endpoint" value of the connection string.
     * @return The endpoint.
     */
    public String getEndpoint() {
        return String.format("%s://%s", endpoint.getScheme(), endpoint.getHost());
    }

    /**
     * Get the fully qualified namespace, or hostname, from the connection string "Endpoint" section.
     * @return The fully qualified namespace.
     */
    public String getFullyQualifiedNamespace() {
        return this.endpoint.getHost();
    }

    /**
     * Get the "SharedAccessKeyName" section of the connection string.
     * @return The shared access key name, or {@code null} if the connection string doesn't have an
     * "SharedAccessKeyName".
     */
    public String getSharedAccessKeyName() {
        return this.sharedAccessKeyName;
    }

    /**
     * Get the "SharedAccessSignature" section of the connection string.
     * @return The shared access key value, or {@code null} if the connection string doesn't have an
     * "SharedAccessSignature".
     */
    public String getSharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Get the "SharedAccessSignature" section of the connection string.
     * @return The shared access signature, or {@code null} if the connection string doesn't have an
     * "SharedAccessSignature".
     */
    public String getSharedAccessSignature() {
        return this.sharedAccessSignature;
    }
}
