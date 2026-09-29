/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class spriom
extends sprqqe {
    private sprdye cfr_renamed_3;
    private sprddm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static spriom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spriom.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static spriom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriom) {
            return (spriom)arg0;
        }
        if (arg0 != null) {
            return new spriom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriom(sprszm sprszm2) {
        void arg0;
        spriom spriom2 = this;
        spriom2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        spriom2.cfr_renamed_3 = (sprdye)sprszm2.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public spriom(sprddm sprddm2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_4 = sprddm2;
        spriom spriom2 = this;
        this.cfr_renamed_3 = new sprdye((byte[])arg1);
    }

    public sprddm cfr_renamed_593() {
        return this.cfr_renamed_4;
    }

    public sprdye cfr_renamed_1157() {
        return this.cfr_renamed_3;
    }
}

