/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrqr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxkm;

public class sprmkm
extends sprqqe {
    private sprxkm cfr_renamed_3;
    private spratm cfr_renamed_4;

    public sprxkm cfr_renamed_4671() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmkm(sprxkm sprxkm2, spratm spratm2) {
        void arg0;
        sprmkm sprmkm2 = this;
        sprmkm2.cfr_renamed_3 = arg0;
        sprmkm2.cfr_renamed_4 = spratm2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmkm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("y\u0000_AH\u0004J\u0014^\u000fX\u0004\u001b\u0012R\u001b^[\u001b")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprxkm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = spratm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        if (null != this.cfr_renamed_4) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public spratm cfr_renamed_4670() {
        return this.cfr_renamed_4;
    }

    public static sprmkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmkm) {
            return (sprmkm)arg0;
        }
        if (arg0 != null) {
            return new sprmkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmkm(sprxkm arg0) {
        this(arg0, null);
    }
}

