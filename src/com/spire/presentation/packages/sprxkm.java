/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprgum;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprywh;

public class sprxkm
extends sprqqe {
    private sprjfn cfr_renamed_3;
    private sprgum cfr_renamed_4;

    public sprjfn cfr_renamed_4279() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprxkm(sprgum sprgum2, sprjfn sprjfn2) {
        void arg0;
        sprxkm sprxkm2 = this;
        sprxkm2.cfr_renamed_4 = arg0;
        sprxkm2.cfr_renamed_3 = sprjfn2;
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
    private /* synthetic */ sprxkm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("X&~gi\"k2\u007f)y\":4s=\u007f}:")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprgum.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = (sprjfn)v0.cfr_renamed_85(1);
    }

    public sprgum cfr_renamed_4673() {
        return this.cfr_renamed_4;
    }

    public static sprxkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxkm) {
            return (sprxkm)arg0;
        }
        if (arg0 != null) {
            return new sprxkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

