/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprrle;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprqxn {
    public static final int cfr_renamed_1 = 3;
    public static final byte cfr_renamed_2 = 41;
    public static final byte cfr_renamed_3 = 39;
    public static final byte cfr_renamed_4 = 40;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (39 == arg0) {
            return sprboj.cfr_renamed_9("K[iAc");
        }
        if (41 == arg0) {
            return sprrle.cfr_renamed_9("+\u001e\u0013\u0003\u000b\u0012\"\u0019\u0003\u001e\u0006\u0019");
        }
        if (40 == arg0) {
            return sprboj.cfr_renamed_9("HAmmdLcId");
        }
        return sprrle.cfr_renamed_9("2\u0019\f\u0019\b\u0000\tW%\u000e\u0013\u0012(\u0005\u0003\u0012\u0015W\u0011\u0016\u000b\u0002\u0002Y");
    }

    private /* synthetic */ sprqxn() {
    }

    public static String cfr_renamed_12048(byte arg0) {
        if (39 == arg0) {
            return sprboj.cfr_renamed_9("K[iAc");
        }
        if (41 == arg0) {
            return sprrle.cfr_renamed_9("+\u001e\u0013\u0003\u000b\u0012\"\u0019\u0003\u001e\u0006\u0019");
        }
        if (40 == arg0) {
            return sprboj.cfr_renamed_9("HAmmdLcId");
        }
        return sprrle.cfr_renamed_9("2\u0019\f\u0019\b\u0000\tW%\u000e\u0013\u0012(\u0005\u0003\u0012\u0015W\u0011\u0016\u000b\u0002\u0002Y");
    }

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[3];
        byArray[0] = 39;
        byArray[1] = 41;
        byArray[2] = 40;
        return byArray;
    }

    public static byte cfr_renamed_5644(String arg0) {
        if (sprboj.cfr_renamed_9("K[iAc").equals(arg0)) {
            return 39;
        }
        if (sprrle.cfr_renamed_9("+\u001e\u0013\u0003\u000b\u0012\"\u0019\u0003\u001e\u0006\u0019").equals(arg0)) {
            return 41;
        }
        if (sprboj.cfr_renamed_9("HAmmdLcId").equals(arg0)) {
            return 40;
        }
        throw new IllegalArgumentException(sprrle.cfr_renamed_9("\"\t\u001c\t\u0018\u0010\u0019G5\u001e\u0003\u00028\u0015\u0013\u0002\u0005G\u0019\u0006\u001a\u0002Y"));
    }
}

