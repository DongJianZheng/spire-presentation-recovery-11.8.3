/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprppm
extends sprqqe {
    public sprktm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprppm(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        sprppm sprppm2 = this;
        this.cfr_renamed_4 = new sprktm((BigInteger)arg0);
        sprppm2.cfr_renamed_3 = new sprktm((BigInteger)arg1);
    }

    public static sprppm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprppm) {
            return (sprppm)arg0;
        }
        if (arg0 != null) {
            return new sprppm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    private /* synthetic */ sprppm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_3 = (sprktm)enumeration.nextElement();
    }
}

