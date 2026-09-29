/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprefg;
import com.spire.presentation.packages.sprgxha;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprxun {
    public static final byte cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    public static final byte cfr_renamed_4 = 1;

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return "Horizontal";
        }
        if (1 == arg0) {
            return "Vertical";
        }
        return sprgxha.cfr_renamed_9(")r\u0017r\u0013k\u0012<+n\u0015h\u0015r\u001bQ\u0013x\u0019<\n}\u0010i\u00192");
    }

    private /* synthetic */ sprxun() {
    }

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[2];
        byArray[0] = 0;
        byArray[1] = 1;
        return byArray;
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return "Horizontal";
        }
        if (1 == arg0) {
            return "Vertical";
        }
        return sprefg.cfr_renamed_9("xmFmBtC#zqDwDmJNBgH#[bAvH-");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = 4 << 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 << 2 ^ 3);
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

    public static byte cfr_renamed_5644(String arg0) {
        if ("Horizontal".equals(arg0)) {
            return 0;
        }
        if ("Vertical".equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprgxha.cfr_renamed_9("I\u0012w\u0012s\u000br\\K\u000eu\bu\u0012{1s\u0018y\\r\u001dq\u00192"));
    }
}

