/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprjtba;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprozn {
    public static final byte cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 3;
    public static final byte cfr_renamed_3 = 1;
    public static final byte cfr_renamed_4 = 2;

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[3];
        byArray[0] = 0;
        byArray[1] = 1;
        byArray[2] = 2;
        return byArray;
    }

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return sprjtba.cfr_renamed_9("6c\u0016i");
        }
        if (1 == arg0) {
            return sprjaaa.cfr_renamed_9("3\u0003$");
        }
        if (2 == arg0) {
            return sprjtba.cfr_renamed_9("2\\=K");
        }
        return sprjaaa.cfr_renamed_9("4!\n!\u000e8\u000fo\" \f?\u0013*\u0012<, \u0005*A9\u0000#\u0014*O");
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return sprjtba.cfr_renamed_9("6c\u0016i");
        }
        if (1 == arg0) {
            return sprjaaa.cfr_renamed_9("3\u0003$");
        }
        if (2 == arg0) {
            return sprjtba.cfr_renamed_9("2\\=K");
        }
        return sprjaaa.cfr_renamed_9("4!\n!\u000e8\u000fo\" \f?\u0013*\u0012<, \u0005*A9\u0000#\u0014*O");
    }

    public static byte cfr_renamed_5644(String arg0) {
        if (sprjtba.cfr_renamed_9("6c\u0016i").equals(arg0)) {
            return 0;
        }
        if (sprjaaa.cfr_renamed_9("3\u0003$").equals(arg0)) {
            return 1;
        }
        if (sprjtba.cfr_renamed_9("2\\=K").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprjaaa.cfr_renamed_9("\u001a\u000f$\u000f \u0016!A\f\u000e\"\u0011=\u0004<\u0012\u0002\u000e+\u0004o\u000f.\f*O"));
    }

    private /* synthetic */ sprozn() {
    }
}

