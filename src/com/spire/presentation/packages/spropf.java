/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgyj;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprljf;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprvof;

public final class spropf {
    private final sprgf cfr_renamed_3;
    private final int cfr_renamed_4;

    public byte[] cfr_renamed_5820(byte[] arg0, byte[] arg1) {
        if (arg0.length != this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprgyj.cfr_renamed_9(")y1e9+5n'+2n0l*c"));
        }
        if (arg1.length != 2 * this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprlbd.cfr_renamed_9("\u00016\u0019*\u0011d\u001f*V(\u0013*\u00110\u001e"));
        }
        return this.cfr_renamed_5887(1, arg0, arg1);
    }

    public byte[] cfr_renamed_5773(byte[] arg0, byte[] arg1) {
        if (arg0.length != this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprgyj.cfr_renamed_9(")y1e9+5n'+2n0l*c"));
        }
        if (arg1.length != 32) {
            throw new IllegalArgumentException(sprlbd.cfr_renamed_9("3\u0004+\u0018#V%\u0012 \u0004!\u00057V(\u0013*\u00110\u001e"));
        }
        return this.cfr_renamed_5887(3, arg0, arg1);
    }

    public byte[] cfr_renamed_5775(byte[] arg0, byte[] arg1) {
        if (arg0.length != 3 * this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprgyj.cfr_renamed_9(")y1e9+5n'+2n0l*c"));
        }
        return this.cfr_renamed_5887(2, arg0, arg1);
    }

    public byte[] cfr_renamed_5878(byte[] arg0, byte[] arg1) {
        if (arg0.length != this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprlbd.cfr_renamed_9("3\u0004+\u0018#V/\u0013=V(\u0013*\u00110\u001e"));
        }
        if (arg1.length != this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprgyj.cfr_renamed_9("|,d0l~b0+2n0l*c"));
        }
        return this.cfr_renamed_5887(0, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public spropf(sprlem sprlem2, int n) {
        void arg1;
        void arg0;
        if (sprlem2 == null) {
            throw new NullPointerException(sprlbd.cfr_renamed_9(" \u001f#\u00137\u0002dKyV*\u0003(\u001a"));
        }
        this.cfr_renamed_3 = sprljf.cfr_renamed_5654((sprlem)arg0);
        this.cfr_renamed_4 = arg1;
    }

    private /* synthetic */ byte[] cfr_renamed_5887(int arg0, byte[] arg1, byte[] arg2) {
        byte[] byArray = sprvof.cfr_renamed_5755(arg0, this.cfr_renamed_4);
        this.cfr_renamed_3.cfr_renamed_1197(byArray, 0, byArray.length);
        this.cfr_renamed_3.cfr_renamed_1197(arg1, 0, arg1.length);
        this.cfr_renamed_3.cfr_renamed_1197(arg2, 0, arg2.length);
        spropf spropf2 = this;
        byte[] byArray2 = new byte[spropf2.cfr_renamed_4];
        if (spropf2.cfr_renamed_3 instanceof sprud) {
            ((sprud)this.cfr_renamed_3).cfr_renamed_1199(byArray2, 0, this.cfr_renamed_4);
            return byArray2;
        }
        this.cfr_renamed_3.cfr_renamed_1219(byArray2, 0);
        return byArray2;
    }
}

