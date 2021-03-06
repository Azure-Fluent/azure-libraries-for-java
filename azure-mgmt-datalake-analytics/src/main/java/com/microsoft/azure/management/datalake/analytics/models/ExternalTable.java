/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog external table item.
 */
public class ExternalTable {
    /**
     * the name of the table associated with this database and schema.
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /**
     * the data source associated with this external table.
     */
    @JsonProperty(value = "dataSource")
    private EntityId dataSource;

    /**
     * Get the name of the table associated with this database and schema.
     *
     * @return the tableName value
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the name of the table associated with this database and schema.
     *
     * @param tableName the tableName value to set
     * @return the ExternalTable object itself.
     */
    public ExternalTable withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the data source associated with this external table.
     *
     * @return the dataSource value
     */
    public EntityId dataSource() {
        return this.dataSource;
    }

    /**
     * Set the data source associated with this external table.
     *
     * @param dataSource the dataSource value to set
     * @return the ExternalTable object itself.
     */
    public ExternalTable withDataSource(EntityId dataSource) {
        this.dataSource = dataSource;
        return this;
    }

}
