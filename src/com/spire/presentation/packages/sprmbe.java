/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprmbe
extends sprkra {
    public sprooe cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmbe(BigInteger bigInteger, BigInteger bigInteger2, int n) {
        void arg1;
        void arg0;
        sprmbe sprmbe2 = this;
        this.cfr_renamed_3 = new sprooe((BigInteger)arg0);
        sprmbe2.cfr_renamed_2 = new sprooe((BigInteger)arg1);
        if (n != 0) {
            void arg2;
            this.cfr_renamed_4 = new sprooe((long)arg2);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprmbe sprmbe2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprmbe2.cfr_renamed_2);
        if (sprmbe2.cfr_renamed_2331() != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_2331() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    private /* synthetic */ sprmbe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_4 = (sprooe)enumeration.nextElement();
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public static sprmbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmbe) {
            return (sprmbe)arg0;
        }
        if (arg0 != null) {
            return new sprmbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

