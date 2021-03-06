/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import com.microsoft.azure.management.batch.ProvisioningState;
import com.microsoft.azure.management.batch.PoolAllocationMode;
import com.microsoft.azure.management.batch.KeyVaultReference;
import com.microsoft.azure.management.batch.AutoStorageProperties;
import java.util.List;
import com.microsoft.azure.management.batch.VirtualMachineFamilyCoreQuota;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Contains information about an Azure Batch account.
 */
@JsonFlatten
@SkipParentValidation
public class BatchAccountInner extends Resource {
    /**
     * The account endpoint used to interact with the Batch service.
     */
    @JsonProperty(value = "properties.accountEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String accountEndpoint;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Invalid', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Cancelled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The allocation mode to use for creating pools in the Batch account.
     * Possible values include: 'BatchService', 'UserSubscription'.
     */
    @JsonProperty(value = "properties.poolAllocationMode", access = JsonProperty.Access.WRITE_ONLY)
    private PoolAllocationMode poolAllocationMode;

    /**
     * A reference to the Azure key vault associated with the Batch account.
     */
    @JsonProperty(value = "properties.keyVaultReference", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultReference keyVaultReference;

    /**
     * The properties and status of any auto-storage account associated with
     * the Batch account.
     */
    @JsonProperty(value = "properties.autoStorage", access = JsonProperty.Access.WRITE_ONLY)
    private AutoStorageProperties autoStorage;

    /**
     * The dedicated core quota for the Batch account.
     * For accounts with PoolAllocationMode set to UserSubscription, quota is
     * managed on the subscription so this value is not returned.
     */
    @JsonProperty(value = "properties.dedicatedCoreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer dedicatedCoreQuota;

    /**
     * The low-priority core quota for the Batch account.
     * For accounts with PoolAllocationMode set to UserSubscription, quota is
     * managed on the subscription so this value is not returned.
     */
    @JsonProperty(value = "properties.lowPriorityCoreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lowPriorityCoreQuota;

    /**
     * A list of the dedicated core quota per Virtual Machine family for the
     * Batch account. For accounts with PoolAllocationMode set to
     * UserSubscription, quota is managed on the subscription so this value is
     * not returned.
     */
    @JsonProperty(value = "properties.dedicatedCoreQuotaPerVMFamily", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineFamilyCoreQuota> dedicatedCoreQuotaPerVMFamily;

    /**
     * A value indicating whether the core quota for the Batch Account is
     * enforced per Virtual Machine family or not.
     * Batch is transitioning its core quota system for dedicated cores to be
     * enforced per Virtual Machine family. During this transitional phase, the
     * dedicated core quota per Virtual Machine family may not yet be enforced.
     * If this flag is false, dedicated core quota is enforced via the old
     * dedicatedCoreQuota property on the account and does not consider Virtual
     * Machine family. If this flag is true, dedicated core quota is enforced
     * via the dedicatedCoreQuotaPerVMFamily property on the account, and the
     * old dedicatedCoreQuota does not apply.
     */
    @JsonProperty(value = "properties.dedicatedCoreQuotaPerVMFamilyEnforced", access = JsonProperty.Access.WRITE_ONLY)
    private boolean dedicatedCoreQuotaPerVMFamilyEnforced;

    /**
     * The pool quota for the Batch account.
     */
    @JsonProperty(value = "properties.poolQuota", access = JsonProperty.Access.WRITE_ONLY)
    private int poolQuota;

    /**
     * The active job and job schedule quota for the Batch account.
     */
    @JsonProperty(value = "properties.activeJobAndJobScheduleQuota", access = JsonProperty.Access.WRITE_ONLY)
    private int activeJobAndJobScheduleQuota;

    /**
     * Get the account endpoint used to interact with the Batch service.
     *
     * @return the accountEndpoint value
     */
    public String accountEndpoint() {
        return this.accountEndpoint;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Invalid', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Cancelled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get possible values include: 'BatchService', 'UserSubscription'.
     *
     * @return the poolAllocationMode value
     */
    public PoolAllocationMode poolAllocationMode() {
        return this.poolAllocationMode;
    }

    /**
     * Get the keyVaultReference value.
     *
     * @return the keyVaultReference value
     */
    public KeyVaultReference keyVaultReference() {
        return this.keyVaultReference;
    }

    /**
     * Get the autoStorage value.
     *
     * @return the autoStorage value
     */
    public AutoStorageProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Get for accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the dedicatedCoreQuota value
     */
    public Integer dedicatedCoreQuota() {
        return this.dedicatedCoreQuota;
    }

    /**
     * Get for accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the lowPriorityCoreQuota value
     */
    public Integer lowPriorityCoreQuota() {
        return this.lowPriorityCoreQuota;
    }

    /**
     * Get a list of the dedicated core quota per Virtual Machine family for the Batch account. For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the dedicatedCoreQuotaPerVMFamily value
     */
    public List<VirtualMachineFamilyCoreQuota> dedicatedCoreQuotaPerVMFamily() {
        return this.dedicatedCoreQuotaPerVMFamily;
    }

    /**
     * Get batch is transitioning its core quota system for dedicated cores to be enforced per Virtual Machine family. During this transitional phase, the dedicated core quota per Virtual Machine family may not yet be enforced. If this flag is false, dedicated core quota is enforced via the old dedicatedCoreQuota property on the account and does not consider Virtual Machine family. If this flag is true, dedicated core quota is enforced via the dedicatedCoreQuotaPerVMFamily property on the account, and the old dedicatedCoreQuota does not apply.
     *
     * @return the dedicatedCoreQuotaPerVMFamilyEnforced value
     */
    public boolean dedicatedCoreQuotaPerVMFamilyEnforced() {
        return this.dedicatedCoreQuotaPerVMFamilyEnforced;
    }

    /**
     * Get the poolQuota value.
     *
     * @return the poolQuota value
     */
    public int poolQuota() {
        return this.poolQuota;
    }

    /**
     * Get the activeJobAndJobScheduleQuota value.
     *
     * @return the activeJobAndJobScheduleQuota value
     */
    public int activeJobAndJobScheduleQuota() {
        return this.activeJobAndJobScheduleQuota;
    }

}
