/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnkp;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwry;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprkde
extends sprkra {
    public sprooe cfr_renamed_2;
    public spraoe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprkde sprkde2 = this;
        sprlre2.cfr_renamed_49(sprkde2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(sprkde2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public static sprkde cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprkde) {
            return (sprkde)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprkde(sprbne.cfr_renamed_23(arg0));
        }
        throw new IllegalArgumentException(sprwry.cfr_renamed_9("H/V/R6SaR#W$^5\u001d(SaZ$I\bS2I S\"X"));
    }

    public String cfr_renamed_358() {
        return this.cfr_renamed_3.cfr_renamed_314();
    }

    public sprkde(String arg0, int arg1, int arg2) {
        sprkde sprkde2 = this;
        this.cfr_renamed_3 = new spraoe(arg0, true);
        sprkde2.cfr_renamed_2 = new sprooe(arg1);
        this.cfr_renamed_4 = new sprooe(arg2);
    }

    public BigInteger cfr_renamed_360() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkde(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnkp.cfr_renamed_9("&\r\u0000L\u0017\t\u0015\u0019\u0001\u0002\u0007\tD\u001f\r\u0016\u0001VD")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprkde sprkde2 = this;
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_3 = spraoe.cfr_renamed_23(enumeration2.nextElement());
        sprkde2.cfr_renamed_2 = sprooe.cfr_renamed_23(enumeration2.nextElement());
        sprkde2.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration.nextElement());
    }

    public BigInteger cfr_renamed_359() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }
}

