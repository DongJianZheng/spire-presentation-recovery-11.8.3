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

public class sprmfe
extends sprkra {
    public sprooe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public static sprmfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmfe) {
            return (sprmfe)arg0;
        }
        if (arg0 != null) {
            return new sprmfe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprmfe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_3 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_4 = (sprooe)enumeration.nextElement();
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    /*
     * WARNING - void declaration
     */
    public sprmfe(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        sprmfe sprmfe2 = this;
        this.cfr_renamed_3 = new sprooe((BigInteger)arg0);
        sprmfe2.cfr_renamed_4 = new sprooe((BigInteger)arg1);
    }
}

