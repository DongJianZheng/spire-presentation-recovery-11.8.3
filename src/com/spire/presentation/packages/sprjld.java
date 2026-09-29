/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctr;
import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprrj;

public class sprjld
extends sprehd {
    private int cfr_renamed_132;
    private int cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private static final int cfr_renamed_112 = 40;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int[] cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_0[this.cfr_renamed_152++] = arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
        if (this.cfr_renamed_152 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ int cfr_renamed_3833(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    private /* synthetic */ void cfr_renamed_3834(sprjld arg0) {
        sprjld sprjld2 = arg0;
        sprjld sprjld3 = this;
        sprjld sprjld4 = arg0;
        sprjld sprjld5 = this;
        sprjld sprjld6 = arg0;
        sprjld sprjld7 = this;
        sprjld sprjld8 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_2 = sprjld8.cfr_renamed_2;
        sprjld7.cfr_renamed_93 = sprjld8.cfr_renamed_93;
        sprjld7.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_91 = sprjld6.cfr_renamed_91;
        sprjld5.cfr_renamed_4 = sprjld6.cfr_renamed_4;
        sprjld5.cfr_renamed_132 = arg0.cfr_renamed_132;
        this.cfr_renamed_3 = sprjld4.cfr_renamed_3;
        sprjld3.cfr_renamed_119 = sprjld4.cfr_renamed_119;
        sprjld3.cfr_renamed_102 = arg0.cfr_renamed_102;
        this.cfr_renamed_86 = sprjld2.cfr_renamed_86;
        System.arraycopy(sprjld2.cfr_renamed_0, 0, this.cfr_renamed_0, 0, arg0.cfr_renamed_0.length);
        this.cfr_renamed_152 = arg0.cfr_renamed_152;
    }

    @Override
    public int cfr_renamed_1218() {
        return 40;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprjld sprjld2 = this;
        sprjld2.cfr_renamed_3120();
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_2, (byte[])arg0, (int)arg1);
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_93, (byte[])arg0, (int)(arg1 + 4));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 8));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_91, (byte[])arg0, (int)(arg1 + 12));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 16));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_132, (byte[])arg0, (int)(arg1 + 20));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_3, (byte[])arg0, (int)(arg1 + 24));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 28));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_102, (byte[])arg0, (int)(arg1 + 32));
        sprjld2.cfr_renamed_3835(sprjld2.cfr_renamed_86, (byte[])arg0, (int)(arg1 + 36));
        sprjld2.cfr_renamed_41();
        return 40;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprjld(this);
    }

    private /* synthetic */ int cfr_renamed_3836(int arg0, int arg1, int arg2) {
        return arg0 ^ (arg1 | ~arg2);
    }

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

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprjld sprjld2 = (sprjld)arg0;
        this.cfr_renamed_3834(sprjld2);
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprjld sprjld2 = this;
        int n2 = sprjld2.cfr_renamed_2;
        int n3 = sprjld2.cfr_renamed_93;
        int n4 = sprjld2.cfr_renamed_1;
        int n5 = sprjld2.cfr_renamed_91;
        int n6 = sprjld2.cfr_renamed_4;
        int n7 = sprjld2.cfr_renamed_132;
        int n8 = sprjld2.cfr_renamed_3;
        int n9 = sprjld2.cfr_renamed_119;
        int n10 = sprjld2.cfr_renamed_102;
        int n11 = sprjld2.cfr_renamed_86;
        n2 = sprjld2.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n3, n4, n5) + this.cfr_renamed_0[0], 11) + n6;
        n4 = sprjld2.cfr_renamed_3837(n4, 10);
        n6 = sprjld2.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n2, n3, n4) + this.cfr_renamed_0[1], 14) + n5;
        n3 = sprjld2.cfr_renamed_3837(n3, 10);
        n5 = sprjld2.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n6, n2, n3) + this.cfr_renamed_0[2], 15) + n4;
        n2 = sprjld2.cfr_renamed_3837(n2, 10);
        n4 = sprjld2.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n5, n6, n2) + this.cfr_renamed_0[3], 12) + n3;
        n6 = sprjld2.cfr_renamed_3837(n6, 10);
        n3 = sprjld2.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n4, n5, n6) + this.cfr_renamed_0[4], 5) + n2;
        n5 = sprjld2.cfr_renamed_3837(n5, 10);
        n2 = sprjld2.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n3, n4, n5) + this.cfr_renamed_0[5], 8) + n6;
        n4 = sprjld2.cfr_renamed_3837(n4, 10);
        n6 = sprjld2.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n2, n3, n4) + this.cfr_renamed_0[6], 7) + n5;
        n3 = sprjld2.cfr_renamed_3837(n3, 10);
        n5 = sprjld2.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n6, n2, n3) + this.cfr_renamed_0[7], 9) + n4;
        n2 = sprjld2.cfr_renamed_3837(n2, 10);
        n4 = sprjld2.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n5, n6, n2) + this.cfr_renamed_0[8], 11) + n3;
        n6 = sprjld2.cfr_renamed_3837(n6, 10);
        n3 = sprjld2.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n4, n5, n6) + this.cfr_renamed_0[9], 13) + n2;
        n5 = sprjld2.cfr_renamed_3837(n5, 10);
        n2 = sprjld2.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n3, n4, n5) + this.cfr_renamed_0[10], 14) + n6;
        n4 = sprjld2.cfr_renamed_3837(n4, 10);
        n6 = sprjld2.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n2, n3, n4) + this.cfr_renamed_0[11], 15) + n5;
        n3 = sprjld2.cfr_renamed_3837(n3, 10);
        n5 = sprjld2.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n6, n2, n3) + this.cfr_renamed_0[12], 6) + n4;
        n2 = sprjld2.cfr_renamed_3837(n2, 10);
        n4 = sprjld2.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n5, n6, n2) + this.cfr_renamed_0[13], 7) + n3;
        n6 = sprjld2.cfr_renamed_3837(n6, 10);
        n3 = sprjld2.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n4, n5, n6) + this.cfr_renamed_0[14], 9) + n2;
        n5 = sprjld2.cfr_renamed_3837(n5, 10);
        n2 = sprjld2.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n3, n4, n5) + this.cfr_renamed_0[15], 8) + n6;
        n4 = sprjld2.cfr_renamed_3837(n4, 10);
        n7 = sprjld2.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_0[5] + 1352829926, 8) + n11;
        n9 = sprjld2.cfr_renamed_3837(n9, 10);
        n11 = sprjld2.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_0[14] + 1352829926, 9) + n10;
        n8 = sprjld2.cfr_renamed_3837(n8, 10);
        n10 = sprjld2.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_0[7] + 1352829926, 9) + n9;
        n7 = sprjld2.cfr_renamed_3837(n7, 10);
        n9 = sprjld2.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_0[0] + 1352829926, 11) + n8;
        n11 = sprjld2.cfr_renamed_3837(n11, 10);
        n8 = sprjld2.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_0[9] + 1352829926, 13) + n7;
        n10 = sprjld2.cfr_renamed_3837(n10, 10);
        n7 = sprjld2.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_0[2] + 1352829926, 15) + n11;
        n9 = sprjld2.cfr_renamed_3837(n9, 10);
        n11 = sprjld2.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_0[11] + 1352829926, 15) + n10;
        n8 = sprjld2.cfr_renamed_3837(n8, 10);
        n10 = sprjld2.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_0[4] + 1352829926, 5) + n9;
        n7 = sprjld2.cfr_renamed_3837(n7, 10);
        n9 = sprjld2.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_0[13] + 1352829926, 7) + n8;
        n11 = sprjld2.cfr_renamed_3837(n11, 10);
        n8 = sprjld2.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_0[6] + 1352829926, 7) + n7;
        n10 = sprjld2.cfr_renamed_3837(n10, 10);
        n7 = sprjld2.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_0[15] + 1352829926, 8) + n11;
        n9 = sprjld2.cfr_renamed_3837(n9, 10);
        n11 = sprjld2.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_0[8] + 1352829926, 11) + n10;
        n8 = sprjld2.cfr_renamed_3837(n8, 10);
        n10 = sprjld2.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_0[1] + 1352829926, 14) + n9;
        n7 = sprjld2.cfr_renamed_3837(n7, 10);
        n9 = sprjld2.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_0[10] + 1352829926, 14) + n8;
        n11 = sprjld2.cfr_renamed_3837(n11, 10);
        n8 = sprjld2.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_0[3] + 1352829926, 12) + n7;
        n10 = sprjld2.cfr_renamed_3837(n10, 10);
        n7 = sprjld2.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_0[12] + 1352829926, 6) + n11;
        sprjld sprjld3 = this;
        n9 = sprjld3.cfr_renamed_3837(n9, 10);
        int n12 = n2;
        n2 = n7;
        n7 = n12;
        sprjld sprjld4 = this;
        n6 = sprjld3.cfr_renamed_3837(n6 + sprjld4.cfr_renamed_3833(n2, n3, n4) + this.cfr_renamed_0[7] + 1518500249, 7) + n5;
        n3 = sprjld4.cfr_renamed_3837(n3, 10);
        n5 = sprjld3.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n6, n2, n3) + this.cfr_renamed_0[4] + 1518500249, 6) + n4;
        n2 = sprjld3.cfr_renamed_3837(n2, 10);
        n4 = sprjld3.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n5, n6, n2) + this.cfr_renamed_0[13] + 1518500249, 8) + n3;
        n6 = sprjld3.cfr_renamed_3837(n6, 10);
        n3 = sprjld3.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n4, n5, n6) + this.cfr_renamed_0[1] + 1518500249, 13) + n2;
        n5 = sprjld3.cfr_renamed_3837(n5, 10);
        n2 = sprjld3.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n3, n4, n5) + this.cfr_renamed_0[10] + 1518500249, 11) + n6;
        n4 = sprjld3.cfr_renamed_3837(n4, 10);
        n6 = sprjld3.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n2, n3, n4) + this.cfr_renamed_0[6] + 1518500249, 9) + n5;
        n3 = sprjld3.cfr_renamed_3837(n3, 10);
        n5 = sprjld3.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n6, n2, n3) + this.cfr_renamed_0[15] + 1518500249, 7) + n4;
        n2 = sprjld3.cfr_renamed_3837(n2, 10);
        n4 = sprjld3.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n5, n6, n2) + this.cfr_renamed_0[3] + 1518500249, 15) + n3;
        n6 = sprjld3.cfr_renamed_3837(n6, 10);
        n3 = sprjld3.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n4, n5, n6) + this.cfr_renamed_0[12] + 1518500249, 7) + n2;
        n5 = sprjld3.cfr_renamed_3837(n5, 10);
        n2 = sprjld3.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n3, n4, n5) + this.cfr_renamed_0[0] + 1518500249, 12) + n6;
        n4 = sprjld3.cfr_renamed_3837(n4, 10);
        n6 = sprjld3.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n2, n3, n4) + this.cfr_renamed_0[9] + 1518500249, 15) + n5;
        n3 = sprjld3.cfr_renamed_3837(n3, 10);
        n5 = sprjld3.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n6, n2, n3) + this.cfr_renamed_0[5] + 1518500249, 9) + n4;
        n2 = sprjld3.cfr_renamed_3837(n2, 10);
        n4 = sprjld3.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n5, n6, n2) + this.cfr_renamed_0[2] + 1518500249, 11) + n3;
        n6 = sprjld3.cfr_renamed_3837(n6, 10);
        n3 = sprjld3.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n4, n5, n6) + this.cfr_renamed_0[14] + 1518500249, 7) + n2;
        n5 = sprjld3.cfr_renamed_3837(n5, 10);
        n2 = sprjld3.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n3, n4, n5) + this.cfr_renamed_0[11] + 1518500249, 13) + n6;
        n4 = sprjld3.cfr_renamed_3837(n4, 10);
        n6 = sprjld3.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n2, n3, n4) + this.cfr_renamed_0[8] + 1518500249, 12) + n5;
        n3 = sprjld3.cfr_renamed_3837(n3, 10);
        n11 = sprjld3.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_0[6] + 1548603684, 9) + n10;
        n8 = sprjld3.cfr_renamed_3837(n8, 10);
        n10 = sprjld3.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_0[11] + 1548603684, 13) + n9;
        n7 = sprjld3.cfr_renamed_3837(n7, 10);
        n9 = sprjld3.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_0[3] + 1548603684, 15) + n8;
        n11 = sprjld3.cfr_renamed_3837(n11, 10);
        n8 = sprjld3.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_0[7] + 1548603684, 7) + n7;
        n10 = sprjld3.cfr_renamed_3837(n10, 10);
        n7 = sprjld3.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_0[0] + 1548603684, 12) + n11;
        n9 = sprjld3.cfr_renamed_3837(n9, 10);
        n11 = sprjld3.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_0[13] + 1548603684, 8) + n10;
        n8 = sprjld3.cfr_renamed_3837(n8, 10);
        n10 = sprjld3.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_0[5] + 1548603684, 9) + n9;
        n7 = sprjld3.cfr_renamed_3837(n7, 10);
        n9 = sprjld3.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_0[10] + 1548603684, 11) + n8;
        n11 = sprjld3.cfr_renamed_3837(n11, 10);
        n8 = sprjld3.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_0[14] + 1548603684, 7) + n7;
        n10 = sprjld3.cfr_renamed_3837(n10, 10);
        n7 = sprjld3.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_0[15] + 1548603684, 7) + n11;
        n9 = sprjld3.cfr_renamed_3837(n9, 10);
        n11 = sprjld3.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_0[8] + 1548603684, 12) + n10;
        n8 = sprjld3.cfr_renamed_3837(n8, 10);
        n10 = sprjld3.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_0[12] + 1548603684, 7) + n9;
        n7 = sprjld3.cfr_renamed_3837(n7, 10);
        n9 = sprjld3.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_0[4] + 1548603684, 6) + n8;
        n11 = sprjld3.cfr_renamed_3837(n11, 10);
        n8 = sprjld3.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_0[9] + 1548603684, 15) + n7;
        n10 = sprjld3.cfr_renamed_3837(n10, 10);
        n7 = sprjld3.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_0[1] + 1548603684, 13) + n11;
        n9 = sprjld3.cfr_renamed_3837(n9, 10);
        sprjld sprjld5 = this;
        sprjld sprjld6 = this;
        n11 = sprjld6.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + sprjld6.cfr_renamed_0[2] + 1548603684, 11) + n10;
        n8 = sprjld5.cfr_renamed_3837(n8, 10);
        int n13 = n3;
        n3 = n8;
        n8 = n13;
        sprjld sprjld7 = this;
        n5 = sprjld7.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n6, n2, n3) + sprjld7.cfr_renamed_0[3] + 1859775393, 11) + n4;
        n2 = sprjld5.cfr_renamed_3837(n2, 10);
        n4 = sprjld5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n5, n6, n2) + this.cfr_renamed_0[10] + 1859775393, 13) + n3;
        n6 = sprjld5.cfr_renamed_3837(n6, 10);
        n3 = sprjld5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n4, n5, n6) + this.cfr_renamed_0[14] + 1859775393, 6) + n2;
        n5 = sprjld5.cfr_renamed_3837(n5, 10);
        n2 = sprjld5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n3, n4, n5) + this.cfr_renamed_0[4] + 1859775393, 7) + n6;
        n4 = sprjld5.cfr_renamed_3837(n4, 10);
        n6 = sprjld5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n2, n3, n4) + this.cfr_renamed_0[9] + 1859775393, 14) + n5;
        n3 = sprjld5.cfr_renamed_3837(n3, 10);
        n5 = sprjld5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n6, n2, n3) + this.cfr_renamed_0[15] + 1859775393, 9) + n4;
        n2 = sprjld5.cfr_renamed_3837(n2, 10);
        n4 = sprjld5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n5, n6, n2) + this.cfr_renamed_0[8] + 1859775393, 13) + n3;
        n6 = sprjld5.cfr_renamed_3837(n6, 10);
        n3 = sprjld5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n4, n5, n6) + this.cfr_renamed_0[1] + 1859775393, 15) + n2;
        n5 = sprjld5.cfr_renamed_3837(n5, 10);
        n2 = sprjld5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n3, n4, n5) + this.cfr_renamed_0[2] + 1859775393, 14) + n6;
        n4 = sprjld5.cfr_renamed_3837(n4, 10);
        n6 = sprjld5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n2, n3, n4) + this.cfr_renamed_0[7] + 1859775393, 8) + n5;
        n3 = sprjld5.cfr_renamed_3837(n3, 10);
        n5 = sprjld5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n6, n2, n3) + this.cfr_renamed_0[0] + 1859775393, 13) + n4;
        n2 = sprjld5.cfr_renamed_3837(n2, 10);
        n4 = sprjld5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n5, n6, n2) + this.cfr_renamed_0[6] + 1859775393, 6) + n3;
        n6 = sprjld5.cfr_renamed_3837(n6, 10);
        n3 = sprjld5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n4, n5, n6) + this.cfr_renamed_0[13] + 1859775393, 5) + n2;
        n5 = sprjld5.cfr_renamed_3837(n5, 10);
        n2 = sprjld5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n3, n4, n5) + this.cfr_renamed_0[11] + 1859775393, 12) + n6;
        n4 = sprjld5.cfr_renamed_3837(n4, 10);
        n6 = sprjld5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n2, n3, n4) + this.cfr_renamed_0[5] + 1859775393, 7) + n5;
        n3 = sprjld5.cfr_renamed_3837(n3, 10);
        n5 = sprjld5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n6, n2, n3) + this.cfr_renamed_0[12] + 1859775393, 5) + n4;
        n2 = sprjld5.cfr_renamed_3837(n2, 10);
        n10 = sprjld5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_0[15] + 1836072691, 9) + n9;
        n7 = sprjld5.cfr_renamed_3837(n7, 10);
        n9 = sprjld5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_0[5] + 1836072691, 7) + n8;
        n11 = sprjld5.cfr_renamed_3837(n11, 10);
        n8 = sprjld5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_0[1] + 1836072691, 15) + n7;
        n10 = sprjld5.cfr_renamed_3837(n10, 10);
        n7 = sprjld5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_0[3] + 1836072691, 11) + n11;
        n9 = sprjld5.cfr_renamed_3837(n9, 10);
        n11 = sprjld5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_0[7] + 1836072691, 8) + n10;
        n8 = sprjld5.cfr_renamed_3837(n8, 10);
        n10 = sprjld5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_0[14] + 1836072691, 6) + n9;
        n7 = sprjld5.cfr_renamed_3837(n7, 10);
        n9 = sprjld5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_0[6] + 1836072691, 6) + n8;
        n11 = sprjld5.cfr_renamed_3837(n11, 10);
        n8 = sprjld5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_0[9] + 1836072691, 14) + n7;
        n10 = sprjld5.cfr_renamed_3837(n10, 10);
        n7 = sprjld5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_0[11] + 1836072691, 12) + n11;
        n9 = sprjld5.cfr_renamed_3837(n9, 10);
        n11 = sprjld5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_0[8] + 1836072691, 13) + n10;
        n8 = sprjld5.cfr_renamed_3837(n8, 10);
        n10 = sprjld5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_0[12] + 1836072691, 5) + n9;
        n7 = sprjld5.cfr_renamed_3837(n7, 10);
        n9 = sprjld5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_0[2] + 1836072691, 14) + n8;
        n11 = sprjld5.cfr_renamed_3837(n11, 10);
        n8 = sprjld5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_0[10] + 1836072691, 13) + n7;
        n10 = sprjld5.cfr_renamed_3837(n10, 10);
        n7 = sprjld5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_0[0] + 1836072691, 13) + n11;
        n9 = sprjld5.cfr_renamed_3837(n9, 10);
        n11 = sprjld5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_0[4] + 1836072691, 7) + n10;
        sprjld sprjld8 = this;
        n8 = sprjld8.cfr_renamed_3837(n8, 10);
        sprjld sprjld9 = this;
        n10 = sprjld8.cfr_renamed_3837(n10 + sprjld9.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_0[13] + 1836072691, 5) + n9;
        n7 = sprjld9.cfr_renamed_3837(n7, 10);
        int n14 = n4;
        n4 = n9;
        n9 = n14;
        n4 = sprjld8.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n5, n6, n2) + this.cfr_renamed_0[1] + -1894007588, 11) + n3;
        n6 = sprjld8.cfr_renamed_3837(n6, 10);
        n3 = sprjld8.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n4, n5, n6) + this.cfr_renamed_0[9] + -1894007588, 12) + n2;
        n5 = sprjld8.cfr_renamed_3837(n5, 10);
        n2 = sprjld8.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n3, n4, n5) + this.cfr_renamed_0[11] + -1894007588, 14) + n6;
        n4 = sprjld8.cfr_renamed_3837(n4, 10);
        n6 = sprjld8.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n2, n3, n4) + this.cfr_renamed_0[10] + -1894007588, 15) + n5;
        n3 = sprjld8.cfr_renamed_3837(n3, 10);
        n5 = sprjld8.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n6, n2, n3) + this.cfr_renamed_0[0] + -1894007588, 14) + n4;
        n2 = sprjld8.cfr_renamed_3837(n2, 10);
        n4 = sprjld8.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n5, n6, n2) + this.cfr_renamed_0[8] + -1894007588, 15) + n3;
        n6 = sprjld8.cfr_renamed_3837(n6, 10);
        n3 = sprjld8.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n4, n5, n6) + this.cfr_renamed_0[12] + -1894007588, 9) + n2;
        n5 = sprjld8.cfr_renamed_3837(n5, 10);
        n2 = sprjld8.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n3, n4, n5) + this.cfr_renamed_0[4] + -1894007588, 8) + n6;
        n4 = sprjld8.cfr_renamed_3837(n4, 10);
        n6 = sprjld8.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n2, n3, n4) + this.cfr_renamed_0[13] + -1894007588, 9) + n5;
        n3 = sprjld8.cfr_renamed_3837(n3, 10);
        n5 = sprjld8.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n6, n2, n3) + this.cfr_renamed_0[3] + -1894007588, 14) + n4;
        n2 = sprjld8.cfr_renamed_3837(n2, 10);
        n4 = sprjld8.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n5, n6, n2) + this.cfr_renamed_0[7] + -1894007588, 5) + n3;
        n6 = sprjld8.cfr_renamed_3837(n6, 10);
        n3 = sprjld8.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n4, n5, n6) + this.cfr_renamed_0[15] + -1894007588, 6) + n2;
        n5 = sprjld8.cfr_renamed_3837(n5, 10);
        n2 = sprjld8.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n3, n4, n5) + this.cfr_renamed_0[14] + -1894007588, 8) + n6;
        n4 = sprjld8.cfr_renamed_3837(n4, 10);
        n6 = sprjld8.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n2, n3, n4) + this.cfr_renamed_0[5] + -1894007588, 6) + n5;
        n3 = sprjld8.cfr_renamed_3837(n3, 10);
        n5 = sprjld8.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n6, n2, n3) + this.cfr_renamed_0[6] + -1894007588, 5) + n4;
        n2 = sprjld8.cfr_renamed_3837(n2, 10);
        n4 = sprjld8.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n5, n6, n2) + this.cfr_renamed_0[2] + -1894007588, 12) + n3;
        n6 = sprjld8.cfr_renamed_3837(n6, 10);
        n9 = sprjld8.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_0[8] + 2053994217, 15) + n8;
        n11 = sprjld8.cfr_renamed_3837(n11, 10);
        n8 = sprjld8.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_0[6] + 2053994217, 5) + n7;
        n10 = sprjld8.cfr_renamed_3837(n10, 10);
        n7 = sprjld8.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_0[4] + 2053994217, 8) + n11;
        n9 = sprjld8.cfr_renamed_3837(n9, 10);
        n11 = sprjld8.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_0[1] + 2053994217, 11) + n10;
        n8 = sprjld8.cfr_renamed_3837(n8, 10);
        n10 = sprjld8.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_0[3] + 2053994217, 14) + n9;
        n7 = sprjld8.cfr_renamed_3837(n7, 10);
        n9 = sprjld8.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_0[11] + 2053994217, 14) + n8;
        n11 = sprjld8.cfr_renamed_3837(n11, 10);
        n8 = sprjld8.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_0[15] + 2053994217, 6) + n7;
        n10 = sprjld8.cfr_renamed_3837(n10, 10);
        n7 = sprjld8.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_0[0] + 2053994217, 14) + n11;
        n9 = sprjld8.cfr_renamed_3837(n9, 10);
        n11 = sprjld8.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_0[5] + 2053994217, 6) + n10;
        n8 = sprjld8.cfr_renamed_3837(n8, 10);
        n10 = sprjld8.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_0[12] + 2053994217, 9) + n9;
        n7 = sprjld8.cfr_renamed_3837(n7, 10);
        n9 = sprjld8.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_0[2] + 2053994217, 12) + n8;
        n11 = sprjld8.cfr_renamed_3837(n11, 10);
        n8 = sprjld8.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_0[13] + 2053994217, 9) + n7;
        n10 = sprjld8.cfr_renamed_3837(n10, 10);
        n7 = sprjld8.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_0[9] + 2053994217, 12) + n11;
        n9 = sprjld8.cfr_renamed_3837(n9, 10);
        n11 = sprjld8.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_0[7] + 2053994217, 5) + n10;
        n8 = sprjld8.cfr_renamed_3837(n8, 10);
        sprjld sprjld10 = this;
        sprjld sprjld11 = this;
        n10 = sprjld11.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + sprjld11.cfr_renamed_0[10] + 2053994217, 15) + n9;
        n7 = sprjld10.cfr_renamed_3837(n7, 10);
        sprjld sprjld12 = this;
        n9 = sprjld12.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + sprjld12.cfr_renamed_0[14] + 2053994217, 8) + n8;
        n11 = sprjld10.cfr_renamed_3837(n11, 10);
        int n15 = n5;
        n5 = n10;
        n10 = n15;
        n3 = sprjld10.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n4, n5, n6) + this.cfr_renamed_0[4] + -1454113458, 9) + n2;
        n5 = sprjld10.cfr_renamed_3837(n5, 10);
        n2 = sprjld10.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n3, n4, n5) + this.cfr_renamed_0[0] + -1454113458, 15) + n6;
        n4 = sprjld10.cfr_renamed_3837(n4, 10);
        n6 = sprjld10.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n2, n3, n4) + this.cfr_renamed_0[5] + -1454113458, 5) + n5;
        n3 = sprjld10.cfr_renamed_3837(n3, 10);
        n5 = sprjld10.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n6, n2, n3) + this.cfr_renamed_0[9] + -1454113458, 11) + n4;
        n2 = sprjld10.cfr_renamed_3837(n2, 10);
        n4 = sprjld10.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n5, n6, n2) + this.cfr_renamed_0[7] + -1454113458, 6) + n3;
        n6 = sprjld10.cfr_renamed_3837(n6, 10);
        n3 = sprjld10.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n4, n5, n6) + this.cfr_renamed_0[12] + -1454113458, 8) + n2;
        n5 = sprjld10.cfr_renamed_3837(n5, 10);
        n2 = sprjld10.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n3, n4, n5) + this.cfr_renamed_0[2] + -1454113458, 13) + n6;
        n4 = sprjld10.cfr_renamed_3837(n4, 10);
        n6 = sprjld10.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n2, n3, n4) + this.cfr_renamed_0[10] + -1454113458, 12) + n5;
        n3 = sprjld10.cfr_renamed_3837(n3, 10);
        n5 = sprjld10.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n6, n2, n3) + this.cfr_renamed_0[14] + -1454113458, 5) + n4;
        n2 = sprjld10.cfr_renamed_3837(n2, 10);
        n4 = sprjld10.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n5, n6, n2) + this.cfr_renamed_0[1] + -1454113458, 12) + n3;
        n6 = sprjld10.cfr_renamed_3837(n6, 10);
        n3 = sprjld10.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n4, n5, n6) + this.cfr_renamed_0[3] + -1454113458, 13) + n2;
        n5 = sprjld10.cfr_renamed_3837(n5, 10);
        n2 = sprjld10.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n3, n4, n5) + this.cfr_renamed_0[8] + -1454113458, 14) + n6;
        n4 = sprjld10.cfr_renamed_3837(n4, 10);
        n6 = sprjld10.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n2, n3, n4) + this.cfr_renamed_0[11] + -1454113458, 11) + n5;
        n3 = sprjld10.cfr_renamed_3837(n3, 10);
        n5 = sprjld10.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n6, n2, n3) + this.cfr_renamed_0[6] + -1454113458, 8) + n4;
        n2 = sprjld10.cfr_renamed_3837(n2, 10);
        n4 = sprjld10.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n5, n6, n2) + this.cfr_renamed_0[15] + -1454113458, 5) + n3;
        n6 = sprjld10.cfr_renamed_3837(n6, 10);
        n3 = sprjld10.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n4, n5, n6) + this.cfr_renamed_0[13] + -1454113458, 6) + n2;
        n5 = sprjld10.cfr_renamed_3837(n5, 10);
        n8 = sprjld10.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_0[12], 8) + n7;
        n10 = sprjld10.cfr_renamed_3837(n10, 10);
        n7 = sprjld10.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_0[15], 5) + n11;
        n9 = sprjld10.cfr_renamed_3837(n9, 10);
        n11 = sprjld10.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_0[10], 12) + n10;
        n8 = sprjld10.cfr_renamed_3837(n8, 10);
        n10 = sprjld10.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_0[4], 9) + n9;
        n7 = sprjld10.cfr_renamed_3837(n7, 10);
        n9 = sprjld10.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_0[1], 12) + n8;
        n11 = sprjld10.cfr_renamed_3837(n11, 10);
        n8 = sprjld10.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_0[5], 5) + n7;
        n10 = sprjld10.cfr_renamed_3837(n10, 10);
        n7 = sprjld10.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_0[8], 14) + n11;
        n9 = sprjld10.cfr_renamed_3837(n9, 10);
        n11 = sprjld10.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_0[7], 6) + n10;
        n8 = sprjld10.cfr_renamed_3837(n8, 10);
        n10 = sprjld10.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_0[6], 8) + n9;
        n7 = sprjld10.cfr_renamed_3837(n7, 10);
        n9 = sprjld10.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_0[2], 13) + n8;
        n11 = sprjld10.cfr_renamed_3837(n11, 10);
        n8 = sprjld10.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_0[13], 6) + n7;
        n10 = sprjld10.cfr_renamed_3837(n10, 10);
        n7 = sprjld10.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_0[14], 5) + n11;
        n9 = sprjld10.cfr_renamed_3837(n9, 10);
        n11 = sprjld10.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_0[0], 15) + n10;
        n8 = sprjld10.cfr_renamed_3837(n8, 10);
        n10 = sprjld10.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_0[3], 13) + n9;
        n7 = sprjld10.cfr_renamed_3837(n7, 10);
        n9 = sprjld10.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_0[9], 11) + n8;
        sprjld sprjld13 = this;
        n11 = sprjld13.cfr_renamed_3837(n11, 10);
        sprjld sprjld14 = this;
        n8 = sprjld13.cfr_renamed_3837(n8 + sprjld14.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_0[11], 11) + n7;
        n10 = sprjld14.cfr_renamed_3837(n10, 10);
        sprjld13.cfr_renamed_2 += n2;
        sprjld13.cfr_renamed_93 += n3;
        sprjld13.cfr_renamed_1 += n4;
        sprjld13.cfr_renamed_91 += n5;
        sprjld13.cfr_renamed_4 += n11;
        sprjld13.cfr_renamed_132 += n7;
        sprjld13.cfr_renamed_3 += n8;
        sprjld13.cfr_renamed_119 += n9;
        sprjld13.cfr_renamed_102 += n10;
        sprjld13.cfr_renamed_86 += n6;
        sprjld13.cfr_renamed_152 = 0;
        int n16 = n = 0;
        while (n16 != this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n++] = 0;
            n16 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3838(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprctr.cfr_renamed_9("\u0000\f\u0002\u0000\u001f\u0001awb");
    }

    public sprjld() {
        sprjld sprjld2 = this;
        sprjld2.cfr_renamed_0 = new int[16];
        sprjld2.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_3839(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    private /* synthetic */ int cfr_renamed_3837(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sprjld(sprjld sprjld2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_0 = new int[16];
        this.cfr_renamed_3834(sprjld2);
    }

    private /* synthetic */ int cfr_renamed_3840(int arg0, int arg1, int arg2) {
        return (arg0 | ~arg1) ^ arg2;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_152 > 14) {
            this.cfr_renamed_3473();
        }
        sprjld sprjld2 = this;
        sprjld2.cfr_renamed_0[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprjld2.cfr_renamed_0[15] = (int)(arg0 >>> 32);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprjld sprjld2 = this;
        sprjld sprjld3 = this;
        sprjld sprjld4 = this;
        sprjld sprjld5 = this;
        sprjld sprjld6 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_2 = 1732584193;
        sprjld6.cfr_renamed_93 = -271733879;
        sprjld6.cfr_renamed_1 = -1732584194;
        sprjld5.cfr_renamed_91 = 271733878;
        sprjld5.cfr_renamed_4 = -1009589776;
        sprjld4.cfr_renamed_132 = 1985229328;
        sprjld4.cfr_renamed_3 = -19088744;
        sprjld3.cfr_renamed_119 = -1985229329;
        sprjld3.cfr_renamed_102 = 19088743;
        sprjld2.cfr_renamed_86 = 1009589775;
        sprjld2.cfr_renamed_152 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n++] = 0;
            n2 = n;
        }
    }
}

