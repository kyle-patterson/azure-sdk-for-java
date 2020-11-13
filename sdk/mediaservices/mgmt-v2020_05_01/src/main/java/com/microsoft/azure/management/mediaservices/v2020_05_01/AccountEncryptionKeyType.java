/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AccountEncryptionKeyType.
 */
public final class AccountEncryptionKeyType extends ExpandableStringEnum<AccountEncryptionKeyType> {
    /** Static value SystemKey for AccountEncryptionKeyType. */
    public static final AccountEncryptionKeyType SYSTEM_KEY = fromString("SystemKey");

    /** Static value CustomerKey for AccountEncryptionKeyType. */
    public static final AccountEncryptionKeyType CUSTOMER_KEY = fromString("CustomerKey");

    /**
     * Creates or finds a AccountEncryptionKeyType from its string representation.
     * @param name a name to look for
     * @return the corresponding AccountEncryptionKeyType
     */
    @JsonCreator
    public static AccountEncryptionKeyType fromString(String name) {
        return fromString(name, AccountEncryptionKeyType.class);
    }

    /**
     * @return known AccountEncryptionKeyType values
     */
    public static Collection<AccountEncryptionKeyType> values() {
        return values(AccountEncryptionKeyType.class);
    }
}
