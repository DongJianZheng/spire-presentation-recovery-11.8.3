/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsl;
import com.spire.presentation.packages.sprcyl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.spryil;
import java.math.BigInteger;

public class sprdjl
extends spryil {
    private sprcyl cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdjl(sprnbm sprnbm2, BigInteger bigInteger, byte[] byArray) {
        this(new sprcyl((sprnbm)arg0, (BigInteger)arg1, (byte[])arg2));
        void arg2;
        void arg1;
        void arg0;
    }

    public sprdjl(sprnbm arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    public byte[] cfr_renamed_3955() {
        return this.cfr_renamed_4.cfr_renamed_3955();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114();
    }

    @Override
    public Object clone() {
        return new sprdjl(this.cfr_renamed_4);
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprbsl) {
            return ((sprbsl)arg0).cfr_renamed_3995().equals(this);
        }
        return this.cfr_renamed_4.cfr_renamed_132(arg0);
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprdjl)) {
            return false;
        }
        sprdjl sprdjl2 = (sprdjl)arg0;
        return this.cfr_renamed_4.equals(sprdjl2.cfr_renamed_4);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprdjl(byte[] arg0) {
        this(null, null, arg0);
    }

    private /* synthetic */ sprdjl(sprcyl sprcyl2) {
        super(0);
        this.cfr_renamed_4 = sprcyl2;
    }
}

