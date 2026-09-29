/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprymm;

public class sprdrm
extends sprqqe {
    private final sprvrm cfr_renamed_3;
    private final sprymm cfr_renamed_4;

    public sprvrm cfr_renamed_10709() {
        return this.cfr_renamed_3;
    }

    public sprymm cfr_renamed_10711() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdrm(sprszm sprszm2) {
        void arg0;
        sprdrm sprdrm2 = this;
        sprdrm2.cfr_renamed_4 = sprymm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprdrm2.cfr_renamed_3 = sprvrm.cfr_renamed_5085(sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)), false);
    }

    public static sprdrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdrm) {
            return (sprdrm)arg0;
        }
        if (arg0 != null) {
            return new sprdrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprdrm sprdrm2 = this;
        sprrvm2.cfr_renamed_5004(sprdrm2.cfr_renamed_4);
        if (sprdrm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdrm(sprymm sprymm2, sprvrm sprvrm2) {
        void arg0;
        sprdrm sprdrm2 = this;
        sprdrm2.cfr_renamed_4 = arg0;
        sprdrm2.cfr_renamed_3 = sprvrm2;
    }
}

