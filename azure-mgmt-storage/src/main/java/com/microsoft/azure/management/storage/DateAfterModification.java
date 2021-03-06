/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to define the number of days after last modification.
 */
public class DateAfterModification {
    /**
     * Integer value indicating the age in days after last modification.
     */
    @JsonProperty(value = "daysAfterModificationGreaterThan", required = true)
    private int daysAfterModificationGreaterThan;

    /**
     * Get integer value indicating the age in days after last modification.
     *
     * @return the daysAfterModificationGreaterThan value
     */
    public int daysAfterModificationGreaterThan() {
        return this.daysAfterModificationGreaterThan;
    }

    /**
     * Set integer value indicating the age in days after last modification.
     *
     * @param daysAfterModificationGreaterThan the daysAfterModificationGreaterThan value to set
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification withDaysAfterModificationGreaterThan(int daysAfterModificationGreaterThan) {
        this.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
        return this;
    }

}
