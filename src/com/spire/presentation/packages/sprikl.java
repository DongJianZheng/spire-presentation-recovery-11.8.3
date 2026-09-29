/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprxq;

public abstract class sprikl
implements sprpl,
sprhx {
    public final spriil cfr_renamed_0;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 64;
    private final byte[] cfr_renamed_3;
    private long cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        arg2 = Math.max(0, arg2);
        if (this.cfr_renamed_1 != 0) {
            for (n2 = 0; n2 < arg2; ++n2) {
                int n3 = arg1 + n2;
                this.cfr_renamed_3[this.cfr_renamed_1++] = arg0[n3];
                if (this.cfr_renamed_1 != 4) continue;
                n = arg2;
                sprikl sprikl2 = this;
                sprikl2.cfr_renamed_3766(sprikl2.cfr_renamed_3, 0);
                sprikl2.cfr_renamed_1 = 0;
                break;
            }
        } else {
            n = arg2;
        }
        int n4 = n - 3;
        int n5 = n2;
        while (n5 < n4) {
            int n6 = n2;
            this.cfr_renamed_3766(arg0, arg1 + n6);
            n5 = n2 += 4;
        }
        int n7 = n2;
        while (n7 < arg2) {
            int n8 = arg1 + n2;
            this.cfr_renamed_3[this.cfr_renamed_1++] = arg0[n8];
            n7 = ++n2;
        }
        this.cfr_renamed_4 += (long)arg2;
    }

    public abstract sprxq cfr_renamed_10476();

    /*
     * WARNING - void declaration
     */
    public sprikl(sprikl sprikl2) {
        void arg0;
        this.cfr_renamed_3 = new byte[4];
        this.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_10478(sprikl2);
    }

    @Override
    public int cfr_renamed_3248() {
        return 64;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprikl sprikl2 = this;
        sprikl2.cfr_renamed_4 = 0L;
        sprikl2.cfr_renamed_1 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n2 = n;
        }
    }

    public sprikl() {
        this(spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprikl(spriil spriil2) {
        void arg0;
        sprikl sprikl2 = this;
        this.cfr_renamed_3 = new byte[4];
        sprikl2.cfr_renamed_0 = arg0;
        sprikl2.cfr_renamed_1 = 0;
    }

    public abstract void cfr_renamed_3473();

    public void cfr_renamed_3793(byte[] arg0) {
        sprikl sprikl2 = this;
        System.arraycopy(sprikl2.cfr_renamed_3, 0, arg0, 0, this.cfr_renamed_1);
        sprpxe.cfr_renamed_442(sprikl2.cfr_renamed_1, arg0, 4);
        sprpxe.cfr_renamed_450(sprikl2.cfr_renamed_4, arg0, 8);
    }

    public abstract void cfr_renamed_3763(long var1);

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3[this.cfr_renamed_1++] = arg0;
        sprikl sprikl2 = this;
        if (sprikl2.cfr_renamed_1 == sprikl2.cfr_renamed_3.length) {
            sprikl sprikl3 = this;
            sprikl3.cfr_renamed_3766(sprikl3.cfr_renamed_3, 0);
            sprikl3.cfr_renamed_1 = 0;
        }
        ++this.cfr_renamed_4;
    }

    public void cfr_renamed_3120() {
        sprikl sprikl2 = this;
        sprikl sprikl3 = sprikl2;
        long l = sprikl2.cfr_renamed_4 << 3;
        sprikl2.cfr_renamed_1221((byte)-128);
        while (sprikl3.cfr_renamed_1 != 0) {
            sprikl sprikl4 = this;
            sprikl3 = sprikl4;
            sprikl4.cfr_renamed_1221((byte)0);
        }
        sprikl sprikl5 = this;
        sprikl5.cfr_renamed_3763(l);
        sprikl5.cfr_renamed_3473();
    }

    public void cfr_renamed_10478(sprikl arg0) {
        System.arraycopy(arg0.cfr_renamed_3, 0, this.cfr_renamed_3, 0, arg0.cfr_renamed_3.length);
        sprikl sprikl2 = this;
        sprikl2.cfr_renamed_1 = arg0.cfr_renamed_1;
        sprikl2.cfr_renamed_4 = arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprikl(byte[] byArray) {
        void arg0;
        this.cfr_renamed_3 = new byte[4];
        void v0 = arg0;
        this.cfr_renamed_0 = spriil.values()[v0[((void)v0).length - 1]];
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        sprikl sprikl2 = this;
        sprikl2.cfr_renamed_1 = sprpxe.cfr_renamed_446((byte[])arg0, 4);
        sprikl2.cfr_renamed_4 = sprpxe.cfr_renamed_456((byte[])arg0, 8);
    }

    public abstract void cfr_renamed_3766(byte[] var1, int var2);
}

