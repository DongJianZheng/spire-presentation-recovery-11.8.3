/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprsqo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spryro {
    @sprtea
    public sprsqo[] cfr_renamed_3;
    @sprtea
    public short[] cfr_renamed_4;

    @sprtea
    public sprsqo cfr_renamed_18579(int arg0) {
        if (arg0 < this.cfr_renamed_3.length) {
            return this.cfr_renamed_3[arg0];
        }
        spryro spryro2 = this;
        sprsqo sprsqo2 = spryro2.cfr_renamed_3[spryro2.cfr_renamed_3.length - 1];
        short s = this.cfr_renamed_4[arg0 - this.cfr_renamed_3.length];
        return new sprsqo(sprsqo2.cfr_renamed_3, s);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spryro(sprmzo sprmzo2, int n, int n2) {
        int n3;
        void arg1;
        void arg2;
        void arg0;
        int n4;
        this.cfr_renamed_3 = new sprsqo[n];
        int n5 = n4 = 0;
        while (n5 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n4++] = new sprsqo((sprmzo)arg0);
            n5 = n4;
        }
        n4 = arg2 - arg1;
        this.cfr_renamed_4 = new short[n4];
        int n6 = n3 = 0;
        while (n6 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n3++] = arg0.cfr_renamed_12254();
            n6 = n3;
        }
    }
}

