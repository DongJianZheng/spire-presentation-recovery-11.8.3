/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sproze;
import java.security.SecureRandom;

public class sprluf {
    public static short[][] cfr_renamed_6121(short[][] arg0) {
        int n;
        short[][] sArrayArray = new short[arg0.length][];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            sArrayArray[n3] = sproze.cfr_renamed_538(arg0[n3]);
            n2 = n;
        }
        return sArrayArray;
    }

    public static boolean cfr_renamed_1231(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            bl &= arg0[n] == arg1[n];
            n2 = --n;
        }
        return bl;
    }

    public static byte[] cfr_renamed_6122(short[][] arg0) {
        int n;
        int n2 = arg0.length;
        int n3 = arg0[0].length;
        byte[] byArray = new byte[n2 * n3];
        int n4 = n = 0;
        while (n4 < n3) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n * n2 + n5;
                byte by = (byte)arg0[n5][n];
                byArray[n7] = by;
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return byArray;
    }

    public static short[][][] cfr_renamed_6123(short[][][] arg0) {
        int n;
        short[][][] sArray = new short[arg0.length][arg0[0].length][];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                int n5 = n3++;
                sArray[n][n5] = sproze.cfr_renamed_538(arg0[n][n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public static int cfr_renamed_6124(short[][][] arg0, byte[] arg1, int arg2, boolean arg3) {
        int n;
        int n2 = arg0.length;
        int n3 = arg0[0].length;
        int n4 = arg0[0][0].length;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < n3) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n4) {
                int n9;
                int n10 = n9 = 0;
                while (n10 < n2) {
                    if (!arg3 || n <= n7) {
                        int n11 = arg2 + n5;
                        ++n5;
                        arg0[n9][n][n7] = (short)(arg1[n11] & 0xFF);
                    }
                    n10 = ++n9;
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
        return n5;
    }

    public static byte[] cfr_renamed_6125(short[][][] arg0, boolean arg1) {
        int n;
        int n2;
        int n3;
        int n4 = arg0.length;
        int n5 = arg0[0].length;
        int n6 = arg0[0][0].length;
        if (arg1) {
            int n7 = n5;
            n2 = n3 = n4 * (n7 * (n7 + 1) / 2);
        } else {
            n2 = n3 = n4 * n5 * n6;
        }
        byte[] byArray = new byte[n2];
        int n8 = 0;
        int n9 = n = 0;
        while (n9 < n5) {
            int n10;
            int n11 = n10 = 0;
            while (n11 < n6) {
                int n12;
                int n13 = n12 = 0;
                while (n13 < n4) {
                    if (!arg1 || n <= n10) {
                        byArray[n8++] = (byte)arg0[n12][n][n10];
                    }
                    n13 = ++n12;
                }
                n11 = ++n10;
            }
            n9 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_6126(sprgf sprgf2, byte[] byArray, int n) {
        void var6_6;
        void arg2;
        void arg1;
        sprgf arg0;
        sprgf sprgf3 = arg0;
        int n2 = sprgf3.cfr_renamed_1218();
        sprgf3.cfr_renamed_1197(byArray, 0, ((void)arg1).length);
        byte[] byArray2 = new byte[n2];
        arg0.cfr_renamed_1219(byArray2, 0);
        if (arg2 == n2) {
            return byArray2;
        }
        if (arg2 < n2) {
            return sproze.cfr_renamed_523(byArray2, (int)arg2);
        }
        byte[] byArray3 = sproze.cfr_renamed_523(byArray2, n2);
        void v1 = var6_6 = arg2 - n2;
        while (v1 >= n2) {
            sprgf sprgf4 = arg0;
            sprgf4.cfr_renamed_1197(byArray2, 0, n2);
            byArray2 = new byte[n2];
            sprgf4.cfr_renamed_1219(byArray2, 0);
            byArray3 = sproze.cfr_renamed_543(byArray3, byArray2);
            v1 = var6_6 -= n2;
        }
        if (var6_6 > 0) {
            sprgf sprgf5 = arg0;
            sprgf5.cfr_renamed_1197(byArray2, 0, n2);
            byArray2 = new byte[n2];
            sprgf5.cfr_renamed_1219(byArray2, 0);
            int n3 = byArray3.length;
            byArray3 = sproze.cfr_renamed_523(byArray3, n3 + var6_6);
            System.arraycopy(byArray2, 0, byArray3, n3, (int)var6_6);
        }
        return byArray3;
    }

    public static short[][][] cfr_renamed_6127(SecureRandom arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int n;
        int n2;
        int n3;
        if (arg4) {
            int n4 = arg2;
            n2 = n3 = arg1 * (n4 * (n4 + 1) / 2);
        } else {
            n2 = n3 = arg1 * arg2 * arg3;
        }
        byte[] byArray = new byte[n2];
        arg0.nextBytes(byArray);
        int n5 = 0;
        short[][][] sArray = new short[arg1][arg2][arg3];
        int n6 = n = 0;
        while (n6 < arg2) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < arg3) {
                int n9;
                int n10 = n9 = 0;
                while (n10 < arg1) {
                    if (!arg4 || n <= n7) {
                        int n11 = byArray[n5] & 0xFF;
                        ++n5;
                        sArray[n9][n][n7] = (short)n11;
                    }
                    n10 = ++n9;
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
        return sArray;
    }

    public static int cfr_renamed_6128(short[][] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = arg0.length;
        int n3 = arg0[0].length;
        int n4 = n = 0;
        while (n4 < n3) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                short[] sArray = arg0[n5];
                int n7 = n;
                short s = (short)(arg1[arg2 + n7 * n2 + n5] & 0xFF);
                sArray[n7] = s;
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return n2 * n3;
    }

    public static boolean cfr_renamed_1230(short[][] arg0, short[][] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            short[] sArray = arg0[n];
            short[] sArray2 = arg1[n];
            bl &= sprluf.cfr_renamed_1231(sArray, sArray2);
            n2 = --n;
        }
        return bl;
    }

    public static byte[] cfr_renamed_1270(short[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    public static short[] cfr_renamed_1271(byte[] arg0) {
        int n;
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            sArray[n3] = (short)(arg0[n3] & 0xFF);
            n2 = n;
        }
        return sArray;
    }

    public static short[][] cfr_renamed_6129(SecureRandom arg0, int arg1, int arg2) {
        int n;
        byte[] byArray = new byte[arg1 * arg2];
        arg0.nextBytes(byArray);
        short[][] sArray = new short[arg1][arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1) {
                short[] sArray2 = sArray[n3];
                int n5 = n;
                short s = (short)(byArray[n5 * arg1 + n3] & 0xFF);
                sArray2[n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public static boolean cfr_renamed_1263(short[][][] arg0, short[][][] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            short[][] sArray = arg0[n];
            short[][] sArray2 = arg1[n];
            bl &= sprluf.cfr_renamed_1230(sArray, sArray2);
            n2 = --n;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_6130(sprgf sprgf2, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        void arg3;
        void arg2;
        void arg1;
        sprgf arg0;
        sprgf sprgf3 = arg0;
        int n = sprgf3.cfr_renamed_1218();
        sprgf3.cfr_renamed_1197(byArray, 0, ((void)arg1).length);
        void v1 = arg2;
        arg0.cfr_renamed_1197((byte[])v1, 0, ((void)v1).length);
        if (((void)arg3).length == n) {
            void v2 = arg3;
            arg0.cfr_renamed_1219((byte[])v2, 0);
            return v2;
        }
        byte[] byArray4 = new byte[n];
        arg0.cfr_renamed_1219(byArray4, 0);
        if (((void)arg3).length < n) {
            void v3 = arg3;
            System.arraycopy(byArray4, 0, v3, 0, ((void)v3).length);
            return arg3;
        }
        System.arraycopy(byArray4, 0, arg3, 0, byArray4.length);
        int n2 = ((void)arg3).length - n;
        int n3 = n;
        int n4 = n2;
        while (n4 >= byArray4.length) {
            arg0.cfr_renamed_1197(byArray4, 0, byArray4.length);
            arg0.cfr_renamed_1219(byArray4, 0);
            System.arraycopy(byArray4, 0, arg3, n3, byArray4.length);
            n3 += byArray4.length;
            n4 = n2 -= byArray4.length;
        }
        if (n2 > 0) {
            arg0.cfr_renamed_1197(byArray4, 0, byArray4.length);
            arg0.cfr_renamed_1219(byArray4, 0);
            System.arraycopy(byArray4, 0, arg3, n3, n2);
        }
        return arg3;
    }
}

