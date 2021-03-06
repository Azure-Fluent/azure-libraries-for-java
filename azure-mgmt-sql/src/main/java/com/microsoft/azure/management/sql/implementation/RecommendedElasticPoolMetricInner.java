/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents recommended elastic pool metric.
 */
public class RecommendedElasticPoolMetricInner {
    /**
     * The time of metric (ISO8601 format).
     */
    @JsonProperty(value = "dateTime")
    private DateTime dateTimeProperty;

    /**
     * Gets or sets the DTUs (Database Transaction Units). See
     * https://azure.microsoft.com/documentation/articles/sql-database-what-is-a-dtu/.
     */
    @JsonProperty(value = "dtu")
    private Double dtu;

    /**
     * Gets or sets size in gigabytes.
     */
    @JsonProperty(value = "sizeGB")
    private Double sizeGB;

    /**
     * Get the time of metric (ISO8601 format).
     *
     * @return the dateTimeProperty value
     */
    public DateTime dateTimeProperty() {
        return this.dateTimeProperty;
    }

    /**
     * Set the time of metric (ISO8601 format).
     *
     * @param dateTimeProperty the dateTimeProperty value to set
     * @return the RecommendedElasticPoolMetricInner object itself.
     */
    public RecommendedElasticPoolMetricInner withDateTimeProperty(DateTime dateTimeProperty) {
        this.dateTimeProperty = dateTimeProperty;
        return this;
    }

    /**
     * Get gets or sets the DTUs (Database Transaction Units). See https://azure.microsoft.com/documentation/articles/sql-database-what-is-a-dtu/.
     *
     * @return the dtu value
     */
    public Double dtu() {
        return this.dtu;
    }

    /**
     * Set gets or sets the DTUs (Database Transaction Units). See https://azure.microsoft.com/documentation/articles/sql-database-what-is-a-dtu/.
     *
     * @param dtu the dtu value to set
     * @return the RecommendedElasticPoolMetricInner object itself.
     */
    public RecommendedElasticPoolMetricInner withDtu(Double dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get gets or sets size in gigabytes.
     *
     * @return the sizeGB value
     */
    public Double sizeGB() {
        return this.sizeGB;
    }

    /**
     * Set gets or sets size in gigabytes.
     *
     * @param sizeGB the sizeGB value to set
     * @return the RecommendedElasticPoolMetricInner object itself.
     */
    public RecommendedElasticPoolMetricInner withSizeGB(Double sizeGB) {
        this.sizeGB = sizeGB;
        return this;
    }

}
