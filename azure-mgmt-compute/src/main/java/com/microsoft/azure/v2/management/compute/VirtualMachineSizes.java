/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.compute;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.SupportsListingByRegion;

/**
 *  Entry point to virtual machine sizes API.
 */
@Fluent
public interface VirtualMachineSizes extends
        SupportsListingByRegion<VirtualMachineSize> {
}