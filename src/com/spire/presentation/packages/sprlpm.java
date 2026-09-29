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

public class sprlpm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public static sprlpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlpm) {
            return (sprlpm)arg0;
        }
        if (arg0 != null) {
            return new sprlpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco cfr_renamed_7361() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_3));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlpm(sprszm sprszm2) {
        void arg0;
        sprlpm sprlpm2 = this;
        sprlpm2.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprlpm2.cfr_renamed_3 = sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_8225();
    }

    /*
     * WARNING - void declaration
     */
    public sprlpm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprlpm sprlpm2 = this;
        sprlpm2.cfr_renamed_4 = arg0;
        sprlpm2.cfr_renamed_3 = sprco2;
    }

    public sprlem cfr_renamed_11199() {
        return this.cfr_renamed_4;
    }
}

