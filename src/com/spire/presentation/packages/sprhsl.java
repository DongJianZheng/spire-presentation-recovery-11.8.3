/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproze;
import java.math.BigInteger;

public class sprhsl
implements sprhd {
    private byte[] cfr_renamed_2;
    private sprnbm cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprhsl)) {
            return false;
        }
        sprhsl sprhsl2 = (sprhsl)arg0;
        if (sproze.cfr_renamed_92(this.cfr_renamed_2, sprhsl2.cfr_renamed_2)) {
            sprhsl sprhsl3 = this;
            if (sprhsl3.cfr_renamed_4019(sprhsl3.cfr_renamed_4, sprhsl2.cfr_renamed_4)) {
                sprhsl sprhsl4 = this;
                if (sprhsl4.cfr_renamed_4019(sprhsl4.cfr_renamed_3, sprhsl2.cfr_renamed_3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_4018(byte[] arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprhsl(byte[] byArray) {
        sprhsl sprhsl2 = this;
        sprhsl2.cfr_renamed_4018(byArray);
    }

    @Override
    public Object clone() {
        sprhsl sprhsl2 = this;
        return new sprhsl(sprhsl2.cfr_renamed_3, sprhsl2.cfr_renamed_4, this.cfr_renamed_2);
    }

    public int hashCode() {
        sprhsl sprhsl2 = this;
        int n = sproze.cfr_renamed_95(sprhsl2.cfr_renamed_2);
        if (sprhsl2.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        if (this.cfr_renamed_3 != null) {
            n ^= this.cfr_renamed_3.hashCode();
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprhsl(sprnbm sprnbm2, BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        sprhsl sprhsl2 = this;
        sprhsl2.cfr_renamed_10678((sprnbm)arg0, (BigInteger)arg1);
        sprhsl2.cfr_renamed_4018(byArray);
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprhsl(sprnbm sprnbm2, BigInteger bigInteger) {
        void arg1;
        sprhsl sprhsl2 = this;
        sprhsl2.cfr_renamed_10678(sprnbm2, (BigInteger)arg1);
    }

    public boolean cfr_renamed_132(Object arg0) {
        return false;
    }

    private /* synthetic */ boolean cfr_renamed_4019(Object arg0, Object arg1) {
        if (arg0 != null) {
            return arg0.equals(arg1);
        }
        return arg1 == null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10678(sprnbm sprnbm2, BigInteger bigInteger) {
        void arg0;
        sprhsl sprhsl2 = this;
        sprhsl2.cfr_renamed_3 = arg0;
        sprhsl2.cfr_renamed_4 = bigInteger;
    }
}

