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
import java.math.BigInteger;

public class sprfbe
extends sprkra {
    public sprxue cfr_renamed_3;
    public sprooe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public static sprfbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfbe) {
            return (sprfbe)arg0;
        }
        if (arg0 != null) {
            return new sprfbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_1490() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprfbe(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprfbe sprfbe2 = this;
        this.cfr_renamed_3 = new sprlqe((byte[])arg0);
        sprfbe2.cfr_renamed_4 = new sprooe((long)arg1);
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfbe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprxue)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }
}

