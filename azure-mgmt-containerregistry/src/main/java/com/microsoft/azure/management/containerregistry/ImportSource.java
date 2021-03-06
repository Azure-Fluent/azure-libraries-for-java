/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImportSource model.
 */
public class ImportSource {
    /**
     * The resource identifier of the source Azure Container Registry.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The address of the source registry (e.g. 'mcr.microsoft.com').
     */
    @JsonProperty(value = "registryUri")
    private String registryUri;

    /**
     * Credentials used when importing from a registry uri.
     */
    @JsonProperty(value = "credentials")
    private ImportSourceCredentials credentials;

    /**
     * Repository name of the source image.
     * Specify an image by repository ('hello-world'). This will use the
     * 'latest' tag.
     * Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest
     * ('hello-world@sha256:abc123').
     */
    @JsonProperty(value = "sourceImage", required = true)
    private String sourceImage;

    /**
     * Get the resource identifier of the source Azure Container Registry.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource identifier of the source Azure Container Registry.
     *
     * @param resourceId the resourceId value to set
     * @return the ImportSource object itself.
     */
    public ImportSource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the address of the source registry (e.g. 'mcr.microsoft.com').
     *
     * @return the registryUri value
     */
    public String registryUri() {
        return this.registryUri;
    }

    /**
     * Set the address of the source registry (e.g. 'mcr.microsoft.com').
     *
     * @param registryUri the registryUri value to set
     * @return the ImportSource object itself.
     */
    public ImportSource withRegistryUri(String registryUri) {
        this.registryUri = registryUri;
        return this;
    }

    /**
     * Get credentials used when importing from a registry uri.
     *
     * @return the credentials value
     */
    public ImportSourceCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set credentials used when importing from a registry uri.
     *
     * @param credentials the credentials value to set
     * @return the ImportSource object itself.
     */
    public ImportSource withCredentials(ImportSourceCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get repository name of the source image.
     Specify an image by repository ('hello-world'). This will use the 'latest' tag.
     Specify an image by tag ('hello-world:latest').
     Specify an image by sha256-based manifest digest ('hello-world@sha256:abc123').
     *
     * @return the sourceImage value
     */
    public String sourceImage() {
        return this.sourceImage;
    }

    /**
     * Set repository name of the source image.
     Specify an image by repository ('hello-world'). This will use the 'latest' tag.
     Specify an image by tag ('hello-world:latest').
     Specify an image by sha256-based manifest digest ('hello-world@sha256:abc123').
     *
     * @param sourceImage the sourceImage value to set
     * @return the ImportSource object itself.
     */
    public ImportSource withSourceImage(String sourceImage) {
        this.sourceImage = sourceImage;
        return this;
    }

}
