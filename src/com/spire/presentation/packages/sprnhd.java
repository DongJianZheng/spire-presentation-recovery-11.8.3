/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprt;

public class sprnhd
implements sprff {
    private static final int[] cfr_renamed_112;
    private int[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 16;
    private static final int[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3640(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    private /* synthetic */ int cfr_renamed_3641(byte[] arg0, int arg1) {
        return arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3642(int[] nArray) {
        void arg0;
        nArray[1] = this.cfr_renamed_3608(nArray[1], 31);
        nArray[2] = this.cfr_renamed_3608(nArray[2], 27);
        void v0 = arg0;
        v0[3] = this.cfr_renamed_3608((int)v0[3], 30);
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        sprnhd sprnhd2 = this;
        sprnhd2.cfr_renamed_4[0] = this.cfr_renamed_3641(arg0, arg1);
        sprnhd sprnhd3 = this;
        sprnhd2.cfr_renamed_4[1] = sprnhd3.cfr_renamed_3641(arg0, arg1 + 4);
        sprnhd3.cfr_renamed_4[2] = this.cfr_renamed_3641(arg0, arg1 + 8);
        sprnhd2.cfr_renamed_4[3] = this.cfr_renamed_3641(arg0, arg1 + 12);
        System.arraycopy(sprnhd2.cfr_renamed_119, 0, this.cfr_renamed_2, 0, this.cfr_renamed_119.length);
        sprnhd sprnhd4 = this;
        sprnhd4.cfr_renamed_3643(sprnhd4.cfr_renamed_2, cfr_renamed_112);
        int n2 = n = 16;
        while (n2 > 0) {
            sprnhd sprnhd5 = this;
            sprnhd sprnhd6 = this;
            sprnhd5.cfr_renamed_3643(sprnhd5.cfr_renamed_4, sprnhd6.cfr_renamed_2);
            sprnhd6.cfr_renamed_4[0] = sprnhd6.cfr_renamed_4[0] ^ cfr_renamed_0[n];
            sprnhd5.cfr_renamed_3644(sprnhd5.cfr_renamed_4);
            sprnhd5.cfr_renamed_3645(sprnhd5.cfr_renamed_4);
            sprnhd5.cfr_renamed_3642(sprnhd5.cfr_renamed_4);
            n2 = --n;
        }
        sprnhd sprnhd7 = this;
        sprnhd sprnhd8 = this;
        sprnhd7.cfr_renamed_3643(sprnhd7.cfr_renamed_4, sprnhd8.cfr_renamed_2);
        sprnhd8.cfr_renamed_4[0] = sprnhd8.cfr_renamed_4[0] ^ cfr_renamed_0[n];
        sprnhd7.cfr_renamed_3640(sprnhd7.cfr_renamed_4[0], arg2, arg3);
        sprnhd7.cfr_renamed_3640(sprnhd7.cfr_renamed_4[1], arg2, arg3 + 4);
        sprnhd7.cfr_renamed_3640(sprnhd7.cfr_renamed_4[2], arg2, arg3 + 8);
        sprnhd7.cfr_renamed_3640(sprnhd7.cfr_renamed_4[3], arg2, arg3 + 12);
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpzz.cfr_renamed_9("z2Q6Q2Z");
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprnhd sprnhd2 = this;
        sprnhd2.cfr_renamed_4[0] = this.cfr_renamed_3641((byte[])arg0, (int)arg1);
        sprnhd sprnhd3 = this;
        sprnhd2.cfr_renamed_4[1] = sprnhd3.cfr_renamed_3641((byte[])arg0, (int)(arg1 + 4));
        sprnhd3.cfr_renamed_4[2] = this.cfr_renamed_3641((byte[])arg0, (int)(arg1 + 8));
        sprnhd2.cfr_renamed_4[3] = this.cfr_renamed_3641((byte[])arg0, (int)(arg1 + 12));
        int n4 = n3 = 0;
        while (n4 < 16) {
            sprnhd sprnhd4 = this;
            sprnhd4.cfr_renamed_4[0] = sprnhd4.cfr_renamed_4[0] ^ cfr_renamed_0[n3];
            sprnhd sprnhd5 = this;
            sprnhd5.cfr_renamed_3643(sprnhd4.cfr_renamed_4, sprnhd5.cfr_renamed_119);
            sprnhd4.cfr_renamed_3644(sprnhd4.cfr_renamed_4);
            sprnhd4.cfr_renamed_3645(sprnhd4.cfr_renamed_4);
            sprnhd4.cfr_renamed_3642(sprnhd4.cfr_renamed_4);
            n4 = ++n3;
        }
        sprnhd sprnhd6 = this;
        sprnhd6.cfr_renamed_4[0] = sprnhd6.cfr_renamed_4[0] ^ cfr_renamed_0[n3];
        sprnhd sprnhd7 = this;
        sprnhd7.cfr_renamed_3643(sprnhd6.cfr_renamed_4, sprnhd7.cfr_renamed_119);
        sprnhd6.cfr_renamed_3640(sprnhd6.cfr_renamed_4[0], (byte[])arg2, (int)arg3);
        sprnhd6.cfr_renamed_3640(sprnhd6.cfr_renamed_4[1], (byte[])arg2, (int)(arg3 + 4));
        sprnhd6.cfr_renamed_3640(sprnhd6.cfr_renamed_4[2], (byte[])arg2, (int)(arg3 + 8));
        sprnhd6.cfr_renamed_3640(sprnhd6.cfr_renamed_4[3], (byte[])arg2, (int)(arg3 + 12));
        return 16;
    }

    static {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        cfr_renamed_112 = nArray;
        int[] nArray2 = new int[17];
        nArray2[0] = 128;
        nArray2[1] = 27;
        nArray2[2] = 54;
        nArray2[3] = 108;
        nArray2[4] = 216;
        nArray2[5] = 171;
        nArray2[6] = 77;
        nArray2[7] = 154;
        nArray2[8] = 47;
        nArray2[9] = 94;
        nArray2[10] = 188;
        nArray2[11] = 99;
        nArray2[12] = 198;
        nArray2[13] = 151;
        nArray2[14] = 53;
        nArray2[15] = 106;
        nArray2[16] = 212;
        cfr_renamed_0 = nArray2;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrvy.cfr_renamed_9("{|ds~{v2bs`s\u007fwfw`2bsaawv2f}2\\}wyw}|2{|{f2?2")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_1 = true;
        sprnld sprnld2 = (sprnld)arg1;
        this.cfr_renamed_2402(sprnld2.cfr_renamed_1521());
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        sprnhd sprnhd2 = this;
        sprnhd2.cfr_renamed_119[0] = this.cfr_renamed_3641(arg0, 0);
        sprnhd sprnhd3 = this;
        sprnhd2.cfr_renamed_119[1] = sprnhd3.cfr_renamed_3641(arg0, 4);
        sprnhd3.cfr_renamed_119[2] = this.cfr_renamed_3641(arg0, 8);
        sprnhd2.cfr_renamed_119[3] = this.cfr_renamed_3641(arg0, 12);
    }

    private /* synthetic */ int cfr_renamed_3608(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    public sprnhd() {
        sprnhd sprnhd2 = this;
        sprnhd sprnhd3 = this;
        sprnhd3.cfr_renamed_4 = new int[4];
        sprnhd3.cfr_renamed_119 = new int[4];
        sprnhd2.cfr_renamed_2 = new int[4];
        sprnhd2.cfr_renamed_1 = false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3644(int[] nArray) {
        void arg0;
        nArray[1] = this.cfr_renamed_3608(nArray[1], 1);
        nArray[2] = this.cfr_renamed_3608(nArray[2], 5);
        void v0 = arg0;
        v0[3] = this.cfr_renamed_3608((int)v0[3], 2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3643(int[] nArray, int[] nArray2) {
        int n;
        int n2;
        void arg0;
        void v0 = arg0;
        int[] nArray3 = nArray;
        int n3 = n2 = nArray[0] ^ v0[2];
        n2 = n3 ^ (this.cfr_renamed_3608(n2, 8) ^ this.cfr_renamed_3608(n3, 24));
        nArray3[1] = nArray3[1] ^ n2;
        v0[3] = v0[3] ^ n2;
        int n4 = n = 0;
        while (n4 < 4) {
            void arg1;
            void v4 = arg0;
            int n5 = n;
            int n6 = v4[n5] ^ arg1[n];
            v4[n5] = n6;
            n4 = ++n;
        }
        void v7 = arg0;
        void v8 = arg0;
        int n7 = n2 = v7[1] ^ v8[3];
        n2 = n7 ^ (this.cfr_renamed_3608(n2, 8) ^ this.cfr_renamed_3608(n7, 24));
        v8[0] = v8[0] ^ n2;
        v7[2] = v7[2] ^ n2;
    }

    private /* synthetic */ void cfr_renamed_3645(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int[] nArray3 = arg0;
        arg0[1] = arg0[1] ^ ~arg0[3] & ~arg0[2];
        nArray3[0] = nArray3[0] ^ arg0[2] & arg0[1];
        int n = arg0[3];
        nArray[3] = arg0[0];
        arg0[0] = n;
        nArray2[2] = nArray2[2] ^ (arg0[0] ^ arg0[1] ^ arg0[3]);
        nArray[1] = nArray[1] ^ ~arg0[3] & ~arg0[2];
        nArray2[0] = nArray2[0] ^ arg0[2] & arg0[1];
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (!this.cfr_renamed_1) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprpzz.cfr_renamed_9("}Z2@}]3])]<X4G8P")).toString());
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprjkd(sprrvy.cfr_renamed_9("{|bgf2pgttw`2f}}2az}`f"));
        }
        if (arg3 + 16 > arg2.length) {
            throw new spreid(sprpzz.cfr_renamed_9("[(@-A)\u0014?A;R8F}@2[}G5[/@"));
        }
        if (this.cfr_renamed_3) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }
}

