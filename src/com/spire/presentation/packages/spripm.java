/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprngn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;
import com.spire.presentation.packages.spryrh;

public class spripm
extends sprqqe {
    private final sprngn cfr_renamed_3;
    private final sprybn cfr_renamed_4;

    public static spripm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spripm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spripm(sprybn sprybn2, sprngn sprngn2) {
        void arg0;
        spripm spripm2 = this;
        spripm2.cfr_renamed_4 = arg0;
        spripm2.cfr_renamed_3 = sprngn2;
    }

    public sprngn cfr_renamed_11362() {
        return this.cfr_renamed_3;
    }

    public static spripm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spripm) {
            return (spripm)arg0;
        }
        if (arg0 != null) {
            return new spripm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spripm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spryrh.cfr_renamed_9("\u001f\u001e\u0015\u001f\u0004\u0002\u0013\u0013\u0002P\u0005\u0015\u0007\u0005\u0013\u001e\u0015\u0015V\u0003\u001f\n\u0013"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprybn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprngn.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprybn cfr_renamed_11361() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }
}

