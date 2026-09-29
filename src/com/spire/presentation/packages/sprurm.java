/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprltq;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprurm
extends sprqqe {
    private spridn cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public sprlem cfr_renamed_204() {
        return this.cfr_renamed_4;
    }

    public sprco[] cfr_renamed_4528() {
        return this.cfr_renamed_3.cfr_renamed_4529();
    }

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
    public sprurm(sprlem sprlem2, spridn spridn2) {
        void arg0;
        sprurm sprurm2 = this;
        sprurm2.cfr_renamed_4 = arg0;
        sprurm2.cfr_renamed_3 = spridn2;
    }

    /*
     * WARNING - void declaration
     */
    public sprurm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_3 = (spridn)arg0.cfr_renamed_85(1);
    }

    public static sprurm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprurm) {
            return (sprurm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprurm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprltq.cfr_renamed_9("\u0016\u000f\b\u000f\f\u0016\rA\f\u0003\t\u0004\u0000\u0015C\b\rA\u0005\u0000\u0000\u0015\f\u0013\u001a[C")).append(arg0.getClass().getName()).toString());
    }

    public spridn cfr_renamed_206() {
        return this.cfr_renamed_3;
    }
}

