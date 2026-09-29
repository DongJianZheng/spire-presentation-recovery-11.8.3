/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzgg;
import java.math.BigInteger;

public class sprvde
extends sprkra {
    public sprxue cfr_renamed_3;
    public sprooe cfr_renamed_4;

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvde(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprxue)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprooe)arg0.cfr_renamed_85(1);
    }

    public BigInteger cfr_renamed_1478() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public static sprvde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvde) {
            return (sprvde)arg0;
        }
        if (arg0 != null) {
            return new sprvde(sprbne.cfr_renamed_23(arg0));
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

    /*
     * WARNING - void declaration
     */
    public sprvde(byte[] byArray, int n) {
        void arg1;
        void arg0;
        if (byArray.length != 8) {
            throw new IllegalArgumentException(sprzgg.cfr_renamed_9("\u0013U\f@@X\u0005Z\u0007@\b\u0014\rA\u0013@@V\u0005\u0014X"));
        }
        sprvde sprvde2 = this;
        sprvde2.cfr_renamed_3 = new sprlqe((byte[])arg0);
        sprvde sprvde3 = this;
        sprvde2.cfr_renamed_4 = new sprooe((long)arg1);
    }
}

