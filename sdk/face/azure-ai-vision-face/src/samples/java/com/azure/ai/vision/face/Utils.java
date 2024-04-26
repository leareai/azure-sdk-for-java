// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utils {
    private static final String TEST_IMAGE_BASE_PATH = "./src/samples/resources/sample-images/";
    public static final String TEST_IMAGE_PATH_FAMILY1_DAD1 = TEST_IMAGE_BASE_PATH + "Family1-Dad1.jpg";

    private static final SimpleDateFormat LOG_DATE_FORMAT = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS");
    public static void log(String str) {
        Date dt = new Date();
        String message = String.format("%s %d %s", LOG_DATE_FORMAT.format(dt), Thread.currentThread().getId(), str);
        System.out.println(message);
    }

    private Utils() {}
}
