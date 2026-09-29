/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprzsp;

@sprtea
public class sprnep
extends spravo {
    public sprzsp cfr_renamed_0;
    private int[] cfr_renamed_1;
    public sprzsp cfr_renamed_2;
    public static final String cfr_renamed_3 = "COLR";
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_18925(int[] arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ void cfr_renamed_18926(int[] arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public int[] cfr_renamed_18927() {
        return this.cfr_renamed_1;
    }

    public int[] cfr_renamed_18928() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_18686(sprujo sprujo2) {
        int n;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        long l = v1.cfr_renamed_14060().cfr_renamed_3274();
        int n2 = v1.cfr_renamed_13218();
        int n3 = v1.cfr_renamed_13218();
        long l2 = v1.cfr_renamed_13220();
        long l3 = v0.cfr_renamed_13220();
        int n4 = n = v0.cfr_renamed_13218();
        this.cfr_renamed_18925(new int[n4]);
        this.cfr_renamed_18926(new int[n4]);
        v0.cfr_renamed_14060().cfr_renamed_11547(l + (l2 & 0xFFFFFFFFL), 0);
        int n5 = 0;
        int n6 = n5;
        while (n6 < (n3 & 0xFFFF)) {
            int n7 = arg0.cfr_renamed_13218();
            this.cfr_renamed_0.cfr_renamed_18929(n7, arg0.cfr_renamed_13218());
            this.cfr_renamed_2.cfr_renamed_18929(n7, arg0.cfr_renamed_13218());
            n6 = ++n5;
        }
        arg0.cfr_renamed_14060().cfr_renamed_11547(l + (l3 & 0xFFFFFFFFL), 0);
        n5 = 0;
        int n8 = n5;
        while (n8 < this.cfr_renamed_18928().length) {
            sprnep sprnep2 = this;
            sprnep2.cfr_renamed_18928()[n5] = arg0.cfr_renamed_13218();
            sprnep2.cfr_renamed_18927()[n5++] = arg0.cfr_renamed_13218();
            n8 = n5;
        }
    }

    public sprnep() {
        sprnep sprnep2 = this;
        this.cfr_renamed_0 = new sprzsp();
        sprnep2.cfr_renamed_2 = new sprzsp();
    }

    @Override
    public String cfr_renamed_313() {
        return cfr_renamed_3;
    }
}

