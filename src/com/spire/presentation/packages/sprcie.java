/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsrp;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprcie
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprije cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprxue cfr_renamed_4669() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprcie(sprije sprije2, sprxue sprxue2) {
        void arg0;
        sprcie sprcie2 = this;
        sprcie2.cfr_renamed_4 = arg0;
        sprcie2.cfr_renamed_3 = sprxue2;
    }

    public static sprcie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcie) {
            return (sprcie)arg0;
        }
        if (arg0 != null) {
            return new sprcie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcie(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsrp.cfr_renamed_9("n7Hv_3]#I8O3\f%E,Il\f")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprije.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprxue.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

