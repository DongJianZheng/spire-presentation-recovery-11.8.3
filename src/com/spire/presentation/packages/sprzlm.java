/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqlfa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprzlm
extends sprqqe {
    private final sprddm cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    public static sprzlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzlm) {
            return (sprzlm)arg0;
        }
        if (arg0 != null) {
            return new sprzlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzlm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprqlfa.cfr_renamed_9("uLz1\u0005?gZeJqQwZ\u0014l\\pAsP?Vz\u0014pR?XzZx@w\u0014-"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_97();
    }

    public sprddm cfr_renamed_7448() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_4600() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzlm(sprddm sprddm2, int n) {
        void arg0;
        sprzlm sprzlm2 = this;
        sprzlm2.cfr_renamed_3 = arg0;
        sprzlm2.cfr_renamed_4 = BigInteger.valueOf(n);
    }
}

