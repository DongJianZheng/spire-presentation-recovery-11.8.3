/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprvqe
extends sprkra {
    private sprije cfr_renamed_3;
    private sprmra cfr_renamed_4;

    public static sprvqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvqe) {
            return (sprvqe)arg0;
        }
        if (arg0 != null) {
            return new sprvqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    public static sprvqe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprvqe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprvqe(sprbne sprbne2) {
        void arg0;
        sprvqe sprvqe2 = this;
        sprvqe2.cfr_renamed_3 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprvqe2.cfr_renamed_4 = (sprmra)sprbne2.cfr_renamed_85(1);
    }

    public sprmra cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprvqe(sprije sprije2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_3 = sprije2;
        sprvqe sprvqe2 = this;
        this.cfr_renamed_4 = new sprmra((byte[])arg1);
    }
}

