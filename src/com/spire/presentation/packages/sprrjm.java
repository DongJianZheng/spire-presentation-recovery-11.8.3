/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprxgf;

public class sprrjm
extends sprqqe {
    public sprjfn cfr_renamed_3;
    public sprjfn cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrjm(sprjfn sprjfn2, sprjfn sprjfn3) {
        void arg0;
        sprrjm sprrjm2 = this;
        sprrjm2.cfr_renamed_4 = arg0;
        sprrjm2.cfr_renamed_3 = sprjfn3;
    }

    public sprjfn cfr_renamed_109() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprrjm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrjm) {
            return (sprrjm)arg0;
        }
        if (arg0 != null) {
            return new sprrjm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjfn cfr_renamed_111() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrjm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwtf.cfr_renamed_9("\u007f8YyN<L,X7^<\u001d*T#Xc\u001d")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprjfn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprjfn.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

