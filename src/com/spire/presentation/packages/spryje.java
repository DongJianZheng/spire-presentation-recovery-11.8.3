/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlje;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmde;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class spryje
extends sprkra {
    public sprlje cfr_renamed_3;
    public sprmde cfr_renamed_4;

    public static spryje cfr_renamed_341(spryte arg0, boolean arg1) {
        return spryje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spryje(sprmde sprmde2, sprlje sprlje2) {
        void arg0;
        spryje spryje2 = this;
        spryje2.cfr_renamed_4 = arg0;
        spryje2.cfr_renamed_3 = sprlje2;
    }

    public sprlje cfr_renamed_4285() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spryje spryje2 = this;
        sprlre2.cfr_renamed_49(spryje2.cfr_renamed_4);
        if (spryje2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public sprmde cfr_renamed_4115() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ spryje(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprmde.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() == 2) {
            this.cfr_renamed_3 = sprlje.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), true);
        }
    }

    public static spryje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryje) {
            return (spryje)arg0;
        }
        if (arg0 != null) {
            return new spryje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

