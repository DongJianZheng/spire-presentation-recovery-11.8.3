/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.sprizf;
import com.spire.presentation.packages.sproze;

public class sprxxf
extends sprizf {
    private final byte[] cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_5957() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public byte[] cfr_renamed_5955() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_2690() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_91() {
        sprxxf sprxxf2 = this;
        byte[] byArray = new byte[sprxxf2.cfr_renamed_284().cfr_renamed_6375()];
        System.arraycopy(sprxxf2.cfr_renamed_1, 0, byArray, 0, this.cfr_renamed_1.length);
        System.arraycopy(this.cfr_renamed_3, 0, byArray, this.cfr_renamed_1.length, this.cfr_renamed_3.length);
        System.arraycopy(this.cfr_renamed_4, 0, byArray, this.cfr_renamed_1.length + this.cfr_renamed_3.length, this.cfr_renamed_4.length);
        System.arraycopy(this.cfr_renamed_2, 0, byArray, this.cfr_renamed_1.length + this.cfr_renamed_3.length + this.cfr_renamed_4.length, this.cfr_renamed_2.length);
        return byArray;
    }

    public byte[] cfr_renamed_3382() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprxxf(sprhvf sprhvf2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxxf sprxxf2 = this;
        sprxxf sprxxf3 = this;
        super(true, (sprhvf)arg0);
        sprxxf3.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg1);
        sprxxf3.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg2);
        sprxxf2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg3);
        sprxxf2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray4);
    }
}

