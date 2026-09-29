/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkse;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvkba;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprgne
extends sprkra {
    private sprrpe cfr_renamed_2;
    private sprkse cfr_renamed_3;
    private sprxue cfr_renamed_4;

    public sprgne(byte[] arg0) {
        this(arg0, null, null);
    }

    public sprkse cfr_renamed_4832() {
        return this.cfr_renamed_3;
    }

    public static sprgne cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprgne.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprgne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgne) {
            return (sprgne)arg0;
        }
        if (arg0 != null) {
            return new sprgne(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgne(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprxue.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        switch (sprbne2.cfr_renamed_84()) {
            case 1: {
                return;
            }
            case 2: {
                if (arg0.cfr_renamed_85(1) instanceof sprrpe) {
                    this.cfr_renamed_2 = sprrpe.cfr_renamed_23(arg0.cfr_renamed_85(1));
                    return;
                }
                this.cfr_renamed_3 = sprkse.cfr_renamed_23(arg0.cfr_renamed_85(2));
                return;
            }
            case 3: {
                sprbne sprbne3 = arg0;
                this.cfr_renamed_2 = sprrpe.cfr_renamed_23(sprbne3.cfr_renamed_85(1));
                this.cfr_renamed_3 = sprkse.cfr_renamed_23(sprbne3.cfr_renamed_85(2));
                return;
            }
        }
        throw new IllegalArgumentException(sprvkba.cfr_renamed_9("{dDk^cV*`oQcBcWdFAWs{nWdFcTcWx"));
    }

    public sprrpe cfr_renamed_110() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgne(byte[] byArray, sprrpe sprrpe2, sprkse sprkse2) {
        void arg1;
        void arg0;
        sprgne sprgne2 = this;
        sprgne sprgne3 = this;
        sprgne3.cfr_renamed_4 = new sprlqe((byte[])arg0);
        sprgne2.cfr_renamed_2 = arg1;
        sprgne2.cfr_renamed_3 = sprkse2;
    }

    public sprxue cfr_renamed_3955() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprgne sprgne2 = this;
        sprlre2.cfr_renamed_49(sprgne2.cfr_renamed_4);
        if (sprgne2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprgne(sprxue sprxue2, sprrpe sprrpe2, sprkse sprkse2) {
        void arg1;
        void arg0;
        sprgne sprgne2 = this;
        this.cfr_renamed_4 = arg0;
        sprgne2.cfr_renamed_2 = arg1;
        sprgne2.cfr_renamed_3 = sprkse2;
    }
}

