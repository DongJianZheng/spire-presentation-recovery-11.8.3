/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfsz;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprttm
extends sprqqe {
    private final sprszm cfr_renamed_2;
    private final sprszm cfr_renamed_3;
    private final sprszm cfr_renamed_4;

    public sprszm cfr_renamed_11375() {
        return this.cfr_renamed_3;
    }

    public static sprttm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprttm) {
            return (sprttm)arg0;
        }
        if (arg0 != null) {
            return new sprttm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprszm cfr_renamed_11376() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprttm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprfsz.cfr_renamed_9("P@ZAK\\\\MM\u000eJKH[\\@ZK\u0019]PT\\"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public static sprttm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprttm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprszm cfr_renamed_11377() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprttm sprttm2 = this;
        sprrvm2.cfr_renamed_5004(sprttm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprttm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

