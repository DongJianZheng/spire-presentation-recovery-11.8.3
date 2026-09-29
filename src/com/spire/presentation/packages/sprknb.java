/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.spryrb;

public abstract class sprknb {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 1;
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
     * WARNING - void declaration
     */
    public static void cfr_renamed_1627(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        spryrb.cfr_renamed_1627(arg0, (int[])arg1);
        spryrb.cfr_renamed_1628(arg0, 8, (int[])arg1, 16);
        int n = spryrb.cfr_renamed_1629(nArray2, 8, (int[])arg1, 16);
        void v0 = arg1;
        int n2 = n + spryrb.cfr_renamed_1630((int[])v0, 0, (int[])v0, 8, 0);
        void v1 = arg1;
        n += spryrb.cfr_renamed_1630((int[])v1, 24, (int[])v1, 16, n2);
        int[] nArray3 = spryrb.cfr_renamed_1631();
        spryrb.cfr_renamed_1632(arg0, 8, arg0, 0, nArray3, 0);
        int[] nArray4 = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1627(nArray3, nArray4);
        sprrpb.cfr_renamed_1634(32, n += sprrpb.cfr_renamed_1635(16, nArray4, 0, (int[])arg1, 8), (int[])arg1, 24);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        spryrb.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg2);
        spryrb.cfr_renamed_1637(arg0, 8, (int[])arg1, 8, (int[])arg2, 16);
        int n = spryrb.cfr_renamed_1629(nArray3, 8, (int[])arg2, 16);
        void v0 = arg2;
        int n2 = n + spryrb.cfr_renamed_1630((int[])v0, 0, (int[])v0, 8, 0);
        void v1 = arg2;
        n += spryrb.cfr_renamed_1630((int[])v1, 24, (int[])v1, 16, n2);
        int[] nArray4 = spryrb.cfr_renamed_1631();
        int[] nArray5 = spryrb.cfr_renamed_1631();
        void v2 = arg1;
        boolean bl = spryrb.cfr_renamed_1632(arg0, 8, arg0, 0, nArray4, 0) != spryrb.cfr_renamed_1632((int[])v2, 8, (int[])v2, 0, nArray5, 0);
        int[] nArray6 = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1636(nArray4, nArray5, nArray6);
        sprrpb.cfr_renamed_1634(32, n += bl ? sprrpb.cfr_renamed_1638(16, nArray6, 0, (int[])arg2, 8) : sprrpb.cfr_renamed_1635(16, nArray6, 0, (int[])arg2, 8), (int[])arg2, 24);
    }
}

