/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrzz;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprfae
extends sprkra {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_3;
    }

    public static sprfae cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprfae.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2295()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2296()));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprfae(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprfae sprfae2 = this;
        sprfae2.cfr_renamed_4 = arg0;
        sprfae2.cfr_renamed_3 = bigInteger2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfae(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrzz.cfr_renamed_9("\u0000G&\u00061C3S'H!CbU+\\'\u001cb")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprfae sprfae2 = this;
        sprfae2.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
        sprfae2.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
    }

    public static sprfae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfae) {
            return (sprfae)arg0;
        }
        if (arg0 != null) {
            return new sprfae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

