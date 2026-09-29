/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfyf;
import com.spire.presentation.packages.spryag;

public class sprzbg {
    private static int cfr_renamed_152 = 16;
    private final int cfr_renamed_112;
    private final int cfr_renamed_119;
    private final sprfyf cfr_renamed_91;
    private final int cfr_renamed_0;
    private static final int cfr_renamed_1 = 64;
    private final spryag cfr_renamed_2;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_6115(short[] arg0, short[] arg1, short[] arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = 43691;
        int n12 = 36409;
        int n13 = 61167;
        sprzbg sprzbg2 = this;
        int[] nArray = new int[sprzbg2.cfr_renamed_3];
        int[] nArray2 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray3 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray4 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray5 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray6 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray7 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray8 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray9 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray10 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray11 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray12 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray13 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray14 = new int[sprzbg2.cfr_renamed_3];
        int[] nArray15 = new int[sprzbg2.cfr_renamed_4];
        int[] nArray16 = new int[sprzbg2.cfr_renamed_4];
        int[] nArray17 = new int[sprzbg2.cfr_renamed_4];
        int[] nArray18 = new int[sprzbg2.cfr_renamed_4];
        int[] nArray19 = new int[sprzbg2.cfr_renamed_4];
        int[] nArray20 = new int[sprzbg2.cfr_renamed_4];
        int[] nArray21 = new int[sprzbg2.cfr_renamed_4];
        short[] sArray = arg2;
        int n14 = n10 = 0;
        while (n14 < this.cfr_renamed_3) {
            n9 = arg0[n10];
            n8 = arg0[n10 + this.cfr_renamed_3];
            n7 = arg0[n10 + this.cfr_renamed_3 * 2];
            n6 = arg0[n10 + this.cfr_renamed_3 * 3];
            n5 = n9 + n7;
            n4 = n8 + n6;
            n3 = n5 + n4;
            n2 = n5 - n4;
            nArray3[n10] = n3;
            nArray4[n10] = n2;
            n5 = (short)((n9 << 2) + n7 << 1);
            n4 = (short)((n8 << 2) + n6);
            n3 = (short)(n5 + n4);
            n2 = (short)(n5 - n4);
            nArray5[n10] = n3;
            nArray6[n10] = n2;
            nArray2[n10] = n5 = (int)((short)((n6 << 3) + (n7 << 2) + (n8 << 1) + n9));
            nArray7[n10] = n9;
            nArray[n10++] = n6;
            n14 = n10;
        }
        int n15 = n10 = 0;
        while (n15 < this.cfr_renamed_3) {
            n9 = arg1[n10];
            n8 = arg1[n10 + this.cfr_renamed_3];
            n7 = arg1[n10 + this.cfr_renamed_3 * 2];
            n6 = arg1[n10 + this.cfr_renamed_3 * 3];
            n5 = n9 + n7;
            n4 = n8 + n6;
            n3 = n5 + n4;
            n2 = n5 - n4;
            nArray10[n10] = n3;
            nArray11[n10] = n2;
            n5 = (n9 << 2) + n7 << 1;
            n4 = (n8 << 2) + n6;
            n3 = n5 + n4;
            n2 = n5 - n4;
            nArray12[n10] = n3;
            nArray13[n10] = n2;
            nArray9[n10] = n5 = (n6 << 3) + (n7 << 2) + (n8 << 1) + n9;
            nArray14[n10] = n9;
            nArray8[n10++] = n6;
            n15 = n10;
        }
        sprzbg sprzbg3 = this;
        sprzbg sprzbg4 = this;
        sprzbg sprzbg5 = this;
        sprzbg5.cfr_renamed_6116(nArray, nArray8, nArray15);
        sprzbg5.cfr_renamed_6116(nArray2, nArray9, nArray16);
        sprzbg4.cfr_renamed_6116(nArray3, nArray10, nArray17);
        sprzbg4.cfr_renamed_6116(nArray4, nArray11, nArray18);
        sprzbg3.cfr_renamed_6116(nArray5, nArray12, nArray19);
        sprzbg3.cfr_renamed_6116(nArray6, nArray13, nArray20);
        this.cfr_renamed_6116(nArray7, nArray14, nArray21);
        int n16 = n = 0;
        while (n16 < this.cfr_renamed_4) {
            n9 = nArray15[n];
            n8 = nArray16[n];
            n7 = nArray17[n];
            n6 = nArray18[n];
            n5 = nArray19[n];
            n4 = nArray20[n];
            n3 = nArray21[n];
            n8 += n5;
            n4 -= n5;
            n6 = (n6 & 0xFFFF) - (n7 & 0xFFFF) >>> 1;
            n5 -= n9;
            n5 -= n3 << 6;
            n5 = (n5 << 1) + n4;
            n8 = n8 - ((n7 += n6) << 6) - n7;
            n7 -= n3;
            n5 = ((n5 & 0xFFFF) - (n7 << 3)) * n11 >> 3;
            n4 += (n8 += 45 * (n7 -= n9));
            n8 = ((n8 & 0xFFFF) + ((n6 & 0xFFFF) << 4)) * n12 >> 1;
            n6 = -(n6 + n8);
            n4 = (30 * (n8 & 0xFFFF) - (n4 & 0xFFFF)) * n13 >> 2;
            n7 -= n5;
            n8 -= n4;
            short[] sArray2 = sArray;
            short[] sArray3 = sArray;
            int n17 = n;
            short[] sArray4 = sArray;
            short[] sArray5 = sArray;
            short[] sArray6 = sArray;
            int n18 = n;
            short[] sArray7 = sArray;
            int n19 = n;
            sArray[n19] = (short)(sArray[n19] + (n3 & 0xFFFF));
            int n20 = n18 + 64;
            sArray7[n20] = (short)(sArray7[n20] + (n4 & 0xFFFF));
            int n21 = n18 + 128;
            sArray5[n21] = (short)(sArray5[n21] + (n5 & 0xFFFF));
            int n22 = n + 192;
            sArray6[n22] = (short)(sArray6[n22] + (n6 & 0xFFFF));
            int n23 = n17 + 256;
            sArray4[n23] = (short)(sArray4[n23] + (n7 & 0xFFFF));
            int n24 = n17 + 320;
            sArray2[n24] = (short)(sArray2[n24] + (n8 & 0xFFFF));
            int n25 = n + 384;
            sArray3[n25] = (short)(sArray3[n25] + (n9 & 0xFFFF));
            n16 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_6117(short[] arg0, short[] arg1, short[] arg2) {
        int n;
        short[] sArray = new short[2 * this.cfr_renamed_0];
        sprzbg sprzbg2 = this;
        sprzbg2.cfr_renamed_6115(arg0, arg1, sArray);
        int n2 = n = sprzbg2.cfr_renamed_0;
        while (n2 < 2 * this.cfr_renamed_0) {
            int n3 = n - this.cfr_renamed_0;
            short s = (short)(arg2[n3] + (sArray[n - this.cfr_renamed_0] - sArray[n]));
            arg2[n3] = s;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_6118(short[] arg0, byte[] arg1, int arg2) {
        block7: {
            int n;
            int[] nArray;
            int[] nArray2;
            block8: {
                int n2;
                block6: {
                    int n3;
                    nArray2 = new int[4];
                    nArray = new int[4];
                    if (this.cfr_renamed_91.cfr_renamed_6112() != 6) break block6;
                    int n4 = n3 = 0;
                    while (n4 < this.cfr_renamed_0 / 4) {
                        int n5;
                        int n6 = (int)this.cfr_renamed_6119(arg1, arg2 + 3 * n3, 3);
                        int n7 = 0;
                        int n8 = n5 = 0;
                        while (n8 < 3) {
                            int n9 = n6 >> n5;
                            n7 += n9 & 0x249249;
                            n8 = ++n5;
                        }
                        nArray2[0] = n7 & 7;
                        nArray[0] = n7 >>> 3 & 7;
                        nArray2[1] = n7 >>> 6 & 7;
                        nArray[1] = n7 >>> 9 & 7;
                        nArray2[2] = n7 >>> 12 & 7;
                        nArray[2] = n7 >>> 15 & 7;
                        nArray2[3] = n7 >>> 18 & 7;
                        nArray[3] = n7 >>> 21;
                        short[] sArray = arg0;
                        arg0[4 * n3 + 0] = (short)(nArray2[0] - nArray[0]);
                        sArray[4 * n3 + 1] = (short)(nArray2[1] - nArray[1]);
                        arg0[4 * n3 + 2] = (short)(nArray2[2] - nArray[2]);
                        int n10 = 4 * n3 + 3;
                        sArray[n10] = (short)(nArray2[3] - nArray[3]);
                        n4 = ++n3;
                    }
                    break block7;
                }
                if (this.cfr_renamed_91.cfr_renamed_6112() != 8) break block8;
                int n11 = n2 = 0;
                while (n11 < this.cfr_renamed_0 / 4) {
                    int n12;
                    int n13 = (int)this.cfr_renamed_6119(arg1, arg2 + 4 * n2, 4);
                    int n14 = 0;
                    int n15 = n12 = 0;
                    while (n15 < 4) {
                        int n16 = n13 >>> n12;
                        n14 += n16 & 0x11111111;
                        n15 = ++n12;
                    }
                    nArray2[0] = n14 & 0xF;
                    nArray[0] = n14 >>> 4 & 0xF;
                    nArray2[1] = n14 >>> 8 & 0xF;
                    nArray[1] = n14 >>> 12 & 0xF;
                    nArray2[2] = n14 >>> 16 & 0xF;
                    nArray[2] = n14 >>> 20 & 0xF;
                    nArray2[3] = n14 >>> 24 & 0xF;
                    nArray[3] = n14 >>> 28;
                    short[] sArray = arg0;
                    arg0[4 * n2 + 0] = (short)(nArray2[0] - nArray[0]);
                    sArray[4 * n2 + 1] = (short)(nArray2[1] - nArray[1]);
                    arg0[4 * n2 + 2] = (short)(nArray2[2] - nArray[2]);
                    int n17 = 4 * n2 + 3;
                    sArray[n17] = (short)(nArray2[3] - nArray[3]);
                    n11 = ++n2;
                }
                break block7;
            }
            if (this.cfr_renamed_91.cfr_renamed_6112() != 10) break block7;
            int n18 = n = 0;
            while (n18 < this.cfr_renamed_0 / 4) {
                int n19;
                long l = this.cfr_renamed_6119(arg1, arg2 + 5 * n, 5);
                long l2 = 0L;
                int n20 = n19 = 0;
                while (n20 < 5) {
                    long l3 = l >>> n19;
                    l2 += l3 & 0x842108421L;
                    n20 = ++n19;
                }
                nArray2[0] = (int)(l2 & 0x1FL);
                nArray[0] = (int)(l2 >>> 5 & 0x1FL);
                nArray2[1] = (int)(l2 >>> 10 & 0x1FL);
                nArray[1] = (int)(l2 >>> 15 & 0x1FL);
                nArray2[2] = (int)(l2 >>> 20 & 0x1FL);
                nArray[2] = (int)(l2 >>> 25 & 0x1FL);
                nArray2[3] = (int)(l2 >>> 30 & 0x1FL);
                nArray[3] = (int)(l2 >>> 35);
                short[] sArray = arg0;
                arg0[4 * n + 0] = (short)(nArray2[0] - nArray[0]);
                sArray[4 * n + 1] = (short)(nArray2[1] - nArray[1]);
                arg0[4 * n + 2] = (short)(nArray2[2] - nArray[2]);
                int n21 = 4 * n + 3;
                sArray[n21] = (short)(nArray2[3] - nArray[3]);
                n18 = ++n;
            }
        }
    }

    public void cfr_renamed_6106(short[][][] arg0, short[][] arg1, short[][] arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_112) {
                if (arg3 == 1) {
                    this.cfr_renamed_6117(arg0[n3][n], arg1[n3], arg2[n]);
                } else {
                    this.cfr_renamed_6117(arg0[n][n3], arg1[n3], arg2[n]);
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6104(short[][][] sArray, byte[] byArray) {
        int n;
        void arg1;
        sprzbg sprzbg2 = this;
        byte[] byArray2 = new byte[this.cfr_renamed_112 * sprzbg2.cfr_renamed_91.cfr_renamed_6114()];
        sprzbg2.cfr_renamed_91.cfr_renamed_82.cfr_renamed_6091(byArray2, (byte[])arg1, this.cfr_renamed_91.cfr_renamed_6108(), byArray2.length);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            void arg0;
            this.cfr_renamed_2.cfr_renamed_6084(byArray2, n * this.cfr_renamed_91.cfr_renamed_6114(), (short[][])arg0[n++]);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzbg(sprfyf sprfyf2) {
        void arg0;
        sprzbg sprzbg2 = this;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_112 = this.cfr_renamed_91.cfr_renamed_6077();
        this.cfr_renamed_0 = arg0.cfr_renamed_6076();
        this.cfr_renamed_119 = this.cfr_renamed_0 << 1;
        this.cfr_renamed_3 = this.cfr_renamed_0 >> 2;
        sprzbg2.cfr_renamed_4 = 2 * this.cfr_renamed_3 - 1;
        sprzbg2.cfr_renamed_2 = sprfyf2.cfr_renamed_6110();
    }

    private /* synthetic */ short cfr_renamed_6120(int arg0, int arg1) {
        return (short)(arg0 * arg1);
    }

    private /* synthetic */ long cfr_renamed_6119(byte[] arg0, int arg1, int arg2) {
        int n;
        long l = arg0[arg1 + 0] & 0xFF;
        int n2 = n = 1;
        while (n2 < arg2) {
            long l2 = arg0[arg1 + n] & 0xFF;
            int n3 = 8 * n;
            l |= l2 << n3;
            n2 = ++n;
        }
        return l;
    }

    private /* synthetic */ void cfr_renamed_6116(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int[] nArray = new int[31];
        int[] nArray2 = new int[31];
        int[] nArray3 = new int[31];
        int[] nArray4 = new int[63];
        int n2 = n = 0;
        while (n2 < 16) {
            int n3;
            int n4 = arg0[n];
            int n5 = arg0[n + 16];
            int n6 = arg0[n + 32];
            int n7 = arg0[n + 48];
            int n8 = n3 = 0;
            while (n8 < 16) {
                int n9 = arg1[n3];
                int n10 = arg1[n3 + 16];
                int n11 = n;
                arg2[n11 + n3 + 0] = arg2[n + n3 + 0] + this.cfr_renamed_6120(n4, n9);
                arg2[n11 + n3 + 32] = arg2[n + n3 + 32] + this.cfr_renamed_6120(n5, n10);
                int n12 = n9 + n10;
                int n13 = n4 + n5;
                nArray[n + n3] = (int)((long)nArray[n + n3] + (long)n12 * (long)n13);
                n12 = arg1[n3 + 32];
                n13 = arg1[n3 + 48];
                int n14 = n;
                arg2[n14 + n3 + 64] = arg2[n + n3 + 64] + this.cfr_renamed_6120(n12, n6);
                arg2[n14 + n3 + 96] = arg2[n + n3 + 96] + this.cfr_renamed_6120(n13, n7);
                int n15 = n6 + n7;
                int n16 = n12 + n13;
                nArray3[n + n3] = nArray3[n + n3] + this.cfr_renamed_6120(n15, n16);
                n9 += n12;
                n12 = n4 + n6;
                nArray4[n + n3 + 0] = nArray4[n + n3 + 0] + this.cfr_renamed_6120(n9, n12);
                n10 += n13;
                n13 = n5 + n7;
                nArray4[n + n3 + 32] = nArray4[n + n3 + 32] + this.cfr_renamed_6120(n10, n13);
                nArray2[n + ++n3] = nArray2[n + n3] + this.cfr_renamed_6120(n9 += n10, n12 += n13);
                n8 = n3;
            }
            n2 = ++n;
        }
        int n17 = n = 0;
        while (n17 < 31) {
            int n18 = n;
            nArray2[n18] = nArray2[n] - nArray4[n + 0] - nArray4[n + 32];
            nArray[n18] = nArray[n] - arg2[n + 0] - arg2[n + 32];
            int n19 = nArray3[n] - arg2[n + 64] - arg2[n + 96];
            nArray3[n18] = n19;
            n17 = ++n;
        }
        int n20 = n = 0;
        while (n20 < 31) {
            nArray4[n + 16] = nArray4[n + 16] + nArray2[n];
            arg2[n + 16] = arg2[n + 16] + nArray[n];
            int n21 = n + 80;
            int n22 = arg2[n + 80] + nArray3[n];
            arg2[n21] = n22;
            n20 = ++n;
        }
        int n23 = n = 0;
        while (n23 < 63) {
            nArray4[++n] = nArray4[n] - arg2[n] - arg2[n + 64];
            n23 = n;
        }
        int n24 = n = 0;
        while (n24 < 63) {
            arg2[++n + 32] = arg2[n + 32] + nArray4[n];
            n24 = n;
        }
    }

    public void cfr_renamed_6102(short[][] arg0, short[][] arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            this.cfr_renamed_6117(arg0[n], arg1[n++], arg2);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6105(short[][] sArray, byte[] byArray) {
        int n;
        void arg1;
        sprzbg sprzbg2 = this;
        byte[] byArray2 = new byte[this.cfr_renamed_112 * sprzbg2.cfr_renamed_91.cfr_renamed_6109()];
        sprzbg2.cfr_renamed_91.cfr_renamed_82.cfr_renamed_6091(byArray2, (byte[])arg1, this.cfr_renamed_91.cfr_renamed_6111(), byArray2.length);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            void arg0;
            if (!this.cfr_renamed_91.cfr_renamed_96) {
                this.cfr_renamed_6118((short[])arg0[n], byArray2, n * this.cfr_renamed_91.cfr_renamed_6109());
            } else {
                int n3;
                int n4 = n3 = 0;
                while (n4 < this.cfr_renamed_0 / 4) {
                    void v3 = arg0;
                    int n5 = n;
                    arg0[n][4 * n3] = (short)((byArray2[n3 + n * this.cfr_renamed_91.cfr_renamed_6109()] & 3 ^ 2) - 2);
                    arg0[n5][4 * n3 + 1] = (short)((byArray2[n3 + n * this.cfr_renamed_91.cfr_renamed_6109()] >>> 2 & 3 ^ 2) - 2);
                    v3[n5][4 * n3 + 2] = (short)((byArray2[n3 + n * this.cfr_renamed_91.cfr_renamed_6109()] >>> 4 & 3 ^ 2) - 2);
                    int n6 = 4 * n3 + 3;
                    short s = (short)((byArray2[n3 + n * this.cfr_renamed_91.cfr_renamed_6109()] >>> 6 & 3 ^ 2) - 2);
                    v3[n][n6] = s;
                    n4 = ++n3;
                }
            }
            n2 = ++n;
        }
    }
}

