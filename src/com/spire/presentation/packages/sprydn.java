/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcy;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprydn
extends sprqqe {
    private final sprgbf cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprigm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprydn(sprigm sprigm2, sprddm sprddm2, byte[] byArray) {
        void arg2;
        void arg0;
        sprydn sprydn2 = this;
        sprydn2.cfr_renamed_4 = arg0;
        sprydn2.cfr_renamed_3 = sprddm2;
        sprydn sprydn3 = this;
        sprydn2.cfr_renamed_2 = new sprdye((byte[])arg2);
    }

    public sprddm cfr_renamed_4881() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprydn sprydn2 = this;
        sprrvm2.cfr_renamed_5004(sprydn2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprydn2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprigm cfr_renamed_9494() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprydn(sprszm sprszm2) {
        if (sprszm2.cfr_renamed_84() == 3) {
            void arg0;
            sprydn sprydn2 = this;
            void v1 = arg0;
            this.cfr_renamed_4 = sprigm.cfr_renamed_23(v1.cfr_renamed_85(0));
            sprydn2.cfr_renamed_3 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
            sprydn2.cfr_renamed_2 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        throw new IllegalArgumentException(sprrcy.cfr_renamed_9("\"\u001a<\u001a8\u00039T$\u0011&\u00012\u001a4\u0011"));
    }

    public static sprydn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprydn) {
            return (sprydn)arg0;
        }
        if (arg0 != null) {
            return new sprydn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgbf cfr_renamed_4882() {
        return this.cfr_renamed_2;
    }
}

