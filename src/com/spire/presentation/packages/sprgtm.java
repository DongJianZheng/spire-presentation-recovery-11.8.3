/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprgtm
extends sprqqe {
    private final sprcom cfr_renamed_3;
    private final sprco cfr_renamed_4;

    public boolean cfr_renamed_4816() {
        return this.cfr_renamed_4 != null;
    }

    public sprcom cfr_renamed_1369() {
        return this.cfr_renamed_3;
    }

    public static sprgtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgtm) {
            return (sprgtm)arg0;
        }
        if (arg0 != null) {
            return new sprgtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgtm(sprcom sprcom2, sprkgn sprkgn2) {
        void arg0;
        sprgtm sprgtm2 = this;
        sprgtm2.cfr_renamed_3 = arg0;
        sprgtm2.cfr_renamed_4 = sprkgn2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprgtm sprgtm2 = this;
        sprrvm2.cfr_renamed_5004(sprgtm2.cfr_renamed_3);
        if (sprgtm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprco cfr_renamed_4028() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprgtm(sprcom sprcom2, sprigm sprigm2) {
        void arg0;
        sprgtm sprgtm2 = this;
        sprgtm2.cfr_renamed_3 = arg0;
        sprgtm2.cfr_renamed_4 = sprigm2;
    }

    private /* synthetic */ sprgtm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprcom.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() > 1) {
            if (!(arg0.cfr_renamed_85(1) instanceof sprkgn)) {
                this.cfr_renamed_4 = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            this.cfr_renamed_4 = arg0.cfr_renamed_85(1);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgtm(sprcom sprcom2) {
        void arg0;
        sprgtm sprgtm2 = this;
        sprgtm2.cfr_renamed_3 = arg0;
        sprgtm2.cfr_renamed_4 = null;
    }

    public boolean cfr_renamed_4815() {
        return this.cfr_renamed_4 instanceof sprkgn;
    }
}

