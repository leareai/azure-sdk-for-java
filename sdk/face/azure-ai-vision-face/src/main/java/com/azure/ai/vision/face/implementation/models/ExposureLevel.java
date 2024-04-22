// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates level of exposure.
 */
public final class ExposureLevel extends ExpandableStringEnum<ExposureLevel> {
    /**
     * Low exposure level.
     */
    @Generated
    public static final ExposureLevel UNDER_EXPOSURE = fromString("underExposure");

    /**
     * Good exposure level.
     */
    @Generated
    public static final ExposureLevel GOOD_EXPOSURE = fromString("goodExposure");

    /**
     * High exposure level.
     */
    @Generated
    public static final ExposureLevel OVER_EXPOSURE = fromString("overExposure");

    /**
     * Creates a new instance of ExposureLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ExposureLevel() {
    }

    /**
     * Creates or finds a ExposureLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExposureLevel.
     */
    @Generated
    public static ExposureLevel fromString(String name) {
        return fromString(name, ExposureLevel.class);
    }

    /**
     * Gets known ExposureLevel values.
     * 
     * @return known ExposureLevel values.
     */
    @Generated
    public static Collection<ExposureLevel> values() {
        return values(ExposureLevel.class);
    }
}
