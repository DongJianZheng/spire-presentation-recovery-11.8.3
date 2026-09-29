/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprbnm
extends sprqqe {
    public sprnbm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbnm(sprnbm sprnbm2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_3 = sprnbm2;
        sprbnm sprbnm2 = this;
        this.cfr_renamed_4 = new sprktm((BigInteger)arg1);
    }

    public static sprbnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbnm) {
            return (sprbnm)arg0;
        }
        if (arg0 != null) {
            return new sprbnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbnm(sprszm sprszm2) {
        void arg0;
        sprbnm sprbnm2 = this;
        sprbnm2.cfr_renamed_3 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprbnm2.cfr_renamed_4 = (sprktm)sprszm2.cfr_renamed_85(1);
    }

    public sprktm cfr_renamed_4602() {
        return this.cfr_renamed_4;
    }

    public sprnbm cfr_renamed_313() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprbnm(sprjii sprjii2, sprktm sprktm2) {
        void arg0;
        sprbnm sprbnm2 = this;
        sprbnm2.cfr_renamed_3 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_119());
        sprbnm2.cfr_renamed_4 = sprktm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbnm(sprjii sprjii2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_3 = sprnbm.cfr_renamed_23(sprjii2.cfr_renamed_119());
        sprbnm sprbnm2 = this;
        this.cfr_renamed_4 = new sprktm((BigInteger)arg1);
    }
}

