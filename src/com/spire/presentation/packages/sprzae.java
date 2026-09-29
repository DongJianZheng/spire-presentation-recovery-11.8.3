/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprzae
extends sprkra {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2295()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2296()));
        return new sprpse(sprlre2);
    }

    public static sprzae cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprzae) {
            return (sprzae)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprzae((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjze.cfr_renamed_9("0M\u000fB\u0015J\u001d\u0003+p8s\fA\u0015J\u001ah\u001cZ*W\u000bV\u001aW\fQ\u001c\u0019Y")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprzae(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprzae sprzae2 = this;
        sprzae2.cfr_renamed_4 = arg0;
        sprzae2.cfr_renamed_3 = bigInteger2;
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzae(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprizd.cfr_renamed_9("\u0015\\3\u001d$X&H2S4XwN>G2\u0007w")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprzae sprzae2 = this;
        sprzae2.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
        sprzae2.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
    }

    public static sprzae cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprzae.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_3;
    }
}

