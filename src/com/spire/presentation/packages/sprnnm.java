/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprnnm
extends sprqqe {
    private spridn cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprnum cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnnm(sprnum sprnum2, spridn spridn2) {
        void arg0;
        void arg1;
        sprnnm sprnnm2 = this;
        sprnnm2.cfr_renamed_3 = new sprktm(arg1 == null ? 0L : 2L);
        sprnnm sprnnm3 = this;
        sprnnm3.cfr_renamed_4 = arg0;
        sprnnm3.cfr_renamed_2 = arg1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprnnm sprnnm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprnnm2.cfr_renamed_4);
        if (sprnnm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprkdn(false, 1, (sprco)this.cfr_renamed_2));
        }
        return new sprqcn(sprrvm2);
    }

    private /* synthetic */ sprnnm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprnum.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        if (sprszm2.cfr_renamed_84() == 3) {
            this.cfr_renamed_2 = spridn.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(2), false);
        }
    }

    public sprnnm(sprnum arg0) {
        this(arg0, null);
    }

    public sprnum cfr_renamed_4172() {
        return this.cfr_renamed_4;
    }

    public static sprnnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnnm) {
            return (sprnnm)arg0;
        }
        if (arg0 != null) {
            return new sprnnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public spridn cfr_renamed_4176() {
        return this.cfr_renamed_2;
    }
}

