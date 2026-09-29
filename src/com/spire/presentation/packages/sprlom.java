/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprlom
extends sprqqe {
    public sproug cfr_renamed_3;
    public sprlem cfr_renamed_4;

    public sprlem cfr_renamed_4286() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlom(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_3 = (sproug)arg0.cfr_renamed_85(1);
    }

    public static sprlom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprlom.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprlom(sprlem sprlem2, sproug sproug2) {
        void arg0;
        sprlom sprlom2 = this;
        sprlom2.cfr_renamed_4 = arg0;
        sprlom2.cfr_renamed_3 = sproug2;
    }

    public sproug cfr_renamed_3262() {
        return this.cfr_renamed_3;
    }

    public static sprlom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlom) {
            return (sprlom)arg0;
        }
        if (arg0 != null) {
            return new sprlom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

