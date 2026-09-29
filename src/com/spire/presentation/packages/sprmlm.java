/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmlm
extends sprqqe {
    private sprigm cfr_renamed_91;
    private sprktm cfr_renamed_0;
    public static final sprktm cfr_renamed_1;
    public static final sprktm cfr_renamed_2;
    public static final sprktm cfr_renamed_3;
    public static final sprktm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprmlm sprmlm2 = this;
        sprrvm2.cfr_renamed_5004(sprmlm2.cfr_renamed_0);
        if (sprmlm2.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprmlm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_0 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_91 = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprigm cfr_renamed_4811() {
        return this.cfr_renamed_91;
    }

    public static sprmlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmlm) {
            return (sprmlm)arg0;
        }
        if (arg0 != null) {
            return new sprmlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    static {
        cfr_renamed_3 = new sprktm(0L);
        cfr_renamed_2 = new sprktm(1L);
        cfr_renamed_1 = new sprktm(2L);
        cfr_renamed_4 = new sprktm(3L);
    }

    public sprktm cfr_renamed_11315() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprmlm(sprktm sprktm2, sprigm sprigm2) {
        void arg0;
        sprmlm sprmlm2 = this;
        sprmlm2.cfr_renamed_0 = arg0;
        sprmlm2.cfr_renamed_91 = sprigm2;
    }
}

