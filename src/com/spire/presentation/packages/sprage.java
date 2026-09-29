/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;

public class sprage
extends sprkra {
    public byte[] cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public sprnje cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprage sprage2 = this;
        sprlre2.cfr_renamed_49(sprage2.cfr_renamed_3);
        sprlre sprlre3 = sprlre2;
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_1));
        if (!sprage2.cfr_renamed_2.equals(cfr_renamed_4)) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_1;
    }

    public sprnje cfr_renamed_1472() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1478() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprage(sprbne sprbne2) {
        void arg0;
        sprage sprage2 = this;
        sprage2.cfr_renamed_3 = sprnje.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprage2.cfr_renamed_1 = ((sprxue)sprbne2.cfr_renamed_85(1)).cfr_renamed_186();
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_2 = ((sprooe)arg0.cfr_renamed_85(2)).cfr_renamed_97();
            return;
        }
        this.cfr_renamed_2 = cfr_renamed_4;
    }

    public static sprage cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprage) {
            return (sprage)arg0;
        }
        if (arg0 != null) {
            return new sprage(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprage(sprnje sprnje2, byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprage sprage2 = this;
        this.cfr_renamed_3 = arg0;
        sprage2.cfr_renamed_1 = arg1;
        sprage2.cfr_renamed_2 = BigInteger.valueOf(n);
    }
}

