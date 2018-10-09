/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.network.Access;

/**
 * Results of IP flow verification on the target resource.
 */
public final class VerificationIPFlowResultInner {
    /**
     * Indicates whether the traffic is allowed or denied. Possible values
     * include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "access")
    private Access access;

    /**
     * Name of the rule. If input is not matched against any security rule, it
     * is not displayed.
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /**
     * Get the access value.
     *
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access value.
     *
     * @param access the access value to set.
     * @return the VerificationIPFlowResultInner object itself.
     */
    public VerificationIPFlowResultInner withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the ruleName value.
     *
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName value.
     *
     * @param ruleName the ruleName value to set.
     * @return the VerificationIPFlowResultInner object itself.
     */
    public VerificationIPFlowResultInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
}