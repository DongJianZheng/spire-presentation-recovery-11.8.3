/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcmp;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprxde
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprere cfr_renamed_4;

    public sprtzd cfr_renamed_204() {
        return new sprtzd(this.cfr_renamed_3.cfr_renamed_19());
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

    public static sprxde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxde) {
            return (sprxde)arg0;
        }
        if (arg0 != null) {
            return new sprxde(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxde(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcmp.cfr_renamed_9("D7bvu3w#c8e3&%o,cl&")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprtzd.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprere.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    /*
     * WARNING - void declaration
     */
    public sprxde(sprtzd sprtzd2, sprere sprere2) {
        void arg0;
        sprxde sprxde2 = this;
        sprxde2.cfr_renamed_3 = arg0;
        sprxde2.cfr_renamed_4 = sprere2;
    }

    public spra[] cfr_renamed_4528() {
        return this.cfr_renamed_4.cfr_renamed_4529();
    }
}

