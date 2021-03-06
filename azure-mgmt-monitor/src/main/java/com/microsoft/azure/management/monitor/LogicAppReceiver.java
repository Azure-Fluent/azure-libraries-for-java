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
 * A logic app receiver.
 */
public class LogicAppReceiver {
    /**
     * The name of the logic app receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The azure resource id of the logic app receiver.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * The callback url where http request sent to.
     */
    @JsonProperty(value = "callbackUrl", required = true)
    private String callbackUrl;

    /**
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /**
     * Get the name of the logic app receiver. Names must be unique across all receivers within an action group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the logic app receiver. Names must be unique across all receivers within an action group.
     *
     * @param name the name value to set
     * @return the LogicAppReceiver object itself.
     */
    public LogicAppReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the azure resource id of the logic app receiver.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the azure resource id of the logic app receiver.
     *
     * @param resourceId the resourceId value to set
     * @return the LogicAppReceiver object itself.
     */
    public LogicAppReceiver withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the callback url where http request sent to.
     *
     * @return the callbackUrl value
     */
    public String callbackUrl() {
        return this.callbackUrl;
    }

    /**
     * Set the callback url where http request sent to.
     *
     * @param callbackUrl the callbackUrl value to set
     * @return the LogicAppReceiver object itself.
     */
    public LogicAppReceiver withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Get indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set
     * @return the LogicAppReceiver object itself.
     */
    public LogicAppReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

}
