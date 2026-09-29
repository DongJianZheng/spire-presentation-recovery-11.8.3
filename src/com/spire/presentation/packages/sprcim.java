/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprcim {
    public int cfr_renamed_2 = 11994318;
    public static final int cfr_renamed_3 = 25578747;
    public static final int cfr_renamed_4 = 11994318;

    public void cfr_renamed_41() {
        this.cfr_renamed_2 = 11994318;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11084(int n) {
        int n2;
        void arg0;
        this.cfr_renamed_2 ^= arg0 << 16;
        int n3 = n2 = 0;
        while (n3 < 8) {
            sprcim sprcim2 = this;
            int n4 = sprcim2.cfr_renamed_2 << 8 >> 31 & 0x1864CFB;
            sprcim2.cfr_renamed_2 = sprcim2.cfr_renamed_2 << 1 ^ n4;
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11083(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprcim sprcim2 = this;
        void v1 = arg0;
        this.cfr_renamed_11084((int)(v1[arg1 + false] & 0xFF));
        sprcim2.cfr_renamed_11084((int)(v1[arg1 + true] & 0xFF));
        sprcim2.cfr_renamed_11084(byArray[arg1 + 2] & 0xFF);
    }

    public int cfr_renamed_97() {
        return this.cfr_renamed_2 & 0xFFFFFF;
    }
}

