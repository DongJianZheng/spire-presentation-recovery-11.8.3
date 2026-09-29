/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprdqe
extends sprkra {
    private sprxue cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private sprije cfr_renamed_4;

    public static sprdqe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprdqe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprije cfr_renamed_4007() {
        return this.cfr_renamed_4;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdqe sprdqe2 = this;
        sprlre2.cfr_renamed_49(sprdqe2.cfr_renamed_3);
        if (sprdqe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_4));
        }
        sprlre sprlre3 = sprlre2;
        sprdqe sprdqe3 = this;
        sprlre3.cfr_renamed_49(sprdqe3.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprdqe3.cfr_renamed_1);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdqe(sprije sprije2, sprxue sprxue2) {
        void arg0;
        sprdqe sprdqe2 = this;
        sprdqe sprdqe3 = this;
        sprdqe3.cfr_renamed_3 = new sprooe(0L);
        sprdqe2.cfr_renamed_2 = arg0;
        sprdqe2.cfr_renamed_1 = sprxue2;
    }

    /*
     * WARNING - void declaration
     */
    public sprdqe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprooe)sprbne2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_85(1) instanceof spryte) {
            this.cfr_renamed_4 = sprije.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), false);
            sprdqe sprdqe2 = this;
            sprdqe2.cfr_renamed_2 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(2));
            sprdqe2.cfr_renamed_1 = (sprxue)arg0.cfr_renamed_85(3);
            return;
        }
        void v1 = arg0;
        this.cfr_renamed_2 = sprije.cfr_renamed_23(v1.cfr_renamed_85(1));
        this.cfr_renamed_1 = (sprxue)v1.cfr_renamed_85(2);
    }

    public sprije cfr_renamed_4000() {
        return this.cfr_renamed_2;
    }

    public sprxue cfr_renamed_4010() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprdqe(sprije sprije2, sprije sprije3, sprxue sprxue2) {
        void arg1;
        void arg0;
        sprdqe sprdqe2 = this;
        sprdqe sprdqe3 = this;
        this.cfr_renamed_3 = new sprooe(0L);
        this.cfr_renamed_4 = arg0;
        sprdqe2.cfr_renamed_2 = arg1;
        sprdqe2.cfr_renamed_1 = sprxue2;
    }

    public static sprdqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdqe) {
            return (sprdqe)arg0;
        }
        if (arg0 != null) {
            return new sprdqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

