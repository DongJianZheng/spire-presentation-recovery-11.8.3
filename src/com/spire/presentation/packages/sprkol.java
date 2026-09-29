/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyl;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprrpl;
import java.math.BigInteger;

public class sprkol
implements sprhd {
    private sprcyl cfr_renamed_4;

    public sprkol(sprnbm arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    public sprkol(byte[] arg0) {
        this(null, null, arg0);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    private /* synthetic */ sprkol(sprcyl sprcyl2) {
        this.cfr_renamed_4 = sprcyl2;
    }

    @Override
    public Object clone() {
        return new sprkol(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprkol)) {
            return false;
        }
        sprkol sprkol2 = (sprkol)arg0;
        return this.cfr_renamed_4.equals(sprkol2.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114();
    }

    /*
     * WARNING - void declaration
     */
    public sprkol(sprnbm sprnbm2, BigInteger bigInteger, byte[] byArray) {
        this(new sprcyl((sprnbm)arg0, (BigInteger)arg1, (byte[])arg2));
        void arg2;
        void arg1;
        void arg0;
    }

    public byte[] cfr_renamed_3955() {
        return this.cfr_renamed_4.cfr_renamed_3955();
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprrpl) {
            return ((sprrpl)arg0).cfr_renamed_634().equals(this);
        }
        return this.cfr_renamed_4.cfr_renamed_132(arg0);
    }
}

