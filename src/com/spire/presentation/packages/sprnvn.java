/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpaba;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzeo;

@sprtea
public final class sprnvn {
    public static final byte cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 3;
    public static final byte cfr_renamed_3 = 2;
    public static final byte cfr_renamed_4 = 1;

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 ^ 5;
        int n4 = n2;
        int n5 = 2 << 3 ^ 2;
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
        if (sprzeo.cfr_renamed_9("\u000f9(a\u001e").equals(arg0)) {
            return 0;
        }
        if (sprpaba.cfr_renamed_9("B?ebS").equals(arg0)) {
            return 1;
        }
        if (sprzeo.cfr_renamed_9("\u000f0(a\u001e").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprpaba.cfr_renamed_9("^I`IdPe\u0007HHgHycnW\u007fO+IjJn\t"));
    }

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return sprzeo.cfr_renamed_9("\u000f9(a\u001e");
        }
        if (1 == arg0) {
            return sprpaba.cfr_renamed_9("B?ebS");
        }
        if (2 == arg0) {
            return sprzeo.cfr_renamed_9("\u000f0(a\u001e");
        }
        return sprpaba.cfr_renamed_9("reLeH|I+ddKdUOB{Sc\u0007}FgRn\t");
    }

    private /* synthetic */ sprnvn() {
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return sprzeo.cfr_renamed_9("\u000f9(a\u001e");
        }
        if (1 == arg0) {
            return sprpaba.cfr_renamed_9("B?ebS");
        }
        if (2 == arg0) {
            return sprzeo.cfr_renamed_9("\u000f0(a\u001e");
        }
        return sprpaba.cfr_renamed_9("reLeH|I+ddKdUOB{Sc\u0007}FgRn\t");
    }

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[3];
        byArray[0] = 0;
        byArray[1] = 1;
        byArray[2] = 2;
        return byArray;
    }
}

