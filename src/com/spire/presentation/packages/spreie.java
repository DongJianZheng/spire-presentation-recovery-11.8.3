/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtce;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.util.Enumeration;

public class spreie
extends sprkra {
    private sprxue cfr_renamed_2;
    private sprtce cfr_renamed_3;
    private sprxue cfr_renamed_4;

    public spreie(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        spreie spreie2 = this;
        spreie2.cfr_renamed_3 = new sprtce((sprbne)enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            sprhse sprhse2 = (sprhse)enumeration.nextElement();
            if (sprhse2.cfr_renamed_312() == 0) {
                this.cfr_renamed_2 = (sprxue)sprhse2.cfr_renamed_2456();
                continue;
            }
            if (sprhse2.cfr_renamed_312() != 2) continue;
            this.cfr_renamed_4 = (sprxue)sprhse2.cfr_renamed_2456();
        }
    }

    /*
     * WARNING - void declaration
     */
    public spreie(sprtce sprtce2, sprxue sprxue2, sprxue sprxue3) {
        void arg1;
        void arg0;
        spreie spreie2 = this;
        this.cfr_renamed_3 = arg0;
        spreie2.cfr_renamed_2 = arg1;
        spreie2.cfr_renamed_4 = sprxue3;
    }

    public sprxue cfr_renamed_4439() {
        return this.cfr_renamed_2;
    }

    public sprtce cfr_renamed_4440() {
        return this.cfr_renamed_3;
    }

    public sprxue cfr_renamed_4441() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spreie spreie2 = this;
        sprlre2.cfr_renamed_49(spreie2.cfr_renamed_3);
        if (spreie2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0, this.cfr_renamed_2));
        }
        sprlre2.cfr_renamed_49(new sprhse(2, this.cfr_renamed_4));
        return new sprpse(sprlre2);
    }
}

