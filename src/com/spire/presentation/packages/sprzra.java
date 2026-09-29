/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprogb;
import java.math.BigInteger;

public final class sprzra {
    public static void cfr_renamed_516(long[] arg0, long arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[n++] = arg1;
            n2 = n;
        }
    }

    public static int cfr_renamed_517(short[][] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            short[] sArray = arg0[n];
            n2 = n2 * 257 + sprzra.cfr_renamed_518(sArray);
            n3 = ++n;
        }
        return n2;
    }

    public static long[] cfr_renamed_519(long[] arg0, long[] arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 == null || arg1.length != arg0.length) {
            return sprzra.cfr_renamed_520(arg0);
        }
        System.arraycopy(arg0, 0, arg1, 0, arg1.length);
        return arg1;
    }

    public static byte[][][] cfr_renamed_521(byte[][][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        byte[][][] byArrayArray = new byte[arg0.length][][];
        int n2 = n = 0;
        while (n2 != byArrayArray.length) {
            int n3 = n++;
            byArrayArray[n3] = sprzra.cfr_renamed_522(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static byte[] cfr_renamed_523(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, byArray, 0, arg1);
            return byArray;
        }
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        return byArray;
    }

    public static long[] cfr_renamed_524(long[] arg0, int arg1) {
        long[] lArray = new long[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, lArray, 0, arg1);
            return lArray;
        }
        System.arraycopy(arg0, 0, lArray, 0, arg0.length);
        return lArray;
    }

    public static int[] cfr_renamed_525(int[] arg0, int arg1) {
        int[] nArray;
        if (arg0 == null) {
            int[] nArray2 = new int[1];
            nArray2[0] = arg1;
            return nArray2;
        }
        int n = arg0.length;
        int[] nArray3 = nArray = new int[n + 1];
        System.arraycopy(arg0, 0, nArray3, 1, n);
        nArray3[0] = arg1;
        return nArray;
    }

    public static byte[] cfr_renamed_526(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        if (arg0 != null && arg1 != null && arg2 != null && arg3 != null) {
            byte[] byArray = new byte[arg0.length + arg1.length + arg2.length + arg3.length];
            System.arraycopy(arg0, 0, byArray, 0, arg0.length);
            System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
            System.arraycopy(arg2, 0, byArray, arg0.length + arg1.length, arg2.length);
            System.arraycopy(arg3, 0, byArray, arg0.length + arg1.length + arg2.length, arg3.length);
            return byArray;
        }
        if (arg3 == null) {
            return sprzra.cfr_renamed_527(arg0, arg1, arg2);
        }
        if (arg2 == null) {
            return sprzra.cfr_renamed_527(arg0, arg1, arg3);
        }
        if (arg1 == null) {
            return sprzra.cfr_renamed_527(arg0, arg2, arg3);
        }
        return sprzra.cfr_renamed_527(arg1, arg2, arg3);
    }

    public static void cfr_renamed_528(short[] arg0, short arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[n++] = arg1;
            n2 = n;
        }
    }

    public static void cfr_renamed_529(char[] arg0, char arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[n++] = arg1;
            n2 = n;
        }
    }

    public static byte[][] cfr_renamed_522(byte[][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        byte[][] byArrayArray = new byte[arg0.length][];
        int n2 = n = 0;
        while (n2 != byArrayArray.length) {
            int n3 = n++;
            byArrayArray[n3] = sprzra.cfr_renamed_158(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static BigInteger[] cfr_renamed_530(BigInteger[] arg0) {
        if (arg0 == null) {
            return null;
        }
        BigInteger[] bigIntegerArray = new BigInteger[arg0.length];
        System.arraycopy(arg0, 0, bigIntegerArray, 0, arg0.length);
        return bigIntegerArray;
    }

    public static int[] cfr_renamed_531(int[] arg0, int arg1, int arg2) {
        int n = sprzra.cfr_renamed_532(arg1, arg2);
        int[] nArray = new int[n];
        if (arg0.length - arg1 < n) {
            System.arraycopy(arg0, arg1, nArray, 0, arg0.length - arg1);
            return nArray;
        }
        System.arraycopy(arg0, arg1, nArray, 0, n);
        return nArray;
    }

    public static byte[] cfr_renamed_533(byte[] arg0, int arg1, int arg2) {
        int n = sprzra.cfr_renamed_532(arg1, arg2);
        byte[] byArray = new byte[n];
        if (arg0.length - arg1 < n) {
            System.arraycopy(arg0, arg1, byArray, 0, arg0.length - arg1);
            return byArray;
        }
        System.arraycopy(arg0, arg1, byArray, 0, n);
        return byArray;
    }

    public static long[] cfr_renamed_520(long[] arg0) {
        if (arg0 == null) {
            return null;
        }
        long[] lArray = new long[arg0.length];
        System.arraycopy(arg0, 0, lArray, 0, arg0.length);
        return lArray;
    }

    private /* synthetic */ sprzra() {
    }

    public static int[] cfr_renamed_534(int[] arg0, int[] arg1) {
        if (arg0 == null) {
            return sprzra.cfr_renamed_535(arg1);
        }
        if (arg1 == null) {
            return sprzra.cfr_renamed_535(arg0);
        }
        int[] nArray = new int[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, nArray, 0, arg0.length);
        System.arraycopy(arg1, 0, nArray, arg0.length, arg1.length);
        return nArray;
    }

    public static int cfr_renamed_536(int[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg2;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[arg1 + n];
        }
        return n2;
    }

    public static byte[] cfr_renamed_537(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        int n = 0;
        int n2 = arg0.length;
        byte[] byArray = new byte[n2];
        while (--n2 >= 0) {
            byte by = arg0[n];
            ++n;
            byArray[n2] = by;
        }
        return byArray;
    }

    public static short[] cfr_renamed_538(short[] arg0) {
        if (arg0 == null) {
            return null;
        }
        short[] sArray = new short[arg0.length];
        System.arraycopy(arg0, 0, sArray, 0, arg0.length);
        return sArray;
    }

    public static void cfr_renamed_492(byte[] arg0, byte arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[n++] = arg1;
            n2 = n;
        }
    }

    public static boolean cfr_renamed_539(int[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (arg0[n] == arg1) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static short[] cfr_renamed_540(short[] arg0, short arg1) {
        short[] sArray;
        if (arg0 == null) {
            short[] sArray2 = new short[1];
            sArray2[0] = arg1;
            return sArray2;
        }
        int n = arg0.length;
        short[] sArray3 = sArray = new short[n + 1];
        System.arraycopy(arg0, 0, sArray3, 1, n);
        sArray3[0] = arg1;
        return sArray;
    }

    public static int[] cfr_renamed_541(int[] arg0, int arg1) {
        int[] nArray = new int[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, nArray, 0, arg1);
            return nArray;
        }
        System.arraycopy(arg0, 0, nArray, 0, arg0.length);
        return nArray;
    }

    public static int cfr_renamed_95(byte[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[n];
        }
        return n2;
    }

    public static int[] cfr_renamed_542(int[] arg0, int arg1) {
        int[] nArray;
        if (arg0 == null) {
            int[] nArray2 = new int[1];
            nArray2[0] = arg1;
            return nArray2;
        }
        int n = arg0.length;
        int[] nArray3 = nArray = new int[n + 1];
        System.arraycopy(arg0, 0, nArray3, 0, n);
        nArray3[n] = arg1;
        return nArray;
    }

    public static byte[] cfr_renamed_543(byte[] arg0, byte[] arg1) {
        if (arg0 != null && arg1 != null) {
            byte[] byArray = new byte[arg0.length + arg1.length];
            System.arraycopy(arg0, 0, byArray, 0, arg0.length);
            System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
            return byArray;
        }
        if (arg1 != null) {
            return sprzra.cfr_renamed_158(arg1);
        }
        return sprzra.cfr_renamed_158(arg0);
    }

    public static int cfr_renamed_544(char[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[n];
        }
        return n2;
    }

    public static int cfr_renamed_545(short[][][] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            short[][] sArray = arg0[n];
            n2 = n2 * 257 + sprzra.cfr_renamed_517(sArray);
            n3 = ++n;
        }
        return n2;
    }

    public static int cfr_renamed_546(Object[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[n].hashCode();
        }
        return n2;
    }

    public static char[] cfr_renamed_547(char[] arg0, int arg1) {
        char[] cArray = new char[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, cArray, 0, arg1);
            return cArray;
        }
        System.arraycopy(arg0, 0, cArray, 0, arg0.length);
        return cArray;
    }

    public static BigInteger[] cfr_renamed_548(BigInteger[] arg0, int arg1, int arg2) {
        int n = sprzra.cfr_renamed_532(arg1, arg2);
        BigInteger[] bigIntegerArray = new BigInteger[n];
        if (arg0.length - arg1 < n) {
            System.arraycopy(arg0, arg1, bigIntegerArray, 0, arg0.length - arg1);
            return bigIntegerArray;
        }
        System.arraycopy(arg0, arg1, bigIntegerArray, 0, n);
        return bigIntegerArray;
    }

    public static boolean cfr_renamed_549(int[] arg0, int[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static BigInteger[] cfr_renamed_550(BigInteger[] arg0, int arg1) {
        BigInteger[] bigIntegerArray = new BigInteger[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, bigIntegerArray, 0, arg1);
            return bigIntegerArray;
        }
        System.arraycopy(arg0, 0, bigIntegerArray, 0, arg0.length);
        return bigIntegerArray;
    }

    public static int cfr_renamed_551(int[][] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            int[] nArray = arg0[n];
            n2 = n2 * 257 + sprzra.cfr_renamed_552(nArray);
            n3 = ++n;
        }
        return n2;
    }

    public static boolean cfr_renamed_553(boolean[] arg0, boolean[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_552(int[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[n];
        }
        return n2;
    }

    public static int cfr_renamed_554(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg2;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[arg1 + n];
        }
        return n2;
    }

    public static byte[] cfr_renamed_555(byte[] arg0, byte arg1) {
        byte[] byArray;
        if (arg0 == null) {
            byte[] byArray2 = new byte[1];
            byArray2[0] = arg1;
            return byArray2;
        }
        int n = arg0.length;
        byte[] byArray3 = byArray = new byte[n + 1];
        System.arraycopy(arg0, 0, byArray3, 0, n);
        byArray3[n] = arg1;
        return byArray;
    }

    public static void cfr_renamed_556(int[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[n++] = arg1;
            n2 = n;
        }
    }

    public static boolean cfr_renamed_557(short[] arg0, short arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (arg0[n] == arg1) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static boolean cfr_renamed_558(Object[] arg0, Object[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != arg0.length) {
            Object object = arg0[n];
            Object object2 = arg1[n];
            if (object == null ? object2 != null : !object.equals(object2)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int[] cfr_renamed_535(int[] arg0) {
        if (arg0 == null) {
            return null;
        }
        int[] nArray = new int[arg0.length];
        System.arraycopy(arg0, 0, nArray, 0, arg0.length);
        return nArray;
    }

    public static byte[] cfr_renamed_527(byte[] arg0, byte[] arg1, byte[] arg2) {
        if (arg0 != null && arg1 != null && arg2 != null) {
            byte[] byArray = new byte[arg0.length + arg1.length + arg2.length];
            System.arraycopy(arg0, 0, byArray, 0, arg0.length);
            System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
            System.arraycopy(arg2, 0, byArray, arg0.length + arg1.length, arg2.length);
            return byArray;
        }
        if (arg1 == null) {
            return sprzra.cfr_renamed_543(arg0, arg2);
        }
        return sprzra.cfr_renamed_543(arg0, arg1);
    }

    public static boolean cfr_renamed_559(byte[] arg0, byte[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            byte by = arg0[n];
            byte by2 = arg1[n];
            n2 |= by ^ by2;
            n3 = ++n;
        }
        return n2 == 0;
    }

    public static byte[] cfr_renamed_560(byte[] arg0, byte arg1) {
        byte[] byArray;
        if (arg0 == null) {
            byte[] byArray2 = new byte[1];
            byArray2[0] = arg1;
            return byArray2;
        }
        int n = arg0.length;
        byte[] byArray3 = byArray = new byte[n + 1];
        System.arraycopy(arg0, 0, byArray3, 1, n);
        byArray3[0] = arg1;
        return byArray;
    }

    public static boolean cfr_renamed_561(char[] arg0, char[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_518(short[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= arg0[n] & 0xFF;
        }
        return n2;
    }

    private static /* synthetic */ int cfr_renamed_532(int arg0, int arg1) {
        int n = arg1 - arg0;
        if (n < 0) {
            StringBuffer stringBuffer = new StringBuffer(arg0);
            stringBuffer.append(sprogb.cfr_renamed_9("5o5")).append(arg1);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        return n;
    }

    public static long[] cfr_renamed_562(long[] arg0, int arg1, int arg2) {
        int n = sprzra.cfr_renamed_532(arg1, arg2);
        long[] lArray = new long[n];
        if (arg0.length - arg1 < n) {
            System.arraycopy(arg0, arg1, lArray, 0, arg0.length - arg1);
            return lArray;
        }
        System.arraycopy(arg0, arg1, lArray, 0, n);
        return lArray;
    }

    public static boolean cfr_renamed_92(byte[] arg0, byte[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static short[] cfr_renamed_563(short[] arg0, short arg1) {
        short[] sArray;
        if (arg0 == null) {
            short[] sArray2 = new short[1];
            sArray2[0] = arg1;
            return sArray2;
        }
        int n = arg0.length;
        short[] sArray3 = sArray = new short[n + 1];
        System.arraycopy(arg0, 0, sArray3, 0, n);
        sArray3[n] = arg1;
        return sArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1 << 1;
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

    public static byte[] cfr_renamed_564(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 == null || arg1.length != arg0.length) {
            return sprzra.cfr_renamed_158(arg0);
        }
        System.arraycopy(arg0, 0, arg1, 0, arg1.length);
        return arg1;
    }

    public static byte[] cfr_renamed_158(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        byte[] byArray = new byte[arg0.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        return byArray;
    }

    public static boolean cfr_renamed_565(long[] arg0, long[] arg1) {
        int n;
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }
}

