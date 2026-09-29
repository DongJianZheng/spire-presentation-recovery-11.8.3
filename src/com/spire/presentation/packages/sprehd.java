/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public abstract class sprehd
implements sprko,
sprrj {
    private static final int cfr_renamed_1 = 64;
    private int cfr_renamed_2;
    private long cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        sprehd sprehd2 = this;
        sprehd2.cfr_renamed_3 = 0L;
        sprehd2.cfr_renamed_2 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
    }

    public abstract void cfr_renamed_3473();

    public sprehd() {
        sprehd sprehd2 = this;
        sprehd2.cfr_renamed_4 = new byte[4];
        sprehd2.cfr_renamed_2 = 0;
    }

    public void cfr_renamed_3793(byte[] arg0) {
        sprehd sprehd2 = this;
        System.arraycopy(sprehd2.cfr_renamed_4, 0, arg0, 0, this.cfr_renamed_2);
        sprtsa.cfr_renamed_442(sprehd2.cfr_renamed_2, arg0, 4);
        sprtsa.cfr_renamed_450(sprehd2.cfr_renamed_3, arg0, 8);
    }

    public sprehd(sprehd sprehd2) {
        this.cfr_renamed_4 = new byte[4];
        this.cfr_renamed_3767(sprehd2);
    }

    public void cfr_renamed_3120() {
        sprehd sprehd2 = this;
        sprehd sprehd3 = sprehd2;
        long l = sprehd2.cfr_renamed_3 << 3;
        sprehd2.cfr_renamed_1221((byte)-128);
        while (sprehd3.cfr_renamed_2 != 0) {
            sprehd sprehd4 = this;
            sprehd3 = sprehd4;
            sprehd4.cfr_renamed_1221((byte)0);
        }
        sprehd sprehd5 = this;
        sprehd5.cfr_renamed_3763(l);
        sprehd5.cfr_renamed_3473();
    }

    public abstract void cfr_renamed_3766(byte[] var1, int var2);

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprehd sprehd2 = this;
        while (sprehd2.cfr_renamed_2 != 0 && arg2 > 0) {
            sprehd sprehd3 = this;
            sprehd2 = sprehd3;
            sprehd3.cfr_renamed_1221(arg0[arg1++]);
            --arg2;
        }
        int n = arg2;
        while (n > this.cfr_renamed_4.length) {
            int n2 = arg1;
            this.cfr_renamed_3766(arg0, n2);
            arg1 = n2 + this.cfr_renamed_4.length;
            this.cfr_renamed_3 += (long)this.cfr_renamed_4.length;
            n = arg2 -= this.cfr_renamed_4.length;
        }
        int n3 = arg2;
        while (n3 > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n3 = --arg2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprehd(byte[] byArray) {
        void arg0;
        this.cfr_renamed_4 = new byte[4];
        System.arraycopy(byArray, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprehd sprehd2 = this;
        sprehd2.cfr_renamed_2 = sprtsa.cfr_renamed_446((byte[])arg0, 4);
        sprehd2.cfr_renamed_3 = sprtsa.cfr_renamed_456((byte[])arg0, 8);
    }

    public void cfr_renamed_3767(sprehd arg0) {
        System.arraycopy(arg0.cfr_renamed_4, 0, this.cfr_renamed_4, 0, arg0.cfr_renamed_4.length);
        sprehd sprehd2 = this;
        sprehd2.cfr_renamed_2 = arg0.cfr_renamed_2;
        sprehd2.cfr_renamed_3 = arg0.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4[this.cfr_renamed_2++] = arg0;
        sprehd sprehd2 = this;
        if (sprehd2.cfr_renamed_2 == sprehd2.cfr_renamed_4.length) {
            sprehd sprehd3 = this;
            sprehd3.cfr_renamed_3766(sprehd3.cfr_renamed_4, 0);
            sprehd3.cfr_renamed_2 = 0;
        }
        ++this.cfr_renamed_3;
    }

    public abstract void cfr_renamed_3763(long var1);

    @Override
    public int cfr_renamed_3248() {
        return 64;
    }
}

