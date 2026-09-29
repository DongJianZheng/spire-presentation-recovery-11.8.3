/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.util.Enumeration;

public class sprtce
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public sprxue cfr_renamed_3374() {
        return this.cfr_renamed_3;
    }

    public sprtce(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_4 = (sprtzd)enumeration.nextElement();
        this.cfr_renamed_3 = (sprxue)enumeration.nextElement();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprtzd cfr_renamed_593() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtce(sprtzd sprtzd2, sprxue sprxue2) {
        void arg0;
        sprtce sprtce2 = this;
        sprtce2.cfr_renamed_4 = arg0;
        sprtce2.cfr_renamed_3 = sprxue2;
    }
}

