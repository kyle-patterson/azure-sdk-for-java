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
 * Defines values for EncryptionScheme.
 */
public final class EncryptionScheme extends ExpandableStringEnum<EncryptionScheme> {
    /** Static value NoEncryption for EncryptionScheme. */
    public static final EncryptionScheme NO_ENCRYPTION = fromString("NoEncryption");

    /** Static value EnvelopeEncryption for EncryptionScheme. */
    public static final EncryptionScheme ENVELOPE_ENCRYPTION = fromString("EnvelopeEncryption");

    /** Static value CommonEncryptionCenc for EncryptionScheme. */
    public static final EncryptionScheme COMMON_ENCRYPTION_CENC = fromString("CommonEncryptionCenc");

    /** Static value CommonEncryptionCbcs for EncryptionScheme. */
    public static final EncryptionScheme COMMON_ENCRYPTION_CBCS = fromString("CommonEncryptionCbcs");

    /**
     * Creates or finds a EncryptionScheme from its string representation.
     * @param name a name to look for
     * @return the corresponding EncryptionScheme
     */
    @JsonCreator
    public static EncryptionScheme fromString(String name) {
        return fromString(name, EncryptionScheme.class);
    }

    /**
     * @return known EncryptionScheme values
     */
    public static Collection<EncryptionScheme> values() {
        return values(EncryptionScheme.class);
    }
}
