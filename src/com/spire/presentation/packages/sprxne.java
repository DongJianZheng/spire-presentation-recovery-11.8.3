/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprxne
extends sprkra {
    private sprxue cfr_renamed_1;
    private sprkne cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprkne cfr_renamed_4036() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxne(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = (sprooe)sprbne2.cfr_renamed_85(0);
        sprxne sprxne2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sprkne.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprxne2.cfr_renamed_3 = sprije.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprxne2.cfr_renamed_1 = (sprxue)arg0.cfr_renamed_85(3);
    }

    public static sprxne cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprxne.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprxne(sprkne sprkne2, sprije sprije2, sprxue sprxue2) {
        void arg1;
        void arg0;
        sprxne sprxne2 = this;
        sprxne sprxne3 = this;
        this.cfr_renamed_4 = new sprooe(4L);
        this.cfr_renamed_2 = arg0;
        sprxne2.cfr_renamed_3 = arg1;
        sprxne2.cfr_renamed_1 = sprxue2;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprije cfr_renamed_4000() {
        return this.cfr_renamed_3;
    }

    public static sprxne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxne) {
            return (sprxne)arg0;
        }
        if (arg0 != null) {
            return new sprxne(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprxne sprxne2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprxne2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprxne2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        return new sprpse(sprlre2);
    }

    public sprxue cfr_renamed_4010() {
        return this.cfr_renamed_1;
    }
}

