/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcag;
import com.spire.presentation.packages.sprnvf;

public class sprevf {
    public long cfr_renamed_119;
    public long cfr_renamed_91;
    public sprcag cfr_renamed_0;
    public byte[] cfr_renamed_1;
    public int cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public int cfr_renamed_4;

    public void cfr_renamed_6888() {
        int n;
        int[] nArray = new int[4];
        nArray[0] = 1634760805;
        nArray[1] = 857760878;
        nArray[2] = 2036477234;
        nArray[3] = 1797285236;
        int[] nArray2 = nArray;
        sprevf sprevf2 = this;
        long l = sprevf2.cfr_renamed_0.cfr_renamed_6889(sprevf2.cfr_renamed_3, 48);
        int n2 = n = 0;
        while (n2 < 8) {
            int n3;
            int n4;
            int[] nArray3 = new int[16];
            System.arraycopy(nArray2, 0, nArray3, 0, nArray2.length);
            sprevf sprevf3 = this;
            int[] nArray4 = nArray3;
            System.arraycopy(sprevf3.cfr_renamed_0.cfr_renamed_6890(sprevf3.cfr_renamed_3, 0, 12), 0, nArray3, 4, 12);
            nArray4[14] = nArray4[14] ^ (int)l;
            nArray3[15] = nArray3[15] ^ (int)(l >>> 32);
            int n5 = n4 = 0;
            while (n5 < 10) {
                sprevf sprevf4 = this;
                sprevf sprevf5 = this;
                sprevf sprevf6 = this;
                sprevf sprevf7 = this;
                sprevf7.cfr_renamed_6582(0, 4, 8, 12, nArray3);
                sprevf7.cfr_renamed_6582(1, 5, 9, 13, nArray3);
                sprevf6.cfr_renamed_6582(2, 6, 10, 14, nArray3);
                sprevf6.cfr_renamed_6582(3, 7, 11, 15, nArray3);
                sprevf5.cfr_renamed_6582(0, 5, 10, 15, nArray3);
                sprevf5.cfr_renamed_6582(1, 6, 11, 12, nArray3);
                sprevf4.cfr_renamed_6582(2, 7, 8, 13, nArray3);
                sprevf4.cfr_renamed_6582(3, 4, 9, 14, nArray3);
                n5 = ++n4;
            }
            int n6 = n3 = 0;
            while (n6 < 4) {
                int n7 = n3;
                int n8 = nArray3[n7] + nArray2[n3];
                nArray3[n7] = n8;
                n6 = ++n3;
            }
            int n9 = n3 = 4;
            while (n9 < 14) {
                int n10 = n3;
                sprevf sprevf8 = this;
                int n11 = nArray3[n10] + sprevf8.cfr_renamed_0.cfr_renamed_6891(sprevf8.cfr_renamed_3, 4 * n3 - 16);
                nArray3[n10] = n11;
                n9 = ++n3;
            }
            sprevf sprevf9 = this;
            nArray3[14] = nArray3[14] + (sprevf9.cfr_renamed_0.cfr_renamed_6891(sprevf9.cfr_renamed_3, 40) ^ (int)l);
            sprevf sprevf10 = this;
            nArray3[15] = nArray3[15] + (sprevf10.cfr_renamed_0.cfr_renamed_6891(sprevf10.cfr_renamed_3, 44) ^ (int)(l >>> 32));
            ++l;
            int n12 = n3 = 0;
            while (n12 < 16) {
                sprevf sprevf11 = this;
                sprevf11.cfr_renamed_1[(n << 2) + (n3 << 5) + 0] = (byte)nArray3[n3];
                sprevf11.cfr_renamed_1[(n << 2) + (n3 << 5) + 1] = (byte)(nArray3[n3] >>> 8);
                sprevf11.cfr_renamed_1[(n << 2) + (n3 << 5) + 2] = (byte)(nArray3[n3] >>> 16);
                int n13 = (n << 2) + (n3 << 5) + 3;
                byte by = (byte)(nArray3[n3] >>> 24);
                sprevf11.cfr_renamed_1[n13] = by;
                n12 = ++n3;
            }
            n2 = ++n;
        }
        System.arraycopy(this.cfr_renamed_0.cfr_renamed_6892(l), 0, this.cfr_renamed_3, 48, 8);
        this.cfr_renamed_4 = 0;
    }

    public sprevf() {
        sprevf sprevf2 = this;
        sprevf sprevf3 = this;
        sprevf sprevf4 = this;
        sprevf4.cfr_renamed_1 = new byte[512];
        sprevf4.cfr_renamed_91 = 0L;
        sprevf3.cfr_renamed_4 = 0;
        sprevf3.cfr_renamed_3 = new byte[256];
        sprevf2.cfr_renamed_119 = 0L;
        sprevf2.cfr_renamed_2 = 0;
        sprevf sprevf5 = this;
        sprevf2.cfr_renamed_0 = new sprcag();
    }

    public void cfr_renamed_6893(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        while (arg2 > 0) {
            int n2 = this.cfr_renamed_1.length - this.cfr_renamed_4;
            if (n2 > arg2) {
                n2 = arg2;
            }
            sprevf sprevf2 = this;
            System.arraycopy(sprevf2.cfr_renamed_1, 0, arg0, n, n2);
            n += n2;
            arg2 -= n2;
            sprevf2.cfr_renamed_4 += n2;
            if (this.cfr_renamed_4 != this.cfr_renamed_1.length) continue;
            this.cfr_renamed_6888();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_6582(int n, int n2, int n3, int n4, int[] nArray) {
        void arg1;
        void arg4;
        int n5 = n2;
        int[] nArray2 = nArray;
        int[] nArray3 = nArray;
        int n6 = n3;
        int n7 = n4;
        int[] nArray4 = nArray;
        int[] nArray5 = nArray;
        int n8 = n;
        int n9 = n2;
        int[] nArray6 = nArray;
        int[] nArray7 = nArray;
        int n10 = n3;
        int n11 = n4;
        int[] nArray8 = nArray;
        int[] nArray9 = nArray;
        int n12 = n;
        nArray8[n12] = nArray8[n12] + nArray[n2];
        nArray9[n11] = nArray9[n11] ^ nArray[n];
        nArray[n11] = nArray[n4] << 16 | nArray[n4] >>> 16;
        nArray6[n10] = nArray6[n10] + nArray[n4];
        nArray7[n9] = nArray7[n9] ^ nArray[n3];
        nArray[n9] = nArray[n2] << 12 | nArray[n2] >>> 20;
        nArray4[n8] = nArray4[n8] + nArray[n2];
        nArray5[n7] = nArray5[n7] ^ nArray[n];
        nArray[n7] = nArray[n4] << 8 | nArray[n4] >>> 24;
        nArray2[n6] = nArray2[n6] + nArray[n4];
        nArray3[n5] = nArray3[n5] ^ nArray[n3];
        void v16 = arg4;
        v16[n5] = nArray[n2] << 7 | v16[arg1] >>> 25;
    }

    public void cfr_renamed_6878(sprnvf arg0) {
        int n;
        byte[] byArray = new byte[56];
        arg0.cfr_renamed_6804(byArray, 0, 56);
        int n2 = n = 0;
        while (n2 < 14) {
            int n3 = byArray[(n << 2) + 0] & 0xFF | (byArray[(n << 2) + 1] & 0xFF) << 8 | (byArray[(n << 2) + 2] & 0xFF) << 16 | (byArray[(n << 2) + 3] & 0xFF) << 24;
            System.arraycopy(this.cfr_renamed_0.cfr_renamed_6894(n3), 0, this.cfr_renamed_3, n++ << 2, 4);
            n2 = n;
        }
        sprevf sprevf2 = this;
        sprevf sprevf3 = this;
        long l = (long)sprevf2.cfr_renamed_0.cfr_renamed_6891(sprevf3.cfr_renamed_3, 48) & 0xFFFFFFFFL;
        long l2 = (long)sprevf2.cfr_renamed_0.cfr_renamed_6891(this.cfr_renamed_3, 52) & 0xFFFFFFFFL;
        System.arraycopy(sprevf3.cfr_renamed_0.cfr_renamed_6892(l + (l2 << 32)), 0, this.cfr_renamed_3, 48, 8);
        sprevf2.cfr_renamed_6888();
    }

    public long cfr_renamed_6810() {
        int n = this.cfr_renamed_4;
        if (n >= this.cfr_renamed_1.length - 9) {
            this.cfr_renamed_6888();
            n = 0;
        }
        this.cfr_renamed_4 = n + 8;
        return (long)this.cfr_renamed_1[n + 0] & 0xFFL | ((long)this.cfr_renamed_1[n + 1] & 0xFFL) << 8 | ((long)this.cfr_renamed_1[n + 2] & 0xFFL) << 16 | ((long)this.cfr_renamed_1[n + 3] & 0xFFL) << 24 | ((long)this.cfr_renamed_1[n + 4] & 0xFFL) << 32 | ((long)this.cfr_renamed_1[n + 5] & 0xFFL) << 40 | ((long)this.cfr_renamed_1[n + 6] & 0xFFL) << 48 | ((long)this.cfr_renamed_1[n + 7] & 0xFFL) << 56;
    }

    public byte cfr_renamed_6811() {
        byte by = this.cfr_renamed_1[this.cfr_renamed_4++];
        sprevf sprevf2 = this;
        if (sprevf2.cfr_renamed_4 == sprevf2.cfr_renamed_1.length) {
            this.cfr_renamed_6888();
        }
        return by;
    }
}

