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
import com.spire.presentation.packages.sprycn;

public class sprgim
extends sprqqe {
    private final sprlem cfr_renamed_3;
    private final sprco cfr_renamed_4;

    public sprlem cfr_renamed_7350() {
        return this.cfr_renamed_3;
    }

    public static sprgim cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgim) {
            return (sprgim)arg0;
        }
        if (arg0 != null) {
            return new sprgim(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgim(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprgim sprgim2 = this;
        sprgim2.cfr_renamed_3 = arg0;
        sprgim2.cfr_renamed_4 = sprco2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgim(sprszm sprszm2) {
        void arg0;
        sprgim sprgim2 = this;
        sprgim2.cfr_renamed_3 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprgim2.cfr_renamed_4 = sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_8225();
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprycn(true, 0, this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }
}

