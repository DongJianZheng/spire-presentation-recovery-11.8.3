/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrkm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryxaa;

public class sprsmm
extends sprqqe {
    private final sprrcm cfr_renamed_3;
    private final sprrkm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprsmm sprsmm2 = this;
        sprrvm2.cfr_renamed_5004(sprsmm2.cfr_renamed_4);
        if (sprsmm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsmm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 1 || arg0.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprrkm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            if (arg0.cfr_renamed_84() == 2) {
                this.cfr_renamed_3 = sprrcm.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            this.cfr_renamed_3 = null;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spryxaa.cfr_renamed_9(" E5X&I YeN L0X+^ \u001d6T?XeR#\u001dt\u001d*Oe\u000fi\u001d\"R1\u001d")).append(arg0.cfr_renamed_84()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprsmm(sprrkm sprrkm2, sprrcm sprrcm2) {
        void arg0;
        sprsmm sprsmm2 = this;
        sprsmm2.cfr_renamed_4 = arg0;
        sprsmm2.cfr_renamed_3 = sprrcm2;
    }

    public sprrcm cfr_renamed_2147() {
        return this.cfr_renamed_3;
    }

    public static sprsmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsmm) {
            return (sprsmm)arg0;
        }
        if (arg0 != null) {
            return new sprsmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrkm cfr_renamed_9765() {
        return this.cfr_renamed_4;
    }

    public sprrcm cfr_renamed_2132() {
        return this.cfr_renamed_3;
    }
}

