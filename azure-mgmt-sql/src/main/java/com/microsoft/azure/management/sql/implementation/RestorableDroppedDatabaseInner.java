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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A restorable dropped database.
 */
@JsonFlatten
public class RestorableDroppedDatabaseInner extends ProxyResource {
    /**
     * The geo-location where the resource lives.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The name of the database.
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /**
     * The edition of the database.
     */
    @JsonProperty(value = "properties.edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /**
     * The max size in bytes of the database.
     */
    @JsonProperty(value = "properties.maxSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private String maxSizeBytes;

    /**
     * The service level objective name of the database.
     */
    @JsonProperty(value = "properties.serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /**
     * The elastic pool name of the database.
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /**
     * The creation date of the database (ISO8601 format).
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The deletion date of the database (ISO8601 format).
     */
    @JsonProperty(value = "properties.deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime deletionDate;

    /**
     * The earliest restore date of the database (ISO8601 format).
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime earliestRestoreDate;

    /**
     * Get the geo-location where the resource lives.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the edition of the database.
     *
     * @return the edition value
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the max size in bytes of the database.
     *
     * @return the maxSizeBytes value
     */
    public String maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Get the service level objective name of the database.
     *
     * @return the serviceLevelObjective value
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the elastic pool name of the database.
     *
     * @return the elasticPoolName value
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the creation date of the database (ISO8601 format).
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the deletion date of the database (ISO8601 format).
     *
     * @return the deletionDate value
     */
    public DateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the earliest restore date of the database (ISO8601 format).
     *
     * @return the earliestRestoreDate value
     */
    public DateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

}
