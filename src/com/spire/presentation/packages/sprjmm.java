/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprjmm
extends sprqqe {
    private sproug cfr_renamed_3;
    private spranm cfr_renamed_4;

    public static sprjmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjmm) {
            return (sprjmm)arg0;
        }
        if (arg0 != null) {
            return new sprjmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_4010() {
        return this.cfr_renamed_3;
    }

    public spranm cfr_renamed_4028() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjmm(spranm spranm2, sproug sproug2) {
        void arg0;
        sprjmm sprjmm2 = this;
        sprjmm2.cfr_renamed_4 = arg0;
        sprjmm2.cfr_renamed_3 = sproug2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjmm(sprszm sprszm2) {
        void arg0;
        sprjmm sprjmm2 = this;
        sprjmm2.cfr_renamed_4 = spranm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprjmm2.cfr_renamed_3 = (sproug)sprszm2.cfr_renamed_85(1);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprjmm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjmm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

