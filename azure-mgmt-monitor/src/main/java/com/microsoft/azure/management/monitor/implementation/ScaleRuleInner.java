/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.monitor.MetricTrigger;
import com.microsoft.azure.management.monitor.ScaleAction;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rule that provide the triggers and parameters for the scaling action.
 */
public class ScaleRuleInner {
    /**
     * the trigger that results in a scaling action.
     */
    @JsonProperty(value = "metricTrigger", required = true)
    private MetricTrigger metricTrigger;

    /**
     * the parameters for the scaling action.
     */
    @JsonProperty(value = "scaleAction", required = true)
    private ScaleAction scaleAction;

    /**
     * Get the trigger that results in a scaling action.
     *
     * @return the metricTrigger value
     */
    public MetricTrigger metricTrigger() {
        return this.metricTrigger;
    }

    /**
     * Set the trigger that results in a scaling action.
     *
     * @param metricTrigger the metricTrigger value to set
     * @return the ScaleRuleInner object itself.
     */
    public ScaleRuleInner withMetricTrigger(MetricTrigger metricTrigger) {
        this.metricTrigger = metricTrigger;
        return this;
    }

    /**
     * Get the parameters for the scaling action.
     *
     * @return the scaleAction value
     */
    public ScaleAction scaleAction() {
        return this.scaleAction;
    }

    /**
     * Set the parameters for the scaling action.
     *
     * @param scaleAction the scaleAction value to set
     * @return the ScaleRuleInner object itself.
     */
    public ScaleRuleInner withScaleAction(ScaleAction scaleAction) {
        this.scaleAction = scaleAction;
        return this;
    }

}
