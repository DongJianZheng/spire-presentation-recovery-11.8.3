/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;

public class sprfse
extends sprkra {
    private sprxue cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private sprkme cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfse(byte[] byArray, BigInteger bigInteger) {
        void arg1;
        void arg0;
        sprfse sprfse2 = this;
        this.cfr_renamed_2 = new sprlqe((byte[])arg0);
        sprfse2.cfr_renamed_3 = new sprooe((BigInteger)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprfse(byte[] byArray, BigInteger bigInteger, sprkme sprkme2) {
        void arg1;
        void arg0;
        sprfse sprfse2 = this;
        sprfse sprfse3 = this;
        sprfse2.cfr_renamed_2 = new sprlqe((byte[])arg0);
        sprfse2.cfr_renamed_3 = new sprooe((BigInteger)arg1);
        sprfse2.cfr_renamed_4 = sprkme2;
    }

    public sprxue cfr_renamed_629() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprfse sprfse2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(sprfse2.cfr_renamed_3);
        if (sprfse2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public sprooe cfr_renamed_4420() {
        return this.cfr_renamed_3;
    }

    public sprkme cfr_renamed_4422() {
        return this.cfr_renamed_4;
    }

    public static sprfse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfse) {
            return (sprfse)arg0;
        }
        if (arg0 != null) {
            return new sprfse(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprfse(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_2 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
        if (sprbne2.cfr_renamed_84() > 2) {
            this.cfr_renamed_4 = sprkme.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }
}

