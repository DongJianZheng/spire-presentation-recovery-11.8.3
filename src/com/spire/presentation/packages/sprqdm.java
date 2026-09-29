/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spredm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprqdm
extends sprqqe {
    private spredm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public spredm cfr_renamed_358() {
        return this.cfr_renamed_2;
    }

    public static sprqdm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqdm) {
            return (sprqdm)arg0;
        }
        if (arg0 != null) {
            return new sprqdm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprqdm(sprszm arg0) {
        sprqdm sprqdm2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprqdm2.cfr_renamed_2 = spredm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration.nextElement());
        sprqdm2.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration.nextElement());
    }

    public BigInteger cfr_renamed_359() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprqdm(spredm spredm2, int n, int n2) {
        void arg2;
        void arg1;
        this.cfr_renamed_2 = spredm2;
        sprqdm sprqdm2 = this;
        this.cfr_renamed_3 = new sprktm((long)arg1);
        sprqdm2.cfr_renamed_4 = new sprktm((long)arg2);
    }

    public BigInteger cfr_renamed_360() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprqdm sprqdm2 = this;
        sprrvm2.cfr_renamed_5004(sprqdm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprqdm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

