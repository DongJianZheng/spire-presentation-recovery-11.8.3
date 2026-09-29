/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprtpm
extends sprqqe {
    public sprszm cfr_renamed_91;
    private static final sprktm cfr_renamed_0 = new sprktm(0L);
    public sprktm cfr_renamed_1;
    public sprigm cfr_renamed_2;
    public sprhgm cfr_renamed_3;
    public boolean cfr_renamed_4;

    public static sprtpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtpm) {
            return (sprtpm)arg0;
        }
        if (arg0 != null) {
            return new sprtpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprhgm cfr_renamed_3091() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtpm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            if (((sprnvm)arg0.cfr_renamed_85(0)).cfr_renamed_312() == 0) {
                sprtpm sprtpm2 = this;
                sprtpm2.cfr_renamed_4 = true;
                ++n;
                sprtpm2.cfr_renamed_1 = sprktm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(0), true);
            } else {
                this.cfr_renamed_1 = cfr_renamed_0;
            }
        } else {
            this.cfr_renamed_1 = cfr_renamed_0;
        }
        if (arg0.cfr_renamed_85(n) instanceof sprnvm) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_2 = sprigm.cfr_renamed_5085(sprnvm2, true);
        }
        this.cfr_renamed_91 = (sprszm)arg0.cfr_renamed_85(n);
        if (arg0.cfr_renamed_84() == ++n + 1) {
            this.cfr_renamed_3 = sprhgm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(n), true);
        }
    }

    public sprszm cfr_renamed_4300() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        if (!this.cfr_renamed_1.cfr_renamed_5078(cfr_renamed_0) || this.cfr_renamed_4) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_1));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_2));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtpm(sprigm sprigm2, sprszm sprszm2, sprmbm sprmbm2) {
        void arg1;
        void arg0;
        sprtpm sprtpm2 = this;
        this.cfr_renamed_1 = cfr_renamed_0;
        this.cfr_renamed_2 = arg0;
        sprtpm2.cfr_renamed_91 = arg1;
        sprtpm2.cfr_renamed_3 = sprhgm.cfr_renamed_23(sprmbm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtpm(sprigm sprigm2, sprszm sprszm2, sprhgm sprhgm2) {
        void arg1;
        void arg0;
        sprtpm sprtpm2 = this;
        this.cfr_renamed_1 = cfr_renamed_0;
        this.cfr_renamed_2 = arg0;
        sprtpm2.cfr_renamed_91 = arg1;
        sprtpm2.cfr_renamed_3 = sprhgm2;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public static sprtpm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprtpm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprigm cfr_renamed_4296() {
        return this.cfr_renamed_2;
    }
}

