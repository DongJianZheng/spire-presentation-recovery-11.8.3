/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprvih;

public abstract class sprwkh {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 4 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
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
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        sprinh.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg2);
        sprinh.cfr_renamed_1637(arg0, 6, (int[])arg1, 6, (int[])arg2, 12);
        int n = sprinh.cfr_renamed_1629(nArray3, 6, (int[])arg2, 12);
        void v0 = arg2;
        int n2 = n + sprinh.cfr_renamed_1630((int[])v0, 0, (int[])v0, 6, 0);
        void v1 = arg2;
        n += sprinh.cfr_renamed_1630((int[])v1, 18, (int[])v1, 12, n2);
        int[] nArray4 = sprinh.cfr_renamed_1631();
        int[] nArray5 = sprinh.cfr_renamed_1631();
        void v2 = arg1;
        boolean bl = sprinh.cfr_renamed_1632(arg0, 6, arg0, 0, nArray4, 0) != sprinh.cfr_renamed_1632((int[])v2, 6, (int[])v2, 0, nArray5, 0);
        int[] nArray6 = sprinh.cfr_renamed_1633();
        sprinh.cfr_renamed_1636(nArray4, nArray5, nArray6);
        sprvih.cfr_renamed_1634(24, n += bl ? sprvih.cfr_renamed_1638(12, nArray6, 0, (int[])arg2, 6) : sprvih.cfr_renamed_1635(12, nArray6, 0, (int[])arg2, 6), (int[])arg2, 18);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1627(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        sprinh.cfr_renamed_1627(arg0, (int[])arg1);
        sprinh.cfr_renamed_1628(arg0, 6, (int[])arg1, 12);
        int n = sprinh.cfr_renamed_1629(nArray2, 6, (int[])arg1, 12);
        void v0 = arg1;
        int n2 = n + sprinh.cfr_renamed_1630((int[])v0, 0, (int[])v0, 6, 0);
        void v1 = arg1;
        n += sprinh.cfr_renamed_1630((int[])v1, 18, (int[])v1, 12, n2);
        int[] nArray3 = sprinh.cfr_renamed_1631();
        sprinh.cfr_renamed_1632(arg0, 6, arg0, 0, nArray3, 0);
        int[] nArray4 = sprinh.cfr_renamed_1633();
        sprinh.cfr_renamed_1627(nArray3, nArray4);
        sprvih.cfr_renamed_1634(24, n += sprvih.cfr_renamed_1635(12, nArray4, 0, (int[])arg1, 6), (int[])arg1, 18);
    }
}

