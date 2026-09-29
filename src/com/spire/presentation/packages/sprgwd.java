/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazd;
import com.spire.presentation.packages.sprjxd;
import com.spire.presentation.packages.sprntd;
import com.spire.presentation.packages.spruhe;
import java.math.BigInteger;

public class sprgwd
extends sprjxd {
    private sprntd cfr_renamed_4;

    private /* synthetic */ sprgwd(sprntd sprntd2) {
        super(2);
        this.cfr_renamed_4 = sprntd2;
    }

    public sprgwd(byte[] arg0) {
        this(null, null, arg0);
    }

    @Override
    public Object clone() {
        return new sprgwd(this.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114();
    }

    public byte[] cfr_renamed_3955() {
        return this.cfr_renamed_4.cfr_renamed_3955();
    }

    public sprgwd(spruhe arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprgwd)) {
            return false;
        }
        sprgwd sprgwd2 = (sprgwd)arg0;
        return this.cfr_renamed_4.equals(sprgwd2.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprazd) {
            return ((sprazd)arg0).cfr_renamed_3995().equals(this);
        }
        return this.cfr_renamed_4.cfr_renamed_132(arg0);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprgwd(spruhe spruhe2, BigInteger bigInteger, byte[] byArray) {
        this(new sprntd((spruhe)arg0, (BigInteger)arg1, (byte[])arg2));
        void arg2;
        void arg1;
        void arg0;
    }
}

