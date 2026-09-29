/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyl;
import com.spire.presentation.packages.sprgtl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.spryil;
import java.math.BigInteger;

public class sprmhl
extends spryil {
    private sprcyl cfr_renamed_4;

    @Override
    public Object clone() {
        return new sprmhl(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_3955() {
        return this.cfr_renamed_4.cfr_renamed_3955();
    }

    public sprmhl(byte[] arg0) {
        this(null, null, arg0);
    }

    private /* synthetic */ sprmhl(sprcyl sprcyl2) {
        super(2);
        this.cfr_renamed_4 = sprcyl2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprmhl)) {
            return false;
        }
        sprmhl sprmhl2 = (sprmhl)arg0;
        return this.cfr_renamed_4.equals(sprmhl2.cfr_renamed_4);
    }

    public sprmhl(sprnbm arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprmhl(sprnbm sprnbm2, BigInteger bigInteger, byte[] byArray) {
        this(new sprcyl((sprnbm)arg0, (BigInteger)arg1, (byte[])arg2));
        void arg2;
        void arg1;
        void arg0;
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprgtl) {
            return ((sprgtl)arg0).cfr_renamed_3995().equals(this);
        }
        return this.cfr_renamed_4.cfr_renamed_132(arg0);
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114();
    }
}

