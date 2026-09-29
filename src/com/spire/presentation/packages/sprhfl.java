/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprhfl
extends sprikl {
    private int cfr_renamed_112;
    private int[] cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private static final int cfr_renamed_4 = 20;

    private /* synthetic */ int cfr_renamed_3836(int arg0, int arg1, int arg2) {
        return arg0 ^ (arg1 | ~arg2);
    }

    public sprhfl() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public String cfr_renamed_1315() {
        return "RIPEMD160";
    }

    private /* synthetic */ int cfr_renamed_3838(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_112 > 14) {
            this.cfr_renamed_3473();
        }
        sprhfl sprhfl2 = this;
        sprhfl2.cfr_renamed_119[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprhfl2.cfr_renamed_119[15] = (int)(arg0 >>> 32);
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        sprhfl sprhfl2 = this;
        int n7 = n6 = sprhfl2.cfr_renamed_1;
        int n8 = n5 = sprhfl2.cfr_renamed_2;
        int n9 = n4 = sprhfl2.cfr_renamed_0;
        int n10 = n3 = sprhfl2.cfr_renamed_91;
        int n11 = n2 = sprhfl2.cfr_renamed_3;
        n7 = sprhfl2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_119[0], 11) + n11;
        n9 = sprhfl2.cfr_renamed_3837(n9, 10);
        n11 = sprhfl2.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_119[1], 14) + n10;
        n8 = sprhfl2.cfr_renamed_3837(n8, 10);
        n10 = sprhfl2.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_119[2], 15) + n9;
        n7 = sprhfl2.cfr_renamed_3837(n7, 10);
        n9 = sprhfl2.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_119[3], 12) + n8;
        n11 = sprhfl2.cfr_renamed_3837(n11, 10);
        n8 = sprhfl2.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_119[4], 5) + n7;
        n10 = sprhfl2.cfr_renamed_3837(n10, 10);
        n7 = sprhfl2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_119[5], 8) + n11;
        n9 = sprhfl2.cfr_renamed_3837(n9, 10);
        n11 = sprhfl2.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_119[6], 7) + n10;
        n8 = sprhfl2.cfr_renamed_3837(n8, 10);
        n10 = sprhfl2.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_119[7], 9) + n9;
        n7 = sprhfl2.cfr_renamed_3837(n7, 10);
        n9 = sprhfl2.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_119[8], 11) + n8;
        n11 = sprhfl2.cfr_renamed_3837(n11, 10);
        n8 = sprhfl2.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_119[9], 13) + n7;
        n10 = sprhfl2.cfr_renamed_3837(n10, 10);
        n7 = sprhfl2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_119[10], 14) + n11;
        n9 = sprhfl2.cfr_renamed_3837(n9, 10);
        n11 = sprhfl2.cfr_renamed_3837(n11 + this.cfr_renamed_3838(n7, n8, n9) + this.cfr_renamed_119[11], 15) + n10;
        n8 = sprhfl2.cfr_renamed_3837(n8, 10);
        n10 = sprhfl2.cfr_renamed_3837(n10 + this.cfr_renamed_3838(n11, n7, n8) + this.cfr_renamed_119[12], 6) + n9;
        n7 = sprhfl2.cfr_renamed_3837(n7, 10);
        n9 = sprhfl2.cfr_renamed_3837(n9 + this.cfr_renamed_3838(n10, n11, n7) + this.cfr_renamed_119[13], 7) + n8;
        n11 = sprhfl2.cfr_renamed_3837(n11, 10);
        n8 = sprhfl2.cfr_renamed_3837(n8 + this.cfr_renamed_3838(n9, n10, n11) + this.cfr_renamed_119[14], 9) + n7;
        n10 = sprhfl2.cfr_renamed_3837(n10, 10);
        n7 = sprhfl2.cfr_renamed_3837(n7 + this.cfr_renamed_3838(n8, n9, n10) + this.cfr_renamed_119[15], 8) + n11;
        n9 = sprhfl2.cfr_renamed_3837(n9, 10);
        n6 = sprhfl2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_119[5] + 1352829926, 8) + n2;
        n4 = sprhfl2.cfr_renamed_3837(n4, 10);
        n2 = sprhfl2.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n6, n5, n4) + this.cfr_renamed_119[14] + 1352829926, 9) + n3;
        n5 = sprhfl2.cfr_renamed_3837(n5, 10);
        n3 = sprhfl2.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n2, n6, n5) + this.cfr_renamed_119[7] + 1352829926, 9) + n4;
        n6 = sprhfl2.cfr_renamed_3837(n6, 10);
        n4 = sprhfl2.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n3, n2, n6) + this.cfr_renamed_119[0] + 1352829926, 11) + n5;
        n2 = sprhfl2.cfr_renamed_3837(n2, 10);
        n5 = sprhfl2.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n4, n3, n2) + this.cfr_renamed_119[9] + 1352829926, 13) + n6;
        n3 = sprhfl2.cfr_renamed_3837(n3, 10);
        n6 = sprhfl2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_119[2] + 1352829926, 15) + n2;
        n4 = sprhfl2.cfr_renamed_3837(n4, 10);
        n2 = sprhfl2.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n6, n5, n4) + this.cfr_renamed_119[11] + 1352829926, 15) + n3;
        n5 = sprhfl2.cfr_renamed_3837(n5, 10);
        n3 = sprhfl2.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n2, n6, n5) + this.cfr_renamed_119[4] + 1352829926, 5) + n4;
        n6 = sprhfl2.cfr_renamed_3837(n6, 10);
        n4 = sprhfl2.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n3, n2, n6) + this.cfr_renamed_119[13] + 1352829926, 7) + n5;
        n2 = sprhfl2.cfr_renamed_3837(n2, 10);
        n5 = sprhfl2.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n4, n3, n2) + this.cfr_renamed_119[6] + 1352829926, 7) + n6;
        n3 = sprhfl2.cfr_renamed_3837(n3, 10);
        n6 = sprhfl2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_119[15] + 1352829926, 8) + n2;
        n4 = sprhfl2.cfr_renamed_3837(n4, 10);
        n2 = sprhfl2.cfr_renamed_3837(n2 + this.cfr_renamed_3836(n6, n5, n4) + this.cfr_renamed_119[8] + 1352829926, 11) + n3;
        n5 = sprhfl2.cfr_renamed_3837(n5, 10);
        n3 = sprhfl2.cfr_renamed_3837(n3 + this.cfr_renamed_3836(n2, n6, n5) + this.cfr_renamed_119[1] + 1352829926, 14) + n4;
        n6 = sprhfl2.cfr_renamed_3837(n6, 10);
        n4 = sprhfl2.cfr_renamed_3837(n4 + this.cfr_renamed_3836(n3, n2, n6) + this.cfr_renamed_119[10] + 1352829926, 14) + n5;
        n2 = sprhfl2.cfr_renamed_3837(n2, 10);
        n5 = sprhfl2.cfr_renamed_3837(n5 + this.cfr_renamed_3836(n4, n3, n2) + this.cfr_renamed_119[3] + 1352829926, 12) + n6;
        n3 = sprhfl2.cfr_renamed_3837(n3, 10);
        n6 = sprhfl2.cfr_renamed_3837(n6 + this.cfr_renamed_3836(n5, n4, n3) + this.cfr_renamed_119[12] + 1352829926, 6) + n2;
        sprhfl sprhfl3 = this;
        n4 = sprhfl3.cfr_renamed_3837(n4, 10);
        sprhfl sprhfl4 = this;
        n11 = sprhfl3.cfr_renamed_3837(n11 + sprhfl4.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_119[7] + 1518500249, 7) + n10;
        n8 = sprhfl4.cfr_renamed_3837(n8, 10);
        n10 = sprhfl3.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_119[4] + 1518500249, 6) + n9;
        n7 = sprhfl3.cfr_renamed_3837(n7, 10);
        n9 = sprhfl3.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_119[13] + 1518500249, 8) + n8;
        n11 = sprhfl3.cfr_renamed_3837(n11, 10);
        n8 = sprhfl3.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_119[1] + 1518500249, 13) + n7;
        n10 = sprhfl3.cfr_renamed_3837(n10, 10);
        n7 = sprhfl3.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_119[10] + 1518500249, 11) + n11;
        n9 = sprhfl3.cfr_renamed_3837(n9, 10);
        n11 = sprhfl3.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_119[6] + 1518500249, 9) + n10;
        n8 = sprhfl3.cfr_renamed_3837(n8, 10);
        n10 = sprhfl3.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_119[15] + 1518500249, 7) + n9;
        n7 = sprhfl3.cfr_renamed_3837(n7, 10);
        n9 = sprhfl3.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_119[3] + 1518500249, 15) + n8;
        n11 = sprhfl3.cfr_renamed_3837(n11, 10);
        n8 = sprhfl3.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_119[12] + 1518500249, 7) + n7;
        n10 = sprhfl3.cfr_renamed_3837(n10, 10);
        n7 = sprhfl3.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_119[0] + 1518500249, 12) + n11;
        n9 = sprhfl3.cfr_renamed_3837(n9, 10);
        n11 = sprhfl3.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_119[9] + 1518500249, 15) + n10;
        n8 = sprhfl3.cfr_renamed_3837(n8, 10);
        n10 = sprhfl3.cfr_renamed_3837(n10 + this.cfr_renamed_3833(n11, n7, n8) + this.cfr_renamed_119[5] + 1518500249, 9) + n9;
        n7 = sprhfl3.cfr_renamed_3837(n7, 10);
        n9 = sprhfl3.cfr_renamed_3837(n9 + this.cfr_renamed_3833(n10, n11, n7) + this.cfr_renamed_119[2] + 1518500249, 11) + n8;
        n11 = sprhfl3.cfr_renamed_3837(n11, 10);
        n8 = sprhfl3.cfr_renamed_3837(n8 + this.cfr_renamed_3833(n9, n10, n11) + this.cfr_renamed_119[14] + 1518500249, 7) + n7;
        n10 = sprhfl3.cfr_renamed_3837(n10, 10);
        n7 = sprhfl3.cfr_renamed_3837(n7 + this.cfr_renamed_3833(n8, n9, n10) + this.cfr_renamed_119[11] + 1518500249, 13) + n11;
        n9 = sprhfl3.cfr_renamed_3837(n9, 10);
        n11 = sprhfl3.cfr_renamed_3837(n11 + this.cfr_renamed_3833(n7, n8, n9) + this.cfr_renamed_119[8] + 1518500249, 12) + n10;
        n8 = sprhfl3.cfr_renamed_3837(n8, 10);
        n2 = sprhfl3.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + this.cfr_renamed_119[6] + 1548603684, 9) + n3;
        n5 = sprhfl3.cfr_renamed_3837(n5, 10);
        n3 = sprhfl3.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n2, n6, n5) + this.cfr_renamed_119[11] + 1548603684, 13) + n4;
        n6 = sprhfl3.cfr_renamed_3837(n6, 10);
        n4 = sprhfl3.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n3, n2, n6) + this.cfr_renamed_119[3] + 1548603684, 15) + n5;
        n2 = sprhfl3.cfr_renamed_3837(n2, 10);
        n5 = sprhfl3.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n4, n3, n2) + this.cfr_renamed_119[7] + 1548603684, 7) + n6;
        n3 = sprhfl3.cfr_renamed_3837(n3, 10);
        n6 = sprhfl3.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n5, n4, n3) + this.cfr_renamed_119[0] + 1548603684, 12) + n2;
        n4 = sprhfl3.cfr_renamed_3837(n4, 10);
        n2 = sprhfl3.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + this.cfr_renamed_119[13] + 1548603684, 8) + n3;
        n5 = sprhfl3.cfr_renamed_3837(n5, 10);
        n3 = sprhfl3.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n2, n6, n5) + this.cfr_renamed_119[5] + 1548603684, 9) + n4;
        n6 = sprhfl3.cfr_renamed_3837(n6, 10);
        n4 = sprhfl3.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n3, n2, n6) + this.cfr_renamed_119[10] + 1548603684, 11) + n5;
        n2 = sprhfl3.cfr_renamed_3837(n2, 10);
        n5 = sprhfl3.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n4, n3, n2) + this.cfr_renamed_119[14] + 1548603684, 7) + n6;
        n3 = sprhfl3.cfr_renamed_3837(n3, 10);
        n6 = sprhfl3.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n5, n4, n3) + this.cfr_renamed_119[15] + 1548603684, 7) + n2;
        n4 = sprhfl3.cfr_renamed_3837(n4, 10);
        n2 = sprhfl3.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + this.cfr_renamed_119[8] + 1548603684, 12) + n3;
        n5 = sprhfl3.cfr_renamed_3837(n5, 10);
        n3 = sprhfl3.cfr_renamed_3837(n3 + this.cfr_renamed_3839(n2, n6, n5) + this.cfr_renamed_119[12] + 1548603684, 7) + n4;
        n6 = sprhfl3.cfr_renamed_3837(n6, 10);
        n4 = sprhfl3.cfr_renamed_3837(n4 + this.cfr_renamed_3839(n3, n2, n6) + this.cfr_renamed_119[4] + 1548603684, 6) + n5;
        n2 = sprhfl3.cfr_renamed_3837(n2, 10);
        n5 = sprhfl3.cfr_renamed_3837(n5 + this.cfr_renamed_3839(n4, n3, n2) + this.cfr_renamed_119[9] + 1548603684, 15) + n6;
        n3 = sprhfl3.cfr_renamed_3837(n3, 10);
        n6 = sprhfl3.cfr_renamed_3837(n6 + this.cfr_renamed_3839(n5, n4, n3) + this.cfr_renamed_119[1] + 1548603684, 13) + n2;
        n4 = sprhfl3.cfr_renamed_3837(n4, 10);
        sprhfl sprhfl5 = this;
        sprhfl sprhfl6 = this;
        n2 = sprhfl6.cfr_renamed_3837(n2 + this.cfr_renamed_3839(n6, n5, n4) + sprhfl6.cfr_renamed_119[2] + 1548603684, 11) + n3;
        n5 = sprhfl5.cfr_renamed_3837(n5, 10);
        sprhfl sprhfl7 = this;
        n10 = sprhfl7.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + sprhfl7.cfr_renamed_119[3] + 1859775393, 11) + n9;
        n7 = sprhfl5.cfr_renamed_3837(n7, 10);
        n9 = sprhfl5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_119[10] + 1859775393, 13) + n8;
        n11 = sprhfl5.cfr_renamed_3837(n11, 10);
        n8 = sprhfl5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_119[14] + 1859775393, 6) + n7;
        n10 = sprhfl5.cfr_renamed_3837(n10, 10);
        n7 = sprhfl5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_119[4] + 1859775393, 7) + n11;
        n9 = sprhfl5.cfr_renamed_3837(n9, 10);
        n11 = sprhfl5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_119[9] + 1859775393, 14) + n10;
        n8 = sprhfl5.cfr_renamed_3837(n8, 10);
        n10 = sprhfl5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_119[15] + 1859775393, 9) + n9;
        n7 = sprhfl5.cfr_renamed_3837(n7, 10);
        n9 = sprhfl5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_119[8] + 1859775393, 13) + n8;
        n11 = sprhfl5.cfr_renamed_3837(n11, 10);
        n8 = sprhfl5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_119[1] + 1859775393, 15) + n7;
        n10 = sprhfl5.cfr_renamed_3837(n10, 10);
        n7 = sprhfl5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_119[2] + 1859775393, 14) + n11;
        n9 = sprhfl5.cfr_renamed_3837(n9, 10);
        n11 = sprhfl5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_119[7] + 1859775393, 8) + n10;
        n8 = sprhfl5.cfr_renamed_3837(n8, 10);
        n10 = sprhfl5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_119[0] + 1859775393, 13) + n9;
        n7 = sprhfl5.cfr_renamed_3837(n7, 10);
        n9 = sprhfl5.cfr_renamed_3837(n9 + this.cfr_renamed_3840(n10, n11, n7) + this.cfr_renamed_119[6] + 1859775393, 6) + n8;
        n11 = sprhfl5.cfr_renamed_3837(n11, 10);
        n8 = sprhfl5.cfr_renamed_3837(n8 + this.cfr_renamed_3840(n9, n10, n11) + this.cfr_renamed_119[13] + 1859775393, 5) + n7;
        n10 = sprhfl5.cfr_renamed_3837(n10, 10);
        n7 = sprhfl5.cfr_renamed_3837(n7 + this.cfr_renamed_3840(n8, n9, n10) + this.cfr_renamed_119[11] + 1859775393, 12) + n11;
        n9 = sprhfl5.cfr_renamed_3837(n9, 10);
        n11 = sprhfl5.cfr_renamed_3837(n11 + this.cfr_renamed_3840(n7, n8, n9) + this.cfr_renamed_119[5] + 1859775393, 7) + n10;
        n8 = sprhfl5.cfr_renamed_3837(n8, 10);
        n10 = sprhfl5.cfr_renamed_3837(n10 + this.cfr_renamed_3840(n11, n7, n8) + this.cfr_renamed_119[12] + 1859775393, 5) + n9;
        n7 = sprhfl5.cfr_renamed_3837(n7, 10);
        n3 = sprhfl5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_119[15] + 1836072691, 9) + n4;
        n6 = sprhfl5.cfr_renamed_3837(n6, 10);
        n4 = sprhfl5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n3, n2, n6) + this.cfr_renamed_119[5] + 1836072691, 7) + n5;
        n2 = sprhfl5.cfr_renamed_3837(n2, 10);
        n5 = sprhfl5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n4, n3, n2) + this.cfr_renamed_119[1] + 1836072691, 15) + n6;
        n3 = sprhfl5.cfr_renamed_3837(n3, 10);
        n6 = sprhfl5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n5, n4, n3) + this.cfr_renamed_119[3] + 1836072691, 11) + n2;
        n4 = sprhfl5.cfr_renamed_3837(n4, 10);
        n2 = sprhfl5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n6, n5, n4) + this.cfr_renamed_119[7] + 1836072691, 8) + n3;
        n5 = sprhfl5.cfr_renamed_3837(n5, 10);
        n3 = sprhfl5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_119[14] + 1836072691, 6) + n4;
        n6 = sprhfl5.cfr_renamed_3837(n6, 10);
        n4 = sprhfl5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n3, n2, n6) + this.cfr_renamed_119[6] + 1836072691, 6) + n5;
        n2 = sprhfl5.cfr_renamed_3837(n2, 10);
        n5 = sprhfl5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n4, n3, n2) + this.cfr_renamed_119[9] + 1836072691, 14) + n6;
        n3 = sprhfl5.cfr_renamed_3837(n3, 10);
        n6 = sprhfl5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n5, n4, n3) + this.cfr_renamed_119[11] + 1836072691, 12) + n2;
        n4 = sprhfl5.cfr_renamed_3837(n4, 10);
        n2 = sprhfl5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n6, n5, n4) + this.cfr_renamed_119[8] + 1836072691, 13) + n3;
        n5 = sprhfl5.cfr_renamed_3837(n5, 10);
        n3 = sprhfl5.cfr_renamed_3837(n3 + this.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_119[12] + 1836072691, 5) + n4;
        n6 = sprhfl5.cfr_renamed_3837(n6, 10);
        n4 = sprhfl5.cfr_renamed_3837(n4 + this.cfr_renamed_3840(n3, n2, n6) + this.cfr_renamed_119[2] + 1836072691, 14) + n5;
        n2 = sprhfl5.cfr_renamed_3837(n2, 10);
        n5 = sprhfl5.cfr_renamed_3837(n5 + this.cfr_renamed_3840(n4, n3, n2) + this.cfr_renamed_119[10] + 1836072691, 13) + n6;
        n3 = sprhfl5.cfr_renamed_3837(n3, 10);
        n6 = sprhfl5.cfr_renamed_3837(n6 + this.cfr_renamed_3840(n5, n4, n3) + this.cfr_renamed_119[0] + 1836072691, 13) + n2;
        n4 = sprhfl5.cfr_renamed_3837(n4, 10);
        n2 = sprhfl5.cfr_renamed_3837(n2 + this.cfr_renamed_3840(n6, n5, n4) + this.cfr_renamed_119[4] + 1836072691, 7) + n3;
        sprhfl sprhfl8 = this;
        n5 = sprhfl8.cfr_renamed_3837(n5, 10);
        sprhfl sprhfl9 = this;
        n3 = sprhfl8.cfr_renamed_3837(n3 + sprhfl9.cfr_renamed_3840(n2, n6, n5) + this.cfr_renamed_119[13] + 1836072691, 5) + n4;
        n6 = sprhfl9.cfr_renamed_3837(n6, 10);
        n9 = sprhfl8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_119[1] + -1894007588, 11) + n8;
        n11 = sprhfl8.cfr_renamed_3837(n11, 10);
        n8 = sprhfl8.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_119[9] + -1894007588, 12) + n7;
        n10 = sprhfl8.cfr_renamed_3837(n10, 10);
        n7 = sprhfl8.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_119[11] + -1894007588, 14) + n11;
        n9 = sprhfl8.cfr_renamed_3837(n9, 10);
        n11 = sprhfl8.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_119[10] + -1894007588, 15) + n10;
        n8 = sprhfl8.cfr_renamed_3837(n8, 10);
        n10 = sprhfl8.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_119[0] + -1894007588, 14) + n9;
        n7 = sprhfl8.cfr_renamed_3837(n7, 10);
        n9 = sprhfl8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_119[8] + -1894007588, 15) + n8;
        n11 = sprhfl8.cfr_renamed_3837(n11, 10);
        n8 = sprhfl8.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_119[12] + -1894007588, 9) + n7;
        n10 = sprhfl8.cfr_renamed_3837(n10, 10);
        n7 = sprhfl8.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_119[4] + -1894007588, 8) + n11;
        n9 = sprhfl8.cfr_renamed_3837(n9, 10);
        n11 = sprhfl8.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_119[13] + -1894007588, 9) + n10;
        n8 = sprhfl8.cfr_renamed_3837(n8, 10);
        n10 = sprhfl8.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_119[3] + -1894007588, 14) + n9;
        n7 = sprhfl8.cfr_renamed_3837(n7, 10);
        n9 = sprhfl8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_119[7] + -1894007588, 5) + n8;
        n11 = sprhfl8.cfr_renamed_3837(n11, 10);
        n8 = sprhfl8.cfr_renamed_3837(n8 + this.cfr_renamed_3839(n9, n10, n11) + this.cfr_renamed_119[15] + -1894007588, 6) + n7;
        n10 = sprhfl8.cfr_renamed_3837(n10, 10);
        n7 = sprhfl8.cfr_renamed_3837(n7 + this.cfr_renamed_3839(n8, n9, n10) + this.cfr_renamed_119[14] + -1894007588, 8) + n11;
        n9 = sprhfl8.cfr_renamed_3837(n9, 10);
        n11 = sprhfl8.cfr_renamed_3837(n11 + this.cfr_renamed_3839(n7, n8, n9) + this.cfr_renamed_119[5] + -1894007588, 6) + n10;
        n8 = sprhfl8.cfr_renamed_3837(n8, 10);
        n10 = sprhfl8.cfr_renamed_3837(n10 + this.cfr_renamed_3839(n11, n7, n8) + this.cfr_renamed_119[6] + -1894007588, 5) + n9;
        n7 = sprhfl8.cfr_renamed_3837(n7, 10);
        n9 = sprhfl8.cfr_renamed_3837(n9 + this.cfr_renamed_3839(n10, n11, n7) + this.cfr_renamed_119[2] + -1894007588, 12) + n8;
        n11 = sprhfl8.cfr_renamed_3837(n11, 10);
        n4 = sprhfl8.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + this.cfr_renamed_119[8] + 2053994217, 15) + n5;
        n2 = sprhfl8.cfr_renamed_3837(n2, 10);
        n5 = sprhfl8.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n4, n3, n2) + this.cfr_renamed_119[6] + 2053994217, 5) + n6;
        n3 = sprhfl8.cfr_renamed_3837(n3, 10);
        n6 = sprhfl8.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n5, n4, n3) + this.cfr_renamed_119[4] + 2053994217, 8) + n2;
        n4 = sprhfl8.cfr_renamed_3837(n4, 10);
        n2 = sprhfl8.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n6, n5, n4) + this.cfr_renamed_119[1] + 2053994217, 11) + n3;
        n5 = sprhfl8.cfr_renamed_3837(n5, 10);
        n3 = sprhfl8.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n2, n6, n5) + this.cfr_renamed_119[3] + 2053994217, 14) + n4;
        n6 = sprhfl8.cfr_renamed_3837(n6, 10);
        n4 = sprhfl8.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + this.cfr_renamed_119[11] + 2053994217, 14) + n5;
        n2 = sprhfl8.cfr_renamed_3837(n2, 10);
        n5 = sprhfl8.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n4, n3, n2) + this.cfr_renamed_119[15] + 2053994217, 6) + n6;
        n3 = sprhfl8.cfr_renamed_3837(n3, 10);
        n6 = sprhfl8.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n5, n4, n3) + this.cfr_renamed_119[0] + 2053994217, 14) + n2;
        n4 = sprhfl8.cfr_renamed_3837(n4, 10);
        n2 = sprhfl8.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n6, n5, n4) + this.cfr_renamed_119[5] + 2053994217, 6) + n3;
        n5 = sprhfl8.cfr_renamed_3837(n5, 10);
        n3 = sprhfl8.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n2, n6, n5) + this.cfr_renamed_119[12] + 2053994217, 9) + n4;
        n6 = sprhfl8.cfr_renamed_3837(n6, 10);
        n4 = sprhfl8.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + this.cfr_renamed_119[2] + 2053994217, 12) + n5;
        n2 = sprhfl8.cfr_renamed_3837(n2, 10);
        n5 = sprhfl8.cfr_renamed_3837(n5 + this.cfr_renamed_3833(n4, n3, n2) + this.cfr_renamed_119[13] + 2053994217, 9) + n6;
        n3 = sprhfl8.cfr_renamed_3837(n3, 10);
        n6 = sprhfl8.cfr_renamed_3837(n6 + this.cfr_renamed_3833(n5, n4, n3) + this.cfr_renamed_119[9] + 2053994217, 12) + n2;
        n4 = sprhfl8.cfr_renamed_3837(n4, 10);
        n2 = sprhfl8.cfr_renamed_3837(n2 + this.cfr_renamed_3833(n6, n5, n4) + this.cfr_renamed_119[7] + 2053994217, 5) + n3;
        n5 = sprhfl8.cfr_renamed_3837(n5, 10);
        sprhfl sprhfl10 = this;
        sprhfl sprhfl11 = this;
        n3 = sprhfl11.cfr_renamed_3837(n3 + this.cfr_renamed_3833(n2, n6, n5) + sprhfl11.cfr_renamed_119[10] + 2053994217, 15) + n4;
        n6 = sprhfl10.cfr_renamed_3837(n6, 10);
        sprhfl sprhfl12 = this;
        n4 = sprhfl12.cfr_renamed_3837(n4 + this.cfr_renamed_3833(n3, n2, n6) + sprhfl12.cfr_renamed_119[14] + 2053994217, 8) + n5;
        n2 = sprhfl10.cfr_renamed_3837(n2, 10);
        n8 = sprhfl10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_119[4] + -1454113458, 9) + n7;
        n10 = sprhfl10.cfr_renamed_3837(n10, 10);
        n7 = sprhfl10.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_119[0] + -1454113458, 15) + n11;
        n9 = sprhfl10.cfr_renamed_3837(n9, 10);
        n11 = sprhfl10.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_119[5] + -1454113458, 5) + n10;
        n8 = sprhfl10.cfr_renamed_3837(n8, 10);
        n10 = sprhfl10.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_119[9] + -1454113458, 11) + n9;
        n7 = sprhfl10.cfr_renamed_3837(n7, 10);
        n9 = sprhfl10.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_119[7] + -1454113458, 6) + n8;
        n11 = sprhfl10.cfr_renamed_3837(n11, 10);
        n8 = sprhfl10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_119[12] + -1454113458, 8) + n7;
        n10 = sprhfl10.cfr_renamed_3837(n10, 10);
        n7 = sprhfl10.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_119[2] + -1454113458, 13) + n11;
        n9 = sprhfl10.cfr_renamed_3837(n9, 10);
        n11 = sprhfl10.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_119[10] + -1454113458, 12) + n10;
        n8 = sprhfl10.cfr_renamed_3837(n8, 10);
        n10 = sprhfl10.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_119[14] + -1454113458, 5) + n9;
        n7 = sprhfl10.cfr_renamed_3837(n7, 10);
        n9 = sprhfl10.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_119[1] + -1454113458, 12) + n8;
        n11 = sprhfl10.cfr_renamed_3837(n11, 10);
        n8 = sprhfl10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_119[3] + -1454113458, 13) + n7;
        n10 = sprhfl10.cfr_renamed_3837(n10, 10);
        n7 = sprhfl10.cfr_renamed_3837(n7 + this.cfr_renamed_3836(n8, n9, n10) + this.cfr_renamed_119[8] + -1454113458, 14) + n11;
        n9 = sprhfl10.cfr_renamed_3837(n9, 10);
        n11 = sprhfl10.cfr_renamed_3837(n11 + this.cfr_renamed_3836(n7, n8, n9) + this.cfr_renamed_119[11] + -1454113458, 11) + n10;
        n8 = sprhfl10.cfr_renamed_3837(n8, 10);
        n10 = sprhfl10.cfr_renamed_3837(n10 + this.cfr_renamed_3836(n11, n7, n8) + this.cfr_renamed_119[6] + -1454113458, 8) + n9;
        n7 = sprhfl10.cfr_renamed_3837(n7, 10);
        n9 = sprhfl10.cfr_renamed_3837(n9 + this.cfr_renamed_3836(n10, n11, n7) + this.cfr_renamed_119[15] + -1454113458, 5) + n8;
        n11 = sprhfl10.cfr_renamed_3837(n11, 10);
        n8 = sprhfl10.cfr_renamed_3837(n8 + this.cfr_renamed_3836(n9, n10, n11) + this.cfr_renamed_119[13] + -1454113458, 6) + n7;
        n10 = sprhfl10.cfr_renamed_3837(n10, 10);
        n5 = sprhfl10.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_119[12], 8) + n6;
        n3 = sprhfl10.cfr_renamed_3837(n3, 10);
        n6 = sprhfl10.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n5, n4, n3) + this.cfr_renamed_119[15], 5) + n2;
        n4 = sprhfl10.cfr_renamed_3837(n4, 10);
        n2 = sprhfl10.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n6, n5, n4) + this.cfr_renamed_119[10], 12) + n3;
        n5 = sprhfl10.cfr_renamed_3837(n5, 10);
        n3 = sprhfl10.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n2, n6, n5) + this.cfr_renamed_119[4], 9) + n4;
        n6 = sprhfl10.cfr_renamed_3837(n6, 10);
        n4 = sprhfl10.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n3, n2, n6) + this.cfr_renamed_119[1], 12) + n5;
        n2 = sprhfl10.cfr_renamed_3837(n2, 10);
        n5 = sprhfl10.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_119[5], 5) + n6;
        n3 = sprhfl10.cfr_renamed_3837(n3, 10);
        n6 = sprhfl10.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n5, n4, n3) + this.cfr_renamed_119[8], 14) + n2;
        n4 = sprhfl10.cfr_renamed_3837(n4, 10);
        n2 = sprhfl10.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n6, n5, n4) + this.cfr_renamed_119[7], 6) + n3;
        n5 = sprhfl10.cfr_renamed_3837(n5, 10);
        n3 = sprhfl10.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n2, n6, n5) + this.cfr_renamed_119[6], 8) + n4;
        n6 = sprhfl10.cfr_renamed_3837(n6, 10);
        n4 = sprhfl10.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n3, n2, n6) + this.cfr_renamed_119[2], 13) + n5;
        n2 = sprhfl10.cfr_renamed_3837(n2, 10);
        n5 = sprhfl10.cfr_renamed_3837(n5 + this.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_119[13], 6) + n6;
        n3 = sprhfl10.cfr_renamed_3837(n3, 10);
        n6 = sprhfl10.cfr_renamed_3837(n6 + this.cfr_renamed_3838(n5, n4, n3) + this.cfr_renamed_119[14], 5) + n2;
        n4 = sprhfl10.cfr_renamed_3837(n4, 10);
        n2 = sprhfl10.cfr_renamed_3837(n2 + this.cfr_renamed_3838(n6, n5, n4) + this.cfr_renamed_119[0], 15) + n3;
        n5 = sprhfl10.cfr_renamed_3837(n5, 10);
        n3 = sprhfl10.cfr_renamed_3837(n3 + this.cfr_renamed_3838(n2, n6, n5) + this.cfr_renamed_119[3], 13) + n4;
        n6 = sprhfl10.cfr_renamed_3837(n6, 10);
        n4 = sprhfl10.cfr_renamed_3837(n4 + this.cfr_renamed_3838(n3, n2, n6) + this.cfr_renamed_119[9], 11) + n5;
        sprhfl sprhfl13 = this;
        n2 = sprhfl13.cfr_renamed_3837(n2, 10);
        sprhfl sprhfl14 = this;
        n5 = sprhfl13.cfr_renamed_3837(n5 + sprhfl14.cfr_renamed_3838(n4, n3, n2) + this.cfr_renamed_119[11], 11) + n6;
        n3 = sprhfl14.cfr_renamed_3837(n3, 10);
        sprhfl13.cfr_renamed_2 = sprhfl13.cfr_renamed_0 + n10 + n2;
        sprhfl13.cfr_renamed_0 = sprhfl13.cfr_renamed_91 + n11 + n6;
        sprhfl13.cfr_renamed_91 = sprhfl13.cfr_renamed_3 + n7 + n5;
        sprhfl13.cfr_renamed_3 = sprhfl13.cfr_renamed_1 + n8 + n4;
        sprhfl13.cfr_renamed_1 = n3 += n9 + this.cfr_renamed_2;
        sprhfl13.cfr_renamed_112 = 0;
        int n12 = n = 0;
        while (n12 != this.cfr_renamed_119.length) {
            this.cfr_renamed_119[n++] = 0;
            n12 = n;
        }
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprhfl sprhfl2 = (sprhfl)arg0;
        this.cfr_renamed_10496(sprhfl2);
    }

    public sprhfl(spriil arg0) {
        sprhfl sprhfl2 = this;
        super(arg0);
        this.cfr_renamed_119 = new int[16];
        sprybl.cfr_renamed_9170(sprhfl2.cfr_renamed_10476());
        this.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_3837(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sprhfl(sprhfl sprhfl2) {
        void arg0;
        sprhfl sprhfl3 = this;
        super((sprikl)arg0);
        sprhfl3.cfr_renamed_119 = new int[16];
        sprybl.cfr_renamed_9170(sprhfl3.cfr_renamed_10476());
        sprhfl3.cfr_renamed_10496(sprhfl2);
    }

    private /* synthetic */ void cfr_renamed_10496(sprhfl arg0) {
        sprhfl sprhfl2 = arg0;
        sprhfl sprhfl3 = this;
        sprhfl sprhfl4 = arg0;
        super.cfr_renamed_10478(arg0);
        this.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_2 = sprhfl4.cfr_renamed_2;
        sprhfl3.cfr_renamed_0 = sprhfl4.cfr_renamed_0;
        sprhfl3.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_3 = sprhfl2.cfr_renamed_3;
        System.arraycopy(sprhfl2.cfr_renamed_119, 0, this.cfr_renamed_119, 0, arg0.cfr_renamed_119.length);
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_1218() {
        return 20;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_119[this.cfr_renamed_112++] = sprpxe.cfr_renamed_439(arg0, arg1);
        if (this.cfr_renamed_112 == 16) {
            this.cfr_renamed_3473();
        }
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprhfl(this);
    }

    private /* synthetic */ int cfr_renamed_3839(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    private /* synthetic */ int cfr_renamed_3840(int arg0, int arg1, int arg2) {
        return (arg0 | ~arg1) ^ arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprhfl sprhfl2 = this;
        sprhfl2.cfr_renamed_3120();
        sprpxe.cfr_renamed_437(sprhfl2.cfr_renamed_1, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_437(sprhfl2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_437(sprhfl2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_437(sprhfl2.cfr_renamed_91, (byte[])arg0, (int)(arg1 + 12));
        sprpxe.cfr_renamed_437(sprhfl2.cfr_renamed_3, (byte[])arg0, (int)(arg1 + 16));
        sprhfl2.cfr_renamed_41();
        return 20;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprhfl sprhfl2 = this;
        sprhfl sprhfl3 = this;
        sprhfl sprhfl4 = this;
        super.cfr_renamed_41();
        sprhfl4.cfr_renamed_1 = 1732584193;
        sprhfl4.cfr_renamed_2 = -271733879;
        sprhfl3.cfr_renamed_0 = -1732584194;
        sprhfl3.cfr_renamed_91 = 271733878;
        sprhfl2.cfr_renamed_3 = -1009589776;
        sprhfl2.cfr_renamed_112 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_119.length) {
            this.cfr_renamed_119[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3833(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprhfl sprhfl2 = this;
        return sprhel.cfr_renamed_10472(sprhfl2, 128, (spriil)sprhfl2.cfr_renamed_0);
    }
}

