/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprade
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprere cfr_renamed_4;

    public sprtzd cfr_renamed_204() {
        return this.cfr_renamed_3;
    }

    public static sprade cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprade) {
            return (sprade)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprade((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbuy.cfr_renamed_9("t\u001cj\u001cn\u0005oRn\u0010k\u0017b\u0006!\u001boRg\u0013b\u0006n\u0000xH!")).append(arg0.getClass().getName()).toString());
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
    public sprade(sprtzd sprtzd2, sprere sprere2) {
        void arg0;
        sprade sprade2 = this;
        sprade2.cfr_renamed_3 = arg0;
        sprade2.cfr_renamed_4 = sprere2;
    }

    public spra[] cfr_renamed_4528() {
        return this.cfr_renamed_4.cfr_renamed_4529();
    }

    /*
     * WARNING - void declaration
     */
    public sprade(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprere)arg0.cfr_renamed_85(1);
    }

    public sprere cfr_renamed_206() {
        return this.cfr_renamed_4;
    }
}

