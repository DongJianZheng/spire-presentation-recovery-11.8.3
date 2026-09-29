/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqpe;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.sprvme;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprkme
extends sprkra {
    public sprooe cfr_renamed_2;
    public sprmra cfr_renamed_3;
    public sprtse cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkme(sprvme sprvme2, sprtse sprtse2, sprqpe sprqpe2) {
        void arg1;
        void arg0;
        sprkme sprkme2 = this;
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_119());
        sprkme2.cfr_renamed_4 = arg1;
        sprkme2.cfr_renamed_3 = sprqpe2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprkme sprkme2 = this;
        sprlre2.cfr_renamed_49(sprkme2.cfr_renamed_2);
        if (sprkme2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkme(sprbne sprbne2) {
        void arg0;
        sprkme sprkme2 = this;
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprkme2.cfr_renamed_4 = null;
        sprkme2.cfr_renamed_3 = null;
        if (sprbne2.cfr_renamed_84() > 2) {
            sprkme sprkme3 = this;
            sprkme3.cfr_renamed_4 = sprtse.cfr_renamed_23(arg0.cfr_renamed_85(1));
            sprkme3.cfr_renamed_3 = sprmra.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        if (arg0.cfr_renamed_84() > 1) {
            spra spra2 = arg0.cfr_renamed_85(1);
            if (spra2 instanceof sprmra) {
                this.cfr_renamed_3 = sprmra.cfr_renamed_23(spra2);
                return;
            }
            this.cfr_renamed_4 = sprtse.cfr_renamed_23(spra2);
        }
    }

    public BigInteger cfr_renamed_648() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    public sprkme(sprvme sprvme2) {
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(sprvme2.cfr_renamed_119());
    }

    public sprmra cfr_renamed_651() {
        return this.cfr_renamed_3;
    }

    public static sprkme cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprkme.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprkme(sprvme sprvme2, sprtse sprtse2) {
        void arg0;
        sprkme sprkme2 = this;
        sprkme2.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_119());
        sprkme2.cfr_renamed_4 = sprtse2;
    }

    public sprtse cfr_renamed_647() {
        return this.cfr_renamed_4;
    }

    public static sprkme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkme) {
            return (sprkme)arg0;
        }
        if (arg0 != null) {
            return new sprkme(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

