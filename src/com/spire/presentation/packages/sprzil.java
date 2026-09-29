/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctc;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprzil
implements sprpl {
    private long cfr_renamed_82;
    private int cfr_renamed_126;
    private long cfr_renamed_88;
    private int cfr_renamed_31;
    private int cfr_renamed_272;
    private static final long[] cfr_renamed_145;
    private long cfr_renamed_114;
    private long[] cfr_renamed_96;
    private static final byte[][] cfr_renamed_105;
    private boolean cfr_renamed_137;
    private int cfr_renamed_79;
    private static final int cfr_renamed_107 = 128;
    private byte[] cfr_renamed_132;
    private int cfr_renamed_102;
    private long cfr_renamed_93;
    private long[] cfr_renamed_86;
    private int cfr_renamed_152;
    private static int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private final spriil cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private long cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    static {
        long[] lArray = new long[8];
        lArray[0] = 7640891576956012808L;
        lArray[1] = -4942790177534073029L;
        lArray[2] = 4354685564936845355L;
        lArray[3] = -6534734903238641935L;
        lArray[4] = 5840696475078001361L;
        lArray[5] = -7276294671716946913L;
        lArray[6] = 2270897969802886507L;
        lArray[7] = 6620516959819538809L;
        cfr_renamed_145 = lArray;
        byte[][] byArrayArray = new byte[12][];
        byte[] byArray = new byte[16];
        byArray[0] = 0;
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 3;
        byArray[4] = 4;
        byArray[5] = 5;
        byArray[6] = 6;
        byArray[7] = 7;
        byArray[8] = 8;
        byArray[9] = 9;
        byArray[10] = 10;
        byArray[11] = 11;
        byArray[12] = 12;
        byArray[13] = 13;
        byArray[14] = 14;
        byArray[15] = 15;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[16];
        byArray2[0] = 14;
        byArray2[1] = 10;
        byArray2[2] = 4;
        byArray2[3] = 8;
        byArray2[4] = 9;
        byArray2[5] = 15;
        byArray2[6] = 13;
        byArray2[7] = 6;
        byArray2[8] = 1;
        byArray2[9] = 12;
        byArray2[10] = 0;
        byArray2[11] = 2;
        byArray2[12] = 11;
        byArray2[13] = 7;
        byArray2[14] = 5;
        byArray2[15] = 3;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[16];
        byArray3[0] = 11;
        byArray3[1] = 8;
        byArray3[2] = 12;
        byArray3[3] = 0;
        byArray3[4] = 5;
        byArray3[5] = 2;
        byArray3[6] = 15;
        byArray3[7] = 13;
        byArray3[8] = 10;
        byArray3[9] = 14;
        byArray3[10] = 3;
        byArray3[11] = 6;
        byArray3[12] = 7;
        byArray3[13] = 1;
        byArray3[14] = 9;
        byArray3[15] = 4;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[16];
        byArray4[0] = 7;
        byArray4[1] = 9;
        byArray4[2] = 3;
        byArray4[3] = 1;
        byArray4[4] = 13;
        byArray4[5] = 12;
        byArray4[6] = 11;
        byArray4[7] = 14;
        byArray4[8] = 2;
        byArray4[9] = 6;
        byArray4[10] = 5;
        byArray4[11] = 10;
        byArray4[12] = 4;
        byArray4[13] = 0;
        byArray4[14] = 15;
        byArray4[15] = 8;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[16];
        byArray5[0] = 9;
        byArray5[1] = 0;
        byArray5[2] = 5;
        byArray5[3] = 7;
        byArray5[4] = 2;
        byArray5[5] = 4;
        byArray5[6] = 10;
        byArray5[7] = 15;
        byArray5[8] = 14;
        byArray5[9] = 1;
        byArray5[10] = 11;
        byArray5[11] = 12;
        byArray5[12] = 6;
        byArray5[13] = 8;
        byArray5[14] = 3;
        byArray5[15] = 13;
        byArrayArray[4] = byArray5;
        byte[] byArray6 = new byte[16];
        byArray6[0] = 2;
        byArray6[1] = 12;
        byArray6[2] = 6;
        byArray6[3] = 10;
        byArray6[4] = 0;
        byArray6[5] = 11;
        byArray6[6] = 8;
        byArray6[7] = 3;
        byArray6[8] = 4;
        byArray6[9] = 13;
        byArray6[10] = 7;
        byArray6[11] = 5;
        byArray6[12] = 15;
        byArray6[13] = 14;
        byArray6[14] = 1;
        byArray6[15] = 9;
        byArrayArray[5] = byArray6;
        byte[] byArray7 = new byte[16];
        byArray7[0] = 12;
        byArray7[1] = 5;
        byArray7[2] = 1;
        byArray7[3] = 15;
        byArray7[4] = 14;
        byArray7[5] = 13;
        byArray7[6] = 4;
        byArray7[7] = 10;
        byArray7[8] = 0;
        byArray7[9] = 7;
        byArray7[10] = 6;
        byArray7[11] = 3;
        byArray7[12] = 9;
        byArray7[13] = 2;
        byArray7[14] = 8;
        byArray7[15] = 11;
        byArrayArray[6] = byArray7;
        byte[] byArray8 = new byte[16];
        byArray8[0] = 13;
        byArray8[1] = 11;
        byArray8[2] = 7;
        byArray8[3] = 14;
        byArray8[4] = 12;
        byArray8[5] = 1;
        byArray8[6] = 3;
        byArray8[7] = 9;
        byArray8[8] = 5;
        byArray8[9] = 0;
        byArray8[10] = 15;
        byArray8[11] = 4;
        byArray8[12] = 8;
        byArray8[13] = 6;
        byArray8[14] = 2;
        byArray8[15] = 10;
        byArrayArray[7] = byArray8;
        byte[] byArray9 = new byte[16];
        byArray9[0] = 6;
        byArray9[1] = 15;
        byArray9[2] = 14;
        byArray9[3] = 9;
        byArray9[4] = 11;
        byArray9[5] = 3;
        byArray9[6] = 0;
        byArray9[7] = 8;
        byArray9[8] = 12;
        byArray9[9] = 2;
        byArray9[10] = 13;
        byArray9[11] = 7;
        byArray9[12] = 1;
        byArray9[13] = 4;
        byArray9[14] = 10;
        byArray9[15] = 5;
        byArrayArray[8] = byArray9;
        byte[] byArray10 = new byte[16];
        byArray10[0] = 10;
        byArray10[1] = 2;
        byArray10[2] = 8;
        byArray10[3] = 4;
        byArray10[4] = 7;
        byArray10[5] = 6;
        byArray10[6] = 1;
        byArray10[7] = 5;
        byArray10[8] = 15;
        byArray10[9] = 11;
        byArray10[10] = 9;
        byArray10[11] = 14;
        byArray10[12] = 3;
        byArray10[13] = 12;
        byArray10[14] = 13;
        byArray10[15] = 0;
        byArrayArray[9] = byArray10;
        byte[] byArray11 = new byte[16];
        byArray11[0] = 0;
        byArray11[1] = 1;
        byArray11[2] = 2;
        byArray11[3] = 3;
        byArray11[4] = 4;
        byArray11[5] = 5;
        byArray11[6] = 6;
        byArray11[7] = 7;
        byArray11[8] = 8;
        byArray11[9] = 9;
        byArray11[10] = 10;
        byArray11[11] = 11;
        byArray11[12] = 12;
        byArray11[13] = 13;
        byArray11[14] = 14;
        byArray11[15] = 15;
        byArrayArray[10] = byArray11;
        byte[] byArray12 = new byte[16];
        byArray12[0] = 14;
        byArray12[1] = 10;
        byArray12[2] = 4;
        byArray12[3] = 8;
        byArray12[4] = 9;
        byArray12[5] = 15;
        byArray12[6] = 13;
        byArray12[7] = 6;
        byArray12[8] = 1;
        byArray12[9] = 12;
        byArray12[10] = 0;
        byArray12[11] = 2;
        byArray12[12] = 11;
        byArray12[13] = 7;
        byArray12[14] = 5;
        byArray12[15] = 3;
        byArrayArray[11] = byArray12;
        cfr_renamed_105 = byArrayArray;
        cfr_renamed_112 = 12;
    }

    public void cfr_renamed_10561() {
        if (this.cfr_renamed_91 != null) {
            sproze.cfr_renamed_492(this.cfr_renamed_91, (byte)0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzil(byte[] byArray, spriil spriil2) {
        void arg1;
        sprzil sprzil2 = this;
        sprzil sprzil3 = this;
        sprzil sprzil4 = this;
        sprzil sprzil5 = this;
        sprzil sprzil6 = this;
        sprzil sprzil7 = this;
        sprzil sprzil8 = this;
        sprzil sprzil9 = this;
        sprzil sprzil10 = this;
        sprzil sprzil11 = this;
        this.cfr_renamed_272 = 64;
        sprzil11.cfr_renamed_102 = 0;
        sprzil11.cfr_renamed_91 = null;
        sprzil10.cfr_renamed_132 = null;
        sprzil10.cfr_renamed_1 = null;
        sprzil9.cfr_renamed_126 = 1;
        sprzil9.cfr_renamed_79 = 1;
        sprzil8.cfr_renamed_31 = 0;
        sprzil8.cfr_renamed_93 = 0L;
        sprzil7.cfr_renamed_4 = 0;
        sprzil7.cfr_renamed_3 = 0;
        sprzil6.cfr_renamed_137 = 0;
        sprzil6.cfr_renamed_119 = null;
        sprzil5.cfr_renamed_152 = 0;
        sprzil5.cfr_renamed_86 = new long[16];
        sprzil4.cfr_renamed_96 = null;
        sprzil4.cfr_renamed_82 = 0L;
        sprzil3.cfr_renamed_114 = 0L;
        sprzil3.cfr_renamed_88 = 0L;
        sprzil2.cfr_renamed_2 = 0L;
        sprzil2.cfr_renamed_119 = new byte[128];
        if (byArray != null) {
            void arg0;
            this.cfr_renamed_1 = new byte[((void)arg0).length];
            System.arraycopy(arg0, 0, this.cfr_renamed_1, 0, ((void)arg0).length);
            if (((void)arg0).length > 64) {
                throw new IllegalArgumentException(spridc.cfr_renamed_9("a,S:\nw\n\u007f\u001eiK;OiD&^iY<Z9E;^,N"));
            }
            this.cfr_renamed_102 = ((void)arg0).length;
            System.arraycopy(arg0, 0, this.cfr_renamed_119, 0, ((void)arg0).length);
            this.cfr_renamed_152 = 128;
        }
        sprzil sprzil12 = this;
        this.cfr_renamed_0 = arg1;
        sprzil12.cfr_renamed_272 = 64;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprzil12, this.cfr_renamed_272 * 8, (spriil)arg1));
        sprzil12.cfr_renamed_1314();
    }

    private /* synthetic */ void cfr_renamed_10558() {
        System.arraycopy(this.cfr_renamed_96, 0, this.cfr_renamed_86, 0, this.cfr_renamed_96.length);
        sprzil sprzil2 = this;
        System.arraycopy(cfr_renamed_145, 0, sprzil2.cfr_renamed_86, sprzil2.cfr_renamed_96.length, 4);
        sprzil sprzil3 = this;
        sprzil3.cfr_renamed_86[12] = this.cfr_renamed_82 ^ cfr_renamed_145[4];
        sprzil sprzil4 = this;
        sprzil3.cfr_renamed_86[13] = sprzil4.cfr_renamed_114 ^ cfr_renamed_145[5];
        sprzil4.cfr_renamed_86[14] = this.cfr_renamed_88 ^ cfr_renamed_145[6];
        sprzil3.cfr_renamed_86[15] = this.cfr_renamed_2 ^ cfr_renamed_145[7];
    }

    public sprzil(byte[] arg0) {
        this(arg0, spriil.cfr_renamed_0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        if (arg0 == null || arg2 == 0) {
            return;
        }
        int n3 = 0;
        if (this.cfr_renamed_152 != 0) {
            n3 = 128 - this.cfr_renamed_152;
            if (n3 >= arg2) {
                sprzil sprzil2 = this;
                System.arraycopy(arg0, arg1, sprzil2.cfr_renamed_119, sprzil2.cfr_renamed_152, arg2);
                this.cfr_renamed_152 += arg2;
                return;
            }
            sprzil sprzil3 = this;
            System.arraycopy(arg0, arg1, sprzil3.cfr_renamed_119, this.cfr_renamed_152, n3);
            sprzil3.cfr_renamed_82 += 128L;
            if (sprzil3.cfr_renamed_82 == 0L) {
                ++this.cfr_renamed_114;
            }
            sprzil sprzil4 = this;
            sprzil4.cfr_renamed_10559(sprzil4.cfr_renamed_119, 0);
            sprzil4.cfr_renamed_152 = 0;
            sproze.cfr_renamed_492(this.cfr_renamed_119, (byte)0);
            n2 = arg1;
        } else {
            n2 = arg1;
        }
        int n4 = n2 + arg2 - 128;
        int n5 = n = arg1 + n3;
        while (true) {
            if (n5 >= n4) {
                System.arraycopy(arg0, n, this.cfr_renamed_119, 0, arg1 + arg2 - n);
                this.cfr_renamed_152 += arg1 + arg2 - n;
                return;
            }
            sprzil sprzil5 = this;
            sprzil5.cfr_renamed_82 += 128L;
            if (sprzil5.cfr_renamed_82 == 0L) {
                ++this.cfr_renamed_114;
            }
            int n6 = n;
            this.cfr_renamed_10559(arg0, n6);
            n5 = n += 128;
        }
    }

    public sprzil(byte[] arg0, int arg1, byte[] arg2, byte[] arg3) {
        this(arg0, arg1, arg2, arg3, spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzil(sprzil sprzil2) {
        void arg0;
        sprzil sprzil3 = this;
        void v1 = arg0;
        sprzil sprzil4 = this;
        void v3 = arg0;
        sprzil sprzil5 = this;
        void v5 = arg0;
        sprzil sprzil6 = this;
        void v7 = arg0;
        sprzil sprzil7 = this;
        sprzil sprzil8 = this;
        sprzil sprzil9 = this;
        sprzil sprzil10 = this;
        sprzil sprzil11 = this;
        sprzil sprzil12 = this;
        sprzil sprzil13 = this;
        sprzil sprzil14 = this;
        sprzil sprzil15 = this;
        sprzil sprzil16 = this;
        sprzil16.cfr_renamed_272 = 64;
        sprzil16.cfr_renamed_102 = 0;
        sprzil15.cfr_renamed_91 = null;
        sprzil15.cfr_renamed_132 = null;
        sprzil14.cfr_renamed_1 = null;
        sprzil14.cfr_renamed_126 = 1;
        sprzil13.cfr_renamed_79 = 1;
        sprzil13.cfr_renamed_31 = 0;
        sprzil12.cfr_renamed_93 = 0L;
        sprzil12.cfr_renamed_4 = 0;
        sprzil11.cfr_renamed_3 = 0;
        sprzil11.cfr_renamed_137 = false;
        sprzil10.cfr_renamed_119 = null;
        sprzil10.cfr_renamed_152 = 0;
        sprzil9.cfr_renamed_86 = new long[16];
        sprzil9.cfr_renamed_96 = null;
        sprzil8.cfr_renamed_82 = 0L;
        sprzil8.cfr_renamed_114 = 0L;
        sprzil7.cfr_renamed_88 = 0L;
        sprzil7.cfr_renamed_2 = 0L;
        this.cfr_renamed_152 = v7.cfr_renamed_152;
        sprzil6.cfr_renamed_119 = sproze.cfr_renamed_158(v7.cfr_renamed_119);
        sprzil6.cfr_renamed_102 = arg0.cfr_renamed_102;
        this.cfr_renamed_1 = sproze.cfr_renamed_158(v5.cfr_renamed_1);
        sprzil5.cfr_renamed_272 = v5.cfr_renamed_272;
        sprzil5.cfr_renamed_96 = sproze.cfr_renamed_520(arg0.cfr_renamed_96);
        this.cfr_renamed_132 = sproze.cfr_renamed_158(v3.cfr_renamed_132);
        sprzil4.cfr_renamed_91 = sproze.cfr_renamed_158(v3.cfr_renamed_91);
        sprzil4.cfr_renamed_82 = arg0.cfr_renamed_82;
        this.cfr_renamed_114 = v1.cfr_renamed_114;
        sprzil3.cfr_renamed_88 = v1.cfr_renamed_88;
        sprzil3.cfr_renamed_0 = sprzil2.cfr_renamed_0;
    }

    public sprzil(int arg0) {
        this(arg0, spriil.cfr_renamed_0);
    }

    private /* synthetic */ void cfr_renamed_10562(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5) {
        sprzil sprzil2 = this;
        int n = arg2;
        sprzil2.cfr_renamed_86[n] = sprzil2.cfr_renamed_86[n] + this.cfr_renamed_86[arg3] + arg0;
        sprzil sprzil3 = this;
        sprzil2.cfr_renamed_86[arg5] = sprtwe.cfr_renamed_5186(sprzil3.cfr_renamed_86[arg5] ^ this.cfr_renamed_86[arg2], 32);
        int n2 = arg4;
        sprzil3.cfr_renamed_86[n2] = this.cfr_renamed_86[n2] + this.cfr_renamed_86[arg5];
        int n3 = arg3;
        sprzil2.cfr_renamed_86[n3] = sprtwe.cfr_renamed_5186(this.cfr_renamed_86[n3] ^ this.cfr_renamed_86[arg4], 24);
        int n4 = arg2;
        sprzil2.cfr_renamed_86[n4] = this.cfr_renamed_86[n4] + this.cfr_renamed_86[arg3] + arg1;
        int n5 = arg5;
        sprzil2.cfr_renamed_86[n5] = sprtwe.cfr_renamed_5186(this.cfr_renamed_86[n5] ^ this.cfr_renamed_86[arg2], 16);
        int n6 = arg4;
        sprzil2.cfr_renamed_86[n6] = this.cfr_renamed_86[n6] + this.cfr_renamed_86[arg5];
        int n7 = arg3;
        sprzil2.cfr_renamed_86[n7] = sprtwe.cfr_renamed_5186(this.cfr_renamed_86[n7] ^ this.cfr_renamed_86[arg4], 63);
    }

    /*
     * WARNING - void declaration
     */
    public sprzil(byte[] byArray, byte[] byArray2) {
        void arg1;
        void v0 = arg1;
        sprzil sprzil2 = this;
        void v2 = arg1;
        sprzil sprzil3 = this;
        sprzil sprzil4 = this;
        sprzil sprzil5 = this;
        sprzil sprzil6 = this;
        sprzil sprzil7 = this;
        sprzil sprzil8 = this;
        sprzil sprzil9 = this;
        sprzil sprzil10 = this;
        sprzil sprzil11 = this;
        sprzil sprzil12 = this;
        sprzil sprzil13 = this;
        this.cfr_renamed_272 = 64;
        sprzil13.cfr_renamed_102 = 0;
        sprzil13.cfr_renamed_91 = null;
        sprzil12.cfr_renamed_132 = null;
        sprzil12.cfr_renamed_1 = null;
        sprzil11.cfr_renamed_126 = 1;
        sprzil11.cfr_renamed_79 = 1;
        sprzil10.cfr_renamed_31 = 0;
        sprzil10.cfr_renamed_93 = 0L;
        sprzil9.cfr_renamed_4 = 0;
        sprzil9.cfr_renamed_3 = 0;
        sprzil8.cfr_renamed_137 = 0;
        sprzil8.cfr_renamed_119 = null;
        sprzil7.cfr_renamed_152 = 0;
        sprzil7.cfr_renamed_86 = new long[16];
        sprzil6.cfr_renamed_96 = null;
        sprzil6.cfr_renamed_82 = 0L;
        sprzil5.cfr_renamed_114 = 0L;
        sprzil5.cfr_renamed_88 = 0L;
        sprzil4.cfr_renamed_2 = 0L;
        sprzil4.cfr_renamed_119 = new byte[128];
        sprzil4.cfr_renamed_0 = spriil.cfr_renamed_0;
        sprzil3.cfr_renamed_272 = arg1[0];
        sprzil3.cfr_renamed_102 = arg1[1];
        this.cfr_renamed_126 = v2[2];
        sprzil2.cfr_renamed_79 = v2[3];
        sprzil2.cfr_renamed_31 = sprpxe.cfr_renamed_439((byte[])v0, 4);
        this.cfr_renamed_93 |= (long)sprpxe.cfr_renamed_439((byte[])arg1, 8);
        this.cfr_renamed_4 = v0[16];
        this.cfr_renamed_3 = byArray2[17];
        this.cfr_renamed_1314();
    }

    /*
     * WARNING - void declaration
     */
    public sprzil(byte[] byArray, int n, byte[] byArray2, byte[] byArray3, spriil spriil2) {
        void arg0;
        void arg3;
        void arg2;
        void arg1;
        void arg4;
        sprzil sprzil2 = this;
        sprzil sprzil3 = this;
        sprzil sprzil4 = this;
        sprzil sprzil5 = this;
        sprzil sprzil6 = this;
        sprzil sprzil7 = this;
        sprzil sprzil8 = this;
        sprzil sprzil9 = this;
        sprzil sprzil10 = this;
        sprzil sprzil11 = this;
        sprzil sprzil12 = this;
        sprzil12.cfr_renamed_272 = 64;
        sprzil12.cfr_renamed_102 = 0;
        sprzil11.cfr_renamed_91 = null;
        sprzil11.cfr_renamed_132 = null;
        sprzil10.cfr_renamed_1 = null;
        sprzil10.cfr_renamed_126 = 1;
        sprzil9.cfr_renamed_79 = 1;
        sprzil9.cfr_renamed_31 = 0;
        sprzil8.cfr_renamed_93 = 0L;
        sprzil8.cfr_renamed_4 = 0;
        sprzil7.cfr_renamed_3 = 0;
        sprzil7.cfr_renamed_137 = false;
        sprzil6.cfr_renamed_119 = null;
        sprzil6.cfr_renamed_152 = 0;
        sprzil5.cfr_renamed_86 = new long[16];
        sprzil5.cfr_renamed_96 = null;
        sprzil4.cfr_renamed_82 = 0L;
        sprzil4.cfr_renamed_114 = 0L;
        sprzil3.cfr_renamed_88 = 0L;
        sprzil3.cfr_renamed_2 = 0L;
        sprzil2.cfr_renamed_0 = arg4;
        sprzil2.cfr_renamed_119 = new byte[128];
        if (n < 1 || arg1 > 64) {
            throw new IllegalArgumentException(sprctc.cfr_renamed_9("\u0017:(52=:t:=91- ~8;:9 6tv&;%+=,1:n~e~y~bj}"));
        }
        this.cfr_renamed_272 = arg1;
        if (arg2 != null) {
            if (((void)arg2).length != 16) {
                throw new IllegalArgumentException(spridc.cfr_renamed_9(":K%^iF,D.^!\n$_:^iH,\n,R(I=F0\nx\u001ciH0^,Y"));
            }
            this.cfr_renamed_91 = new byte[16];
            System.arraycopy(arg2, 0, this.cfr_renamed_91, 0, ((void)arg2).length);
        }
        if (arg3 != null) {
            if (((void)arg3).length != 16) {
                throw new IllegalArgumentException(sprctc.cfr_renamed_9("$;&-;052=$5*=1:~8;:9 6t3!- ~6;t;,?7*8'tob~6' ;'"));
            }
            this.cfr_renamed_132 = new byte[16];
            System.arraycopy(arg3, 0, this.cfr_renamed_132, 0, ((void)arg3).length);
        }
        if (arg0 != null) {
            this.cfr_renamed_1 = new byte[((void)arg0).length];
            System.arraycopy(arg0, 0, this.cfr_renamed_1, 0, ((void)arg0).length);
            if (((void)arg0).length > 64) {
                throw new IllegalArgumentException(spridc.cfr_renamed_9("a,S:\nw\n\u007f\u001eiK;OiD&^iY<Z9E;^,N"));
            }
            this.cfr_renamed_102 = ((void)arg0).length;
            System.arraycopy(arg0, 0, this.cfr_renamed_119, 0, ((void)arg0).length);
            this.cfr_renamed_152 = 128;
        }
        sprzil sprzil13 = this;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprzil13, (int)(arg1 * 8), (spriil)arg4));
        sprzil13.cfr_renamed_1314();
    }

    private /* synthetic */ void cfr_renamed_1314() {
        if (this.cfr_renamed_96 == null) {
            sprzil sprzil2 = this;
            sprzil2.cfr_renamed_96 = new long[8];
            sprzil sprzil3 = this;
            sprzil2.cfr_renamed_96[0] = cfr_renamed_145[0] ^ (long)(sprzil3.cfr_renamed_272 | sprzil3.cfr_renamed_102 << 8 | (this.cfr_renamed_126 << 16 | this.cfr_renamed_79 << 24 | this.cfr_renamed_31 << 32));
            sprzil2.cfr_renamed_96[1] = cfr_renamed_145[1] ^ this.cfr_renamed_93;
            sprzil sprzil4 = this;
            sprzil2.cfr_renamed_96[2] = cfr_renamed_145[2] ^ (long)(sprzil4.cfr_renamed_4 | sprzil4.cfr_renamed_3 << 8);
            sprzil2.cfr_renamed_96[3] = cfr_renamed_145[3];
            sprzil2.cfr_renamed_96[4] = cfr_renamed_145[4];
            sprzil2.cfr_renamed_96[5] = cfr_renamed_145[5];
            if (sprzil2.cfr_renamed_91 != null) {
                sprzil sprzil5 = this;
                sprzil5.cfr_renamed_96[4] = sprzil5.cfr_renamed_96[4] ^ sprpxe.cfr_renamed_443(this.cfr_renamed_91, 0);
                sprzil5.cfr_renamed_96[5] = sprzil5.cfr_renamed_96[5] ^ sprpxe.cfr_renamed_443(this.cfr_renamed_91, 8);
            }
            sprzil sprzil6 = this;
            sprzil6.cfr_renamed_96[6] = cfr_renamed_145[6];
            sprzil6.cfr_renamed_96[7] = cfr_renamed_145[7];
            if (sprzil6.cfr_renamed_132 != null) {
                sprzil sprzil7 = this;
                sprzil7.cfr_renamed_96[6] = sprzil7.cfr_renamed_96[6] ^ sprpxe.cfr_renamed_443(this.cfr_renamed_132, 0);
                sprzil7.cfr_renamed_96[7] = sprzil7.cfr_renamed_96[7] ^ sprpxe.cfr_renamed_443(this.cfr_renamed_132, 8);
            }
        }
    }

    @Override
    public void cfr_renamed_41() {
        sprzil sprzil2 = this;
        sprzil sprzil3 = this;
        this.cfr_renamed_152 = 0;
        sprzil3.cfr_renamed_88 = 0L;
        sprzil3.cfr_renamed_2 = 0L;
        sprzil2.cfr_renamed_82 = 0L;
        sprzil2.cfr_renamed_114 = 0L;
        this.cfr_renamed_137 = false;
        this.cfr_renamed_96 = null;
        sproze.cfr_renamed_492(this.cfr_renamed_119, (byte)0);
        if (this.cfr_renamed_1 != null) {
            System.arraycopy(this.cfr_renamed_1, 0, this.cfr_renamed_119, 0, this.cfr_renamed_1.length);
            this.cfr_renamed_152 = 128;
        }
        this.cfr_renamed_1314();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        int n = 0;
        n = 128 - this.cfr_renamed_152;
        if (n == 0) {
            sprzil sprzil2 = this;
            sprzil2.cfr_renamed_82 += 128L;
            if (sprzil2.cfr_renamed_82 == 0L) {
                ++this.cfr_renamed_114;
            }
            sprzil sprzil3 = this;
            sprzil3.cfr_renamed_10559(sprzil3.cfr_renamed_119, 0);
            sproze.cfr_renamed_492(sprzil3.cfr_renamed_119, (byte)0);
            sprzil3.cfr_renamed_119[0] = arg0;
            this.cfr_renamed_152 = 1;
            return;
        }
        sprzil sprzil4 = this;
        sprzil4.cfr_renamed_119[sprzil4.cfr_renamed_152] = arg0;
        ++sprzil4.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10559(byte[] byArray, int n) {
        int n2;
        void arg1;
        void arg0;
        this.cfr_renamed_10558();
        long[] lArray = new long[16];
        sprpxe.cfr_renamed_447((byte[])arg0, (int)arg1, lArray);
        int n3 = n2 = 0;
        while (n3 < cfr_renamed_112) {
            sprzil sprzil2 = this;
            sprzil sprzil3 = this;
            sprzil sprzil4 = this;
            sprzil4.cfr_renamed_10562(lArray[cfr_renamed_105[n2][0]], lArray[cfr_renamed_105[n2][1]], 0, 4, 8, 12);
            sprzil4.cfr_renamed_10562(lArray[cfr_renamed_105[n2][2]], lArray[cfr_renamed_105[n2][3]], 1, 5, 9, 13);
            this.cfr_renamed_10562(lArray[cfr_renamed_105[n2][4]], lArray[cfr_renamed_105[n2][5]], 2, 6, 10, 14);
            sprzil3.cfr_renamed_10562(lArray[cfr_renamed_105[n2][6]], lArray[cfr_renamed_105[n2][7]], 3, 7, 11, 15);
            sprzil3.cfr_renamed_10562(lArray[cfr_renamed_105[n2][8]], lArray[cfr_renamed_105[n2][9]], 0, 5, 10, 15);
            this.cfr_renamed_10562(lArray[cfr_renamed_105[n2][10]], lArray[cfr_renamed_105[n2][11]], 1, 6, 11, 12);
            sprzil2.cfr_renamed_10562(lArray[cfr_renamed_105[n2][12]], lArray[cfr_renamed_105[n2][13]], 2, 7, 8, 13);
            long l = lArray[cfr_renamed_105[n2][14]];
            long l2 = lArray[cfr_renamed_105[n2][15]];
            sprzil2.cfr_renamed_10562(l, l2, 3, 4, 9, 14);
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_96.length) {
            sprzil sprzil5 = this;
            int n5 = n2;
            long l = sprzil5.cfr_renamed_96[n5] ^ this.cfr_renamed_86[n2] ^ this.cfr_renamed_86[n2 + 8];
            sprzil5.cfr_renamed_96[n5] = l;
            n4 = ++n2;
        }
    }

    public void cfr_renamed_10556() {
        this.cfr_renamed_137 = true;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        if (arg1 > arg0.length - this.cfr_renamed_272) {
            throw new sprwjl(sprctc.cfr_renamed_9(";+ .!*t<!82;&~ 1;~'6;, "));
        }
        this.cfr_renamed_88 = -1L;
        if (this.cfr_renamed_137) {
            this.cfr_renamed_2 = -1L;
        }
        sprzil sprzil2 = this;
        sprzil2.cfr_renamed_82 += (long)this.cfr_renamed_152;
        if (sprzil2.cfr_renamed_152 > 0 && this.cfr_renamed_82 == 0L) {
            ++this.cfr_renamed_114;
        }
        sprzil sprzil3 = this;
        sprzil3.cfr_renamed_10559(sprzil3.cfr_renamed_119, 0);
        sproze.cfr_renamed_492(sprzil3.cfr_renamed_119, (byte)0);
        sproze.cfr_renamed_516(sprzil3.cfr_renamed_86, 0L);
        int n = sprzil3.cfr_renamed_272 >>> 3;
        int n2 = sprzil3.cfr_renamed_272 & 7;
        sprpxe.cfr_renamed_5181(sprzil3.cfr_renamed_96, 0, n, arg0, arg1);
        if (n2 > 0) {
            byte[] byArray = new byte[8];
            sprpxe.cfr_renamed_444(this.cfr_renamed_96[n], byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1 + this.cfr_renamed_272 - n2, n2);
        }
        sprzil sprzil4 = this;
        sproze.cfr_renamed_516(sprzil4.cfr_renamed_96, 0L);
        sprzil4.cfr_renamed_41();
        return sprzil4.cfr_renamed_272;
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_272;
    }

    @Override
    public String cfr_renamed_1315() {
        return spridc.cfr_renamed_9("h\u0005k\u0002o{H");
    }

    public void cfr_renamed_9997() {
        if (this.cfr_renamed_1 != null) {
            sprzil sprzil2 = this;
            sproze.cfr_renamed_492(sprzil2.cfr_renamed_1, (byte)0);
            sproze.cfr_renamed_492(sprzil2.cfr_renamed_119, (byte)0);
        }
    }

    @Override
    public int cfr_renamed_3248() {
        return 128;
    }

    public sprzil() {
        this(512, spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzil(int n, spriil spriil2) {
        void arg0;
        void arg1;
        sprzil sprzil2 = this;
        sprzil sprzil3 = this;
        sprzil sprzil4 = this;
        sprzil sprzil5 = this;
        sprzil sprzil6 = this;
        sprzil sprzil7 = this;
        sprzil sprzil8 = this;
        sprzil sprzil9 = this;
        sprzil sprzil10 = this;
        sprzil sprzil11 = this;
        this.cfr_renamed_272 = 64;
        sprzil11.cfr_renamed_102 = 0;
        sprzil11.cfr_renamed_91 = null;
        sprzil10.cfr_renamed_132 = null;
        sprzil10.cfr_renamed_1 = null;
        sprzil9.cfr_renamed_126 = 1;
        sprzil9.cfr_renamed_79 = 1;
        sprzil8.cfr_renamed_31 = 0;
        sprzil8.cfr_renamed_93 = 0L;
        sprzil7.cfr_renamed_4 = 0;
        sprzil7.cfr_renamed_3 = 0;
        sprzil6.cfr_renamed_137 = 0;
        sprzil6.cfr_renamed_119 = null;
        sprzil5.cfr_renamed_152 = 0;
        sprzil5.cfr_renamed_86 = new long[16];
        sprzil4.cfr_renamed_96 = null;
        sprzil4.cfr_renamed_82 = 0L;
        sprzil3.cfr_renamed_114 = 0L;
        sprzil3.cfr_renamed_88 = 0L;
        sprzil2.cfr_renamed_2 = 0L;
        sprzil2.cfr_renamed_0 = arg1;
        if (n < 8 || arg0 > 512 || arg0 % 8 != false) {
            throw new IllegalArgumentException(sprctc.cfr_renamed_9("\u001c\u0018\u001f\u001f\u001bf<t:=91- ~67 ~8;:9 6t3!- ~6;t?t3!2 7$21~;8tft?::t0;*t9&;5*1,t*<?:~aof"));
        }
        sprzil sprzil12 = this;
        sprzil12.cfr_renamed_119 = new byte[128];
        sprzil12.cfr_renamed_102 = 0;
        this.cfr_renamed_272 = arg0 / 8;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(this, (int)arg0, (spriil)arg1));
        this.cfr_renamed_1314();
    }
}

