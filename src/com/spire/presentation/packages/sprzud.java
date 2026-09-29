/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjxd;
import com.spire.presentation.packages.sprntd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spryud;
import java.math.BigInteger;

public class sprzud
extends sprjxd {
    private sprntd cfr_renamed_4;

    public sprzud(byte[] arg0) {
        this(null, null, arg0);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114();
    }

    public sprzud(spruhe arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public Object clone() {
        return new sprzud(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_3955() {
        return this.cfr_renamed_4.cfr_renamed_3955();
    }

    /*
     * WARNING - void declaration
     */
    public sprzud(spruhe spruhe2, BigInteger bigInteger, byte[] byArray) {
        this(new sprntd((spruhe)arg0, (BigInteger)arg1, (byte[])arg2));
        void arg2;
        void arg1;
        void arg0;
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof spryud) {
            return ((spryud)arg0).cfr_renamed_3995().equals(this);
        }
        return this.cfr_renamed_4.cfr_renamed_132(arg0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzud)) {
            return false;
        }
        sprzud sprzud2 = (sprzud)arg0;
        return this.cfr_renamed_4.equals(sprzud2.cfr_renamed_4);
    }

    private /* synthetic */ sprzud(sprntd sprntd2) {
        super(0);
        this.cfr_renamed_4 = sprntd2;
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }
}

