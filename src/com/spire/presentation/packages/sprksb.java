/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqlb;
import com.spire.presentation.packages.sprrpb;

public abstract class sprksb {
    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1627(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        sprqlb.cfr_renamed_1627(arg0, (int[])arg1);
        sprqlb.cfr_renamed_1628(arg0, 6, (int[])arg1, 12);
        int n = sprqlb.cfr_renamed_1629(nArray2, 6, (int[])arg1, 12);
        void v0 = arg1;
        int n2 = n + sprqlb.cfr_renamed_1630((int[])v0, 0, (int[])v0, 6, 0);
        void v1 = arg1;
        n += sprqlb.cfr_renamed_1630((int[])v1, 18, (int[])v1, 12, n2);
        int[] nArray3 = sprqlb.cfr_renamed_1631();
        sprqlb.cfr_renamed_1632(arg0, 6, arg0, 0, nArray3, 0);
        int[] nArray4 = sprqlb.cfr_renamed_1633();
        sprqlb.cfr_renamed_1627(nArray3, nArray4);
        sprrpb.cfr_renamed_1634(24, n += sprrpb.cfr_renamed_1635(12, nArray4, 0, (int[])arg1, 6), (int[])arg1, 18);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        sprqlb.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg2);
        sprqlb.cfr_renamed_1637(arg0, 6, (int[])arg1, 6, (int[])arg2, 12);
        int n = sprqlb.cfr_renamed_1629(nArray3, 6, (int[])arg2, 12);
        void v0 = arg2;
        int n2 = n + sprqlb.cfr_renamed_1630((int[])v0, 0, (int[])v0, 6, 0);
        void v1 = arg2;
        n += sprqlb.cfr_renamed_1630((int[])v1, 18, (int[])v1, 12, n2);
        int[] nArray4 = sprqlb.cfr_renamed_1631();
        int[] nArray5 = sprqlb.cfr_renamed_1631();
        void v2 = arg1;
        boolean bl = sprqlb.cfr_renamed_1632(arg0, 6, arg0, 0, nArray4, 0) != sprqlb.cfr_renamed_1632((int[])v2, 6, (int[])v2, 0, nArray5, 0);
        int[] nArray6 = sprqlb.cfr_renamed_1633();
        sprqlb.cfr_renamed_1636(nArray4, nArray5, nArray6);
        sprrpb.cfr_renamed_1634(24, n += bl ? sprrpb.cfr_renamed_1638(12, nArray6, 0, (int[])arg2, 6) : sprrpb.cfr_renamed_1635(12, nArray6, 0, (int[])arg2, 6), (int[])arg2, 18);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 4 << 1;
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
}

