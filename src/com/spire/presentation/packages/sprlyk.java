/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdoha;
import com.spire.presentation.packages.sprhyk;

public class sprlyk
extends sprhyk {
    @Override
    public String cfr_renamed_1315() {
        return sprdoha.cfr_renamed_9("6o0aMi3cS");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3464(byte[] byArray, byte[] byArray2) {
        byte by;
        void arg0;
        int n;
        sprlyk sprlyk2 = this;
        sprlyk2.cfr_renamed_1 = 0;
        sprlyk2.cfr_renamed_3 = new byte[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = (byte)n3;
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < 768) {
            sprlyk sprlyk3 = this;
            void v5 = arg0;
            this.cfr_renamed_1 = sprlyk3.cfr_renamed_3[sprlyk3.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v5[n % ((void)v5).length] & 0xFF];
            sprlyk sprlyk4 = this;
            by = sprlyk4.cfr_renamed_3[n & 0xFF];
            sprlyk sprlyk5 = this;
            sprlyk4.cfr_renamed_3[n & 0xFF] = sprlyk5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprlyk5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 768) {
            void arg1;
            sprlyk sprlyk6 = this;
            void v10 = arg1;
            this.cfr_renamed_1 = sprlyk6.cfr_renamed_3[sprlyk6.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v10[n % ((void)v10).length] & 0xFF];
            sprlyk sprlyk7 = this;
            by = sprlyk7.cfr_renamed_3[n & 0xFF];
            sprlyk sprlyk8 = this;
            sprlyk7.cfr_renamed_3[n & 0xFF] = sprlyk8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprlyk8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n5 = ++n;
        }
        int n6 = n = 0;
        while (n6 < 768) {
            sprlyk sprlyk9 = this;
            void v15 = arg0;
            this.cfr_renamed_1 = sprlyk9.cfr_renamed_3[sprlyk9.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v15[n % ((void)v15).length] & 0xFF];
            sprlyk sprlyk10 = this;
            by = sprlyk10.cfr_renamed_3[n & 0xFF];
            sprlyk sprlyk11 = this;
            sprlyk10.cfr_renamed_3[n & 0xFF] = sprlyk11.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprlyk11.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n6 = ++n;
        }
        this.cfr_renamed_0 = 0;
    }
}

