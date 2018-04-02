/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An azure function receiver.
 */
public class AzureFunctionReceiver {
    /**
     * The name of the azure function receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The azure resource id of the function app.
     */
    @JsonProperty(value = "functionAppResourceId", required = true)
    private String functionAppResourceId;

    /**
     * The function name in the function app.
     */
    @JsonProperty(value = "functionName", required = true)
    private String functionName;

    /**
     * The http trigger url where http request sent to.
     */
    @JsonProperty(value = "httpTriggerUrl", required = true)
    private String httpTriggerUrl;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the functionAppResourceId value.
     *
     * @return the functionAppResourceId value
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }

    /**
     * Set the functionAppResourceId value.
     *
     * @param functionAppResourceId the functionAppResourceId value to set
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withFunctionAppResourceId(String functionAppResourceId) {
        this.functionAppResourceId = functionAppResourceId;
        return this;
    }

    /**
     * Get the functionName value.
     *
     * @return the functionName value
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Set the functionName value.
     *
     * @param functionName the functionName value to set
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get the httpTriggerUrl value.
     *
     * @return the httpTriggerUrl value
     */
    public String httpTriggerUrl() {
        return this.httpTriggerUrl;
    }

    /**
     * Set the httpTriggerUrl value.
     *
     * @param httpTriggerUrl the httpTriggerUrl value to set
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withHttpTriggerUrl(String httpTriggerUrl) {
        this.httpTriggerUrl = httpTriggerUrl;
        return this;
    }

}