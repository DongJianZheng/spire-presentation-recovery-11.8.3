/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import java.math.BigInteger;

public abstract class sprdih {
    public static boolean cfr_renamed_8540(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 5) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 4;
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = 4 << 3 ^ 2;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static boolean cfr_renamed_8535(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 4;
        while (n2 >= 0) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8538(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        arg1[0] = arg0[0];
        v1[1] = arg0[1];
        v1[2] = arg0[2];
        v0[3] = arg0[3];
        v0[4] = arg0[4];
    }

    public static BigInteger cfr_renamed_8542(long[] arg0) {
        int n;
        byte[] byArray = new byte[40];
        int n2 = n = 0;
        while (n2 < 5) {
            long l = arg0[n];
            if (l != 0L) {
                sprpxe.cfr_renamed_450(l, byArray, 4 - n << 3);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }

    public static boolean cfr_renamed_8541(long[] arg0) {
        int n;
        if (arg0[0] != 1L) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 5) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static long[] cfr_renamed_8534() {
        return new long[5];
    }

    public static long[] cfr_renamed_8539(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] lArray = sprdih.cfr_renamed_8534();
        int n2 = n = 0;
        while (n2 < 5) {
            lArray[n++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
            n2 = n;
        }
        return lArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8537(long[] lArray, int n, long[] lArray2, int n2) {
        void arg1;
        long[] arg0;
        void arg3;
        void arg2;
        void v0 = arg2;
        void v1 = arg3;
        void v2 = arg2;
        v2[arg3 + false] = arg0[arg1 + false];
        v2[arg3 + true] = arg0[arg1 + true];
        arg2[v1 + 2] = arg0[arg1 + 2];
        v0[v1 + 3] = arg0[arg1 + 3];
        v0[n2 + 4] = arg0[arg1 + 4];
    }

    public static long[] cfr_renamed_8536() {
        return new long[10];
    }
}

