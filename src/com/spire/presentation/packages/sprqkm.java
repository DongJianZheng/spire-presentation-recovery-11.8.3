/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprypm;

public class sprqkm
extends sprqqe {
    private sprkgn cfr_renamed_1;
    private sprbxm cfr_renamed_2;
    private sprupm cfr_renamed_3;
    private sprypm cfr_renamed_4;

    public boolean cfr_renamed_688() {
        return this.cfr_renamed_2.cfr_renamed_587();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqkm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_2 = sprbxm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        int n = 1;
        if (1 < arg0.cfr_renamed_84() && arg0.cfr_renamed_85(n) instanceof sprkgn) {
            this.cfr_renamed_1 = sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84() && arg0.cfr_renamed_85(n) instanceof sprupm) {
            this.cfr_renamed_3 = sprupm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84()) {
            this.cfr_renamed_4 = sprypm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
    }

    public spraen cfr_renamed_678() {
        if (null == this.cfr_renamed_1 || this.cfr_renamed_1 instanceof spraen) {
            return (spraen)this.cfr_renamed_1;
        }
        return new spraen(this.cfr_renamed_1.cfr_renamed_314());
    }

    public sprypm cfr_renamed_671() {
        return this.cfr_renamed_4;
    }

    public sprnrm cfr_renamed_675() {
        if (null == this.cfr_renamed_3 || this.cfr_renamed_3 instanceof sprnrm) {
            return (sprnrm)this.cfr_renamed_3;
        }
        return new sprnrm(this.cfr_renamed_3.cfr_renamed_314(), false);
    }

    /*
     * WARNING - void declaration
     */
    public sprqkm(sprbxm sprbxm2, sprkgn sprkgn2, sprupm sprupm2, sprypm sprypm2) {
        void arg2;
        void arg1;
        void arg0;
        sprqkm sprqkm2 = this;
        sprqkm sprqkm3 = this;
        sprqkm3.cfr_renamed_2 = arg0;
        sprqkm3.cfr_renamed_1 = arg1;
        sprqkm2.cfr_renamed_3 = arg2;
        sprqkm2.cfr_renamed_4 = sprypm2;
    }

    public static sprqkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqkm) {
            return (sprqkm)arg0;
        }
        if (arg0 != null) {
            return new sprqkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprqkm sprqkm2 = this;
        sprrvm2.cfr_renamed_5004(sprqkm2.cfr_renamed_2);
        if (sprqkm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprkgn cfr_renamed_5385() {
        return this.cfr_renamed_1;
    }

    public sprupm cfr_renamed_5384() {
        return this.cfr_renamed_3;
    }
}

