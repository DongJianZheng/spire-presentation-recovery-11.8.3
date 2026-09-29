/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprglm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprwrm
extends sprqqe {
    public sprtpm cfr_renamed_3;
    public sprglm cfr_renamed_4;

    public static sprwrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwrm) {
            return (sprwrm)arg0;
        }
        if (arg0 != null) {
            return new sprwrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprwrm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprwrm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprtpm cfr_renamed_4295() {
        return this.cfr_renamed_3;
    }

    public sprglm cfr_renamed_4297() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwrm(sprtpm sprtpm2, sprglm sprglm2) {
        void arg0;
        sprwrm sprwrm2 = this;
        sprwrm2.cfr_renamed_3 = arg0;
        sprwrm2.cfr_renamed_4 = sprglm2;
    }

    private /* synthetic */ sprwrm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprtpm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprglm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true);
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprwrm sprwrm2 = this;
        sprrvm2.cfr_renamed_5004(sprwrm2.cfr_renamed_3);
        if (sprwrm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }
}

