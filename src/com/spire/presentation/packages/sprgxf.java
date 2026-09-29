/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsag;
import com.spire.presentation.packages.sprvrc;

public class sprgxf
extends sprsag {
    public void cfr_renamed_1221(byte arg0) {
        int n = this.cfr_renamed_2++;
        this.cfr_renamed_1[n] = (byte)(this.cfr_renamed_1[n] ^ arg0);
        if (this.cfr_renamed_2 == 32) {
            sprgxf sprgxf2 = this;
            sprgxf2.cfr_renamed_6018(sprgxf2.cfr_renamed_1);
            sprgxf2.cfr_renamed_2 = 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprgxf(byte[] byArray) {
        int n;
        void arg0;
        sprgxf sprgxf2 = this;
        byte[] byArray2 = new byte[640];
        void v1 = arg0;
        sprgxf2.cfr_renamed_1197((byte[])v1, 0, ((void)v1).length);
        this.cfr_renamed_1199(byArray2, 0, byArray2.length);
        this.cfr_renamed_3 = new long[10][8];
        this.cfr_renamed_4 = new int[10][8];
        int n2 = n = 0;
        while (n2 < 10) {
            sprgxf sprgxf3 = this;
            sprgxf3.cfr_renamed_6019(sprgxf3.cfr_renamed_4[n], byArray2, n << 5);
            sprgxf3.cfr_renamed_6020(sprgxf3.cfr_renamed_3[n], byArray2, n++ << 6);
            n2 = n;
        }
    }

    public String cfr_renamed_1315() {
        return sprvrc.cfr_renamed_9("c(Y(@(\u0006\u001a");
    }

    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        int n = arg2;
        int n2 = arg2;
        sprgxf sprgxf2 = this;
        byte[] byArray = this.cfr_renamed_1;
        int n3 = sprgxf2.cfr_renamed_2;
        byArray[n3] = (byte)(byArray[n3] ^ 0x1F);
        sprgxf2.cfr_renamed_1[31] = (byte)(sprgxf2.cfr_renamed_1[31] ^ 0x80);
        while (n2 >= 32) {
            sprgxf sprgxf3 = this;
            sprgxf3.cfr_renamed_6018(sprgxf3.cfr_renamed_1);
            int n4 = arg1;
            arg1 += 32;
            System.arraycopy(sprgxf3.cfr_renamed_1, 0, arg0, n4, 32);
            n2 = arg2 -= 32;
        }
        if (arg2 > 0) {
            sprgxf sprgxf4 = this;
            sprgxf4.cfr_renamed_6018(sprgxf4.cfr_renamed_1);
            System.arraycopy(sprgxf4.cfr_renamed_1, 0, arg0, arg1, arg2);
        }
        this.cfr_renamed_41();
        return n;
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = arg1;
        int n3 = arg2 + this.cfr_renamed_2 >> 5;
        int n4 = n = 0;
        while (n4 < n3) {
            sprgxf sprgxf2 = this;
            while (sprgxf2.cfr_renamed_2 < 32) {
                int n5 = this.cfr_renamed_2++;
                byte by = (byte)(this.cfr_renamed_1[n5] ^ arg0[n2]);
                ++n2;
                this.cfr_renamed_1[n5] = by;
                sprgxf2 = this;
            }
            sprgxf sprgxf3 = this;
            sprgxf3.cfr_renamed_6018(sprgxf3.cfr_renamed_1);
            this.cfr_renamed_2 = 0;
            n4 = ++n;
        }
        int n6 = n2;
        while (n6 < arg1 + arg2) {
            int n7 = this.cfr_renamed_2++;
            byte by = (byte)(this.cfr_renamed_1[n7] ^ arg0[n2]);
            this.cfr_renamed_1[n7] = by;
            n6 = ++n2;
        }
    }
}

