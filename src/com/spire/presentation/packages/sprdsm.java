/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprdsm
extends sprqqe {
    private sprktm cfr_renamed_3;
    private sprnbm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdsm(sprjii sprjii2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_4 = sprnbm.cfr_renamed_23(sprjii2);
        sprdsm sprdsm2 = this;
        this.cfr_renamed_3 = new sprktm((BigInteger)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdsm(sprjii sprjii2, sprktm sprktm2) {
        void arg0;
        sprdsm sprdsm2 = this;
        sprdsm2.cfr_renamed_4 = sprnbm.cfr_renamed_23(arg0);
        sprdsm2.cfr_renamed_3 = sprktm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprdsm(sprcbm sprcbm2) {
        void arg0;
        sprdsm sprdsm2 = this;
        sprdsm2.cfr_renamed_4 = arg0.cfr_renamed_102();
        sprdsm2.cfr_renamed_3 = sprcbm2.cfr_renamed_114();
    }

    public static sprdsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdsm) {
            return (sprdsm)arg0;
        }
        if (arg0 != null) {
            return new sprdsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdsm(sprszm sprszm2) {
        void arg0;
        sprdsm sprdsm2 = this;
        sprdsm2.cfr_renamed_4 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprdsm2.cfr_renamed_3 = (sprktm)sprszm2.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdsm(sprnbm sprnbm2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_4 = sprnbm2;
        sprdsm sprdsm2 = this;
        this.cfr_renamed_3 = new sprktm((BigInteger)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdsm(sprndm sprndm2) {
        void arg0;
        sprdsm sprdsm2 = this;
        sprdsm2.cfr_renamed_4 = arg0.cfr_renamed_102();
        sprdsm2.cfr_renamed_3 = sprndm2.cfr_renamed_114();
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_3;
    }

    public sprnbm cfr_renamed_313() {
        return this.cfr_renamed_4;
    }
}

