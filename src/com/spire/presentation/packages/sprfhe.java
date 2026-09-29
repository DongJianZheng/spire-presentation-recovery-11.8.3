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

public class sprfhe
extends sprkra {
    public sprooe cfr_renamed_3;
    public sprxue cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfhe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() == 1) {
            sprfhe sprfhe2 = this;
            sprfhe2.cfr_renamed_3 = null;
            sprfhe2.cfr_renamed_4 = (sprxue)arg0.cfr_renamed_85(0);
            return;
        }
        this.cfr_renamed_3 = (sprooe)arg0.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprxue)arg0.cfr_renamed_85(1);
    }

    public BigInteger cfr_renamed_4211() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprfhe(byte[] byArray) {
        void arg0;
        this.cfr_renamed_3 = null;
        sprfhe sprfhe2 = this;
        this.cfr_renamed_4 = new sprlqe((byte[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprfhe(int n, byte[] byArray) {
        void arg1;
        void arg0;
        sprfhe sprfhe2 = this;
        this.cfr_renamed_3 = new sprooe((long)arg0);
        sprfhe2.cfr_renamed_4 = new sprlqe((byte[])arg1);
    }

    public static sprfhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfhe) {
            return (sprfhe)arg0;
        }
        if (arg0 != null) {
            return new sprfhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_4.cfr_renamed_186();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }
}

