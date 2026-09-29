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

public class sproom
extends sprqqe {
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public BigInteger cfr_renamed_2331() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public static sproom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproom) {
            return (sproom)arg0;
        }
        if (arg0 != null) {
            return new sproom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sproom(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_2 = (sprktm)enumeration.nextElement();
            return;
        }
        this.cfr_renamed_2 = null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sproom sproom2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sproom2.cfr_renamed_3);
        if (sproom2.cfr_renamed_2331() != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sproom(BigInteger bigInteger, BigInteger bigInteger2, int n) {
        void arg1;
        void arg0;
        sproom sproom2 = this;
        this.cfr_renamed_4 = new sprktm((BigInteger)arg0);
        sproom2.cfr_renamed_3 = new sprktm((BigInteger)arg1);
        if (n != 0) {
            void arg2;
            this.cfr_renamed_2 = new sprktm((long)arg2);
            return;
        }
        this.cfr_renamed_2 = null;
    }
}

