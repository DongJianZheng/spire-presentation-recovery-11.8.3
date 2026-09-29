/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;

public class sprxnd
implements spruc {
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private static final byte cfr_renamed_0 = 92;
    private static final byte cfr_renamed_1 = 54;
    private sprlc cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 64;

    public sprlc cfr_renamed_3069() {
        return this.cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprxnd(sprlc sprlc2) {
        void arg0;
        sprxnd sprxnd2 = this;
        sprxnd sprxnd3 = this;
        sprxnd3.cfr_renamed_3 = new byte[64];
        sprxnd3.cfr_renamed_119 = new byte[64];
        sprxnd2.cfr_renamed_2 = arg0;
        sprxnd2.cfr_renamed_91 = sprlc2.cfr_renamed_1218();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1524(sprt sprt2) {
        int n;
        this.cfr_renamed_2.cfr_renamed_41();
        byte[] byArray = ((sprnld)sprt2).cfr_renamed_1521();
        if (byArray.length > 64) {
            this.cfr_renamed_2.cfr_renamed_1197(byArray, 0, byArray.length);
            sprxnd sprxnd2 = this;
            sprxnd2.cfr_renamed_2.cfr_renamed_1219(sprxnd2.cfr_renamed_3, 0);
            n = this.cfr_renamed_91;
            int n2 = n;
            while (n2 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n++] = 0;
                n2 = n;
            }
        } else {
            System.arraycopy(byArray, 0, this.cfr_renamed_3, 0, byArray.length);
            int n3 = n = byArray.length;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n++] = 0;
                n3 = n;
            }
        }
        this.cfr_renamed_119 = new byte[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_3, 0, this.cfr_renamed_119, 0, this.cfr_renamed_3.length);
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3.length) {
            int n5 = n++;
            this.cfr_renamed_3[n5] = (byte)(this.cfr_renamed_3[n5] ^ 0x36);
            n4 = n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_119.length) {
            int n7 = n++;
            this.cfr_renamed_119[n7] = (byte)(this.cfr_renamed_119[n7] ^ 0x5C);
            n6 = n;
        }
        sprxnd sprxnd3 = this;
        sprxnd3.cfr_renamed_2.cfr_renamed_1197(sprxnd3.cfr_renamed_3, 0, this.cfr_renamed_3.length);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_2.cfr_renamed_1315()).append(sprbnja.cfr_renamed_9("b|\u0000u\u000e")).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprxnd sprxnd2 = this;
        byte[] byArray = new byte[sprxnd2.cfr_renamed_91];
        sprxnd2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        sprxnd2.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
        this.cfr_renamed_2.cfr_renamed_1197(byArray, 0, byArray.length);
        sprxnd sprxnd3 = this;
        int n = sprxnd3.cfr_renamed_2.cfr_renamed_1219(arg0, arg1);
        sprxnd3.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_41() {
        sprxnd sprxnd2 = this;
        sprxnd2.cfr_renamed_2.cfr_renamed_41();
        sprxnd2.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
    }
}

