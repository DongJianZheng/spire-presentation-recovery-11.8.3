/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrgda;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprzde
extends sprkra {
    public sprooe cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public static sprzde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzde) {
            return (sprzde)arg0;
        }
        if (arg0 != null) {
            return new sprzde(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzde(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrgda.cfr_renamed_9("\u0007j!+6n4~ e&nex,q 1e")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprzde sprzde2 = this;
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration2.nextElement());
        sprzde2.cfr_renamed_2 = sprooe.cfr_renamed_23(enumeration2.nextElement());
        sprzde2.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement());
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprzde sprzde2 = this;
        sprlre2.cfr_renamed_49(sprzde2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprzde2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public static sprzde cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprzde.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprzde(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        sprzde sprzde2 = this;
        this.cfr_renamed_4 = new sprooe(arg0);
        sprzde2.cfr_renamed_2 = new sprooe(arg1);
        this.cfr_renamed_3 = new sprooe(arg2);
    }
}

