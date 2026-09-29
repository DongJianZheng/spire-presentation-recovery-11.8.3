/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkbn
extends sprqqe {
    private final sprllm cfr_renamed_3;
    private final sprndm[] cfr_renamed_4;

    public static sprkbn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkbn) {
            return (sprkbn)arg0;
        }
        if (arg0 != null) {
            return new sprkbn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprndm[] cfr_renamed_2454() {
        sprndm[] sprndmArray = new sprndm[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, sprndmArray, 0, this.cfr_renamed_4.length);
        return sprndmArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkbn(sprszm sprszm2) {
        int n;
        void arg0;
        sprkbn sprkbn2 = this;
        sprkbn2.cfr_renamed_3 = sprllm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprszm sprszm3 = sprszm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        sprkbn2.cfr_renamed_4 = new sprndm[sprszm3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprndm.cfr_renamed_23(sprszm3.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkbn(sprllm sprllm2, sprndm[] sprndmArray) {
        void arg1;
        void arg0;
        sprkbn sprkbn2 = this;
        sprkbn2.cfr_renamed_3 = arg0;
        sprkbn2.cfr_renamed_4 = new sprndm[sprndmArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    public sprllm cfr_renamed_9284() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprcen(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }
}

