/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxde;

public class sprawa
extends sprkra {
    public sprxde cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public String cfr_renamed_113() {
        return this.cfr_renamed_4.cfr_renamed_204().cfr_renamed_19();
    }

    public sprawa(spra spra2) {
        this.cfr_renamed_4 = sprxde.cfr_renamed_23(spra2);
    }

    /*
     * WARNING - void declaration
     */
    public sprawa(String string, spra spra2) {
        void arg1;
        void arg0;
        sprawa sprawa2 = this;
        sprawa2.cfr_renamed_4 = new sprxde(new sprtzd((String)arg0), new sprcwe((spra)arg1));
    }

    public spra[] cfr_renamed_205() {
        int n;
        sprere sprere2 = this.cfr_renamed_4.cfr_renamed_206();
        spra[] spraArray = new spra[sprere2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprere2.cfr_renamed_84()) {
            int n3 = n++;
            spraArray[n3] = sprere2.cfr_renamed_85(n3);
            n2 = n;
        }
        return spraArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprawa(String string, sprlre sprlre2) {
        void arg1;
        void arg0;
        sprawa sprawa2 = this;
        sprawa2.cfr_renamed_4 = new sprxde(new sprtzd((String)arg0), new sprcwe((sprlre)arg1));
    }
}

