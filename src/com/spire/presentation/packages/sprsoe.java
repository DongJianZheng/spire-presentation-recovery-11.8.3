/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprupe;
import com.spire.presentation.packages.sprvva;

public class sprsoe
extends sprkra {
    private sprupe cfr_renamed_3;
    private sprszd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsoe(sprupe sprupe2, sprude sprude2) {
        void arg0;
        sprsoe sprsoe2 = this;
        sprsoe2.cfr_renamed_3 = arg0;
        sprsoe2.cfr_renamed_4 = sprszd.cfr_renamed_23(sprude2.cfr_renamed_119());
    }

    public sprupe cfr_renamed_4391() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprsoe(sprupe sprupe2, sprszd sprszd2) {
        void arg0;
        sprsoe sprsoe2 = this;
        sprsoe2.cfr_renamed_3 = arg0;
        sprsoe2.cfr_renamed_4 = sprszd2;
    }

    public sprszd cfr_renamed_4849() {
        return this.cfr_renamed_4;
    }

    public static sprsoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsoe) {
            return (sprsoe)arg0;
        }
        if (arg0 != null) {
            return new sprsoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprsoe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprupe.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprszd.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprsoe(sprupe sprupe2) {
        this.cfr_renamed_3 = sprupe2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprsoe sprsoe2 = this;
        sprlre2.cfr_renamed_49(sprsoe2.cfr_renamed_3);
        if (sprsoe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}

