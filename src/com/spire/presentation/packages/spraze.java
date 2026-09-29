/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;

public class spraze {
    private sprgf cfr_renamed_4;

    public byte[] cfr_renamed_1370(byte[] arg0) {
        byte[] byArray = new byte[arg0.length];
        this.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
        spraze spraze2 = this;
        byArray = new byte[spraze2.cfr_renamed_4.cfr_renamed_1218()];
        spraze2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        spraze spraze3 = this;
        spraze3.cfr_renamed_1379(arg0, byArray);
        spraze3.cfr_renamed_1380(arg0);
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_1379(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4;
            int n5 = n4 = (0xFF & arg0[n]) + (0xFF & arg1[n]) + n2;
            arg0[n] = (byte)n5;
            n2 = (byte)(n5 >> 8);
            n3 = ++n;
        }
    }

    public spraze(sprgf sprgf2) {
        this.cfr_renamed_4 = sprgf2;
    }

    private /* synthetic */ void cfr_renamed_1380(byte[] arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4;
            int n5 = n4 = (0xFF & arg0[n]) + n2;
            arg0[n] = (byte)n5;
            n2 = (byte)(n5 >> 8);
            n3 = ++n;
        }
    }
}

