/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhao;
import com.spire.presentation.packages.spriko;
import com.spire.presentation.packages.sprzra;

public class sprbhb {
    private int cfr_renamed_1;
    private int[] cfr_renamed_2;
    private int[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    public int[] cfr_renamed_1150() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprbhb(int n) throws IllegalArgumentException {
        void arg0;
        if (n <= 10) {
            int[] nArray = new int[1];
            nArray[0] = 10;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[1];
            nArray3[0] = 3;
            int[] nArray4 = nArray3;
            int[] nArray5 = new int[1];
            nArray5[0] = 2;
            int[] nArray6 = nArray5;
            this.cfr_renamed_1430(nArray2.length, nArray2, nArray4, nArray6);
            return;
        }
        if (arg0 <= 20) {
            int[] nArray = new int[2];
            nArray[0] = 10;
            nArray[1] = 10;
            int[] nArray7 = nArray;
            int[] nArray8 = new int[2];
            nArray8[0] = 5;
            nArray8[1] = 4;
            int[] nArray9 = nArray8;
            int[] nArray10 = new int[2];
            nArray10[0] = 2;
            nArray10[1] = 2;
            int[] nArray11 = nArray10;
            this.cfr_renamed_1430(nArray7.length, nArray7, nArray9, nArray11);
            return;
        }
        int[] nArray = new int[4];
        nArray[0] = 10;
        nArray[1] = 10;
        nArray[2] = 10;
        nArray[3] = 10;
        int[] nArray12 = nArray;
        int[] nArray13 = new int[4];
        nArray13[0] = 9;
        nArray13[1] = 9;
        nArray13[2] = 9;
        nArray13[3] = 3;
        int[] nArray14 = nArray13;
        int[] nArray15 = new int[4];
        nArray15[0] = 2;
        nArray15[1] = 2;
        nArray15[2] = 2;
        nArray15[3] = 2;
        int[] nArray16 = nArray15;
        this.cfr_renamed_1430(nArray12.length, nArray12, nArray14, nArray16);
    }

    public int cfr_renamed_1140() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_1430(int arg0, int[] arg1, int[] arg2, int[] arg3) throws IllegalArgumentException {
        int n;
        boolean bl = true;
        String string = "";
        this.cfr_renamed_1 = arg0;
        if (this.cfr_renamed_1 != arg2.length || this.cfr_renamed_1 != arg1.length || this.cfr_renamed_1 != arg3.length) {
            bl = false;
            string = spriko.cfr_renamed_9("rGBQWLD]BM\u0007YF[FDB]B[TLS\tAFUDF]");
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            if (arg3[n] < 2 || (arg1[n] - arg3[n]) % 2 != 0) {
                bl = false;
                string = sprhao.cfr_renamed_9("^gf{n5yt{tdp}p{5B5!^)+45;5h{m5A8B5lcl{)gld||{pm<(");
            }
            if (arg1[n] < 4 || arg2[n] < 2) {
                bl = false;
                string = spriko.cfr_renamed_9("p[HG@\tWHUHJLSLU\to\tH[\u0007^\u0007\u0001o\t\u0019\t\u0014\tFGC\tP\t\u0019\t\u0016\tULV\\N[BM\u000e\b");
            }
            n2 = ++n;
        }
        if (bl) {
            sprbhb sprbhb2 = this;
            this.cfr_renamed_3 = sprzra.cfr_renamed_535(arg1);
            sprbhb2.cfr_renamed_2 = sprzra.cfr_renamed_535(arg2);
            sprbhb2.cfr_renamed_4 = sprzra.cfr_renamed_535(arg3);
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public int[] cfr_renamed_1249() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprbhb(int n, int[] nArray, int[] nArray2, int[] nArray3) throws IllegalArgumentException {
        void arg3;
        void arg2;
        void arg1;
        sprbhb sprbhb2 = this;
        sprbhb2.cfr_renamed_1430(n, (int[])arg1, (int[])arg2, (int[])arg3);
    }

    public int[] cfr_renamed_1250() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_2);
    }
}

