/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprswk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprxyy;
import java.security.SecureRandom;

public class sprqeg {
    public static void cfr_renamed_6330(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 != arg1.length) {
            byte by = arg1[n2];
            n3 += by & 1;
            n4 = ++n2;
        }
        n2 = sprqeg.cfr_renamed_6331(n3 - arg3);
        int n5 = n = 0;
        while (n5 < arg3) {
            int n6 = n++;
            arg0[n6] = (byte)((arg1[n6] ^ 1) & ~n2 ^ 1);
            n5 = n;
        }
        int n7 = n = arg3;
        while (n7 < arg2) {
            int n8 = n++;
            arg0[n8] = (byte)(arg1[n8] & ~n2);
            n7 = n;
        }
    }

    public static void cfr_renamed_6332(SecureRandom arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int[] nArray = new int[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            nArray[n++] = sprqeg.cfr_renamed_6333(arg0);
            n2 = n;
        }
        sprqeg.cfr_renamed_6334(arg1, nArray, arg2, arg3);
    }

    private static /* synthetic */ int cfr_renamed_6331(int arg0) {
        long l = sprqeg.cfr_renamed_6335(arg0);
        l = -l;
        return -((int)(l >>> 63));
    }

    public static void cfr_renamed_6336(short[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2;
        short[] sArray = new short[arg2 + 1];
        short[] sArray2 = new short[arg2 + 1];
        short[] sArray3 = new short[arg2 + 1];
        short[] sArray4 = new short[arg2 + 1];
        sArray3[0] = (short)sprqeg.cfr_renamed_6337(3, arg3);
        short[] sArray5 = sArray;
        sArray5[0] = 1;
        sArray[arg2 - 1] = -1;
        sArray5[arg2] = -1;
        int n3 = n2 = 0;
        while (n3 < arg2) {
            int n4 = arg2 - 1 - n2;
            short s = arg1[n2];
            sArray2[n4] = s;
            n3 = ++n2;
        }
        sArray2[arg2] = 0;
        int n5 = 1;
        int n6 = n = 0;
        while (n6 < 2 * arg2 - 1) {
            System.arraycopy(sArray4, 0, sArray4, 1, arg2);
            sArray4[0] = 0;
            int n7 = sprqeg.cfr_renamed_6338(-n5) & sprqeg.cfr_renamed_6331(sArray2[0]);
            int n8 = n5;
            n5 = n8 ^ n7 & (n8 ^ -n8);
            int n9 = n2 = 0;
            ++n5;
            while (n9 < arg2 + 1) {
                int n10 = n7 & (sArray[n2] ^ sArray2[n2]);
                int n11 = n2;
                short[] sArray6 = sArray;
                sArray6[n11] = (short)(sArray6[n11] ^ n10);
                sArray2[n11] = (short)(sArray2[n11] ^ n10);
                short[] sArray7 = sArray4;
                n10 = n7 & (sArray4[n2] ^ sArray3[n2]);
                int n12 = n2;
                sArray7[n12] = (short)(sArray7[n12] ^ n10);
                int n13 = n2++;
                sArray3[n13] = (short)(sArray3[n13] ^ n10);
                n9 = n2;
            }
            short s = sArray[0];
            short s2 = sArray2[0];
            int n14 = n2 = 0;
            while (n14 < arg2 + 1) {
                sArray2[++n2] = (short)sprqeg.cfr_renamed_6339(s * sArray2[n2] - s2 * sArray[n2], arg3);
                n14 = n2;
            }
            int n15 = n2 = 0;
            while (n15 < arg2 + 1) {
                sArray3[++n2] = (short)sprqeg.cfr_renamed_6339(s * sArray3[n2] - s2 * sArray4[n2], arg3);
                n15 = n2;
            }
            int n16 = n2 = 0;
            while (n16 < arg2) {
                sArray2[++n2] = sArray2[n2 + 1];
                n16 = n2;
            }
            sArray2[arg2] = 0;
            n6 = ++n;
        }
        int n17 = sprqeg.cfr_renamed_6337(sArray[0], arg3);
        int n18 = n2 = 0;
        while (n18 < arg2) {
            int n19 = n2;
            short s = (short)sprqeg.cfr_renamed_6339(n17 * sArray4[arg2 - 1 - n2], arg3);
            arg0[n19] = s;
            n18 = ++n2;
        }
    }

    public static void cfr_renamed_6340(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            arg0[2 * n] = (byte)(arg1[n] & 0xF);
            int n3 = 2 * n + 1;
            byte by = (byte)(arg1[n] >>> 4);
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6341(int[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg0.length * 4];
        byte[] byArray2 = new byte[arg0.length * 4];
        byte[] byArray3 = new byte[16];
        sprqeg.cfr_renamed_6342(byArray, byArray2, byArray3, arg1);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            int n4 = sprqeg.cfr_renamed_6343(byArray2[n * 4]) + (sprqeg.cfr_renamed_6343(byArray2[n3 * 4 + 1]) << 8) + (sprqeg.cfr_renamed_6343(byArray2[n * 4 + 2]) << 16) + (sprqeg.cfr_renamed_6343(byArray2[n * 4 + 3]) << 24);
            arg0[n3] = n4;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6344(short[] arg0, short[] arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        short s;
        int n2;
        int n3 = arg3;
        short[] sArray = new short[n3 + n3 - 1];
        int n4 = n2 = 0;
        while (n4 < arg3) {
            s = 0;
            int n5 = n = 0;
            while (n5 <= n2) {
                int n6 = s + arg1[n] * arg2[n2 - n];
                s = (short)sprqeg.cfr_renamed_6339(n6, arg4);
                n5 = ++n;
            }
            sArray[n2++] = s;
            n4 = n2;
        }
        int n7 = n2 = arg3;
        while (true) {
            int n8 = arg3;
            if (n7 >= n8 + n8 - 1) break;
            s = 0;
            int n9 = n2 - arg3 + 1;
            while (n9 < arg3) {
                int n10 = s + arg1[n] * arg2[n2 - n];
                s = (short)sprqeg.cfr_renamed_6339(n10, arg4);
                n9 = ++n;
            }
            sArray[n2++] = s;
            n7 = n2;
        }
        int n11 = arg3;
        int n12 = n2 = n11 + n11 - 2;
        while (n12 >= arg3) {
            int n13 = n2;
            sArray[n13 - arg3] = (short)sprqeg.cfr_renamed_6339(sArray[n2 - arg3] + sArray[n2], arg4);
            short s2 = (short)sprqeg.cfr_renamed_6339(sArray[n2 - arg3 + 1] + sArray[n2], arg4);
            sArray[n13 - arg3 + 1] = s2;
            n12 = --n2;
        }
        int n14 = n2 = 0;
        while (n14 < arg3) {
            int n15 = n2++;
            arg0[n15] = sArray[n15];
            n14 = n2;
        }
    }

    private static /* synthetic */ void cfr_renamed_6345(byte[] arg0, short[] arg1, short[] arg2, int arg3, int arg4) {
        if (arg3 == 1) {
            short s;
            short s2 = arg1[0];
            short s3 = s = arg2[0];
            while (s3 > 1) {
                arg0[arg4++] = (byte)s2;
                s2 = (short)(s2 >>> 8);
                s3 = (short)(s + 255 >>> 8);
            }
        }
        if (arg3 > 1) {
            int n;
            short[] sArray = new short[(arg3 + 1) / 2];
            short[] sArray2 = new short[(arg3 + 1) / 2];
            int n2 = n = 0;
            while (n2 < arg3 - 1) {
                int n3;
                short s = arg2[n];
                int n4 = arg1[n] + arg1[n + 1] * s;
                int n5 = arg2[n + 1] * s;
                while (n5 >= 16384) {
                    arg0[arg4++] = (byte)n4;
                    n4 >>>= 8;
                    n5 = n3 + 255 >>> 8;
                }
                sArray[n / 2] = (short)n4;
                int n6 = n / 2;
                sArray2[n6] = (short)n3;
                n2 = n += 2;
            }
            if (n < arg3) {
                int n7 = n;
                sArray[n7 / 2] = arg1[n];
                sArray2[n7 / 2] = arg2[n];
            }
            sprqeg.cfr_renamed_6345(arg0, sArray, sArray2, (arg3 + 1) / 2, arg4);
        }
    }

    public static int cfr_renamed_6337(int arg0, int arg1) {
        int n;
        int n2 = arg0;
        int n3 = n = 1;
        while (n3 < arg1 - 2) {
            n2 = sprqeg.cfr_renamed_6339(arg0 * n2, arg1);
            n3 = ++n;
        }
        return n2;
    }

    public static boolean cfr_renamed_6346(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2;
        int n3;
        byte[] byArray = new byte[arg2 + 1];
        byte[] byArray2 = new byte[arg2 + 1];
        byte[] byArray3 = new byte[arg2 + 1];
        byte[] byArray4 = new byte[arg2 + 1];
        byArray3[0] = 1;
        byte[] byArray5 = byArray;
        byArray5[0] = 1;
        byArray[arg2 - 1] = -1;
        byArray5[arg2] = -1;
        int n4 = n3 = 0;
        while (n4 < arg2) {
            int n5 = arg2 - 1 - n3;
            byte by = arg0[n3];
            byArray2[n5] = by;
            n4 = ++n3;
        }
        byArray2[arg2] = 0;
        int n6 = 1;
        int n7 = n2 = 0;
        while (n7 < 2 * arg2 - 1) {
            System.arraycopy(byArray4, 0, byArray4, 1, arg2);
            byArray4[0] = 0;
            n = -byArray2[0] * byArray[0];
            int n8 = sprqeg.cfr_renamed_6338(-n6) & sprqeg.cfr_renamed_6331(byArray2[0]);
            int n9 = n6;
            n6 = n9 ^ n8 & (n9 ^ -n9);
            int n10 = n3 = 0;
            ++n6;
            while (n10 < arg2 + 1) {
                int n11 = n8 & (byArray[n3] ^ byArray2[n3]);
                int n12 = n3;
                byte[] byArray6 = byArray;
                byArray6[n12] = (byte)(byArray6[n12] ^ n11);
                byArray2[n12] = (byte)(byArray2[n12] ^ n11);
                byte[] byArray7 = byArray4;
                n11 = n8 & (byArray4[n3] ^ byArray3[n3]);
                int n13 = n3;
                byArray7[n13] = (byte)(byArray7[n13] ^ n11);
                int n14 = n3++;
                byArray3[n14] = (byte)(byArray3[n14] ^ n11);
                n10 = n3;
            }
            int n15 = n3 = 0;
            while (n15 < arg2 + 1) {
                byArray2[++n3] = (byte)sprqeg.cfr_renamed_6339(byArray2[n3] + n * byArray[n3], 3);
                n15 = n3;
            }
            int n16 = n3 = 0;
            while (n16 < arg2 + 1) {
                byArray3[++n3] = (byte)sprqeg.cfr_renamed_6339(byArray3[n3] + n * byArray4[n3], 3);
                n16 = n3;
            }
            int n17 = n3 = 0;
            while (n17 < arg2) {
                byArray2[++n3] = byArray2[n3 + 1];
                n17 = n3;
            }
            byArray2[arg2] = 0;
            n7 = ++n2;
        }
        n = byArray[0];
        int n18 = n3 = 0;
        while (n18 < arg2) {
            int n19 = n3;
            byte by = (byte)(n * byArray4[arg2 - 1 - n3]);
            arg1[n19] = by;
            n18 = ++n3;
        }
        return n6 == 0;
    }

    public static long cfr_renamed_6335(int arg0) {
        return (long)arg0 & 0xFFFFFFFFL;
    }

    public static void cfr_renamed_6347(short[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        short[] sArray = new short[arg2];
        short[] sArray2 = new short[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            sArray2[n++] = (short)((arg3 + 2) / 3);
            n2 = n;
        }
        sprqeg.cfr_renamed_6348(sArray, arg1, sArray2, arg2, 0, 0);
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = n++;
            arg0[n4] = (short)(sArray[n4] * 3 - (arg3 - 1) / 2);
            n3 = n;
        }
    }

    public static void cfr_renamed_6349(byte[] arg0, byte[] arg1, int arg2) {
        byte by;
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg2 / 4) {
            by = arg1[n3];
            ++n3;
            byte[] byArray = arg0;
            byArray[n2++] = (byte)((sprqeg.cfr_renamed_6343(by) & 3) - 1);
            by = (byte)(by >>> 2);
            arg0[n2++] = (byte)((sprqeg.cfr_renamed_6343(by) & 3) - 1);
            by = (byte)(by >>> 2);
            byArray[n2++] = (byte)((sprqeg.cfr_renamed_6343(by) & 3) - 1);
            by = (byte)(by >>> 2);
            byArray[n2++] = (byte)((sprqeg.cfr_renamed_6343(by) & 3) - 1);
            n4 = ++n;
        }
        by = arg1[n3];
        arg0[n2] = (byte)((sprqeg.cfr_renamed_6343(by) & 3) - 1);
    }

    public static void cfr_renamed_6334(byte[] arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg3) {
            arg1[++n] = arg1[n] & 0xFFFFFFFE;
            n2 = n;
        }
        int n3 = n = arg3;
        while (n3 < arg2) {
            arg1[++n] = arg1[n] & 0xFFFFFFFD | 1;
            n3 = n;
        }
        sprqeg.cfr_renamed_6350(arg1, arg2);
        int n4 = n = 0;
        while (n4 < arg2) {
            int n5 = n++;
            arg0[n5] = (byte)((arg1[n5] & 3) - 1);
            n4 = n;
        }
    }

    public static void cfr_renamed_6351(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg2 / 4) {
            int n5 = arg1[n2] + 1;
            byte by = (byte)n5;
            int n6 = arg1[++n2] + 1;
            by = (byte)(by + ((byte)n6 << 2));
            int n7 = arg1[++n2] + 1;
            by = (byte)(by + ((byte)n7 << 4));
            int n8 = arg1[++n2] + 1;
            ++n2;
            by = (byte)(by + ((byte)n8 << 6));
            arg0[n3++] = by;
            n4 = ++n;
        }
        arg0[n3] = (byte)(arg1[n2] + 1);
    }

    public static void cfr_renamed_6352(short[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int[] nArray = new int[arg2];
        sprqeg.cfr_renamed_6341(nArray, arg1);
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n++;
            arg0[n3] = (short)(sprqeg.cfr_renamed_6353(nArray[n3], arg3) - (arg3 - 1) / 2);
            n2 = n;
        }
    }

    public static void cfr_renamed_6354(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        int n;
        byte by;
        int n2;
        int n3 = arg3;
        byte[] byArray = new byte[n3 + n3 - 1];
        int n4 = n2 = 0;
        while (n4 < arg3) {
            by = 0;
            int n5 = n = 0;
            while (n5 <= n2) {
                int n6 = by + arg1[n] * arg2[n2 - n];
                by = (byte)sprqeg.cfr_renamed_6339(n6, 3);
                n5 = ++n;
            }
            byArray[n2++] = by;
            n4 = n2;
        }
        int n7 = n2 = arg3;
        while (true) {
            int n8 = arg3;
            if (n7 >= n8 + n8 - 1) break;
            by = 0;
            int n9 = n2 - arg3 + 1;
            while (n9 < arg3) {
                int n10 = by + arg1[n] * arg2[n2 - n];
                by = (byte)sprqeg.cfr_renamed_6339(n10, 3);
                n9 = ++n;
            }
            byArray[n2++] = by;
            n7 = n2;
        }
        int n11 = arg3;
        int n12 = n2 = n11 + n11 - 2;
        while (n12 >= arg3) {
            int n13 = n2;
            byArray[n13 - arg3] = (byte)sprqeg.cfr_renamed_6339(byArray[n2 - arg3] + byArray[n2], 3);
            byte by2 = (byte)sprqeg.cfr_renamed_6339(byArray[n2 - arg3 + 1] + byArray[n2], 3);
            byArray[n13 - arg3 + 1] = by2;
            n12 = --n2;
        }
        int n14 = n2 = 0;
        while (n14 < arg3) {
            int n15 = n2++;
            arg0[n15] = byArray[n15];
            n14 = n2;
        }
    }

    private static /* synthetic */ int cfr_renamed_6353(int arg0, int arg1) {
        return sprqeg.cfr_renamed_6355(arg0, arg1)[1];
    }

    public static void cfr_renamed_6356(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg2 & (arg0[n] ^ arg1[n]));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static int cfr_renamed_6339(int arg0, int arg1) {
        return sprqeg.cfr_renamed_6357(arg0 + (arg1 - 1) / 2, arg1)[1] - (arg1 - 1) / 2;
    }

    public static void cfr_renamed_6350(int[] arg0, int arg1) {
        int n;
        int n2;
        if (arg1 < 2) {
            return;
        }
        int n3 = n2 = 1;
        while (n3 < arg1 - n2) {
            int n4 = n2;
            n3 = n4 + n4;
        }
        int n5 = n = n2;
        while (n5 > 0) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < arg1 - n) {
                if ((n6 & n) == 0) {
                    int n8 = n6;
                    sprqeg.cfr_renamed_6358(arg0, n8, n8 + n);
                }
                n7 = ++n6;
            }
            int n9 = n2;
            while (n9 > n) {
                int n10;
                int n11 = n6 = 0;
                while (n11 < arg1 - n10) {
                    if ((n6 & n) == 0) {
                        sprqeg.cfr_renamed_6358(arg0, n6 + n, n6 + n10);
                    }
                    n11 = ++n6;
                }
                n9 = n10 >>> 1;
            }
            n5 = n >>> 1;
        }
    }

    private static /* synthetic */ int[] cfr_renamed_6357(int arg0, int arg1) {
        int[] nArray = sprqeg.cfr_renamed_6355(sprqeg.cfr_renamed_6359(Integer.MIN_VALUE + sprqeg.cfr_renamed_6335(arg0)), arg1);
        int[] nArray2 = sprqeg.cfr_renamed_6355(Integer.MIN_VALUE, arg1);
        int n = sprqeg.cfr_renamed_6359(sprqeg.cfr_renamed_6335(nArray[0]) - sprqeg.cfr_renamed_6335(nArray2[0]));
        int n2 = sprqeg.cfr_renamed_6359(sprqeg.cfr_renamed_6335(nArray[1]) - sprqeg.cfr_renamed_6335(nArray2[1]));
        int n3 = -(n2 >>> 31);
        int[] nArray3 = new int[2];
        nArray3[0] = n += n3;
        nArray3[1] = n2 += n3 & arg1;
        return nArray3;
    }

    public static void cfr_renamed_6360(short[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        short[] sArray = new short[arg2];
        short[] sArray2 = new short[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            sArray2[n++] = (short)arg3;
            n2 = n;
        }
        sprqeg.cfr_renamed_6348(sArray, arg1, sArray2, arg2, 0, 0);
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = n++;
            arg0[n4] = (short)(sArray[n4] - (arg3 - 1) / 2);
            n3 = n;
        }
    }

    private static /* synthetic */ int[] cfr_renamed_6355(int arg0, int arg1) {
        long l = sprqeg.cfr_renamed_6335(arg0);
        long l2 = sprqeg.cfr_renamed_6335(Integer.MIN_VALUE);
        long l3 = 0L;
        long l4 = l * (l2 /= (long)arg1) >>> 31;
        l -= l4 * (long)arg1;
        l3 += l4;
        l4 = l * l2 >>> 31;
        l -= l4 * (long)arg1;
        l3 += l4;
        ++l3;
        long l5 = -((l -= (long)arg1) >>> 63);
        int[] nArray = new int[2];
        nArray[0] = sprqeg.cfr_renamed_6359(l3 += l5);
        nArray[1] = sprqeg.cfr_renamed_6359(l += l5 & (long)arg1);
        return nArray;
    }

    public static void cfr_renamed_6361(SecureRandom arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg1.length / 8];
        arg0.nextBytes(byArray);
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n;
            byte by = (byte)(1 & byArray[n3 >>> 3] >>> (n & 7));
            arg1[n3] = by;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6362(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n >>> 3;
            byte by = (byte)(arg0[n3] | arg1[n] << (n & 7));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void cfr_renamed_6348(short[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) ** GOTO lbl11
        if (arg2[0] == 1) {
            v0 = arg3;
            arg0[arg4] = 0;
        } else if (arg2[0] <= 256) {
            v0 = arg3;
            arg0[arg4] = (short)sprqeg.cfr_renamed_6353(sprqeg.cfr_renamed_6343(arg1[arg5]), arg2[0]);
        } else {
            arg0[arg4] = (short)sprqeg.cfr_renamed_6353(sprqeg.cfr_renamed_6343(arg1[arg5]) + (arg1[arg5 + 1] << 8), arg2[0]);
lbl11:
            // 2 sources

            v0 = arg3;
        }
        if (v0 > 1) {
            var6_6 = new short[(arg3 + 1) / 2];
            var7_7 = new short[(arg3 + 1) / 2];
            var8_8 = new short[arg3 / 2];
            var9_9 = new int[arg3 / 2];
            v1 = var10_10 = 0;
            while (v1 < arg3 - 1) {
                var11_11 = arg2[var10_10] * arg2[var10_10 + 1];
                if (var11_11 > 0x3FFF00) {
                    v2 = var10_10;
                    var9_9[v2 / 2] = 65536;
                    v3 = (short)(sprqeg.cfr_renamed_6343(arg1[arg5]) + 256 * sprqeg.cfr_renamed_6343(arg1[arg5 + 1]));
                    arg5 += 2;
                    var8_8[v2 / 2] = v3;
                    var7_7[var10_10 / 2] = (short)((var11_11 + 255 >>> 8) + 255 >>> 8);
                } else if (var11_11 >= 16384) {
                    v4 = var10_10;
                    var9_9[v4 / 2] = 256;
                    v5 = (short)sprqeg.cfr_renamed_6343(arg1[arg5]);
                    ++arg5;
                    var8_8[v4 / 2] = v5;
                    var7_7[var10_10 / 2] = (short)(var11_11 + 255 >>> 8);
                } else {
                    var9_9[var10_10 / 2] = 1;
                    v6 = var10_10;
                    var8_8[v6 / 2] = 0;
                    var7_7[v6 / 2] = (short)var11_11;
                }
                v1 = var10_10 += 2;
            }
            if (var10_10 < arg3) {
                var7_7[var10_10 / 2] = arg2[var10_10];
            }
            sprqeg.cfr_renamed_6348(var6_6, arg1, var7_7, (arg3 + 1) / 2, arg4, arg5);
            v7 = var10_10 = 0;
            while (v7 < arg3 - 1) {
                var11_11 = sprqeg.cfr_renamed_6363(var8_8[var10_10 / 2]);
                var12_12 = sprqeg.cfr_renamed_6355(var11_11 += var9_9[var10_10 / 2] * sprqeg.cfr_renamed_6363(var6_6[var10_10 / 2]), arg2[var10_10]);
                arg0[arg4++] = (short)var12_12[1];
                v8 = arg4++;
                v9 = (short)sprqeg.cfr_renamed_6353(var12_12[0], arg2[var10_10 + 1]);
                arg0[v8] = v9;
                v7 = var10_10 += 2;
            }
            if (var10_10 < arg3) {
                arg0[arg4] = var6_6[var10_10 / 2];
            }
        }
    }

    public static void cfr_renamed_6364(byte[] arg0, short[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(-sprqeg.cfr_renamed_6338(sprqeg.cfr_renamed_6339(sprqeg.cfr_renamed_6339(arg6 * arg2[n3] - arg5, arg3) - arg1[n] + 4 * arg4 + 1, arg3)));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static int cfr_renamed_6363(short arg0) {
        return arg0 & 0xFFFF;
    }

    private static /* synthetic */ void cfr_renamed_6342(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        sprswk sprswk2;
        sprswk sprswk3 = sprswk2 = new sprswk(new sprael());
        sprswk3.cfr_renamed_5535(true, new sprkpk(new sprtpk(arg3), arg2));
        sprswk3.cfr_renamed_505(arg0, 0, arg1.length, arg1, 0);
    }

    public static int cfr_renamed_6333(SecureRandom arg0) {
        byte[] byArray = new byte[4];
        arg0.nextBytes(byArray);
        return sprqeg.cfr_renamed_6343(byArray[0]) + (sprqeg.cfr_renamed_6343(byArray[1]) << 8) + (sprqeg.cfr_renamed_6343(byArray[2]) << 16) + (sprqeg.cfr_renamed_6343(byArray[3]) << 24);
    }

    public static void cfr_renamed_6358(int[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n2 = nArray[arg1];
        int n3 = nArray2[arg2];
        int n4 = n2 ^ n3;
        int n5 = n = n3 - n2;
        n = n5 ^ n4 & (n5 ^ n3 ^ Integer.MIN_VALUE);
        n >>>= 31;
        n = -n;
        nArray[arg1] = n2 ^ (n &= n4);
        nArray2[arg2] = n3 ^ n;
    }

    public static int cfr_renamed_6359(long arg0) {
        int n = (int)arg0;
        if ((long)n != arg0) {
            throw new IllegalStateException(sprxyy.cfr_renamed_9("UQOEF\u0010LEW\u0010LV\u0003YMDFWFB\u0003BB^DU"));
        }
        return n;
    }

    public static int cfr_renamed_6343(byte arg0) {
        return arg0 & 0xFF;
    }

    public static void cfr_renamed_6365(SecureRandom arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            arg1[n++] = (byte)(((sprqeg.cfr_renamed_6333(arg0) & 0x3FFFFFFF) * 3 >>> 30) - 1);
            n2 = n;
        }
    }

    public static byte[] cfr_renamed_6366(byte[] arg0, byte[] arg1) {
        byte[] byArray = new byte[64];
        byte[] byArray2 = new byte[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, byArray2, 0, arg0.length);
        System.arraycopy(arg1, 0, byArray2, arg0.length, arg1.length);
        sprocl sprocl2 = new sprocl();
        sprocl2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprocl2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_6367(byte[] arg0, short[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg5 * (sprqeg.cfr_renamed_6339(arg1[n3] + arg2[n] * ((arg3 - 1) / 2), arg3) + arg4) + 16384 >>> 15);
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6368(byte[] arg0, short[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n++;
            arg0[n3] = (byte)sprqeg.cfr_renamed_6339(arg1[n3], 3);
            n2 = n;
        }
    }

    public static void cfr_renamed_6369(byte[] arg0, short[] arg1, int arg2, int arg3) {
        int n;
        short[] sArray = new short[arg2];
        short[] sArray2 = new short[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n;
            sArray[n3] = (short)((arg1[n] + (arg3 - 1) / 2) * 10923 >>> 15);
            sArray2[n3] = (short)((arg3 + 2) / 3);
            n2 = ++n;
        }
        sprqeg.cfr_renamed_6345(arg0, sArray, sArray2, arg2, 0);
    }

    public static void cfr_renamed_6370(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg1[2 * n3] + (arg1[2 * n + 1] << 4));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6371(byte[] arg0, short[] arg1, int arg2, int arg3) {
        int n;
        short[] sArray = new short[arg2];
        short[] sArray2 = new short[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n++;
            sArray[n3] = (short)(arg1[n3] + (arg3 - 1) / 2);
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < arg2) {
            sArray2[n++] = (short)arg3;
            n4 = n;
        }
        sprqeg.cfr_renamed_6345(arg0, sArray, sArray2, arg2, 0);
    }

    private static /* synthetic */ int cfr_renamed_6338(int arg0) {
        return -(arg0 >>> 31);
    }

    public static void cfr_renamed_6372(short[] arg0, short[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n++;
            arg0[n3] = (short)sprqeg.cfr_renamed_6339(arg2 * arg1[n3], arg3);
            n2 = n;
        }
    }

    public static void cfr_renamed_6373(short[] arg0, short[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            short s = (short)(arg1[n] - sprqeg.cfr_renamed_6339(arg1[n3], 3));
            arg0[n3] = s;
            n2 = ++n;
        }
    }
}

