// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates quality of image for recognition.
 */
public final class QualityForRecognition extends ExpandableStringEnum<QualityForRecognition> {
    /**
     * Low quality.
     */
    @Generated
    public static final QualityForRecognition LOW = fromString("low");

    /**
     * Medium quality.
     */
    @Generated
    public static final QualityForRecognition MEDIUM = fromString("medium");

    /**
     * High quality.
     */
    @Generated
    public static final QualityForRecognition HIGH = fromString("high");

    /**
     * Creates a new instance of QualityForRecognition value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public QualityForRecognition() {
    }

    /**
     * Creates or finds a QualityForRecognition from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QualityForRecognition.
     */
    @Generated
    public static QualityForRecognition fromString(String name) {
        return fromString(name, QualityForRecognition.class);
    }

    /**
     * Gets known QualityForRecognition values.
     * 
     * @return known QualityForRecognition values.
     */
    @Generated
    public static Collection<QualityForRecognition> values() {
        return values(QualityForRecognition.class);
    }
}
