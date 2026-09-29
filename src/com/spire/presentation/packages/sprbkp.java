/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public class sprbkp
extends spravo {
    private byte[] cfr_renamed_1;
    public static final String cfr_renamed_2 = "CPAL";
    private int[] cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_18917() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_18918(int arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4) {
        byte[] byArray = this.cfr_renamed_1;
        int n = arg0 * 4;
        arg3[0] = byArray[n];
        arg2[0] = byArray[n + 1];
        arg1[0] = byArray[n + 2];
        arg4[0] = byArray[n + 3];
    }

    private /* synthetic */ void cfr_renamed_18919(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public int[] cfr_renamed_18920() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_18921(int[] arg0) {
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_18686(sprujo sprujo2) {
        void arg0;
        sprbkp sprbkp2 = this;
        sprujo sprujo3 = sprujo2;
        sprujo sprujo4 = sprujo2;
        long l = sprujo4.cfr_renamed_14060().cfr_renamed_3274();
        int n = sprujo4.cfr_renamed_13218();
        int n2 = sprujo3.cfr_renamed_13218();
        int n3 = sprujo3.cfr_renamed_13218();
        sprbkp2.cfr_renamed_18919(sprujo2.cfr_renamed_13218());
        long l2 = sprujo3.cfr_renamed_13220();
        void v3 = arg0;
        sprbkp2.cfr_renamed_18921(sprrzo.cfr_renamed_18661((sprujo)v3, n3 & 0xFFFF));
        v3.cfr_renamed_14060().cfr_renamed_11547(l + (l2 & 0xFFFFFFFFL), 0);
        this.cfr_renamed_1 = arg0.cfr_renamed_16065(4 * (this.cfr_renamed_18917() & 0xFFFF));
    }

    @Override
    public String cfr_renamed_313() {
        return cfr_renamed_2;
    }
}

