/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprvih;

public abstract class sprjlh {
    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1627(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        sprmeh.cfr_renamed_1627(arg0, (int[])arg1);
        sprmeh.cfr_renamed_1628(arg0, 8, (int[])arg1, 16);
        int n = sprmeh.cfr_renamed_1629(nArray2, 8, (int[])arg1, 16);
        void v0 = arg1;
        int n2 = n + sprmeh.cfr_renamed_1630((int[])v0, 0, (int[])v0, 8, 0);
        void v1 = arg1;
        n += sprmeh.cfr_renamed_1630((int[])v1, 24, (int[])v1, 16, n2);
        int[] nArray3 = sprmeh.cfr_renamed_1631();
        sprmeh.cfr_renamed_1632(arg0, 8, arg0, 0, nArray3, 0);
        int[] nArray4 = sprmeh.cfr_renamed_1633();
        sprmeh.cfr_renamed_1627(nArray3, nArray4);
        sprvih.cfr_renamed_1634(32, n += sprvih.cfr_renamed_1635(16, nArray4, 0, (int[])arg1, 8), (int[])arg1, 24);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        sprmeh.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg2);
        sprmeh.cfr_renamed_1637(arg0, 8, (int[])arg1, 8, (int[])arg2, 16);
        int n = sprmeh.cfr_renamed_1629(nArray3, 8, (int[])arg2, 16);
        void v0 = arg2;
        int n2 = n + sprmeh.cfr_renamed_1630((int[])v0, 0, (int[])v0, 8, 0);
        void v1 = arg2;
        n += sprmeh.cfr_renamed_1630((int[])v1, 24, (int[])v1, 16, n2);
        int[] nArray4 = sprmeh.cfr_renamed_1631();
        int[] nArray5 = sprmeh.cfr_renamed_1631();
        void v2 = arg1;
        boolean bl = sprmeh.cfr_renamed_1632(arg0, 8, arg0, 0, nArray4, 0) != sprmeh.cfr_renamed_1632((int[])v2, 8, (int[])v2, 0, nArray5, 0);
        int[] nArray6 = sprmeh.cfr_renamed_1633();
        sprmeh.cfr_renamed_1636(nArray4, nArray5, nArray6);
        sprvih.cfr_renamed_1634(32, n += bl ? sprvih.cfr_renamed_1638(16, nArray6, 0, (int[])arg2, 8) : sprvih.cfr_renamed_1635(16, nArray6, 0, (int[])arg2, 8), (int[])arg2, 24);
    }
}

