/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprche
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprere cfr_renamed_4;

    public sprtzd cfr_renamed_204() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprche(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprere)arg0.cfr_renamed_85(1);
    }

    public spra[] cfr_renamed_4528() {
        return this.cfr_renamed_4.cfr_renamed_4529();
    }

    public sprere cfr_renamed_206() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public static sprche cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprche) {
            return (sprche)arg0;
        }
        if (arg0 != null) {
            return new sprche(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprche(sprtzd sprtzd2, sprere sprere2) {
        void arg0;
        sprche sprche2 = this;
        sprche2.cfr_renamed_3 = arg0;
        sprche2.cfr_renamed_4 = sprere2;
    }
}

