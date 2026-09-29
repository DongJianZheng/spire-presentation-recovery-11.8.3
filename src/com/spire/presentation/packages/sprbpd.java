/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprbpd
implements sprb {
    private BigInteger cfr_renamed_2;
    private spruhe cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbpd(spruhe spruhe2, BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        sprbpd sprbpd2 = this;
        sprbpd2.cfr_renamed_4017((spruhe)arg0, (BigInteger)arg1);
        sprbpd2.cfr_renamed_4018(byArray);
    }

    private /* synthetic */ boolean cfr_renamed_4019(Object arg0, Object arg1) {
        if (arg0 != null) {
            return arg0.equals(arg1);
        }
        return arg1 == null;
    }

    public sprbpd(byte[] byArray) {
        sprbpd sprbpd2 = this;
        sprbpd2.cfr_renamed_4018(byArray);
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        return false;
    }

    private /* synthetic */ void cfr_renamed_4018(byte[] arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public int hashCode() {
        sprbpd sprbpd2 = this;
        int n = sprzra.cfr_renamed_95(sprbpd2.cfr_renamed_4);
        if (sprbpd2.cfr_renamed_2 != null) {
            n ^= this.cfr_renamed_2.hashCode();
        }
        if (this.cfr_renamed_3 != null) {
            n ^= this.cfr_renamed_3.hashCode();
        }
        return n;
    }

    @Override
    public Object clone() {
        sprbpd sprbpd2 = this;
        return new sprbpd(sprbpd2.cfr_renamed_3, sprbpd2.cfr_renamed_2, this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_4017(spruhe spruhe2, BigInteger bigInteger) {
        void arg0;
        sprbpd sprbpd2 = this;
        sprbpd2.cfr_renamed_3 = arg0;
        sprbpd2.cfr_renamed_2 = bigInteger;
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprbpd)) {
            return false;
        }
        sprbpd sprbpd2 = (sprbpd)arg0;
        if (sprzra.cfr_renamed_92(this.cfr_renamed_4, sprbpd2.cfr_renamed_4)) {
            sprbpd sprbpd3 = this;
            if (sprbpd3.cfr_renamed_4019(sprbpd3.cfr_renamed_2, sprbpd2.cfr_renamed_2)) {
                sprbpd sprbpd4 = this;
                if (sprbpd4.cfr_renamed_4019(sprbpd4.cfr_renamed_3, sprbpd2.cfr_renamed_3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprbpd(spruhe spruhe2, BigInteger bigInteger) {
        void arg1;
        sprbpd sprbpd2 = this;
        sprbpd2.cfr_renamed_4017(spruhe2, (BigInteger)arg1);
    }
}

