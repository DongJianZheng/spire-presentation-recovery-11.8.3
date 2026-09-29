/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupn;

@sprtea
public final class sprpdo {
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprupn.cfr_renamed_9("j\u001bD\u0004F\u0007@\u0000L").equals(arg0)) {
            return 0;
        }
        if (sprrvy.cfr_renamed_9("F`gwFkbw").equals(arg0)) {
            return 1;
        }
        if (sprupn.cfr_renamed_9("z\u0000H\u001aM\u0015[\u0010}\rY\u0011\u0018").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprrvy.cfr_renamed_9("G|y|}e|2BvtT}|fFkbw2|s\u007fw<"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = 2 << 3 ^ 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ 3;
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

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprupn.cfr_renamed_9("j\u001bD\u0004F\u0007@\u0000L");
            }
            case 1: {
                return sprrvy.cfr_renamed_9("F`gwFkbw");
            }
            case 2: {
                return sprupn.cfr_renamed_9("z\u0000H\u001aM\u0015[\u0010}\rY\u0011\u0018");
            }
        }
        return sprrvy.cfr_renamed_9("G|y|}e|2BvtT}|fFkbw2ds~gw<");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprupn.cfr_renamed_9("j\u001bD\u0004F\u0007@\u0000L");
            }
            case 1: {
                return sprrvy.cfr_renamed_9("F`gwFkbw");
            }
            case 2: {
                return sprupn.cfr_renamed_9("z\u0000H\u001aM\u0015[\u0010}\rY\u0011\u0018");
            }
        }
        return sprrvy.cfr_renamed_9("G|y|}e|2BvtT}|fFkbw2ds~gw<");
    }

    private /* synthetic */ sprpdo() {
    }
}

