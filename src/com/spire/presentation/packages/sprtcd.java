/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehaa;
import com.spire.presentation.packages.sprend;
import com.spire.presentation.packages.sprgrc;
import com.spire.presentation.packages.sprkwc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprppr;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;

public class sprtcd
implements spruc {
    public static final int cfr_renamed_1 = 256;
    public static final int cfr_renamed_2 = 1024;
    public static final int cfr_renamed_3 = 512;
    private sprend cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtcd(sprtcd sprtcd2) {
        void arg0;
        sprtcd sprtcd3 = this;
        sprtcd3.cfr_renamed_4 = new sprend(arg0.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        sprgrc sprgrc2;
        sprgrc sprgrc3;
        if (arg0 instanceof sprgrc) {
            sprgrc2 = sprgrc3 = (sprgrc)arg0;
        } else if (arg0 instanceof sprnld) {
            sprgrc2 = sprgrc3 = new sprkwc().cfr_renamed_2402(((sprnld)arg0).cfr_renamed_1521()).cfr_renamed_1451();
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprehaa.cfr_renamed_9("o:P5J=BtV5T5K1R1TtV5U'C0\u0006 Itu?C=Htk\u0015etO:O \u0006y\u0006")).append(arg0.getClass().getName()).toString());
        }
        if (sprgrc2.cfr_renamed_1521() == null) {
            throw new IllegalArgumentException(sprppr.cfr_renamed_9("$\f\u0012\u000e\u0019G:&4G\u0005\u0002\u0006\u0012\u001e\u0015\u0012\u0014W\u0006W\f\u0012\u001eW\u0017\u0016\u0015\u0016\n\u0012\u0013\u0012\u0015Y"));
        }
        this.cfr_renamed_4.cfr_renamed_3465(sprgrc3);
    }

    /*
     * WARNING - void declaration
     */
    public sprtcd(int n, int n2) {
        void arg1;
        void arg0;
        sprtcd sprtcd2 = this;
        sprtcd2.cfr_renamed_4 = new sprend((int)arg0, (int)arg1);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprehaa.cfr_renamed_9("\u0007M1O:\u000b\u0019g\u0017\u000b")).append(this.cfr_renamed_4.cfr_renamed_1195() * 8).append("-").append(this.cfr_renamed_4.cfr_renamed_3466() * 8).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        return this.cfr_renamed_4.cfr_renamed_1219(arg0, arg1);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_4.cfr_renamed_3466();
    }
}

