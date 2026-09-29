/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprjkm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    public static sprjkm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjkm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    public sprlem cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public static sprjkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjkm) {
            return (sprjkm)arg0;
        }
        if (arg0 != null) {
            return new sprjkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjkm(sprszm sprszm2) {
        void arg0;
        sprjkm sprjkm2 = this;
        sprjkm2.cfr_renamed_3 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprjkm2.cfr_renamed_4 = sprszm2.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprjkm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprjkm sprjkm2 = this;
        sprjkm2.cfr_renamed_3 = arg0;
        sprjkm2.cfr_renamed_4 = sprco2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

