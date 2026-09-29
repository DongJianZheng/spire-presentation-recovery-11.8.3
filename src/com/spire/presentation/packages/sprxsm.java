/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgum;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprxsm
extends sprqqe {
    private sprszm cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprgum cfr_renamed_0;
    private sprjfn cfr_renamed_1;
    private static final sprktm cfr_renamed_2 = new sprktm(0L);
    private sprhgm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxsm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            if (((sprnvm)arg0.cfr_renamed_85(0)).cfr_renamed_312() == 0) {
                sprxsm sprxsm2 = this;
                sprxsm2.cfr_renamed_91 = true;
                ++n;
                sprxsm2.cfr_renamed_4 = sprktm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(0), true);
            } else {
                this.cfr_renamed_4 = cfr_renamed_2;
            }
        } else {
            this.cfr_renamed_4 = cfr_renamed_2;
        }
        sprxsm sprxsm3 = this;
        void v2 = arg0;
        this.cfr_renamed_0 = sprgum.cfr_renamed_23(arg0.cfr_renamed_85(n));
        sprxsm3.cfr_renamed_1 = sprjfn.cfr_renamed_23(v2.cfr_renamed_85(++n));
        sprxsm3.cfr_renamed_119 = (sprszm)v2.cfr_renamed_85(++n);
        if (arg0.cfr_renamed_84() > ++n) {
            this.cfr_renamed_3 = sprhgm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(n), true);
        }
    }

    public sprxsm(sprgum arg0, sprjfn arg1, sprszm arg2, sprmbm arg3) {
        this(cfr_renamed_2, arg0, sprjfn.cfr_renamed_23(arg1), arg2, sprhgm.cfr_renamed_23(arg3));
    }

    /*
     * WARNING - void declaration
     */
    public sprxsm(sprktm sprktm2, sprgum sprgum2, sprjfn sprjfn2, sprszm sprszm2, sprhgm sprhgm2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxsm sprxsm2 = this;
        sprxsm sprxsm3 = this;
        this.cfr_renamed_4 = arg0;
        sprxsm3.cfr_renamed_0 = arg1;
        sprxsm3.cfr_renamed_1 = arg2;
        sprxsm2.cfr_renamed_119 = arg3;
        sprxsm2.cfr_renamed_3 = sprhgm2;
    }

    public sprhgm cfr_renamed_4278() {
        return this.cfr_renamed_3;
    }

    public sprjfn cfr_renamed_4279() {
        return this.cfr_renamed_1;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        if (this.cfr_renamed_91 || !this.cfr_renamed_4.cfr_renamed_5078(cfr_renamed_2)) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprxsm sprxsm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(sprxsm2.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(sprxsm2.cfr_renamed_119);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public sprgum cfr_renamed_4277() {
        return this.cfr_renamed_0;
    }

    public static sprxsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxsm) {
            return (sprxsm)arg0;
        }
        if (arg0 != null) {
            return new sprxsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprszm cfr_renamed_4280() {
        return this.cfr_renamed_119;
    }

    public sprxsm(sprgum arg0, sprjfn arg1, sprszm arg2, sprhgm arg3) {
        this(cfr_renamed_2, arg0, arg1, arg2, arg3);
    }

    public static sprxsm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprxsm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

