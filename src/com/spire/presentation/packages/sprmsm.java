/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprmsm
extends sprqqe {
    private final sprybn cfr_renamed_3;
    private final sprlvm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprlvm cfr_renamed_2442() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmsm(sprybn sprybn2, sprlvm sprlvm2) {
        void arg0;
        sprmsm sprmsm2 = this;
        sprmsm2.cfr_renamed_3 = arg0;
        sprmsm2.cfr_renamed_4 = sprlvm2;
    }

    public sprybn cfr_renamed_11361() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmsm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprsqaa.cfr_renamed_9("[\u001eQ\u001f@\u0002W\u0013FPA\u0015C\u0005W\u001eQ\u0015\u0012\u0003[\nW"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprybn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprlvm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprmsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmsm) {
            return (sprmsm)arg0;
        }
        if (arg0 != null) {
            return new sprmsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprmsm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprmsm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

