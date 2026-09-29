/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfkba;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryoy;

@sprtea
public final class sprgbn {
    public static final byte cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 3;
    public static final byte cfr_renamed_3 = 1;
    public static final byte cfr_renamed_4 = -1;

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[3];
        byArray[0] = -1;
        byArray[1] = 0;
        byArray[2] = 1;
        return byArray;
    }

    private /* synthetic */ sprgbn() {
    }

    public static String cfr_renamed_12048(byte arg0) {
        if (-1 == arg0) {
            return sprfkba.cfr_renamed_9(",-\u0016\u0006\u0007$\u000b,\u0007&");
        }
        if (0 == arg0) {
            return "False";
        }
        if (1 == arg0) {
            return "True";
        }
        return spryoy.cfr_renamed_9("\u000fg1g5~4)\u0014|6e;k6l\u0018f5ez\u007f;e/lt");
    }

    public static byte cfr_renamed_5644(String arg0) {
        if (sprfkba.cfr_renamed_9(",-\u0016\u0006\u0007$\u000b,\u0007&").equals(arg0)) {
            return -1;
        }
        if ("False".equals(arg0)) {
            return 0;
        }
        if ("True".equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(spryoy.cfr_renamed_9("\\4b4f-gzG/e6h8e?K5f6)4h7lt"));
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (-1 == arg0) {
            return sprfkba.cfr_renamed_9(",-\u0016\u0006\u0007$\u000b,\u0007&");
        }
        if (0 == arg0) {
            return "False";
        }
        if (1 == arg0) {
            return "True";
        }
        return spryoy.cfr_renamed_9("\u000fg1g5~4)\u0014|6e;k6l\u0018f5ez\u007f;e/lt");
    }
}

