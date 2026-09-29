/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class spraue
extends sprkra {
    private sprooe cfr_renamed_1;
    private sprnte cfr_renamed_2;
    private sprxue cfr_renamed_3;
    private sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraue(sprije sprije2, sprnte sprnte2, byte[] byArray) {
        void arg2;
        void arg0;
        spraue spraue2 = this;
        spraue spraue3 = this;
        spraue3.cfr_renamed_1 = new sprooe(0L);
        spraue2.cfr_renamed_4 = arg0;
        spraue2.cfr_renamed_2 = sprnte2;
        spraue2.cfr_renamed_3 = new sprlqe((byte[])arg2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraue(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_1 = (sprooe)sprbne2.cfr_renamed_85(0);
        spraue spraue2 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = sprije.cfr_renamed_23(v1.cfr_renamed_85(1));
        spraue2.cfr_renamed_2 = sprnte.cfr_renamed_23(v1.cfr_renamed_85(2));
        spraue2.cfr_renamed_3 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(3));
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_580() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        spraue spraue2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        sprlre2.cfr_renamed_49(spraue2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(spraue2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprjve(sprlre2);
    }

    public static spraue cfr_renamed_341(spryte arg0, boolean arg1) {
        return spraue.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprnte cfr_renamed_2589() {
        return this.cfr_renamed_2;
    }

    public static spraue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraue) {
            return (spraue)arg0;
        }
        if (arg0 != null) {
            return new spraue(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_410() {
        return this.cfr_renamed_4;
    }
}

