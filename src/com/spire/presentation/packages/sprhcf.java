/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfye;
import com.spire.presentation.packages.sprfze;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtaf;
import com.spire.presentation.packages.sprtea;
import java.security.SecureRandom;

@sprtea
public class sprhcf {
    private static final int cfr_renamed_133 = 901;
    private static final int cfr_renamed_185 = 901;
    private static final int spr\ufe34 = 32;
    public static final int cfr_renamed_82 = 38432;
    private static final int cfr_renamed_126 = 0x1FFFFF;
    private static final int cfr_renamed_88 = 24;
    private static final int cfr_renamed_31 = 0x3FFFFF;
    private static final long cfr_renamed_272 = 5L;
    private static final int cfr_renamed_145 = 901;
    private static int cfr_renamed_114 = 56;
    private static final int cfr_renamed_96 = 32;
    private static final int cfr_renamed_105 = 180;
    private static final int cfr_renamed_137 = 21;
    private static final long cfr_renamed_79 = 587710463L;
    private static int cfr_renamed_107 = 3;
    private static final int cfr_renamed_132 = 32;
    private static final int cfr_renamed_102 = 30;
    public static final int cfr_renamed_93 = 12392;
    private static final int cfr_renamed_86 = 856145921;
    private static final int cfr_renamed_152 = 901;
    private static final int cfr_renamed_112 = 2048;
    private static final int cfr_renamed_119 = 513161157;
    private static final int cfr_renamed_91 = 32;
    private static final int cfr_renamed_0 = 32;
    private static final int cfr_renamed_1 = 5;
    private static final int cfr_renamed_2 = 40;
    private static final int cfr_renamed_3 = 40;
    public static final int cfr_renamed_4 = 5664;

    private static /* synthetic */ void cfr_renamed_5550(byte[] arg0, int arg1, int arg2, int arg3) {
        sprpxe.cfr_renamed_437(arg3, arg0, arg1 * 4 + arg2 * 4);
    }

    public static /* synthetic */ int cfr_renamed_5551(byte[] arg0, int arg1, int arg2) {
        return sprhcf.cfr_renamed_5552(arg0, arg1, arg2);
    }

    public static int cfr_renamed_5549(byte[] arg0, byte[] arg1, SecureRandom arg2) {
        int n;
        int n2 = 0;
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[256];
        long[] lArray = new long[2048];
        long[] lArray2 = new long[10240];
        long[] lArray3 = new long[10240];
        long[] lArray4 = new long[10240];
        long[] lArray5 = new long[2048];
        arg2.nextBytes(byArray);
        sprtaf.cfr_renamed_5553(byArray2, 0, 256, byArray, 0, 32);
        int n3 = n = 0;
        while (n3 < 5) {
            do {
                sprfye.cfr_renamed_5554(++n2, byArray2, n * 32, lArray2, n * 2048);
            } while (sprhcf.cfr_renamed_5555(lArray2, n * 2048, 901));
            n3 = ++n;
        }
        do {
            sprfye.cfr_renamed_5554(++n2, byArray2, 160, lArray, 0);
        } while (sprhcf.cfr_renamed_5555(lArray, 0, 901));
        sprfze.cfr_renamed_5556(lArray3, byArray2, 192);
        sprfze.cfr_renamed_5557(lArray5, lArray);
        int n4 = n = 0;
        while (n4 < 5) {
            int n5 = n;
            sprfze.cfr_renamed_5558(lArray4, n5 * 2048, lArray3, n * 2048, lArray5);
            sprfze.cfr_renamed_5559(lArray4, n5 * 2048, lArray4, n * 2048, lArray2, n++ * 2048);
            n4 = n;
        }
        sprhcf.cfr_renamed_5560(arg0, lArray4, byArray2, 192);
        sprhcf.cfr_renamed_5561(arg1, lArray, lArray2, byArray2, 192, arg0);
        return 0;
    }

    private static /* synthetic */ int cfr_renamed_5552(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3;
        int n4 = arg1 * 4 + arg2 * 4;
        int n5 = n3;
        n5 = n2;
        n5 = n;
        n5 = arg0[n4] & 0xFF | (arg0[++n4] & 0xFF) << 8 | (arg0[++n4] & 0xFF) << 16 | arg0[++n4] << 24;
        return n5;
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

    public static void cfr_renamed_5563(int[] arg0, short[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = 0;
        short s = 0;
        short[] sArray = new short[2048];
        byte[] byArray = new byte[168];
        short s2 = s;
        s = (short)(s2 + 1);
        sprtaf.cfr_renamed_5564(byArray, 0, 168, s2, arg2, arg3, 32);
        sproze.cfr_renamed_528(sArray, (short)0);
        int n3 = n = 0;
        while (n3 < 40) {
            if (n2 > 165) {
                short s3 = s;
                s = (short)(s3 + 1);
                sprtaf.cfr_renamed_5564(byArray, 0, 168, s3, arg2, arg3, 32);
                n2 = 0;
            }
            int n4 = byArray[n2] << 8 | byArray[n2 + 1] & 0xFF;
            if (sArray[n4 &= 0x7FF] == 0) {
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

    @sprtea
    public static void cfr_renamed_5565(byte[] arg0, long[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 2048) {
            int n4 = sprhcf.cfr_renamed_5552(arg2, n2, 0);
            int n5 = sprhcf.cfr_renamed_5552(arg2, n2, 1);
            int n6 = sprhcf.cfr_renamed_5552(arg2, n2, 2);
            int n7 = sprhcf.cfr_renamed_5552(arg2, n2, 3);
            int n8 = sprhcf.cfr_renamed_5552(arg2, n2, 4);
            int n9 = sprhcf.cfr_renamed_5552(arg2, n2, 5);
            int n10 = sprhcf.cfr_renamed_5552(arg2, n2, 6);
            int n11 = sprhcf.cfr_renamed_5552(arg2, n2, 7);
            int n12 = sprhcf.cfr_renamed_5552(arg2, n2, 8);
            int n13 = sprhcf.cfr_renamed_5552(arg2, n2, 9);
            int n14 = sprhcf.cfr_renamed_5552(arg2, n2, 10);
            int n15 = n;
            int n16 = n;
            int n17 = n;
            int n18 = n;
            int n19 = n;
            arg1[n] = n4 << 10 >> 10;
            arg1[n19 + 1] = n4 >>> 22 | n5 << 20 >> 10;
            arg1[n19 + 2] = n5 >>> 12 | n6 << 30 >> 10;
            arg1[n + 3] = n6 << 8 >> 10;
            arg1[n18 + 4] = n6 >>> 24 | n7 << 18 >> 10;
            arg1[n18 + 5] = n7 >>> 14 | n8 << 28 >> 10;
            arg1[n + 6] = n8 << 6 >> 10;
            arg1[n17 + 7] = n8 >>> 26 | n9 << 16 >> 10;
            arg1[n17 + 8] = n9 >>> 16 | n10 << 26 >> 10;
            arg1[n + 9] = n10 << 4 >> 10;
            arg1[n16 + 10] = n10 >>> 28 | n11 << 14 >> 10;
            arg1[n16 + 11] = n11 >>> 18 | n12 << 24 >> 10;
            arg1[n + 12] = n12 << 2 >> 10;
            arg1[n15 + 13] = n12 >>> 30 | n13 << 12 >> 10;
            arg1[n15 + 14] = n13 >>> 20 | n14 << 22 >> 10;
            n2 += 11;
            arg1[n + 15] = n14 >> 10;
            n3 = n += 16;
        }
        System.arraycopy(arg2, arg3 + 5632, arg0, 0, 32);
    }

    @sprtea
    public static void cfr_renamed_5560(byte[] arg0, long[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 9600) {
            int n4 = n;
            int n5 = n;
            int n6 = n;
            int n7 = n;
            int n8 = n;
            sprhcf.cfr_renamed_5550(arg0, n8, 0, (int)(arg1[n2] | arg1[n2 + 1] << 30));
            sprhcf.cfr_renamed_5550(arg0, n8, 1, (int)(arg1[n2 + 1] >> 2 | arg1[n2 + 2] << 28));
            sprhcf.cfr_renamed_5550(arg0, n, 2, (int)(arg1[n2 + 2] >> 4 | arg1[n2 + 3] << 26));
            sprhcf.cfr_renamed_5550(arg0, n7, 3, (int)(arg1[n2 + 3] >> 6 | arg1[n2 + 4] << 24));
            sprhcf.cfr_renamed_5550(arg0, n7, 4, (int)(arg1[n2 + 4] >> 8 | arg1[n2 + 5] << 22));
            sprhcf.cfr_renamed_5550(arg0, n, 5, (int)(arg1[n2 + 5] >> 10 | arg1[n2 + 6] << 20));
            sprhcf.cfr_renamed_5550(arg0, n6, 6, (int)(arg1[n2 + 6] >> 12 | arg1[n2 + 7] << 18));
            sprhcf.cfr_renamed_5550(arg0, n6, 7, (int)(arg1[n2 + 7] >> 14 | arg1[n2 + 8] << 16));
            sprhcf.cfr_renamed_5550(arg0, n, 8, (int)(arg1[n2 + 8] >> 16 | arg1[n2 + 9] << 14));
            sprhcf.cfr_renamed_5550(arg0, n5, 9, (int)(arg1[n2 + 9] >> 18 | arg1[n2 + 10] << 12));
            sprhcf.cfr_renamed_5550(arg0, n5, 10, (int)(arg1[n2 + 10] >> 20 | arg1[n2 + 11] << 10));
            sprhcf.cfr_renamed_5550(arg0, n, 11, (int)(arg1[n2 + 11] >> 22 | arg1[n2 + 12] << 8));
            sprhcf.cfr_renamed_5550(arg0, n4, 12, (int)(arg1[n2 + 12] >> 24 | arg1[n2 + 13] << 6));
            sprhcf.cfr_renamed_5550(arg0, n4, 13, (int)(arg1[n2 + 13] >> 26 | arg1[n2 + 14] << 4));
            long l = arg1[n2 + 14] >> 28;
            long l2 = arg1[n2 + 15] << 2;
            n2 += 16;
            sprhcf.cfr_renamed_5550(arg0, n, 14, (int)(l | l2));
            n3 = n += 15;
        }
        System.arraycopy(arg2, arg3, arg0, 38400, 32);
    }

    @sprtea
    public static void cfr_renamed_5561(byte[] arg0, long[] arg1, long[] arg2, byte[] arg3, int arg4, byte[] arg5) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 2048) {
            int n5 = n3 + n;
            byte by = (byte)arg1[n];
            arg0[n5] = by;
            n4 = ++n;
        }
        n3 += 2048;
        int n6 = n2 = 0;
        while (n6 < 5) {
            int n7 = n = 0;
            while (n7 < 2048) {
                int n8 = n3 + (n2 * 2048 + n);
                byte by = (byte)arg2[n2 * 2048 + n];
                arg0[n8] = by;
                n7 = ++n;
            }
            n6 = ++n2;
        }
        System.arraycopy(arg3, arg4, arg0, n3 += 10240, 64);
        int n9 = n3 += 64;
        n3 += 40;
        sprtaf.cfr_renamed_5553(arg0, n9, 40, arg5, 0, 38400);
    }

    public static boolean cfr_renamed_5566(long[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 2048) {
            int n3 = (int)(428072960L - arg0[arg1 + n]) >> 31;
            int n4 = (int)(arg0[arg1 + n] - 856145921L & (long)n3 | arg0[arg1 + n] & (long)(~n3));
            int n5 = ~(sprhcf.cfr_renamed_5567(n4) - 428072059) >>> 31;
            int n6 = n4;
            n4 = n4 + 0x800000 - 1 >> 24;
            int n7 = ~(sprhcf.cfr_renamed_5567(n4 = n6 - (n4 << 24)) - 8387707) >>> 31;
            if ((n5 | n7) == 1) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static int cfr_renamed_5543(byte[] arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, SecureRandom arg5) {
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[32];
        byte[] byArray3 = new byte[144];
        int[] nArray = new int[40];
        short[] sArray = new short[40];
        long[] lArray = new long[2048];
        long[] lArray2 = new long[2048];
        long[] lArray3 = new long[2048];
        long[] lArray4 = new long[2048];
        long[] lArray5 = new long[10240];
        long[] lArray6 = new long[10240];
        long[] lArray7 = new long[10240];
        int n = 0;
        boolean bl = false;
        System.arraycopy(arg4, 12320, byArray3, 0, 32);
        byte[] byArray4 = new byte[32];
        arg5.nextBytes(byArray4);
        System.arraycopy(byArray4, 0, byArray3, 32, 32);
        sprtaf.cfr_renamed_5553(byArray3, 64, 40, arg1, 0, arg3);
        sprtaf.cfr_renamed_5553(byArray2, 0, 32, byArray3, 0, byArray3.length - 40);
        System.arraycopy(arg4, 12352, byArray3, byArray3.length - 40, 40);
        long[] lArray8 = lArray;
        sprfze.cfr_renamed_5556(lArray7, arg4, 12288);
        while (true) {
            boolean bl2;
            block5: {
                int n2;
                sprhcf.cfr_renamed_5568(lArray8, byArray2, 0, ++n);
                sprfze.cfr_renamed_5557(lArray2, lArray);
                int n3 = n2 = 0;
                while (n3 < 5) {
                    sprfze.cfr_renamed_5558(lArray5, n2 * 2048, lArray7, n2++ * 2048, lArray2);
                    n3 = n2;
                }
                sprhcf.cfr_renamed_5569(byArray, 0, lArray5, byArray3, 64);
                sprhcf.cfr_renamed_5563(nArray, sArray, byArray, 0);
                sprfze.cfr_renamed_5570(lArray3, arg4, nArray, sArray);
                sprfze.cfr_renamed_5571(lArray4, lArray, lArray3);
                if (sprhcf.cfr_renamed_5572(lArray4)) {
                    lArray8 = lArray;
                    continue;
                }
                int n4 = n2 = 0;
                while (n4 < 5) {
                    sprfze.cfr_renamed_5573(lArray6, n2 * 2048, arg4, 2048 * (n2 + 1), nArray, sArray);
                    sprfze.cfr_renamed_5574(lArray5, n2 * 2048, lArray5, n2 * 2048, lArray6, n2 * 2048);
                    bl = sprhcf.cfr_renamed_5566(lArray5, n2 * 2048);
                    if (bl) {
                        bl2 = bl;
                        break block5;
                    }
                    n4 = ++n2;
                }
                bl2 = bl;
            }
            if (!bl2) break;
            lArray8 = lArray;
        }
        sprhcf.cfr_renamed_5575(arg0, 0, byArray, 0, lArray4);
        return 0;
    }

    private static /* synthetic */ void cfr_renamed_5569(byte[] arg0, int arg1, long[] arg2, byte[] arg3, int arg4) {
        int n;
        byte[] byArray = new byte[10320];
        int n2 = n = 0;
        while (n2 < 5) {
            int n3;
            int n4 = n * 2048;
            int n5 = n3 = 0;
            while (n5 < 2048) {
                int n6 = (int)arg2[n4];
                int n7 = 428072960 - n6 >> 31;
                n6 = n6 - 856145921 & n7 | n6 & ~n7;
                int n8 = n6 & 0xFFFFFF;
                n7 = 0x800000 - n8 >> 31;
                n8 = n8 - 0x1000000 & n7 | n8 & ~n7;
                byArray[n4++] = (byte)(n6 - n8 >> 24);
                n5 = ++n3;
            }
            n2 = ++n;
        }
        System.arraycopy(arg3, arg4, byArray, 10240, 80);
        sprtaf.cfr_renamed_5553(arg0, arg1, 32, byArray, 0, byArray.length);
    }

    private static /* synthetic */ long cfr_renamed_5576(long arg0) {
        return (arg0 >> 63 ^ arg0) - (arg0 >> 63);
    }

    private static /* synthetic */ boolean cfr_renamed_5577(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 2048) {
            if (arg0[n] < -2096250L || arg0[n] > 2096250L) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    private static /* synthetic */ int cfr_renamed_5567(int arg0) {
        return (arg0 >> 31 ^ arg0) - (arg0 >> 31);
    }

    public static void cfr_renamed_5568(long[] arg0, byte[] arg1, int arg2, int arg3) {
        short s;
        int n = 0;
        int n2 = 0;
        int n3 = 2048;
        byte[] byArray = new byte[2048 * cfr_renamed_107 + 1];
        int n4 = cfr_renamed_107;
        short s2 = s = (short)(arg3 << 8);
        s = (short)(s2 + 1);
        sprtaf.cfr_renamed_5578(byArray, 0, 2048 * n4, s2, arg1, arg2, 32);
        int n5 = n;
        while (n5 < 2048) {
            if (n2 >= n3 * n4) {
                n3 = cfr_renamed_114;
                short s3 = s;
                s = (short)(s3 + 1);
                sprtaf.cfr_renamed_5578(byArray, 0, 2048 * n4, s3, arg1, arg2, 32);
                n2 = 0;
            }
            int n6 = n;
            long[] lArray = arg0;
            arg0[n] = sprhcf.cfr_renamed_5579(byArray, n2) & 0x3FFFFF;
            lArray[n6] = lArray[n6] - 0x1FFFFFL;
            if (arg0[n6] != 0x200000L) {
                // empty if block
            }
            n2 += n4;
            n5 = ++n;
        }
    }

    @sprtea
    public static void cfr_renamed_5580(int[] arg0, byte[] arg1, int arg2, byte[] arg3) {
        int n;
        int n2 = 0;
        byte[] byArray = arg3;
        int n3 = 0x3FFFFFFF;
        int n4 = n = 0;
        while (n4 < 10240) {
            int n5 = n;
            int n6 = n;
            int n7 = n;
            int n8 = n;
            int n9 = n;
            arg0[n] = sprhcf.cfr_renamed_5552(byArray, n2, 0) & n3;
            arg0[n9 + 1] = (sprhcf.cfr_renamed_5552(byArray, n2, 0) >>> 30 | sprhcf.cfr_renamed_5552(byArray, n2, 1) << 2) & n3;
            arg0[n9 + 2] = (sprhcf.cfr_renamed_5552(byArray, n2, 1) >>> 28 | sprhcf.cfr_renamed_5552(byArray, n2, 2) << 4) & n3;
            arg0[n + 3] = (sprhcf.cfr_renamed_5552(byArray, n2, 2) >>> 26 | sprhcf.cfr_renamed_5552(byArray, n2, 3) << 6) & n3;
            arg0[n8 + 4] = (sprhcf.cfr_renamed_5552(byArray, n2, 3) >>> 24 | sprhcf.cfr_renamed_5552(byArray, n2, 4) << 8) & n3;
            arg0[n8 + 5] = (sprhcf.cfr_renamed_5552(byArray, n2, 4) >>> 22 | sprhcf.cfr_renamed_5552(byArray, n2, 5) << 10) & n3;
            arg0[n + 6] = (sprhcf.cfr_renamed_5552(byArray, n2, 5) >>> 20 | sprhcf.cfr_renamed_5552(byArray, n2, 6) << 12) & n3;
            arg0[n7 + 7] = (sprhcf.cfr_renamed_5552(byArray, n2, 6) >>> 18 | sprhcf.cfr_renamed_5552(byArray, n2, 7) << 14) & n3;
            arg0[n7 + 8] = (sprhcf.cfr_renamed_5552(byArray, n2, 7) >>> 16 | sprhcf.cfr_renamed_5552(byArray, n2, 8) << 16) & n3;
            arg0[n + 9] = (sprhcf.cfr_renamed_5552(byArray, n2, 8) >>> 14 | sprhcf.cfr_renamed_5552(byArray, n2, 9) << 18) & n3;
            arg0[n6 + 10] = (sprhcf.cfr_renamed_5552(byArray, n2, 9) >>> 12 | sprhcf.cfr_renamed_5552(byArray, n2, 10) << 20) & n3;
            arg0[n6 + 11] = (sprhcf.cfr_renamed_5552(byArray, n2, 10) >>> 10 | sprhcf.cfr_renamed_5552(byArray, n2, 11) << 22) & n3;
            arg0[n + 12] = (sprhcf.cfr_renamed_5552(byArray, n2, 11) >>> 8 | sprhcf.cfr_renamed_5552(byArray, n2, 12) << 24) & n3;
            arg0[n5 + 13] = (sprhcf.cfr_renamed_5552(byArray, n2, 12) >>> 6 | sprhcf.cfr_renamed_5552(byArray, n2, 13) << 26) & n3;
            arg0[n5 + 14] = (sprhcf.cfr_renamed_5552(byArray, n2, 13) >>> 4 | sprhcf.cfr_renamed_5552(byArray, n2, 14) << 28) & n3;
            int n10 = sprhcf.cfr_renamed_5552(byArray, n2, 14) >>> 2 & n3;
            n2 += 15;
            arg0[n + 15] = n10;
            n4 = n += 16;
        }
        System.arraycopy(arg3, 38400, arg1, arg2, 32);
    }

    @sprtea
    public static void cfr_renamed_5575(byte[] arg0, int arg1, byte[] arg2, int arg3, long[] arg4) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 1408) {
            int n4 = n;
            int n5 = n;
            int n6 = n;
            sprhcf.cfr_renamed_5550(arg0, n, 0, (int)(arg4[n2 + 0] & 0x3FFFFFL | arg4[n2 + 1] << 22));
            sprhcf.cfr_renamed_5550(arg0, n, 1, (int)(arg4[n2 + 1] >>> 10 & 0xFFFL | arg4[n2 + 2] << 12));
            sprhcf.cfr_renamed_5550(arg0, n6, 2, (int)(arg4[n2 + 2] >>> 20 & 3L | (arg4[n2 + 3] & 0x3FFFFFL) << 2 | arg4[n2 + 4] << 24));
            sprhcf.cfr_renamed_5550(arg0, n6, 3, (int)(arg4[n2 + 4] >>> 8 & 0x3FFFL | arg4[n2 + 5] << 14));
            sprhcf.cfr_renamed_5550(arg0, n, 4, (int)(arg4[n2 + 5] >>> 18 & 0xFL | (arg4[n2 + 6] & 0x3FFFFFL) << 4 | arg4[n2 + 7] << 26));
            sprhcf.cfr_renamed_5550(arg0, n5, 5, (int)(arg4[n2 + 7] >>> 6 & 0xFFFFL | arg4[n2 + 8] << 16));
            sprhcf.cfr_renamed_5550(arg0, n5, 6, (int)(arg4[n2 + 8] >>> 16 & 0x3FL | (arg4[n2 + 9] & 0x3FFFFFL) << 6 | arg4[n2 + 10] << 28));
            sprhcf.cfr_renamed_5550(arg0, n, 7, (int)(arg4[n2 + 10] >>> 4 & 0x3FFFFL | arg4[n2 + 11] << 18));
            sprhcf.cfr_renamed_5550(arg0, n4, 8, (int)(arg4[n2 + 11] >>> 14 & 0xFFL | (arg4[n2 + 12] & 0x3FFFFFL) << 8 | arg4[n2 + 13] << 30));
            sprhcf.cfr_renamed_5550(arg0, n4, 9, (int)(arg4[n2 + 13] >>> 2 & 0xFFFFFL | arg4[n2 + 14] << 20));
            long l = arg4[n2 + 14] >>> 12 & 0x3FFL;
            long l2 = arg4[n2 + 15] << 10;
            n2 += 16;
            sprhcf.cfr_renamed_5550(arg0, n, 10, (int)(l | l2));
            n3 = n += 11;
        }
        System.arraycopy(arg2, arg3, arg0, arg1 + 5632, 32);
    }

    private static /* synthetic */ boolean cfr_renamed_5555(long[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = 2048;
        long[] lArray = new long[2048];
        int n4 = n = 0;
        while (n4 < 2048) {
            int n5 = n++;
            lArray[n5] = sprhcf.cfr_renamed_5567((int)arg0[arg1 + n5]);
            n4 = n;
        }
        int n6 = n = 0;
        while (n6 < 40) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3 - 1) {
                long[] lArray2 = lArray;
                long l = lArray2[n7 + 1] - lArray[n7] >> 31;
                long l2 = lArray[n7 + 1] & l | lArray[n7] & (l ^ 0xFFFFFFFFFFFFFFFFL);
                lArray[n7 + 1] = lArray[n7] & l | lArray[n7 + 1] & (l ^ 0xFFFFFFFFFFFFFFFFL);
                lArray2[n7++] = l2;
                n8 = n7;
            }
            long l = lArray[n3 - 1];
            --n3;
            n2 += (int)l;
            n6 = ++n;
        }
        return n2 > arg2;
    }

    private static /* synthetic */ boolean cfr_renamed_5572(long[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 2048) {
            long l = 2096250L - sprhcf.cfr_renamed_5576(arg0[n]);
            n2 = (int)((long)n2 | l);
            n3 = ++n;
        }
        return n2 >>> 31 > 0;
    }

    public static int cfr_renamed_5539(byte[] arg0, byte[] arg1, int arg2, int arg3, byte[] arg4) {
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[32];
        byte[] byArray3 = new byte[32];
        byte[] byArray4 = new byte[80];
        int[] nArray = new int[40];
        short[] sArray = new short[40];
        int[] nArray2 = new int[10240];
        long[] lArray = new long[10240];
        long[] lArray2 = new long[10240];
        long[] lArray3 = new long[10240];
        long[] lArray4 = new long[2048];
        long[] lArray5 = new long[2048];
        int n = 0;
        if (arg3 != 5664) {
            return -1;
        }
        sprhcf.cfr_renamed_5565(byArray, lArray4, arg1, arg2);
        if (sprhcf.cfr_renamed_5577(lArray4)) {
            return -2;
        }
        sprhcf.cfr_renamed_5580(nArray2, byArray3, 0, arg4);
        sprtaf.cfr_renamed_5553(byArray4, 0, 40, arg0, 0, arg0.length);
        sprtaf.cfr_renamed_5553(byArray4, 40, 40, arg4, 0, 38400);
        sprfze.cfr_renamed_5556(lArray2, byArray3, 0);
        sprhcf.cfr_renamed_5563(nArray, sArray, byArray, 0);
        sprfze.cfr_renamed_5557(lArray5, lArray4);
        int n2 = n = 0;
        while (n2 < 5) {
            sprfze.cfr_renamed_5581(lArray3, n * 2048, nArray2, n * 2048, nArray, sArray);
            sprfze.cfr_renamed_5558(lArray, n * 2048, lArray2, n * 2048, lArray5);
            sprfze.cfr_renamed_5574(lArray, n * 2048, lArray, n * 2048, lArray3, n++ * 2048);
            n2 = n;
        }
        sprhcf.cfr_renamed_5569(byArray2, 0, lArray, byArray4, 0);
        if (!sprhcf.cfr_renamed_5562(byArray, 0, byArray2, 0, 32)) {
            return -3;
        }
        return 0;
    }

    public static int cfr_renamed_5579(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = n2;
        n3 = n;
        n3 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16;
        return n3;
    }
}

