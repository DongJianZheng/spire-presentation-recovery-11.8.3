/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprjsm
extends sprqqe {
    private sprktm cfr_renamed_3;
    private sprigm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjsm(sprigm sprigm2, sprktm sprktm2) {
        void arg0;
        sprjsm sprjsm2 = this;
        sprjsm2.cfr_renamed_4 = arg0;
        sprjsm2.cfr_renamed_3 = sprktm2;
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_3;
    }

    public static sprjsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjsm) {
            return (sprjsm)arg0;
        }
        if (arg0 != null) {
            return new sprjsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjsm(sprigm arg0, BigInteger arg1) {
        this(arg0, new sprktm(arg1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprigm cfr_renamed_102() {
        return this.cfr_renamed_4;
    }

    public static sprjsm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjsm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjsm(sprszm sprszm2) {
        void arg0;
        sprjsm sprjsm2 = this;
        sprjsm2.cfr_renamed_4 = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprjsm2.cfr_renamed_3 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }
}

