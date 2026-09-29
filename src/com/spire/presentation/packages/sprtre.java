/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnqe;
import com.spire.presentation.packages.sprvva;

public class sprtre
extends sprkra {
    private sprere cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtre(sprlre sprlre2) {
        void arg0;
        sprtre sprtre2 = this;
        sprtre2.cfr_renamed_4 = new sprnqe((sprlre)arg0);
    }

    public static sprtre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtre) {
            return (sprtre)arg0;
        }
        if (arg0 != null) {
            return new sprtre(sprere.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprche[] cfr_renamed_82() {
        int n;
        sprche[] sprcheArray = new sprche[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprcheArray.length) {
            int n3 = n++;
            sprcheArray[n3] = sprche.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprcheArray;
    }

    private /* synthetic */ sprtre(sprere sprere2) {
        this.cfr_renamed_4 = sprere2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

