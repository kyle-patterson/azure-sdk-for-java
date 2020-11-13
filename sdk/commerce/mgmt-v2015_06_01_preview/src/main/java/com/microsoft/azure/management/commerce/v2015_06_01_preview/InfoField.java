/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.commerce.v2015_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key-value pairs of instance details in the legacy format.
 */
public class InfoField {
    /**
     * Identifies the name of the instance provisioned by the user.
     */
    @JsonProperty(value = "project")
    private String project;

    /**
     * Get identifies the name of the instance provisioned by the user.
     *
     * @return the project value
     */
    public String project() {
        return this.project;
    }

    /**
     * Set identifies the name of the instance provisioned by the user.
     *
     * @param project the project value to set
     * @return the InfoField object itself.
     */
    public InfoField withProject(String project) {
        this.project = project;
        return this;
    }

}
