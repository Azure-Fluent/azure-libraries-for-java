/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation Entity contract Properties.
 */
public class OperationTagResourceContractProperties {
    /**
     * Identifier of the operation in form /operations/{operationId}.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Operation name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Api Name.
     */
    @JsonProperty(value = "apiName", access = JsonProperty.Access.WRITE_ONLY)
    private String apiName;

    /**
     * Api Revision.
     */
    @JsonProperty(value = "apiRevision", access = JsonProperty.Access.WRITE_ONLY)
    private String apiRevision;

    /**
     * Api Version.
     */
    @JsonProperty(value = "apiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String apiVersion;

    /**
     * Operation Description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST
     * but not limited by only them.
     */
    @JsonProperty(value = "method", access = JsonProperty.Access.WRITE_ONLY)
    private String method;

    /**
     * Relative URL template identifying the target resource for this
     * operation. May include parameters. Example:
     * /customers/{cid}/orders/{oid}/?date={date}.
     */
    @JsonProperty(value = "urlTemplate", access = JsonProperty.Access.WRITE_ONLY)
    private String urlTemplate;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the OperationTagResourceContractProperties object itself.
     */
    public OperationTagResourceContractProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the apiName value.
     *
     * @return the apiName value
     */
    public String apiName() {
        return this.apiName;
    }

    /**
     * Get the apiRevision value.
     *
     * @return the apiRevision value
     */
    public String apiRevision() {
        return this.apiRevision;
    }

    /**
     * Get the apiVersion value.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the method value.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Get the urlTemplate value.
     *
     * @return the urlTemplate value
     */
    public String urlTemplate() {
        return this.urlTemplate;
    }

}