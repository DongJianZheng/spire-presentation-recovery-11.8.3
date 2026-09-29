/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprntd;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.spruhe;
import java.math.BigInteger;

public class sprsrd
implements sprb {
    private sprntd cfr_renamed_4;

    public sprsrd(byte[] arg0) {
        this(null, null, arg0);
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprsrd)) {
            return false;
        }
        sprsrd sprsrd2 = (sprsrd)arg0;
        return this.cfr_renamed_4.equals(sprsrd2.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114();
    }

    @Override
    public Object clone() {
        return new sprsrd(this.cfr_renamed_4);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprpod) {
            return ((sprpod)arg0).cfr_renamed_634().equals(this);
        }
        return this.cfr_renamed_4.cfr_renamed_132(arg0);
    }

    public sprsrd(spruhe arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    private /* synthetic */ sprsrd(sprntd sprntd2) {
        this.cfr_renamed_4 = sprntd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsrd(spruhe spruhe2, BigInteger bigInteger, byte[] byArray) {
        this(new sprntd((spruhe)arg0, (BigInteger)arg1, (byte[])arg2));
        void arg2;
        void arg1;
        void arg0;
    }

    public byte[] cfr_renamed_3955() {
        return this.cfr_renamed_4.cfr_renamed_3955();
    }
}

