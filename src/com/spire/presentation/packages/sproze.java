/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprisda;
import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sprvzb;
import java.math.BigInteger;
import java.util.Arrays;

public final class sproze {
    public static void cfr_renamed_528(short[] arg0, short arg1) {
        Arrays.fill(arg0, arg1);
    }

    public static int cfr_renamed_5237(long[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg2;
        int n2 = n + 1;
        while (--n >= 0) {
            long l = arg0[arg1 + n];
            n2 *= 257;
            n2 ^= (int)l;
            n2 *= 257;
            n2 ^= (int)(l >>> 32);
        }
        return n2;
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
            byArrayArray[n3] = sproze.cfr_renamed_522(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static void cfr_renamed_3408(byte[] arg0) {
        if (null != arg0) {
            Arrays.fill(arg0, (byte)0);
        }
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

    public static void cfr_renamed_5238(char[] arg0, int arg1, int arg2, char arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static void cfr_renamed_5239(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        int n2 = arg1 + arg2 - 1;
        int n3 = n;
        while (n3 < n2) {
            byte[] byArray = arg0;
            byte[] byArray2 = arg0;
            byte by = byArray[n];
            byte by2 = byArray2[n2];
            byArray[n++] = by2;
            byArray2[n2--] = by;
            n3 = n;
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

    public static boolean cfr_renamed_561(char[] arg0, char[] arg1) {
        return Arrays.equals(arg0, arg1);
    }

    public static int[] cfr_renamed_5240(int[] arg0) {
        if (null == arg0) {
            return null;
        }
        int n = 0;
        int n2 = arg0.length - 1;
        int n3 = n;
        while (n3 < n2) {
            int[] nArray = arg0;
            int[] nArray2 = arg0;
            int n4 = nArray[n];
            int n5 = nArray2[n2];
            nArray[n++] = n5;
            nArray2[n2--] = n4;
            n3 = n;
        }
        return arg0;
    }

    public static void cfr_renamed_492(byte[] arg0, byte arg1) {
        Arrays.fill(arg0, arg1);
    }

    public static boolean cfr_renamed_558(Object[] arg0, Object[] arg1) {
        return Arrays.equals(arg0, arg1);
    }

    public static long[] cfr_renamed_562(long[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        long[] lArray = new long[n];
        System.arraycopy(arg0, arg1, lArray, 0, Math.min(arg0.length - arg1, n));
        return lArray;
    }

    public static boolean cfr_renamed_5241(Object[] arg0) {
        return null == arg0 || arg0.length < 1;
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

    public static short[] cfr_renamed_5242(short[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        short[] sArray = new short[n];
        System.arraycopy(arg0, arg1, sArray, 0, Math.min(arg0.length - arg1, n));
        return sArray;
    }

    public static void cfr_renamed_5243(Object[] arg0, Object arg1) {
        Arrays.fill(arg0, arg1);
    }

    public static long[] cfr_renamed_524(long[] arg0, int arg1) {
        long[] lArray = new long[arg1];
        System.arraycopy(arg0, 0, lArray, 0, Math.min(arg0.length, arg1));
        return lArray;
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

    public static void cfr_renamed_516(long[] arg0, long arg1) {
        Arrays.fill(arg0, arg1);
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

    public static boolean cfr_renamed_559(byte[] arg0, byte[] arg1) {
        int n;
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0 == arg1) {
            return true;
        }
        int n2 = arg0.length < arg1.length ? arg0.length : arg1.length;
        int n3 = arg0.length ^ arg1.length;
        int n4 = n = 0;
        while (n4 != n2) {
            byte by = arg0[n];
            byte by2 = arg1[n];
            n3 |= by ^ by2;
            n4 = ++n;
        }
        int n5 = n = n2;
        while (n5 < arg1.length) {
            byte by = arg1[n];
            int n6 = ~arg1[n];
            n3 |= by ^ n6;
            n5 = ++n;
        }
        return n3 == 0;
    }

    public static boolean cfr_renamed_5244(short[] arg0, short[] arg1) {
        return Arrays.equals(arg0, arg1);
    }

    public static boolean cfr_renamed_5245(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (null == arg1) {
            throw new NullPointerException(sprvzb.cfr_renamed_9("_l_-\u001bl\u0016c\u0017yXo\u001d-\u0016x\u0014a"));
        }
        if (null == arg3) {
            throw new NullPointerException(sprisda.cfr_renamed_9("i\u001biY-\u0018 \u0017!\rn\u001b+Y \f\"\u0015"));
        }
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprvzb.cfr_renamed_9("_a\u001dc_-\u001bl\u0016c\u0017yXo\u001d-\u0016h\u001fl\fd\u000eh"));
        }
        if (arg2 > arg1.length - arg0) {
            throw new IndexOutOfBoundsException(sprisda.cfr_renamed_9("^/6(\u001fiY8\u0018\"\f+Y'\u00178\u0018\"\u0010*Y(\u0016<Y=\t+\u001a'\u001f'\u001c*Y\"\u001c \u001e:\u0011"));
        }
        if (arg4 > arg3.length - arg0) {
            throw new IndexOutOfBoundsException(sprvzb.cfr_renamed_9("*\u001aB\u001ek_-\u000el\u0014x\u001d-\u0011c\u000el\u0014d\u001c-\u001eb\n-\u000b}\u001dn\u0011k\u0011h\u001c-\u0014h\u0016j\fe"));
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0) {
            byte by = arg1[arg2 + n];
            byte by2 = arg3[arg4 + n];
            n2 |= by ^ by2;
            n3 = ++n;
        }
        return 0 == n2;
    }

    public static int[] cfr_renamed_541(int[] arg0, int arg1) {
        int[] nArray = new int[arg1];
        System.arraycopy(arg0, 0, nArray, 0, Math.min(arg0.length, arg1));
        return nArray;
    }

    public static short[] cfr_renamed_5246(short[] arg0, int arg1) {
        short[] sArray = new short[arg1];
        System.arraycopy(arg0, 0, sArray, 0, Math.min(arg0.length, arg1));
        return sArray;
    }

    public static boolean cfr_renamed_5247(byte[] arg0) {
        return null == arg0 || arg0.length < 1;
    }

    public static long[] cfr_renamed_519(long[] arg0, long[] arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 == null || arg1.length != arg0.length) {
            return sproze.cfr_renamed_520(arg0);
        }
        System.arraycopy(arg0, 0, arg1, 0, arg1.length);
        return arg1;
    }

    public static byte[] cfr_renamed_526(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        if (null == arg0) {
            return sproze.cfr_renamed_527(arg1, arg2, arg3);
        }
        if (null == arg1) {
            return sproze.cfr_renamed_527(arg0, arg2, arg3);
        }
        if (null == arg2) {
            return sproze.cfr_renamed_527(arg0, arg1, arg3);
        }
        if (null == arg3) {
            return sproze.cfr_renamed_527(arg0, arg1, arg2);
        }
        byte[] byArray = new byte[arg0.length + arg1.length + arg2.length + arg3.length];
        int n = 0;
        System.arraycopy(arg0, 0, byArray, n, arg0.length);
        System.arraycopy(arg1, 0, byArray, n += arg0.length, arg1.length);
        System.arraycopy(arg2, 0, byArray, n += arg1.length, arg2.length);
        System.arraycopy(arg3, 0, byArray, n += arg2.length, arg3.length);
        return byArray;
    }

    public static byte[] cfr_renamed_533(byte[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        byte[] byArray = new byte[n];
        System.arraycopy(arg0, arg1, byArray, 0, Math.min(arg0.length - arg1, n));
        return byArray;
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

    public static void cfr_renamed_556(int[] arg0, int arg1) {
        Arrays.fill(arg0, arg1);
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
            byArrayArray[n3] = sproze.cfr_renamed_158(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static String[] cfr_renamed_5248(String[] arg0, String arg1) {
        String[] stringArray;
        if (arg0 == null) {
            String[] stringArray2 = new String[1];
            stringArray2[0] = arg1;
            return stringArray2;
        }
        int n = arg0.length;
        String[] stringArray3 = stringArray = new String[n + 1];
        System.arraycopy(arg0, 0, stringArray3, 0, n);
        stringArray3[n] = arg1;
        return stringArray;
    }

    public static BigInteger[] cfr_renamed_530(BigInteger[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (BigInteger[])arg0.clone();
    }

    public static byte[] cfr_renamed_527(byte[] arg0, byte[] arg1, byte[] arg2) {
        if (null == arg0) {
            return sproze.cfr_renamed_543(arg1, arg2);
        }
        if (null == arg1) {
            return sproze.cfr_renamed_543(arg0, arg2);
        }
        if (null == arg2) {
            return sproze.cfr_renamed_543(arg0, arg1);
        }
        byte[] byArray = new byte[arg0.length + arg1.length + arg2.length];
        int n = 0;
        System.arraycopy(arg0, 0, byArray, n, arg0.length);
        System.arraycopy(arg1, 0, byArray, n += arg0.length, arg1.length);
        System.arraycopy(arg2, 0, byArray, n += arg1.length, arg2.length);
        return byArray;
    }

    public static byte[] cfr_renamed_5249(byte[] arg0) {
        if (null == arg0) {
            return null;
        }
        int n = 0;
        int n2 = arg0.length - 1;
        int n3 = n;
        while (n3 < n2) {
            byte[] byArray = arg0;
            byte[] byArray2 = arg0;
            byte by = byArray[n];
            byte by2 = byArray2[n2];
            byArray[n++] = by2;
            byArray2[n2--] = by;
            n3 = n;
        }
        return arg0;
    }

    public static int cfr_renamed_551(int[][] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            int[] nArray = arg0[n];
            n2 = n2 * 257 + sproze.cfr_renamed_552(nArray);
            n3 = ++n;
        }
        return n2;
    }

    public static void cfr_renamed_5250(int[] arg0) {
        if (null != arg0) {
            Arrays.fill(arg0, 0);
        }
    }

    public static boolean cfr_renamed_5251(char[] arg0, char[] arg1) {
        int n;
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0 == arg1) {
            return true;
        }
        int n2 = Math.min(arg0.length, arg1.length);
        int n3 = arg0.length ^ arg1.length;
        int n4 = n = 0;
        while (n4 != n2) {
            char c = arg0[n];
            char c2 = arg1[n];
            n3 |= c ^ c2;
            n4 = ++n;
        }
        int n5 = n = n2;
        while (n5 < arg1.length) {
            byte by = (byte)arg1[n];
            byte by2 = (byte)(~arg1[n]);
            n3 |= by ^ by2;
            n5 = ++n;
        }
        return n3 == 0;
    }

    public static int cfr_renamed_546(Object[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= sprmye.cfr_renamed_5182(arg0[n]);
        }
        return n2;
    }

    public static byte[] cfr_renamed_543(byte[] arg0, byte[] arg1) {
        if (null == arg0) {
            return sproze.cfr_renamed_158(arg1);
        }
        if (null == arg1) {
            return sproze.cfr_renamed_158(arg0);
        }
        byte[] byArray = new byte[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
        return byArray;
    }

    public static boolean cfr_renamed_92(byte[] arg0, byte[] arg1) {
        return Arrays.equals(arg0, arg1);
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

    public static boolean cfr_renamed_5252(boolean[] arg0, boolean arg1) {
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

    public static boolean cfr_renamed_553(boolean[] arg0, boolean[] arg1) {
        return Arrays.equals(arg0, arg1);
    }

    public static boolean cfr_renamed_549(int[] arg0, int[] arg1) {
        return Arrays.equals(arg0, arg1);
    }

    public static void cfr_renamed_5253(long[] arg0, int arg1, int arg2, long arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static int[] cfr_renamed_535(int[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (int[])arg0.clone();
    }

    public static boolean[] cfr_renamed_5254(boolean[] arg0, int arg1) {
        boolean[] blArray = new boolean[arg1];
        System.arraycopy(arg0, 0, blArray, 0, Math.min(arg0.length, arg1));
        return blArray;
    }

    public static boolean[] cfr_renamed_5255(boolean[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        boolean[] blArray = new boolean[n];
        System.arraycopy(arg0, arg1, blArray, 0, Math.min(arg0.length - arg1, n));
        return blArray;
    }

    public static long[] cfr_renamed_520(long[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (long[])arg0.clone();
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

    public static boolean cfr_renamed_5135(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int n;
        int n2 = arg2 - arg1;
        int n3 = arg5 - arg4;
        if (n2 != n3) {
            return false;
        }
        int n4 = n = 0;
        while (n4 < n2) {
            if (arg0[arg1 + n] != arg3[arg4 + n]) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    public static BigInteger[] cfr_renamed_550(BigInteger[] arg0, int arg1) {
        BigInteger[] bigIntegerArray = new BigInteger[arg1];
        System.arraycopy(arg0, 0, bigIntegerArray, 0, Math.min(arg0.length, arg1));
        return bigIntegerArray;
    }

    public static byte[] cfr_renamed_564(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 == null || arg1.length != arg0.length) {
            return sproze.cfr_renamed_158(arg0);
        }
        System.arraycopy(arg0, 0, arg1, 0, arg1.length);
        return arg1;
    }

    public static boolean cfr_renamed_5256(long[] arg0, long arg1) {
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

    public static int cfr_renamed_517(short[][] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            short[] sArray = arg0[n];
            n2 = n2 * 257 + sproze.cfr_renamed_518(sArray);
            n3 = ++n;
        }
        return n2;
    }

    public static void cfr_renamed_5257(int[] arg0, int arg1, int arg2, int arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static void cfr_renamed_5258(Object[] arg0, int arg1, int arg2, Object arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static short[] cfr_renamed_5259(short[] arg0, short[] arg1) {
        if (null == arg0) {
            return sproze.cfr_renamed_538(arg1);
        }
        if (null == arg1) {
            return sproze.cfr_renamed_538(arg0);
        }
        short[] sArray = new short[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, sArray, 0, arg0.length);
        System.arraycopy(arg1, 0, sArray, arg0.length, arg1.length);
        return sArray;
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

    public static void cfr_renamed_5260(boolean[] arg0, boolean arg1) {
        Arrays.fill(arg0, arg1);
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

    public static void cfr_renamed_5261(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = arg0.length - 1;
        int n3 = n = 0;
        while (n3 <= n2) {
            int n4 = n++;
            arg1[n4] = arg0[n2 - n4];
            n3 = n;
        }
    }

    public static int cfr_renamed_545(short[][][] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            short[][] sArray = arg0[n];
            n2 = n2 * 257 + sproze.cfr_renamed_517(sArray);
            n3 = ++n;
        }
        return n2;
    }

    public static boolean cfr_renamed_565(long[] arg0, long[] arg1) {
        return Arrays.equals(arg0, arg1);
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

    public static char[] cfr_renamed_1106(char[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (char[])arg0.clone();
    }

    public static void cfr_renamed_5214(byte[] arg0, int arg1, int arg2, byte arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static char[] cfr_renamed_547(char[] arg0, int arg1) {
        char[] cArray = new char[arg1];
        System.arraycopy(arg0, 0, cArray, 0, Math.min(arg0.length, arg1));
        return cArray;
    }

    public static void cfr_renamed_5262(boolean[] arg0, int arg1, int arg2, boolean arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static boolean cfr_renamed_5263(int[] arg0) {
        return null == arg0 || arg0.length < 1;
    }

    public static short[] cfr_renamed_538(short[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (short[])arg0.clone();
    }

    public static void cfr_renamed_5264(short[] arg0, int arg1, int arg2, short arg3) {
        Arrays.fill(arg0, arg1, arg2, arg3);
    }

    public static boolean cfr_renamed_5265(char[] arg0, char arg1) {
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

    public static int[] cfr_renamed_531(int[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        int[] nArray = new int[n];
        System.arraycopy(arg0, arg1, nArray, 0, Math.min(arg0.length - arg1, n));
        return nArray;
    }

    public static int cfr_renamed_5266(long[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = arg0.length;
        int n2 = n + 1;
        while (--n >= 0) {
            long l = arg0[n];
            n2 *= 257;
            n2 ^= (int)l;
            n2 *= 257;
            n2 ^= (int)(l >>> 32);
        }
        return n2;
    }

    public static BigInteger[] cfr_renamed_548(BigInteger[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        BigInteger[] bigIntegerArray = new BigInteger[n];
        System.arraycopy(arg0, arg1, bigIntegerArray, 0, Math.min(arg0.length - arg1, n));
        return bigIntegerArray;
    }

    private /* synthetic */ sproze() {
    }

    public static boolean[] cfr_renamed_5267(boolean[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (boolean[])arg0.clone();
    }

    public static char[] cfr_renamed_5268(char[] arg0, int arg1, int arg2) {
        int n = sproze.cfr_renamed_532(arg1, arg2);
        char[] cArray = new char[n];
        System.arraycopy(arg0, arg1, cArray, 0, Math.min(arg0.length - arg1, n));
        return cArray;
    }

    public static byte[] cfr_renamed_158(byte[] arg0) {
        if (null == arg0) {
            return null;
        }
        return (byte[])arg0.clone();
    }

    public static boolean cfr_renamed_5269(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = arg1 + n;
            n2 |= arg0[n4];
            n3 = ++n;
        }
        return n2 == 0;
    }

    public static int[] cfr_renamed_5270(int[] arg0) {
        if (arg0 == null) {
            return null;
        }
        int n = 0;
        int n2 = arg0.length;
        int[] nArray = new int[n2];
        while (--n2 >= 0) {
            int n3 = arg0[n];
            ++n;
            nArray[n2] = n3;
        }
        return nArray;
    }

    public static int cfr_renamed_5271(byte[] arg0, byte[] arg1) {
        int n;
        if (arg0 == arg1) {
            return 0;
        }
        if (arg0 == null) {
            return -1;
        }
        if (arg1 == null) {
            return 1;
        }
        int n2 = Math.min(arg0.length, arg1.length);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = arg0[n] & 0xFF;
            int n5 = arg1[n] & 0xFF;
            if (n4 < n5) {
                return -1;
            }
            if (n4 > n5) {
                return 1;
            }
            n3 = ++n;
        }
        if (arg0.length < arg1.length) {
            return -1;
        }
        if (arg0.length > arg1.length) {
            return 1;
        }
        return 0;
    }

    private static /* synthetic */ int cfr_renamed_532(int arg0, int arg1) {
        int n = arg1 - arg0;
        if (n < 0) {
            StringBuffer stringBuffer = new StringBuffer(arg0);
            stringBuffer.append(sprisda.cfr_renamed_9("YpY")).append(arg1);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        return n;
    }

    public static int[] cfr_renamed_534(int[] arg0, int[] arg1) {
        if (null == arg0) {
            return sproze.cfr_renamed_535(arg1);
        }
        if (null == arg1) {
            return sproze.cfr_renamed_535(arg0);
        }
        int[] nArray = new int[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, nArray, 0, arg0.length);
        System.arraycopy(arg1, 0, nArray, arg0.length, arg1.length);
        return nArray;
    }

    public static byte[] cfr_renamed_1120(byte[][] arg0) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 != arg0.length) {
            byte[] byArray = arg0[n2];
            n3 += byArray.length;
            n4 = ++n2;
        }
        byte[] byArray = new byte[n3];
        int n5 = 0;
        int n6 = n = 0;
        while (n6 != arg0.length) {
            System.arraycopy(arg0[n], 0, byArray, n5, arg0[n].length);
            byte[] byArray2 = arg0[n];
            n5 += byArray2.length;
            n6 = ++n;
        }
        return byArray;
    }

    public static void cfr_renamed_529(char[] arg0, char arg1) {
        Arrays.fill(arg0, arg1);
    }

    public static boolean cfr_renamed_5272(Object[] arg0) {
        int n;
        if (null == arg0) {
            return true;
        }
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            if (null == arg0[n]) {
                return true;
            }
            n3 = ++n;
        }
        return false;
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

    public static byte[] cfr_renamed_523(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, Math.min(arg0.length, arg1));
        return byArray;
    }

    public static boolean cfr_renamed_5273(byte[] arg0, byte arg1) {
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
}

