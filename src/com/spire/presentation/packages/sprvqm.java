/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhlm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprssm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprvqm
extends sprqqe {
    private sprhgm cfr_renamed_0;
    private sprssm cfr_renamed_1;
    private sprjfn cfr_renamed_2;
    private sprhlm cfr_renamed_3;
    private sprjfn cfr_renamed_4;

    public sprvqm(sprssm arg0, sprhlm arg1, sprjfn arg2, sprjfn arg3, sprmbm arg4) {
        this(arg0, arg1, arg2, arg3, sprhgm.cfr_renamed_23(arg4));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprvqm sprvqm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprvqm2.cfr_renamed_4);
        if (sprvqm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_0));
        }
        return new sprcen(sprrvm2);
    }

    public sprhgm cfr_renamed_4271() {
        return this.cfr_renamed_0;
    }

    public sprssm cfr_renamed_4270() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ sprvqm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        sprvqm sprvqm2 = this;
        sprvqm2.cfr_renamed_1 = sprssm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprvqm2.cfr_renamed_3 = sprhlm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprjfn.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
        if (sprszm2.cfr_renamed_84() > 4) {
            this.cfr_renamed_2 = sprjfn.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(3), true);
            this.cfr_renamed_0 = sprhgm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(4), true);
            return;
        }
        if (arg0.cfr_renamed_84() > 3) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(3);
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_2 = sprjfn.cfr_renamed_5085(sprnvm2, true);
                return;
            }
            this.cfr_renamed_0 = sprhgm.cfr_renamed_5085(sprnvm2, true);
        }
    }

    public sprhlm cfr_renamed_2161() {
        return this.cfr_renamed_3;
    }

    public sprjfn cfr_renamed_2133() {
        return this.cfr_renamed_2;
    }

    public static sprvqm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprvqm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprvqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvqm) {
            return (sprvqm)arg0;
        }
        if (arg0 != null) {
            return new sprvqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjfn cfr_renamed_2132() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprvqm(sprssm sprssm2, sprhlm sprhlm2, sprjfn sprjfn2, sprjfn sprjfn3, sprhgm sprhgm2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvqm sprvqm2 = this;
        sprvqm sprvqm3 = this;
        this.cfr_renamed_1 = arg0;
        sprvqm3.cfr_renamed_3 = arg1;
        sprvqm3.cfr_renamed_4 = arg2;
        sprvqm2.cfr_renamed_2 = arg3;
        sprvqm2.cfr_renamed_0 = sprhgm2;
    }
}

