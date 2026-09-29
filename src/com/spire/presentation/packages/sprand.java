/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprrj;

public class sprand
extends sprehd {
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 20;
    private int[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3835(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)arg0;
        arg1[v1 + true] = (byte)(arg0 >>> 8);
        v0[v1 + 2] = (byte)(arg0 >>> 16);
        v0[n2 + 3] = (byte)(arg0 >>> 24);
    }

    private /* synthetic */ int cfr_renamed_3838(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_91 > 14) {
            this.cfr_renamed_3473();
        }
        sprand sprand2 = this;
        sprand2.cfr_renamed_1[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprand2.cfr_renamed_1[15] = (int)(arg0 >>> 32);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprand sprand2 = this;
        sprand2.cfr_renamed_3120();
        sprand2.cfr_renamed_3835(sprand2.cfr_renamed_2, (byte[])arg0, (int)arg1);
        sprand2.cfr_renamed_3835(sprand2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 4));
        sprand2.cfr_renamed_3835(sprand2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 8));
        sprand2.cfr_renamed_3835(sprand2.cfr_renamed_3, (byte[])arg0, (int)(arg1 + 12));
        sprand2.cfr_renamed_3835(sprand2.cfr_renamed_112, (byte[])arg0, (int)(arg1 + 16));
        sprand2.cfr_renamed_41();
        return 20;
    }

    @Override
    public String cfr_renamed_1315() {
        return "RIPEMD160";
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprand sprand2 = this;
        sprand sprand3 = this;
        sprand sprand4 = this;
        super.cfr_renamed_41();
        sprand4.cfr_renamed_2 = 1732584193;
        sprand4.cfr_renamed_4 = -271733879;
        sprand3.cfr_renamed_119 = -1732584194;
        sprand3.cfr_renamed_3 = 271733878;
        sprand2.cfr_renamed_112 = -1009589776;
        sprand2.cfr_renamed_91 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3837(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    private /* synthetic */ int cfr_renamed_3839(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_1[this.cfr_renamed_91++] = arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
        if (this.cfr_renamed_91 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ int cfr_renamed_3840(int arg0, int arg1, int arg2) {
        return (arg0 | ~arg1) ^ arg2;
    }

    private /* synthetic */ int cfr_renamed_3833(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        sprand sprand2 = this;
        int n7 = n6 = sprand2.cfr_renamed_2;
        int n8 = n5 = sprand2.cfr_renamed_4;
        int n9 = n4 = sprand2.cfr_renamed_119;
        int n10 = n3 = sprand2.cfr_renamed_3;
        int n11 = n2 = sprand2.cfr_renamed_112;
        n7 = sprand2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_1[0], 11) + n11;
        n9 = sprand2.cfr_renamed_3837(n9, 10);
        n11 = sprand2.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_1[1], 14) + n10;
        n8 = sprand2.cfr_renamed_3837(n8, 10);
        n10 = sprand2.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_1[2], 15) + n9;
        n7 = sprand2.cfr_renamed_3837(n7, 10);
        n9 = sprand2.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_1[3], 12) + n8;
        n11 = sprand2.cfr_renamed_3837(n11, 10);
        n8 = sprand2.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_1[4], 5) + n7;
        n10 = sprand2.cfr_renamed_3837(n10, 10);
        n7 = sprand2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_1[5], 8) + n11;
        n9 = sprand2.cfr_renamed_3837(n9, 10);
        n11 = sprand2.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_1[6], 7) + n10;
        n8 = sprand2.cfr_renamed_3837(n8, 10);
        n10 = sprand2.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_1[7], 9) + n9;
        n7 = sprand2.cfr_renamed_3837(n7, 10);
        n9 = sprand2.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_1[8], 11) + n8;
        n11 = sprand2.cfr_renamed_3837(n11, 10);
        n8 = sprand2.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_1[9], 13) + n7;
        n10 = sprand2.cfr_renamed_3837(n10, 10);
        n7 = sprand2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_1[10], 14) + n11;
        n9 = sprand2.cfr_renamed_3837(n9, 10);
        n11 = sprand2.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_1[11], 15) + n10;
        n8 = sprand2.cfr_renamed_3837(n8, 10);
        n10 = sprand2.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_1[12], 6) + n9;
        n7 = sprand2.cfr_renamed_3837(n7, 10);
        n9 = sprand2.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_1[13], 7) + n8;
        n11 = sprand2.cfr_renamed_3837(n11, 10);
        n8 = sprand2.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_1[14], 9) + n7;
        n10 = sprand2.cfr_renamed_3837(n10, 10);
        n7 = sprand2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_1[15], 8) + n11;
        n9 = sprand2.cfr_renamed_3837(n9, 10);
        n6 = sprand2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_1[5] + 1352829926, 8) + n2;
        n4 = sprand2.cfr_renamed_3837(n4, 10);
        n2 = sprand2.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n6, n5, n4) + this.cfr_renamed_1[14] + 1352829926, 9) + n3;
        n5 = sprand2.cfr_renamed_3837(n5, 10);
        n3 = sprand2.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n2, n6, n5) + this.cfr_renamed_1[7] + 1352829926, 9) + n4;
        n6 = sprand2.cfr_renamed_3837(n6, 10);
        n4 = sprand2.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n3, n2, n6) + this.cfr_renamed_1[0] + 1352829926, 11) + n5;
        n2 = sprand2.cfr_renamed_3837(n2, 10);
        n5 = sprand2.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n4, n3, n2) + this.cfr_renamed_1[9] + 1352829926, 13) + n6;
        n3 = sprand2.cfr_renamed_3837(n3, 10);
        n6 = sprand2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_1[2] + 1352829926, 15) + n2;
        n4 = sprand2.cfr_renamed_3837(n4, 10);
        n2 = sprand2.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n6, n5, n4) + this.cfr_renamed_1[11] + 1352829926, 15) + n3;
        n5 = sprand2.cfr_renamed_3837(n5, 10);
        n3 = sprand2.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n2, n6, n5) + this.cfr_renamed_1[4] + 1352829926, 5) + n4;
        n6 = sprand2.cfr_renamed_3837(n6, 10);
        n4 = sprand2.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n3, n2, n6) + this.cfr_renamed_1[13] + 1352829926, 7) + n5;
        n2 = sprand2.cfr_renamed_3837(n2, 10);
        n5 = sprand2.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n4, n3, n2) + this.cfr_renamed_1[6] + 1352829926, 7) + n6;
        n3 = sprand2.cfr_renamed_3837(n3, 10);
        n6 = sprand2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_1[15] + 1352829926, 8) + n2;
        n4 = sprand2.cfr_renamed_3837(n4, 10);
        n2 = sprand2.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n6, n5, n4) + this.cfr_renamed_1[8] + 1352829926, 11) + n3;
        n5 = sprand2.cfr_renamed_3837(n5, 10);
        n3 = sprand2.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n2, n6, n5) + this.cfr_renamed_1[1] + 1352829926, 14) + n4;
        n6 = sprand2.cfr_renamed_3837(n6, 10);
        n4 = sprand2.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n3, n2, n6) + this.cfr_renamed_1[10] + 1352829926, 14) + n5;
        n2 = sprand2.cfr_renamed_3837(n2, 10);
        n5 = sprand2.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n4, n3, n2) + this.cfr_renamed_1[3] + 1352829926, 12) + n6;
        n3 = sprand2.cfr_renamed_3837(n3, 10);
        n6 = sprand2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_1[12] + 1352829926, 6) + n2;
        sprand sprand3 = this;
        n4 = sprand3.cfr_renamed_3837(n4, 10);
        sprand sprand4 = this;
        n11 = sprand3.cfr_renamed_3837(n11 + sprand4.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_1[7] + 1518500249, 7) + n10;
        n8 = sprand4.cfr_renamed_3837(n8, 10);
        n10 = sprand3.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_1[4] + 1518500249, 6) + n9;
        n7 = sprand3.cfr_renamed_3837(n7, 10);
        n9 = sprand3.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_1[13] + 1518500249, 8) + n8;
        n11 = sprand3.cfr_renamed_3837(n11, 10);
        n8 = sprand3.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_1[1] + 1518500249, 13) + n7;
        n10 = sprand3.cfr_renamed_3837(n10, 10);
        n7 = sprand3.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_1[10] + 1518500249, 11) + n11;
        n9 = sprand3.cfr_renamed_3837(n9, 10);
        n11 = sprand3.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_1[6] + 1518500249, 9) + n10;
        n8 = sprand3.cfr_renamed_3837(n8, 10);
        n10 = sprand3.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_1[15] + 1518500249, 7) + n9;
        n7 = sprand3.cfr_renamed_3837(n7, 10);
        n9 = sprand3.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_1[3] + 1518500249, 15) + n8;
        n11 = sprand3.cfr_renamed_3837(n11, 10);
        n8 = sprand3.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_1[12] + 1518500249, 7) + n7;
        n10 = sprand3.cfr_renamed_3837(n10, 10);
        n7 = sprand3.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_1[0] + 1518500249, 12) + n11;
        n9 = sprand3.cfr_renamed_3837(n9, 10);
        n11 = sprand3.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_1[9] + 1518500249, 15) + n10;
        n8 = sprand3.cfr_renamed_3837(n8, 10);
        n10 = sprand3.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_1[5] + 1518500249, 9) + n9;
        n7 = sprand3.cfr_renamed_3837(n7, 10);
        n9 = sprand3.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_1[2] + 1518500249, 11) + n8;
        n11 = sprand3.cfr_renamed_3837(n11, 10);
        n8 = sprand3.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_1[14] + 1518500249, 7) + n7;
        n10 = sprand3.cfr_renamed_3837(n10, 10);
        n7 = sprand3.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_1[11] + 1518500249, 13) + n11;
        n9 = sprand3.cfr_renamed_3837(n9, 10);
        n11 = sprand3.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_1[8] + 1518500249, 12) + n10;
        n8 = sprand3.cfr_renamed_3837(n8, 10);
        n2 = sprand3.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + this.cfr_renamed_1[6] + 1548603684, 9) + n3;
        n5 = sprand3.cfr_renamed_3837(n5, 10);
        n3 = sprand3.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n2, n6, n5) + this.cfr_renamed_1[11] + 1548603684, 13) + n4;
        n6 = sprand3.cfr_renamed_3837(n6, 10);
        n4 = sprand3.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n3, n2, n6) + this.cfr_renamed_1[3] + 1548603684, 15) + n5;
        n2 = sprand3.cfr_renamed_3837(n2, 10);
        n5 = sprand3.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n4, n3, n2) + this.cfr_renamed_1[7] + 1548603684, 7) + n6;
        n3 = sprand3.cfr_renamed_3837(n3, 10);
        n6 = sprand3.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n5, n4, n3) + this.cfr_renamed_1[0] + 1548603684, 12) + n2;
        n4 = sprand3.cfr_renamed_3837(n4, 10);
        n2 = sprand3.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + this.cfr_renamed_1[13] + 1548603684, 8) + n3;
        n5 = sprand3.cfr_renamed_3837(n5, 10);
        n3 = sprand3.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n2, n6, n5) + this.cfr_renamed_1[5] + 1548603684, 9) + n4;
        n6 = sprand3.cfr_renamed_3837(n6, 10);
        n4 = sprand3.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n3, n2, n6) + this.cfr_renamed_1[10] + 1548603684, 11) + n5;
        n2 = sprand3.cfr_renamed_3837(n2, 10);
        n5 = sprand3.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n4, n3, n2) + this.cfr_renamed_1[14] + 1548603684, 7) + n6;
        n3 = sprand3.cfr_renamed_3837(n3, 10);
        n6 = sprand3.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n5, n4, n3) + this.cfr_renamed_1[15] + 1548603684, 7) + n2;
        n4 = sprand3.cfr_renamed_3837(n4, 10);
        n2 = sprand3.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + this.cfr_renamed_1[8] + 1548603684, 12) + n3;
        n5 = sprand3.cfr_renamed_3837(n5, 10);
        n3 = sprand3.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n2, n6, n5) + this.cfr_renamed_1[12] + 1548603684, 7) + n4;
        n6 = sprand3.cfr_renamed_3837(n6, 10);
        n4 = sprand3.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n3, n2, n6) + this.cfr_renamed_1[4] + 1548603684, 6) + n5;
        n2 = sprand3.cfr_renamed_3837(n2, 10);
        n5 = sprand3.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n4, n3, n2) + this.cfr_renamed_1[9] + 1548603684, 15) + n6;
        n3 = sprand3.cfr_renamed_3837(n3, 10);
        n6 = sprand3.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n5, n4, n3) + this.cfr_renamed_1[1] + 1548603684, 13) + n2;
        n4 = sprand3.cfr_renamed_3837(n4, 10);
        sprand sprand5 = this;
        sprand sprand6 = this;
        n2 = sprand6.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + sprand6.cfr_renamed_1[2] + 1548603684, 11) + n3;
        n5 = sprand5.cfr_renamed_3837(n5, 10);
        sprand sprand7 = this;
        n10 = sprand7.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + sprand7.cfr_renamed_1[3] + 1859775393, 11) + n9;
        n7 = sprand5.cfr_renamed_3837(n7, 10);
        n9 = sprand5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_1[10] + 1859775393, 13) + n8;
        n11 = sprand5.cfr_renamed_3837(n11, 10);
        n8 = sprand5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_1[14] + 1859775393, 6) + n7;
        n10 = sprand5.cfr_renamed_3837(n10, 10);
        n7 = sprand5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_1[4] + 1859775393, 7) + n11;
        n9 = sprand5.cfr_renamed_3837(n9, 10);
        n11 = sprand5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_1[9] + 1859775393, 14) + n10;
        n8 = sprand5.cfr_renamed_3837(n8, 10);
        n10 = sprand5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_1[15] + 1859775393, 9) + n9;
        n7 = sprand5.cfr_renamed_3837(n7, 10);
        n9 = sprand5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_1[8] + 1859775393, 13) + n8;
        n11 = sprand5.cfr_renamed_3837(n11, 10);
        n8 = sprand5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_1[1] + 1859775393, 15) + n7;
        n10 = sprand5.cfr_renamed_3837(n10, 10);
        n7 = sprand5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_1[2] + 1859775393, 14) + n11;
        n9 = sprand5.cfr_renamed_3837(n9, 10);
        n11 = sprand5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_1[7] + 1859775393, 8) + n10;
        n8 = sprand5.cfr_renamed_3837(n8, 10);
        n10 = sprand5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_1[0] + 1859775393, 13) + n9;
        n7 = sprand5.cfr_renamed_3837(n7, 10);
        n9 = sprand5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_1[6] + 1859775393, 6) + n8;
        n11 = sprand5.cfr_renamed_3837(n11, 10);
        n8 = sprand5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_1[13] + 1859775393, 5) + n7;
        n10 = sprand5.cfr_renamed_3837(n10, 10);
        n7 = sprand5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_1[11] + 1859775393, 12) + n11;
        n9 = sprand5.cfr_renamed_3837(n9, 10);
        n11 = sprand5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_1[5] + 1859775393, 7) + n10;
        n8 = sprand5.cfr_renamed_3837(n8, 10);
        n10 = sprand5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_1[12] + 1859775393, 5) + n9;
        n7 = sprand5.cfr_renamed_3837(n7, 10);
        n3 = sprand5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_1[15] + 1836072691, 9) + n4;
        n6 = sprand5.cfr_renamed_3837(n6, 10);
        n4 = sprand5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n3, n2, n6) + this.cfr_renamed_1[5] + 1836072691, 7) + n5;
        n2 = sprand5.cfr_renamed_3837(n2, 10);
        n5 = sprand5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n4, n3, n2) + this.cfr_renamed_1[1] + 1836072691, 15) + n6;
        n3 = sprand5.cfr_renamed_3837(n3, 10);
        n6 = sprand5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n5, n4, n3) + this.cfr_renamed_1[3] + 1836072691, 11) + n2;
        n4 = sprand5.cfr_renamed_3837(n4, 10);
        n2 = sprand5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n6, n5, n4) + this.cfr_renamed_1[7] + 1836072691, 8) + n3;
        n5 = sprand5.cfr_renamed_3837(n5, 10);
        n3 = sprand5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_1[14] + 1836072691, 6) + n4;
        n6 = sprand5.cfr_renamed_3837(n6, 10);
        n4 = sprand5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n3, n2, n6) + this.cfr_renamed_1[6] + 1836072691, 6) + n5;
        n2 = sprand5.cfr_renamed_3837(n2, 10);
        n5 = sprand5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n4, n3, n2) + this.cfr_renamed_1[9] + 1836072691, 14) + n6;
        n3 = sprand5.cfr_renamed_3837(n3, 10);
        n6 = sprand5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n5, n4, n3) + this.cfr_renamed_1[11] + 1836072691, 12) + n2;
        n4 = sprand5.cfr_renamed_3837(n4, 10);
        n2 = sprand5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n6, n5, n4) + this.cfr_renamed_1[8] + 1836072691, 13) + n3;
        n5 = sprand5.cfr_renamed_3837(n5, 10);
        n3 = sprand5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_1[12] + 1836072691, 5) + n4;
        n6 = sprand5.cfr_renamed_3837(n6, 10);
        n4 = sprand5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n3, n2, n6) + this.cfr_renamed_1[2] + 1836072691, 14) + n5;
        n2 = sprand5.cfr_renamed_3837(n2, 10);
        n5 = sprand5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n4, n3, n2) + this.cfr_renamed_1[10] + 1836072691, 13) + n6;
        n3 = sprand5.cfr_renamed_3837(n3, 10);
        n6 = sprand5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n5, n4, n3) + this.cfr_renamed_1[0] + 1836072691, 13) + n2;
        n4 = sprand5.cfr_renamed_3837(n4, 10);
        n2 = sprand5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n6, n5, n4) + this.cfr_renamed_1[4] + 1836072691, 7) + n3;
        sprand sprand8 = this;
        n5 = sprand8.cfr_renamed_3837(n5, 10);
        sprand sprand9 = this;
        n3 = sprand8.cfr_renamed_3837(n3 + sprand9.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_1[13] + 1836072691, 5) + n4;
        n6 = sprand9.cfr_renamed_3837(n6, 10);
        n9 = sprand8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_1[1] + -1894007588, 11) + n8;
        n11 = sprand8.cfr_renamed_3837(n11, 10);
        n8 = sprand8.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_1[9] + -1894007588, 12) + n7;
        n10 = sprand8.cfr_renamed_3837(n10, 10);
        n7 = sprand8.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_1[11] + -1894007588, 14) + n11;
        n9 = sprand8.cfr_renamed_3837(n9, 10);
        n11 = sprand8.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_1[10] + -1894007588, 15) + n10;
        n8 = sprand8.cfr_renamed_3837(n8, 10);
        n10 = sprand8.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_1[0] + -1894007588, 14) + n9;
        n7 = sprand8.cfr_renamed_3837(n7, 10);
        n9 = sprand8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_1[8] + -1894007588, 15) + n8;
        n11 = sprand8.cfr_renamed_3837(n11, 10);
        n8 = sprand8.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_1[12] + -1894007588, 9) + n7;
        n10 = sprand8.cfr_renamed_3837(n10, 10);
        n7 = sprand8.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_1[4] + -1894007588, 8) + n11;
        n9 = sprand8.cfr_renamed_3837(n9, 10);
        n11 = sprand8.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_1[13] + -1894007588, 9) + n10;
        n8 = sprand8.cfr_renamed_3837(n8, 10);
        n10 = sprand8.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_1[3] + -1894007588, 14) + n9;
        n7 = sprand8.cfr_renamed_3837(n7, 10);
        n9 = sprand8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_1[7] + -1894007588, 5) + n8;
        n11 = sprand8.cfr_renamed_3837(n11, 10);
        n8 = sprand8.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_1[15] + -1894007588, 6) + n7;
        n10 = sprand8.cfr_renamed_3837(n10, 10);
        n7 = sprand8.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_1[14] + -1894007588, 8) + n11;
        n9 = sprand8.cfr_renamed_3837(n9, 10);
        n11 = sprand8.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_1[5] + -1894007588, 6) + n10;
        n8 = sprand8.cfr_renamed_3837(n8, 10);
        n10 = sprand8.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_1[6] + -1894007588, 5) + n9;
        n7 = sprand8.cfr_renamed_3837(n7, 10);
        n9 = sprand8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_1[2] + -1894007588, 12) + n8;
        n11 = sprand8.cfr_renamed_3837(n11, 10);
        n4 = sprand8.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + this.cfr_renamed_1[8] + 2053994217, 15) + n5;
        n2 = sprand8.cfr_renamed_3837(n2, 10);
        n5 = sprand8.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n4, n3, n2) + this.cfr_renamed_1[6] + 2053994217, 5) + n6;
        n3 = sprand8.cfr_renamed_3837(n3, 10);
        n6 = sprand8.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n5, n4, n3) + this.cfr_renamed_1[4] + 2053994217, 8) + n2;
        n4 = sprand8.cfr_renamed_3837(n4, 10);
        n2 = sprand8.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n6, n5, n4) + this.cfr_renamed_1[1] + 2053994217, 11) + n3;
        n5 = sprand8.cfr_renamed_3837(n5, 10);
        n3 = sprand8.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n2, n6, n5) + this.cfr_renamed_1[3] + 2053994217, 14) + n4;
        n6 = sprand8.cfr_renamed_3837(n6, 10);
        n4 = sprand8.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + this.cfr_renamed_1[11] + 2053994217, 14) + n5;
        n2 = sprand8.cfr_renamed_3837(n2, 10);
        n5 = sprand8.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n4, n3, n2) + this.cfr_renamed_1[15] + 2053994217, 6) + n6;
        n3 = sprand8.cfr_renamed_3837(n3, 10);
        n6 = sprand8.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n5, n4, n3) + this.cfr_renamed_1[0] + 2053994217, 14) + n2;
        n4 = sprand8.cfr_renamed_3837(n4, 10);
        n2 = sprand8.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n6, n5, n4) + this.cfr_renamed_1[5] + 2053994217, 6) + n3;
        n5 = sprand8.cfr_renamed_3837(n5, 10);
        n3 = sprand8.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n2, n6, n5) + this.cfr_renamed_1[12] + 2053994217, 9) + n4;
        n6 = sprand8.cfr_renamed_3837(n6, 10);
        n4 = sprand8.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + this.cfr_renamed_1[2] + 2053994217, 12) + n5;
        n2 = sprand8.cfr_renamed_3837(n2, 10);
        n5 = sprand8.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n4, n3, n2) + this.cfr_renamed_1[13] + 2053994217, 9) + n6;
        n3 = sprand8.cfr_renamed_3837(n3, 10);
        n6 = sprand8.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n5, n4, n3) + this.cfr_renamed_1[9] + 2053994217, 12) + n2;
        n4 = sprand8.cfr_renamed_3837(n4, 10);
        n2 = sprand8.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n6, n5, n4) + this.cfr_renamed_1[7] + 2053994217, 5) + n3;
        n5 = sprand8.cfr_renamed_3837(n5, 10);
        sprand sprand10 = this;
        sprand sprand11 = this;
        n3 = sprand11.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n2, n6, n5) + sprand11.cfr_renamed_1[10] + 2053994217, 15) + n4;
        n6 = sprand10.cfr_renamed_3837(n6, 10);
        sprand sprand12 = this;
        n4 = sprand12.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + sprand12.cfr_renamed_1[14] + 2053994217, 8) + n5;
        n2 = sprand10.cfr_renamed_3837(n2, 10);
        n8 = sprand10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_1[4] + -1454113458, 9) + n7;
        n10 = sprand10.cfr_renamed_3837(n10, 10);
        n7 = sprand10.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_1[0] + -1454113458, 15) + n11;
        n9 = sprand10.cfr_renamed_3837(n9, 10);
        n11 = sprand10.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_1[5] + -1454113458, 5) + n10;
        n8 = sprand10.cfr_renamed_3837(n8, 10);
        n10 = sprand10.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_1[9] + -1454113458, 11) + n9;
        n7 = sprand10.cfr_renamed_3837(n7, 10);
        n9 = sprand10.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_1[7] + -1454113458, 6) + n8;
        n11 = sprand10.cfr_renamed_3837(n11, 10);
        n8 = sprand10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_1[12] + -1454113458, 8) + n7;
        n10 = sprand10.cfr_renamed_3837(n10, 10);
        n7 = sprand10.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_1[2] + -1454113458, 13) + n11;
        n9 = sprand10.cfr_renamed_3837(n9, 10);
        n11 = sprand10.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_1[10] + -1454113458, 12) + n10;
        n8 = sprand10.cfr_renamed_3837(n8, 10);
        n10 = sprand10.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_1[14] + -1454113458, 5) + n9;
        n7 = sprand10.cfr_renamed_3837(n7, 10);
        n9 = sprand10.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_1[1] + -1454113458, 12) + n8;
        n11 = sprand10.cfr_renamed_3837(n11, 10);
        n8 = sprand10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_1[3] + -1454113458, 13) + n7;
        n10 = sprand10.cfr_renamed_3837(n10, 10);
        n7 = sprand10.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_1[8] + -1454113458, 14) + n11;
        n9 = sprand10.cfr_renamed_3837(n9, 10);
        n11 = sprand10.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_1[11] + -1454113458, 11) + n10;
        n8 = sprand10.cfr_renamed_3837(n8, 10);
        n10 = sprand10.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_1[6] + -1454113458, 8) + n9;
        n7 = sprand10.cfr_renamed_3837(n7, 10);
        n9 = sprand10.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_1[15] + -1454113458, 5) + n8;
        n11 = sprand10.cfr_renamed_3837(n11, 10);
        n8 = sprand10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_1[13] + -1454113458, 6) + n7;
        n10 = sprand10.cfr_renamed_3837(n10, 10);
        n5 = sprand10.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_1[12], 8) + n6;
        n3 = sprand10.cfr_renamed_3837(n3, 10);
        n6 = sprand10.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n5, n4, n3) + this.cfr_renamed_1[15], 5) + n2;
        n4 = sprand10.cfr_renamed_3837(n4, 10);
        n2 = sprand10.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n6, n5, n4) + this.cfr_renamed_1[10], 12) + n3;
        n5 = sprand10.cfr_renamed_3837(n5, 10);
        n3 = sprand10.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n2, n6, n5) + this.cfr_renamed_1[4], 9) + n4;
        n6 = sprand10.cfr_renamed_3837(n6, 10);
        n4 = sprand10.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n3, n2, n6) + this.cfr_renamed_1[1], 12) + n5;
        n2 = sprand10.cfr_renamed_3837(n2, 10);
        n5 = sprand10.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_1[5], 5) + n6;
        n3 = sprand10.cfr_renamed_3837(n3, 10);
        n6 = sprand10.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n5, n4, n3) + this.cfr_renamed_1[8], 14) + n2;
        n4 = sprand10.cfr_renamed_3837(n4, 10);
        n2 = sprand10.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n6, n5, n4) + this.cfr_renamed_1[7], 6) + n3;
        n5 = sprand10.cfr_renamed_3837(n5, 10);
        n3 = sprand10.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n2, n6, n5) + this.cfr_renamed_1[6], 8) + n4;
        n6 = sprand10.cfr_renamed_3837(n6, 10);
        n4 = sprand10.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n3, n2, n6) + this.cfr_renamed_1[2], 13) + n5;
        n2 = sprand10.cfr_renamed_3837(n2, 10);
        n5 = sprand10.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_1[13], 6) + n6;
        n3 = sprand10.cfr_renamed_3837(n3, 10);
        n6 = sprand10.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n5, n4, n3) + this.cfr_renamed_1[14], 5) + n2;
        n4 = sprand10.cfr_renamed_3837(n4, 10);
        n2 = sprand10.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n6, n5, n4) + this.cfr_renamed_1[0], 15) + n3;
        n5 = sprand10.cfr_renamed_3837(n5, 10);
        n3 = sprand10.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n2, n6, n5) + this.cfr_renamed_1[3], 13) + n4;
        n6 = sprand10.cfr_renamed_3837(n6, 10);
        n4 = sprand10.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n3, n2, n6) + this.cfr_renamed_1[9], 11) + n5;
        sprand sprand13 = this;
        n2 = sprand13.cfr_renamed_3837(n2, 10);
        sprand sprand14 = this;
        n5 = sprand13.cfr_renamed_3837(n5 + sprand14.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_1[11], 11) + n6;
        n3 = sprand14.cfr_renamed_3837(n3, 10);
        sprand13.cfr_renamed_4 = sprand13.cfr_renamed_119 + n10 + n2;
        sprand13.cfr_renamed_119 = sprand13.cfr_renamed_3 + n11 + n6;
        sprand13.cfr_renamed_3 = sprand13.cfr_renamed_112 + n7 + n5;
        sprand13.cfr_renamed_112 = sprand13.cfr_renamed_2 + n8 + n4;
        sprand13.cfr_renamed_2 = n3 += n9 + this.cfr_renamed_4;
        sprand13.cfr_renamed_91 = 0;
        int n12 = n = 0;
        while (n12 != this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n12 = n;
        }
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprand(this);
    }

    private /* synthetic */ int cfr_renamed_3836(int arg0, int arg1, int arg2) {
        return arg0 ^ (arg1 | ~arg2);
    }

    private /* synthetic */ void cfr_renamed_3850(sprand arg0) {
        sprand sprand2 = arg0;
        sprand sprand3 = this;
        sprand sprand4 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_2 = arg0.cfr_renamed_2;
        this.cfr_renamed_4 = sprand4.cfr_renamed_4;
        sprand3.cfr_renamed_119 = sprand4.cfr_renamed_119;
        sprand3.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_112 = sprand2.cfr_renamed_112;
        System.arraycopy(sprand2.cfr_renamed_1, 0, this.cfr_renamed_1, 0, arg0.cfr_renamed_1.length);
        this.cfr_renamed_91 = arg0.cfr_renamed_91;
    }

    @Override
    public int cfr_renamed_1218() {
        return 20;
    }

    public sprand() {
        sprand sprand2 = this;
        sprand2.cfr_renamed_1 = new int[16];
        sprand2.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    public sprand(sprand sprand2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_1 = new int[16];
        this.cfr_renamed_3850(sprand2);
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprand sprand2 = (sprand)arg0;
        this.cfr_renamed_3850(sprand2);
    }
}

