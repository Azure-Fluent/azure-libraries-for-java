/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import java.util.List;
import com.microsoft.azure.management.network.VpnGatewayTunnelingProtocol;
import com.microsoft.azure.management.network.P2SVpnServerConfigVpnClientRootCertificate;
import com.microsoft.azure.management.network.P2SVpnServerConfigVpnClientRevokedCertificate;
import com.microsoft.azure.management.network.P2SVpnServerConfigRadiusServerRootCertificate;
import com.microsoft.azure.management.network.P2SVpnServerConfigRadiusClientRootCertificate;
import com.microsoft.azure.management.network.IpsecPolicy;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * P2SVpnServerConfiguration Resource.
 */
@JsonFlatten
public class P2SVpnServerConfigurationInner extends SubResource {
    /**
     * The name of the P2SVpnServerConfiguration that is unique within a
     * VirtualWan in a resource group. This name can be used to access the
     * resource along with Paren VirtualWan resource name.
     */
    @JsonProperty(value = "properties.name")
    private String p2SVpnServerConfigurationPropertiesName;

    /**
     * VPN protocols for the P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnProtocols")
    private List<VpnGatewayTunnelingProtocol> vpnProtocols;

    /**
     * VPN client root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigVpnClientRootCertificates")
    private List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates;

    /**
     * VPN client revoked certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigVpnClientRevokedCertificates")
    private List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates;

    /**
     * Radius Server root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigRadiusServerRootCertificates")
    private List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates;

    /**
     * Radius client root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigRadiusClientRootCertificates")
    private List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates;

    /**
     * VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientIpsecPolicies")
    private List<IpsecPolicy> vpnClientIpsecPolicies;

    /**
     * The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerAddress")
    private String radiusServerAddress;

    /**
     * The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerSecret")
    private String radiusServerSecret;

    /**
     * The provisioning state of the P2SVpnServerConfiguration resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * List of references to P2SVpnGateways.
     */
    @JsonProperty(value = "properties.p2SVpnGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> p2SVpnGateways;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "properties.etag")
    private String p2SVpnServerConfigurationPropertiesEtag;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     *
     * @return the p2SVpnServerConfigurationPropertiesName value
     */
    public String p2SVpnServerConfigurationPropertiesName() {
        return this.p2SVpnServerConfigurationPropertiesName;
    }

    /**
     * Set the name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     *
     * @param p2SVpnServerConfigurationPropertiesName the p2SVpnServerConfigurationPropertiesName value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigurationPropertiesName(String p2SVpnServerConfigurationPropertiesName) {
        this.p2SVpnServerConfigurationPropertiesName = p2SVpnServerConfigurationPropertiesName;
        return this;
    }

    /**
     * Get vPN protocols for the P2SVpnServerConfiguration.
     *
     * @return the vpnProtocols value
     */
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.vpnProtocols;
    }

    /**
     * Set vPN protocols for the P2SVpnServerConfiguration.
     *
     * @param vpnProtocols the vpnProtocols value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.vpnProtocols = vpnProtocols;
        return this;
    }

    /**
     * Get vPN client root certificate of P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigVpnClientRootCertificates value
     */
    public List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates() {
        return this.p2SVpnServerConfigVpnClientRootCertificates;
    }

    /**
     * Set vPN client root certificate of P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigVpnClientRootCertificates the p2SVpnServerConfigVpnClientRootCertificates value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigVpnClientRootCertificates(List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates) {
        this.p2SVpnServerConfigVpnClientRootCertificates = p2SVpnServerConfigVpnClientRootCertificates;
        return this;
    }

    /**
     * Get vPN client revoked certificate of P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigVpnClientRevokedCertificates value
     */
    public List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates() {
        return this.p2SVpnServerConfigVpnClientRevokedCertificates;
    }

    /**
     * Set vPN client revoked certificate of P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigVpnClientRevokedCertificates the p2SVpnServerConfigVpnClientRevokedCertificates value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigVpnClientRevokedCertificates(List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates) {
        this.p2SVpnServerConfigVpnClientRevokedCertificates = p2SVpnServerConfigVpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get radius Server root certificate of P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigRadiusServerRootCertificates value
     */
    public List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates() {
        return this.p2SVpnServerConfigRadiusServerRootCertificates;
    }

    /**
     * Set radius Server root certificate of P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigRadiusServerRootCertificates the p2SVpnServerConfigRadiusServerRootCertificates value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigRadiusServerRootCertificates(List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates) {
        this.p2SVpnServerConfigRadiusServerRootCertificates = p2SVpnServerConfigRadiusServerRootCertificates;
        return this;
    }

    /**
     * Get radius client root certificate of P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigRadiusClientRootCertificates value
     */
    public List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates() {
        return this.p2SVpnServerConfigRadiusClientRootCertificates;
    }

    /**
     * Set radius client root certificate of P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigRadiusClientRootCertificates the p2SVpnServerConfigRadiusClientRootCertificates value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigRadiusClientRootCertificates(List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates) {
        this.p2SVpnServerConfigRadiusClientRootCertificates = p2SVpnServerConfigRadiusClientRootCertificates;
        return this;
    }

    /**
     * Get vpnClientIpsecPolicies for P2SVpnServerConfiguration.
     *
     * @return the vpnClientIpsecPolicies value
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies;
    }

    /**
     * Set vpnClientIpsecPolicies for P2SVpnServerConfiguration.
     *
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        return this;
    }

    /**
     * Get the radius server address property of the P2SVpnServerConfiguration resource for point to site client connection.
     *
     * @return the radiusServerAddress value
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radius server address property of the P2SVpnServerConfiguration resource for point to site client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radius secret property of the P2SVpnServerConfiguration resource for point to site client connection.
     *
     * @return the radiusServerSecret value
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radius secret property of the P2SVpnServerConfiguration resource for point to site client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

    /**
     * Get the provisioning state of the P2SVpnServerConfiguration resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get list of references to P2SVpnGateways.
     *
     * @return the p2SVpnGateways value
     */
    public List<SubResource> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the p2SVpnServerConfigurationPropertiesEtag value
     */
    public String p2SVpnServerConfigurationPropertiesEtag() {
        return this.p2SVpnServerConfigurationPropertiesEtag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param p2SVpnServerConfigurationPropertiesEtag the p2SVpnServerConfigurationPropertiesEtag value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigurationPropertiesEtag(String p2SVpnServerConfigurationPropertiesEtag) {
        this.p2SVpnServerConfigurationPropertiesEtag = p2SVpnServerConfigurationPropertiesEtag;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
