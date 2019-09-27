/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity representing the reference to the deployment parameters.
 */
public class ParametersLink {
    /**
     * The URI of the parameters file.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /**
     * If included, must match the ContentVersion in the template.
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /**
     * Get the URI of the parameters file.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI of the parameters file.
     *
     * @param uri the uri value to set
     * @return the ParametersLink object itself.
     */
    public ParametersLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get if included, must match the ContentVersion in the template.
     *
     * @return the contentVersion value
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set if included, must match the ContentVersion in the template.
     *
     * @param contentVersion the contentVersion value to set
     * @return the ParametersLink object itself.
     */
    public ParametersLink withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

}
