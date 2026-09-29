/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhle;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkre;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class spraje
extends sprkra {
    private sprere cfr_renamed_2;
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    public static spraje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraje) {
            return (spraje)arg0;
        }
        if (arg0 != null) {
            return new spraje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spra cfr_renamed_1458() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spraje(sprtzd sprtzd2, spra spra2) {
        void arg1;
        void arg0;
        spraje spraje2 = this;
        this.cfr_renamed_3 = arg0;
        spraje2.cfr_renamed_4 = arg1;
        spraje2.cfr_renamed_2 = null;
    }

    public sprtzd cfr_renamed_1457() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraje(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = ((spryte)arg0.cfr_renamed_85(1)).cfr_renamed_2456();
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_2 = (sprere)arg0.cfr_renamed_85(2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spraje(sprtzd sprtzd2, spra spra2, sprere sprere2) {
        void arg1;
        void arg0;
        spraje spraje2 = this;
        this.cfr_renamed_3 = arg0;
        spraje2.cfr_renamed_4 = arg1;
        spraje2.cfr_renamed_2 = sprere2;
    }

    public sprere cfr_renamed_1461() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spraje spraje2 = this;
        sprlre2.cfr_renamed_49(spraje2.cfr_renamed_3);
        sprlre sprlre3 = sprlre2;
        sprlre2.cfr_renamed_49(new sprkre(true, 0, this.cfr_renamed_4));
        if (spraje2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        return new sprhle(sprlre2);
    }
}

