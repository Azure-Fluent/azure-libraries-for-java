/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An server Active Directory Administrator.
 */
@JsonFlatten
public class ServerAzureADAdministratorInner extends ProxyResource {
    /**
     * The type of administrator.
     */
    @JsonProperty(value = "properties.administratorType", required = true)
    private String administratorType;

    /**
     * The server administrator login value.
     */
    @JsonProperty(value = "properties.login", required = true)
    private String login;

    /**
     * The server administrator Sid (Secure ID).
     */
    @JsonProperty(value = "properties.sid", required = true)
    private UUID sid;

    /**
     * The server Active Directory Administrator tenant id.
     */
    @JsonProperty(value = "properties.tenantId", required = true)
    private UUID tenantId;

    /**
     * Creates an instance of ServerAzureADAdministratorInner class.
     */
    public ServerAzureADAdministratorInner() {
        administratorType = "ActiveDirectory";
    }

    /**
     * Get the type of administrator.
     *
     * @return the administratorType value
     */
    public String administratorType() {
        return this.administratorType;
    }

    /**
     * Set the type of administrator.
     *
     * @param administratorType the administratorType value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withAdministratorType(String administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the server administrator login value.
     *
     * @return the login value
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the server administrator login value.
     *
     * @param login the login value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the server administrator Sid (Secure ID).
     *
     * @return the sid value
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set the server administrator Sid (Secure ID).
     *
     * @param sid the sid value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the server Active Directory Administrator tenant id.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the server Active Directory Administrator tenant id.
     *
     * @param tenantId the tenantId value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
