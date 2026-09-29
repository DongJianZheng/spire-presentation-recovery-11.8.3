/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprssm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprpsm
extends sprqqe {
    public sprssm cfr_renamed_3;
    public sprhgm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprpsm sprpsm2 = this;
        sprrvm2.cfr_renamed_5004(sprpsm2.cfr_renamed_3);
        if (sprpsm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public sprssm cfr_renamed_4281() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprpsm(sprssm sprssm2, sprhgm sprhgm2) {
        void arg0;
        sprpsm sprpsm2 = this;
        sprpsm2.cfr_renamed_3 = arg0;
        sprpsm2.cfr_renamed_4 = sprhgm2;
    }

    public static sprpsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpsm) {
            return (sprpsm)arg0;
        }
        if (arg0 != null) {
            return new sprpsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprpsm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprpsm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    private /* synthetic */ sprpsm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprssm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprhgm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true);
        }
    }

    public sprhgm cfr_renamed_4282() {
        return this.cfr_renamed_4;
    }
}

