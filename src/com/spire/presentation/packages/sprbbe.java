/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.util.Enumeration;

public class sprbbe
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprije cfr_renamed_4;

    public byte[] cfr_renamed_1446() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    private /* synthetic */ sprbbe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_4 = sprije.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprxue.cfr_renamed_23(enumeration.nextElement());
    }

    /*
     * WARNING - void declaration
     */
    public sprbbe(sprije sprije2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_4 = sprije2;
        sprbbe sprbbe2 = this;
        this.cfr_renamed_3 = new sprlqe((byte[])arg1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprije cfr_renamed_1445() {
        return this.cfr_renamed_4;
    }

    public static sprbbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbbe) {
            return (sprbbe)arg0;
        }
        if (arg0 != null) {
            return new sprbbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

