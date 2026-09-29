/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjsm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwqm;
import com.spire.presentation.packages.sprxgf;

public class sprism
extends sprqqe {
    private final sprjfn cfr_renamed_0;
    private final sprjfn cfr_renamed_1;
    private final sprjsm cfr_renamed_2;
    private final sprwqm cfr_renamed_3;
    private sprhgm cfr_renamed_4;

    public sprjfn cfr_renamed_4852() {
        return this.cfr_renamed_1;
    }

    public sprwqm cfr_renamed_648() {
        return this.cfr_renamed_3;
    }

    public static sprism cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprism) {
            return (sprism)arg0;
        }
        if (arg0 != null) {
            return new sprism(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprism(sprwqm sprwqm2, sprjsm sprjsm2, sprjfn sprjfn2, sprjfn sprjfn3, sprhgm sprhgm2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprism sprism2 = this;
        sprism sprism3 = this;
        this.cfr_renamed_3 = arg0;
        sprism3.cfr_renamed_2 = arg1;
        sprism3.cfr_renamed_1 = arg2;
        sprism2.cfr_renamed_0 = arg3;
        sprism2.cfr_renamed_4 = sprhgm2;
    }

    public sprism(sprwqm arg0, sprjsm arg1, sprjfn arg2, sprjfn arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    public sprjsm cfr_renamed_2443() {
        return this.cfr_renamed_2;
    }

    public sprjfn cfr_renamed_4851() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprism sprism2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprism sprism3 = this;
        sprrvm2.cfr_renamed_5004(sprism3.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprism3.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm2.cfr_renamed_5004(sprism2.cfr_renamed_0);
        if (sprism2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprism(sprszm arg0) {
        sprszm sprszm2 = arg0;
        sprism sprism2 = this;
        sprszm sprszm3 = arg0;
        this.cfr_renamed_3 = sprwqm.cfr_renamed_23(sprszm3.cfr_renamed_85(0));
        sprism2.cfr_renamed_2 = sprjsm.cfr_renamed_23(sprszm3.cfr_renamed_85(1));
        sprism2.cfr_renamed_1 = sprjfn.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_0 = sprjfn.cfr_renamed_23(sprszm2.cfr_renamed_85(3));
        if (sprszm2.cfr_renamed_84() > 4) {
            this.cfr_renamed_4 = sprhgm.cfr_renamed_23(arg0.cfr_renamed_85(4));
        }
    }

    public sprhgm cfr_renamed_4850() {
        return this.cfr_renamed_4;
    }
}

