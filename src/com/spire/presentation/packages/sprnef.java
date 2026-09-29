/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhye;
import com.spire.presentation.packages.sprlcf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtaf;
import com.spire.presentation.packages.sprtea;
import java.security.SecureRandom;

@sprtea
public class sprnef {
    public static final int cfr_renamed_953 = 5224;
    private static final int cfr_renamed_133 = 3;
    private static final int cfr_renamed_185 = 1024;
    private static final int spr\ufe34 = 32;
    private static int cfr_renamed_82;
    private static final int cfr_renamed_126 = 19;
    private static final int cfr_renamed_88 = 29;
    private static final int cfr_renamed_31 = 13632409;
    private static final int cfr_renamed_272 = 32;
    private static final int cfr_renamed_145 = 524287;
    private static final int cfr_renamed_114 = 554;
    private static final int cfr_renamed_96 = 554;
    private static final int cfr_renamed_105 = 554;
    private static final int cfr_renamed_137 = 1048575;
    private static final int cfr_renamed_79 = 108;
    private static int cfr_renamed_107;
    private static final int cfr_renamed_132 = 554;
    public static final int cfr_renamed_102 = 2592;
    private static final int cfr_renamed_93 = 4;
    private static final int cfr_renamed_86 = 32;
    private static final int cfr_renamed_152 = 8;
    private static final int cfr_renamed_112 = 25;
    private static final int cfr_renamed_119 = 22;
    private static final int cfr_renamed_91 = 32;
    private static final int cfr_renamed_0 = 343576577;
    private static final int cfr_renamed_1 = 30;
    public static final int cfr_renamed_2 = 14880;
    private static final long cfr_renamed_3 = 2205847551L;
    private static final int cfr_renamed_4 = 40;

    public static void cfr_renamed_5563(int[] arg0, short[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = 0;
        short s = 0;
        short[] sArray = new short[1024];
        byte[] byArray = new byte[168];
        short s2 = s;
        s = (short)(s2 + 1);
        sprtaf.cfr_renamed_5564(byArray, 0, 168, s2, arg2, arg3, 32);
        sproze.cfr_renamed_528(sArray, (short)0);
        int n3 = n = 0;
        while (n3 < 25) {
            if (n2 > 165) {
                short s3 = s;
                s = (short)(s3 + 1);
                sprtaf.cfr_renamed_5564(byArray, 0, 168, s3, arg2, arg3, 32);
                n2 = 0;
            }
            int n4 = byArray[n2] << 8 | byArray[n2 + 1] & 0xFF;
            if (sArray[n4 &= 0x3FF] == 0) {
                int[] nArray;
                if ((byArray[n2 + 2] & 1) == 1) {
                    nArray = arg0;
                    sArray[n4] = -1;
                } else {
                    sArray[n4] = 1;
                    nArray = arg0;
                }
                nArray[n] = n4;
                arg1[n++] = sArray[n4];
            }
            n2 += 3;
            n3 = n;
        }
    }

    private static /* synthetic */ boolean cfr_renamed_5582(int[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = 1024;
        int[] nArray = new int[1024];
        int n4 = n = 0;
        while (n4 < 1024) {
            int n5 = n++;
            nArray[n5] = sprnef.cfr_renamed_5567(arg0[arg1 + n5]);
            n4 = n;
        }
        int n6 = n = 0;
        while (n6 < 25) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3 - 1) {
                int[] nArray2 = nArray;
                int[] nArray3 = nArray;
                int n9 = nArray2[n7];
                int n10 = nArray3[n7 + 1];
                int n11 = n10 - n9 >> 31;
                int n12 = n10 & n11 | n9 & ~n11;
                nArray2[n7 + 1] = n9 & n11 | n10 & ~n11;
                nArray3[n7++] = n12;
                n8 = n7;
            }
            n2 += nArray[--n3];
            n6 = ++n;
        }
        return n2 > arg2;
    }

    private static /* synthetic */ boolean cfr_renamed_5583(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 1024) {
            if (arg0[n] < -523733 || arg0[n] > 523733) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    @sprtea
    public static void cfr_renamed_5584(byte[] arg0, int arg1, byte[] arg2, int arg3, int[] arg4) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 640) {
            int n4 = n;
            int n5 = n;
            int n6 = n;
            sprnef.cfr_renamed_5550(arg0, n, 0, arg4[n2] & 0xFFFFF | arg4[n2 + 1] << 20);
            sprnef.cfr_renamed_5550(arg0, n6, 1, arg4[n2 + 1] >>> 12 & 0xFF | (arg4[n2 + 2] & 0xFFFFF) << 8 | arg4[n2 + 3] << 28);
            sprnef.cfr_renamed_5550(arg0, n6, 2, arg4[n2 + 3] >>> 4 & 0xFFFF | arg4[n2 + 4] << 16);
            sprnef.cfr_renamed_5550(arg0, n, 3, arg4[n2 + 4] >>> 16 & 0xF | (arg4[n2 + 5] & 0xFFFFF) << 4 | arg4[n2 + 6] << 24);
            sprnef.cfr_renamed_5550(arg0, n5, 4, arg4[n2 + 6] >>> 8 & 0xFFF | arg4[n2 + 7] << 12);
            sprnef.cfr_renamed_5550(arg0, n5, 5, arg4[n2 + 8] & 0xFFFFF | arg4[n2 + 9] << 20);
            sprnef.cfr_renamed_5550(arg0, n, 6, arg4[n2 + 9] >>> 12 & 0xFF | (arg4[n2 + 10] & 0xFFFFF) << 8 | arg4[n2 + 11] << 28);
            sprnef.cfr_renamed_5550(arg0, n4, 7, arg4[n2 + 11] >>> 4 & 0xFFFF | arg4[n2 + 12] << 16);
            sprnef.cfr_renamed_5550(arg0, n4, 8, arg4[n2 + 12] >>> 16 & 0xF | (arg4[n2 + 13] & 0xFFFFF) << 4 | arg4[n2 + 14] << 24);
            int n7 = arg4[n2 + 14] >>> 8 & 0xFFF;
            int n8 = arg4[n2 + 15];
            n2 += 16;
            sprnef.cfr_renamed_5550(arg0, n, 9, n7 | n8 << 12);
            n3 = n += 10;
        }
        System.arraycopy(arg2, arg3, arg0, arg1 + 2560, 32);
    }

    @sprtea
    public static void cfr_renamed_5585(byte[] arg0, int[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 3712) {
            int n4 = n;
            int n5 = n;
            int n6 = n;
            int n7 = n;
            int n8 = n;
            int n9 = n;
            int n10 = n;
            int n11 = n;
            int n12 = n;
            sprnef.cfr_renamed_5550(arg0, n, 0, arg1[n2] | arg1[n2 + 1] << 29);
            sprnef.cfr_renamed_5550(arg0, n, 1, arg1[n2 + 1] >> 3 | arg1[n2 + 2] << 26);
            sprnef.cfr_renamed_5550(arg0, n12, 2, arg1[n2 + 2] >> 6 | arg1[n2 + 3] << 23);
            sprnef.cfr_renamed_5550(arg0, n12, 3, arg1[n2 + 3] >> 9 | arg1[n2 + 4] << 20);
            sprnef.cfr_renamed_5550(arg0, n, 4, arg1[n2 + 4] >> 12 | arg1[n2 + 5] << 17);
            sprnef.cfr_renamed_5550(arg0, n11, 5, arg1[n2 + 5] >> 15 | arg1[n2 + 6] << 14);
            sprnef.cfr_renamed_5550(arg0, n11, 6, arg1[n2 + 6] >> 18 | arg1[n2 + 7] << 11);
            sprnef.cfr_renamed_5550(arg0, n, 7, arg1[n2 + 7] >> 21 | arg1[n2 + 8] << 8);
            sprnef.cfr_renamed_5550(arg0, n10, 8, arg1[n2 + 8] >> 24 | arg1[n2 + 9] << 5);
            sprnef.cfr_renamed_5550(arg0, n10, 9, arg1[n2 + 9] >> 27 | arg1[n2 + 10] << 2 | arg1[n2 + 11] << 31);
            sprnef.cfr_renamed_5550(arg0, n, 10, arg1[n2 + 11] >> 1 | arg1[n2 + 12] << 28);
            sprnef.cfr_renamed_5550(arg0, n9, 11, arg1[n2 + 12] >> 4 | arg1[n2 + 13] << 25);
            sprnef.cfr_renamed_5550(arg0, n9, 12, arg1[n2 + 13] >> 7 | arg1[n2 + 14] << 22);
            sprnef.cfr_renamed_5550(arg0, n, 13, arg1[n2 + 14] >> 10 | arg1[n2 + 15] << 19);
            sprnef.cfr_renamed_5550(arg0, n8, 14, arg1[n2 + 15] >> 13 | arg1[n2 + 16] << 16);
            sprnef.cfr_renamed_5550(arg0, n8, 15, arg1[n2 + 16] >> 16 | arg1[n2 + 17] << 13);
            sprnef.cfr_renamed_5550(arg0, n, 16, arg1[n2 + 17] >> 19 | arg1[n2 + 18] << 10);
            sprnef.cfr_renamed_5550(arg0, n7, 17, arg1[n2 + 18] >> 22 | arg1[n2 + 19] << 7);
            sprnef.cfr_renamed_5550(arg0, n7, 18, arg1[n2 + 19] >> 25 | arg1[n2 + 20] << 4);
            sprnef.cfr_renamed_5550(arg0, n, 19, arg1[n2 + 20] >> 28 | arg1[n2 + 21] << 1 | arg1[n2 + 22] << 30);
            sprnef.cfr_renamed_5550(arg0, n6, 20, arg1[n2 + 22] >> 2 | arg1[n2 + 23] << 27);
            sprnef.cfr_renamed_5550(arg0, n6, 21, arg1[n2 + 23] >> 5 | arg1[n2 + 24] << 24);
            sprnef.cfr_renamed_5550(arg0, n, 22, arg1[n2 + 24] >> 8 | arg1[n2 + 25] << 21);
            sprnef.cfr_renamed_5550(arg0, n5, 23, arg1[n2 + 25] >> 11 | arg1[n2 + 26] << 18);
            sprnef.cfr_renamed_5550(arg0, n5, 24, arg1[n2 + 26] >> 14 | arg1[n2 + 27] << 15);
            sprnef.cfr_renamed_5550(arg0, n, 25, arg1[n2 + 27] >> 17 | arg1[n2 + 28] << 12);
            sprnef.cfr_renamed_5550(arg0, n4, 26, arg1[n2 + 28] >> 20 | arg1[n2 + 29] << 9);
            sprnef.cfr_renamed_5550(arg0, n4, 27, arg1[n2 + 29] >> 23 | arg1[n2 + 30] << 6);
            int n13 = arg1[n2 + 30] >> 26;
            int n14 = arg1[n2 + 31];
            n2 += 32;
            sprnef.cfr_renamed_5550(arg0, n, 28, n13 | n14 << 3);
            n3 = n += 29;
        }
        System.arraycopy(arg2, arg3, arg0, 14848, 32);
    }

    public static int cfr_renamed_5549(byte[] arg0, byte[] arg1, SecureRandom arg2) {
        int n;
        int n2 = 0;
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[224];
        int[] nArray = new int[1024];
        int[] nArray2 = new int[4096];
        int[] nArray3 = new int[4096];
        int[] nArray4 = new int[4096];
        int[] nArray5 = new int[1024];
        arg2.nextBytes(byArray);
        sprtaf.cfr_renamed_5586(byArray2, 0, 224, byArray, 0, 32);
        int n3 = n = 0;
        while (n3 < 4) {
            do {
                sprlcf.cfr_renamed_5587(++n2, byArray2, n * 32, nArray2, n * 1024);
            } while (sprnef.cfr_renamed_5582(nArray2, n * 1024, 554));
            n3 = ++n;
        }
        do {
            sprlcf.cfr_renamed_5587(++n2, byArray2, 128, nArray, 0);
        } while (sprnef.cfr_renamed_5582(nArray, 0, 554));
        sprhye.cfr_renamed_5588(nArray3, byArray2, 160);
        sprhye.cfr_renamed_5589(nArray5, nArray);
        int n4 = n = 0;
        while (n4 < 4) {
            int n5 = n;
            sprhye.cfr_renamed_5590(nArray4, n5 * 1024, nArray3, n * 1024, nArray5);
            sprhye.cfr_renamed_5591(nArray4, n5 * 1024, nArray4, n * 1024, nArray2, n++ * 1024);
            n4 = n;
        }
        sprnef.cfr_renamed_5585(arg0, nArray4, byArray2, 160);
        sprnef.cfr_renamed_5592(arg1, nArray, nArray2, byArray2, 160, arg0);
        return 0;
    }

    private static /* synthetic */ boolean cfr_renamed_5593(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 1024) {
            int n4 = sprnef.cfr_renamed_5567(arg0[n]);
            n2 |= 523733 - n4;
            n3 = ++n;
        }
        return n2 >>> 31 != 0;
    }

    public static int cfr_renamed_5543(byte[] arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, SecureRandom arg5) {
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[32];
        byte[] byArray3 = new byte[144];
        int[] nArray = new int[25];
        short[] sArray = new short[25];
        int[] nArray2 = new int[1024];
        int[] nArray3 = new int[1024];
        int[] nArray4 = new int[1024];
        int[] nArray5 = new int[1024];
        int[] nArray6 = new int[4096];
        int[] nArray7 = new int[4096];
        int[] nArray8 = new int[4096];
        int n = 0;
        boolean bl = false;
        System.arraycopy(arg4, 5152, byArray3, 0, 32);
        byte[] byArray4 = new byte[32];
        arg5.nextBytes(byArray4);
        System.arraycopy(byArray4, 0, byArray3, 32, 32);
        sprtaf.cfr_renamed_5586(byArray3, 64, 40, arg1, 0, arg3);
        sprtaf.cfr_renamed_5586(byArray2, 0, 32, byArray3, 0, byArray3.length - 40);
        System.arraycopy(arg4, 5184, byArray3, byArray3.length - 40, 40);
        int[] nArray9 = nArray2;
        sprhye.cfr_renamed_5588(nArray8, arg4, 5120);
        while (true) {
            boolean bl2;
            block5: {
                int n2;
                sprnef.cfr_renamed_5594(nArray9, byArray2, 0, ++n);
                sprhye.cfr_renamed_5589(nArray3, nArray2);
                int n3 = n2 = 0;
                while (n3 < 4) {
                    sprhye.cfr_renamed_5590(nArray6, n2 * 1024, nArray8, n2++ * 1024, nArray3);
                    n3 = n2;
                }
                sprnef.cfr_renamed_5595(byArray, 0, nArray6, byArray3, 64);
                sprnef.cfr_renamed_5563(nArray, sArray, byArray, 0);
                sprhye.cfr_renamed_5596(nArray4, 0, arg4, 0, nArray, sArray);
                sprhye.cfr_renamed_5597(nArray5, nArray2, nArray4);
                if (sprnef.cfr_renamed_5593(nArray5)) {
                    nArray9 = nArray2;
                    continue;
                }
                int n4 = n2 = 0;
                while (n4 < 4) {
                    sprhye.cfr_renamed_5596(nArray7, n2 * 1024, arg4, 1024 * (n2 + 1), nArray, sArray);
                    sprhye.cfr_renamed_5598(nArray6, n2 * 1024, nArray6, n2 * 1024, nArray7, n2 * 1024);
                    bl = sprnef.cfr_renamed_5599(nArray6, n2 * 1024);
                    if (bl) {
                        bl2 = bl;
                        break block5;
                    }
                    n4 = ++n2;
                }
                bl2 = bl;
            }
            if (!bl2) break;
            nArray9 = nArray2;
        }
        sprnef.cfr_renamed_5584(arg0, 0, byArray, 0, nArray5);
        return 0;
    }

    public static int cfr_renamed_5539(byte[] arg0, byte[] arg1, int arg2, int arg3, byte[] arg4) {
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[32];
        byte[] byArray3 = new byte[32];
        byte[] byArray4 = new byte[80];
        int[] nArray = new int[25];
        short[] sArray = new short[25];
        int[] nArray2 = new int[4096];
        int[] nArray3 = new int[4096];
        int[] nArray4 = new int[4096];
        int[] nArray5 = new int[4096];
        int[] nArray6 = new int[1024];
        int[] nArray7 = new int[1024];
        int n = 0;
        if (arg3 != 2592) {
            return -1;
        }
        sprnef.cfr_renamed_5600(byArray, nArray6, arg1, arg2);
        if (sprnef.cfr_renamed_5583(nArray6)) {
            return -2;
        }
        sprnef.cfr_renamed_5580(nArray2, byArray3, 0, arg4);
        sprtaf.cfr_renamed_5586(byArray4, 0, 40, arg0, 0, arg0.length);
        sprtaf.cfr_renamed_5586(byArray4, 40, 40, arg4, 0, 14848);
        sprhye.cfr_renamed_5588(nArray4, byArray3, 0);
        sprnef.cfr_renamed_5563(nArray, sArray, byArray, 0);
        sprhye.cfr_renamed_5589(nArray7, nArray6);
        int n2 = n = 0;
        while (n2 < 4) {
            sprhye.cfr_renamed_5601(nArray5, n * 1024, nArray2, n * 1024, nArray, sArray);
            sprhye.cfr_renamed_5590(nArray3, n * 1024, nArray4, n * 1024, nArray7);
            sprhye.cfr_renamed_5602(nArray3, n * 1024, nArray3, n * 1024, nArray5, n++ * 1024);
            n2 = n;
        }
        sprnef.cfr_renamed_5595(byArray2, 0, nArray3, byArray4, 0);
        if (!sprnef.cfr_renamed_5562(byArray, 0, byArray2, 0, 32)) {
            return -3;
        }
        return 0;
    }

    @sprtea
    public static void cfr_renamed_5600(byte[] arg0, int[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 1024) {
            int n4 = sprnef.cfr_renamed_5552(arg2, n2, 0);
            int n5 = sprnef.cfr_renamed_5552(arg2, n2, 1);
            int n6 = sprnef.cfr_renamed_5552(arg2, n2, 2);
            int n7 = sprnef.cfr_renamed_5552(arg2, n2, 3);
            int n8 = sprnef.cfr_renamed_5552(arg2, n2, 4);
            int n9 = sprnef.cfr_renamed_5552(arg2, n2, 5);
            int n10 = sprnef.cfr_renamed_5552(arg2, n2, 6);
            int n11 = sprnef.cfr_renamed_5552(arg2, n2, 7);
            int n12 = sprnef.cfr_renamed_5552(arg2, n2, 8);
            int n13 = sprnef.cfr_renamed_5552(arg2, n2, 9);
            int n14 = n;
            int n15 = n;
            int n16 = n;
            int n17 = n;
            int n18 = n;
            arg1[n] = n4 << 12 >> 12;
            arg1[n18 + 1] = n4 >>> 20 | n5 << 24 >> 12;
            arg1[n18 + 2] = n5 << 4 >> 12;
            arg1[n + 3] = n5 >>> 28 | n6 << 16 >> 12;
            arg1[n17 + 4] = n6 >>> 16 | n7 << 28 >> 12;
            arg1[n17 + 5] = n7 << 8 >> 12;
            arg1[n + 6] = n7 >>> 24 | n8 << 20 >> 12;
            arg1[n16 + 7] = n8 >> 12;
            arg1[n16 + 8] = n9 << 12 >> 12;
            arg1[n + 9] = n9 >>> 20 | n10 << 24 >> 12;
            arg1[n15 + 10] = n10 << 4 >> 12;
            arg1[n15 + 11] = n10 >>> 28 | n11 << 16 >> 12;
            arg1[n + 12] = n11 >>> 16 | n12 << 28 >> 12;
            arg1[n14 + 13] = n12 << 8 >> 12;
            arg1[n14 + 14] = n12 >>> 24 | n13 << 20 >> 12;
            n2 += 10;
            arg1[n + 15] = n13 >> 12;
            n3 = n += 16;
        }
        System.arraycopy(arg2, arg3 + 2560, arg0, 0, 32);
    }

    private static /* synthetic */ void cfr_renamed_5595(byte[] arg0, int arg1, int[] arg2, byte[] arg3, int arg4) {
        int n;
        byte[] byArray = new byte[4176];
        int n2 = n = 0;
        while (n2 < 4) {
            int n3;
            int n4 = n * 1024;
            int n5 = n3 = 0;
            while (n5 < 1024) {
                int n6 = arg2[n4];
                int n7 = 171788288 - n6 >> 31;
                n6 = n6 - 343576577 & n7 | n6 & ~n7;
                int n8 = n6 & 0x3FFFFF;
                n7 = 0x200000 - n8 >> 31;
                n8 = n8 - 0x400000 & n7 | n8 & ~n7;
                byArray[n4++] = (byte)(n6 - n8 >> 22);
                n5 = ++n3;
            }
            n2 = ++n;
        }
        System.arraycopy(arg3, arg4, byArray, 4096, 80);
        sprtaf.cfr_renamed_5586(arg0, arg1, 32, byArray, 0, byArray.length);
    }

    public static /* synthetic */ int cfr_renamed_5551(byte[] arg0, int arg1, int arg2) {
        return sprnef.cfr_renamed_5552(arg0, arg1, arg2);
    }

    @sprtea
    public static void cfr_renamed_5580(int[] arg0, byte[] arg1, int arg2, byte[] arg3) {
        int n;
        int n2 = 0;
        byte[] byArray = arg3;
        int n3 = 0x1FFFFFFF;
        int n4 = n = 0;
        while (n4 < 4096) {
            int n5 = n;
            int n6 = n;
            int n7 = n;
            int n8 = n;
            int n9 = n;
            int n10 = n;
            int n11 = n;
            int n12 = n;
            int n13 = n;
            int n14 = n;
            arg0[n] = sprnef.cfr_renamed_5552(byArray, n2, 0) & n3;
            arg0[n + 1] = (sprnef.cfr_renamed_5552(byArray, n2, 0) >>> 29 | sprnef.cfr_renamed_5552(byArray, n2, 1) << 3) & n3;
            arg0[n14 + 2] = (sprnef.cfr_renamed_5552(byArray, n2, 1) >>> 26 | sprnef.cfr_renamed_5552(byArray, n2, 2) << 6) & n3;
            arg0[n14 + 3] = (sprnef.cfr_renamed_5552(byArray, n2, 2) >>> 23 | sprnef.cfr_renamed_5552(byArray, n2, 3) << 9) & n3;
            arg0[n + 4] = (sprnef.cfr_renamed_5552(byArray, n2, 3) >>> 20 | sprnef.cfr_renamed_5552(byArray, n2, 4) << 12) & n3;
            arg0[n13 + 5] = (sprnef.cfr_renamed_5552(byArray, n2, 4) >>> 17 | sprnef.cfr_renamed_5552(byArray, n2, 5) << 15) & n3;
            arg0[n13 + 6] = (sprnef.cfr_renamed_5552(byArray, n2, 5) >>> 14 | sprnef.cfr_renamed_5552(byArray, n2, 6) << 18) & n3;
            arg0[n + 7] = (sprnef.cfr_renamed_5552(byArray, n2, 6) >>> 11 | sprnef.cfr_renamed_5552(byArray, n2, 7) << 21) & n3;
            arg0[n12 + 8] = (sprnef.cfr_renamed_5552(byArray, n2, 7) >>> 8 | sprnef.cfr_renamed_5552(byArray, n2, 8) << 24) & n3;
            arg0[n12 + 9] = (sprnef.cfr_renamed_5552(byArray, n2, 8) >>> 5 | sprnef.cfr_renamed_5552(byArray, n2, 9) << 27) & n3;
            arg0[n + 10] = sprnef.cfr_renamed_5552(byArray, n2, 9) >>> 2 & n3;
            arg0[n11 + 11] = (sprnef.cfr_renamed_5552(byArray, n2, 9) >>> 31 | sprnef.cfr_renamed_5552(byArray, n2, 10) << 1) & n3;
            arg0[n11 + 12] = (sprnef.cfr_renamed_5552(byArray, n2, 10) >>> 28 | sprnef.cfr_renamed_5552(byArray, n2, 11) << 4) & n3;
            arg0[n + 13] = (sprnef.cfr_renamed_5552(byArray, n2, 11) >>> 25 | sprnef.cfr_renamed_5552(byArray, n2, 12) << 7) & n3;
            arg0[n10 + 14] = (sprnef.cfr_renamed_5552(byArray, n2, 12) >>> 22 | sprnef.cfr_renamed_5552(byArray, n2, 13) << 10) & n3;
            arg0[n10 + 15] = (sprnef.cfr_renamed_5552(byArray, n2, 13) >>> 19 | sprnef.cfr_renamed_5552(byArray, n2, 14) << 13) & n3;
            arg0[n + 16] = (sprnef.cfr_renamed_5552(byArray, n2, 14) >>> 16 | sprnef.cfr_renamed_5552(byArray, n2, 15) << 16) & n3;
            arg0[n9 + 17] = (sprnef.cfr_renamed_5552(byArray, n2, 15) >>> 13 | sprnef.cfr_renamed_5552(byArray, n2, 16) << 19) & n3;
            arg0[n9 + 18] = (sprnef.cfr_renamed_5552(byArray, n2, 16) >>> 10 | sprnef.cfr_renamed_5552(byArray, n2, 17) << 22) & n3;
            arg0[n + 19] = (sprnef.cfr_renamed_5552(byArray, n2, 17) >>> 7 | sprnef.cfr_renamed_5552(byArray, n2, 18) << 25) & n3;
            arg0[n8 + 20] = (sprnef.cfr_renamed_5552(byArray, n2, 18) >>> 4 | sprnef.cfr_renamed_5552(byArray, n2, 19) << 28) & n3;
            arg0[n8 + 21] = sprnef.cfr_renamed_5552(byArray, n2, 19) >>> 1 & n3;
            arg0[n + 22] = (sprnef.cfr_renamed_5552(byArray, n2, 19) >>> 30 | sprnef.cfr_renamed_5552(byArray, n2, 20) << 2) & n3;
            arg0[n7 + 23] = (sprnef.cfr_renamed_5552(byArray, n2, 20) >>> 27 | sprnef.cfr_renamed_5552(byArray, n2, 21) << 5) & n3;
            arg0[n7 + 24] = (sprnef.cfr_renamed_5552(byArray, n2, 21) >>> 24 | sprnef.cfr_renamed_5552(byArray, n2, 22) << 8) & n3;
            arg0[n + 25] = (sprnef.cfr_renamed_5552(byArray, n2, 22) >>> 21 | sprnef.cfr_renamed_5552(byArray, n2, 23) << 11) & n3;
            arg0[n6 + 26] = (sprnef.cfr_renamed_5552(byArray, n2, 23) >>> 18 | sprnef.cfr_renamed_5552(byArray, n2, 24) << 14) & n3;
            arg0[n6 + 27] = (sprnef.cfr_renamed_5552(byArray, n2, 24) >>> 15 | sprnef.cfr_renamed_5552(byArray, n2, 25) << 17) & n3;
            arg0[n + 28] = (sprnef.cfr_renamed_5552(byArray, n2, 25) >>> 12 | sprnef.cfr_renamed_5552(byArray, n2, 26) << 20) & n3;
            arg0[n5 + 29] = (sprnef.cfr_renamed_5552(byArray, n2, 26) >>> 9 | sprnef.cfr_renamed_5552(byArray, n2, 27) << 23) & n3;
            arg0[n5 + 30] = (sprnef.cfr_renamed_5552(byArray, n2, 27) >>> 6 | sprnef.cfr_renamed_5552(byArray, n2, 28) << 26) & n3;
            int n15 = sprnef.cfr_renamed_5552(byArray, n2, 28) >>> 3;
            n2 += 29;
            arg0[n + 31] = n15;
            n4 = n += 32;
        }
        System.arraycopy(arg3, 14848, arg1, arg2, 32);
    }

    public static boolean cfr_renamed_5599(int[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 1024) {
            int n3 = arg0[arg1 + n];
            int n4 = 171788288 - n3 >> 31;
            int n5 = n3 - 343576577 & n4 | n3 & ~n4;
            int n6 = ~(sprnef.cfr_renamed_5567(n5) - 171787734) >>> 31;
            int n7 = n5;
            n5 = n5 + 0x200000 - 1 >> 22;
            int n8 = ~(sprnef.cfr_renamed_5567(n5 = n7 - (n5 << 22)) - 2096598) >>> 31;
            if ((n6 | n8) == 1) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    private static /* synthetic */ void cfr_renamed_5550(byte[] arg0, int arg1, int arg2, int arg3) {
        sprpxe.cfr_renamed_437(arg3, arg0, arg1 + arg2 << 2);
    }

    private static /* synthetic */ int cfr_renamed_5552(byte[] arg0, int arg1, int arg2) {
        return sprpxe.cfr_renamed_439(arg0, arg1 + arg2 << 2);
    }

    static {
        cfr_renamed_107 = 56;
        cfr_renamed_82 = 3;
    }

    private static /* synthetic */ int cfr_renamed_5567(int arg0) {
        int n = arg0 >> 31;
        return (n ^ arg0) - n;
    }

    public static boolean cfr_renamed_5562(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg1 + arg4 <= arg0.length && arg3 + arg4 <= arg2.length) {
            int n;
            int n2 = n = 0;
            while (n2 < arg4) {
                if (arg0[arg1 + n] != arg2[arg3 + n]) {
                    return false;
                }
                n2 = ++n;
            }
            return true;
        }
        return false;
    }

    public static void cfr_renamed_5594(int[] arg0, byte[] arg1, int arg2, int arg3) {
        short s;
        int n = 0;
        int n2 = 0;
        int n3 = 1024;
        byte[] byArray = new byte[1024 * cfr_renamed_82 + 1];
        int n4 = cfr_renamed_82;
        short s2 = s = (short)(arg3 << 8);
        s = (short)(s2 + 1);
        sprtaf.cfr_renamed_5564(byArray, 0, 1024 * n4, s2, arg1, arg2, 32);
        int n5 = n;
        while (n5 < 1024) {
            if (n2 >= n3 * n4) {
                n3 = cfr_renamed_107;
                short s3 = s;
                s = (short)(s3 + 1);
                sprtaf.cfr_renamed_5564(byArray, 0, 1024 * n4, s3, arg1, arg2, 32);
                n2 = 0;
            }
            int n6 = n;
            int[] nArray = arg0;
            arg0[n] = sprnef.cfr_renamed_5603(byArray, n2) & 0xFFFFF;
            nArray[n6] = nArray[n6] - 524287;
            if (arg0[n6] != 524288) {
                // empty if block
            }
            n2 += n4;
            n5 = ++n;
        }
    }

    @sprtea
    public static void cfr_renamed_5592(byte[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, byte[] arg5) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 1024) {
            int n5 = n3 + n;
            byte by = (byte)arg1[n];
            arg0[n5] = by;
            n4 = ++n;
        }
        n3 += 1024;
        int n6 = n2 = 0;
        while (n6 < 4) {
            int n7 = n = 0;
            while (n7 < 1024) {
                int n8 = n3 + (n2 * 1024 + n);
                byte by = (byte)arg2[n2 * 1024 + n];
                arg0[n8] = by;
                n7 = ++n;
            }
            n6 = ++n2;
        }
        System.arraycopy(arg3, arg4, arg0, n3 += 4096, 64);
        int n9 = n3 += 64;
        n3 += 40;
        sprtaf.cfr_renamed_5586(arg0, n9, 40, arg5, 0, 14848);
    }

    public static int cfr_renamed_5603(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = n2;
        n3 = n;
        n3 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16;
        return n3;
    }
}

