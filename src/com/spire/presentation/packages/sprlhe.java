/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprlhe
extends sprkra {
    private sprbfe[] cfr_renamed_3;
    private sprbfe[] cfr_renamed_4;

    public sprbfe[] cfr_renamed_348() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, new sprpse(this.cfr_renamed_4)));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, new sprpse(this.cfr_renamed_3)));
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprlhe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            spryte spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    while (false) {
                    }
                    this.cfr_renamed_4 = this.cfr_renamed_4506(sprbne.cfr_renamed_341(spryte2, false));
                    break;
                }
                case 1: {
                    this.cfr_renamed_3 = this.cfr_renamed_4506(sprbne.cfr_renamed_341(spryte2, false));
                }
            }
        }
    }

    public static sprlhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlhe) {
            return (sprlhe)arg0;
        }
        if (arg0 != null) {
            return new sprlhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprbfe[] cfr_renamed_350() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprlhe(sprbfe[] sprbfeArray, sprbfe[] sprbfeArray2) {
        void arg1;
        if (sprbfeArray != null) {
            void arg0;
            this.cfr_renamed_4 = arg0;
        }
        if (arg1 != null) {
            this.cfr_renamed_3 = arg1;
        }
    }

    private /* synthetic */ sprbfe[] cfr_renamed_4506(sprbne arg0) {
        int n;
        sprbfe[] sprbfeArray = new sprbfe[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprbfeArray.length) {
            int n3 = n++;
            sprbfeArray[n3] = sprbfe.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprbfeArray;
    }
}

