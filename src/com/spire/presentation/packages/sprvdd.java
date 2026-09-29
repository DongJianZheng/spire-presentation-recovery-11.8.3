/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsk;
import com.spire.presentation.packages.sprngd;

public class sprvdd
extends sprngd {
    @Override
    public String cfr_renamed_1315() {
        return sprdsk.cfr_renamed_9("3\u000e5\u0000H\b6\u0002V");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3464(byte[] byArray, byte[] byArray2) {
        byte by;
        void arg0;
        int n;
        sprvdd sprvdd2 = this;
        sprvdd2.cfr_renamed_1 = 0;
        sprvdd2.cfr_renamed_3 = new byte[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = (byte)n3;
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < 768) {
            sprvdd sprvdd3 = this;
            void v5 = arg0;
            this.cfr_renamed_1 = sprvdd3.cfr_renamed_3[sprvdd3.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v5[n % ((void)v5).length] & 0xFF];
            sprvdd sprvdd4 = this;
            by = sprvdd4.cfr_renamed_3[n & 0xFF];
            sprvdd sprvdd5 = this;
            sprvdd4.cfr_renamed_3[n & 0xFF] = sprvdd5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprvdd5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 768) {
            void arg1;
            sprvdd sprvdd6 = this;
            void v10 = arg1;
            this.cfr_renamed_1 = sprvdd6.cfr_renamed_3[sprvdd6.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v10[n % ((void)v10).length] & 0xFF];
            sprvdd sprvdd7 = this;
            by = sprvdd7.cfr_renamed_3[n & 0xFF];
            sprvdd sprvdd8 = this;
            sprvdd7.cfr_renamed_3[n & 0xFF] = sprvdd8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprvdd8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n5 = ++n;
        }
        int n6 = n = 0;
        while (n6 < 768) {
            sprvdd sprvdd9 = this;
            void v15 = arg0;
            this.cfr_renamed_1 = sprvdd9.cfr_renamed_3[sprvdd9.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v15[n % ((void)v15).length] & 0xFF];
            sprvdd sprvdd10 = this;
            by = sprvdd10.cfr_renamed_3[n & 0xFF];
            sprvdd sprvdd11 = this;
            sprvdd10.cfr_renamed_3[n & 0xFF] = sprvdd11.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprvdd11.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n6 = ++n;
        }
        this.cfr_renamed_0 = 0;
    }
}

