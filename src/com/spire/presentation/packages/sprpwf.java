/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.sprizf;
import com.spire.presentation.packages.sproze;

public class sprpwf
extends sprizf {
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_91() {
        sprpwf sprpwf2 = this;
        byte[] byArray = new byte[sprpwf2.cfr_renamed_284().cfr_renamed_1252()];
        System.arraycopy(sprpwf2.cfr_renamed_3, 0, byArray, 0, this.cfr_renamed_3.length);
        System.arraycopy(this.cfr_renamed_4, 0, byArray, this.cfr_renamed_3.length, this.cfr_renamed_4.length);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprpwf(sprhvf sprhvf2, byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprpwf sprpwf2 = this;
        super(false, (sprhvf)arg0);
        sprpwf2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg1);
        sprpwf2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray2);
    }

    public byte[] cfr_renamed_6379() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprpwf(sprhvf sprhvf2, byte[] byArray) {
        super(0 != 0, (sprhvf)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_3 = sproze.cfr_renamed_533((byte[])arg1, 0, 32);
        this.cfr_renamed_4 = sproze.cfr_renamed_533(byArray, this.cfr_renamed_3.length, ((void)arg1).length);
    }
}

