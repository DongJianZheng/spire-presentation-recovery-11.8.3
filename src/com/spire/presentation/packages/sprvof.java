/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgraa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.sprrpf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class sprvof {
    public static void cfr_renamed_450(long arg0, byte[] arg1, int arg2) {
        if (arg1 == null) {
            throw new NullPointerException(sprpzz.cfr_renamed_9("4Z}\t`\u00143A1X"));
        }
        if (arg1.length - arg2 < 8) {
            throw new IllegalArgumentException(sprgraa.cfr_renamed_9("Zn@!Qo[tSi\u0014rD`Wd\u0014hZ!UsF`M"));
        }
        int n = arg2;
        int n2 = arg2;
        int n3 = arg2;
        arg1[n3] = (byte)(arg0 >> 56 & 0xFFL);
        arg1[n3 + 1] = (byte)(arg0 >> 48 & 0xFFL);
        arg1[arg2 + 2] = (byte)(arg0 >> 40 & 0xFFL);
        arg1[n2 + 3] = (byte)(arg0 >> 32 & 0xFFL);
        arg1[n2 + 4] = (byte)(arg0 >> 24 & 0xFFL);
        arg1[arg2 + 5] = (byte)(arg0 >> 16 & 0xFFL);
        arg1[n + 6] = (byte)(arg0 >> 8 & 0xFFL);
        arg1[n + 7] = (byte)(arg0 & 0xFFL);
    }

    public static byte[] cfr_renamed_5749(Object arg0) throws IOException {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream2.writeObject(arg0);
        objectOutputStream2.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean cfr_renamed_5121(byte[][] arg0, byte[][] arg1) {
        int n;
        if (sprvof.cfr_renamed_5750(arg0) || sprvof.cfr_renamed_5750(arg1)) {
            throw new NullPointerException(sprpzz.cfr_renamed_9("<\u00142F}V}\t`\u00143A1X"));
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (!sproze.cfr_renamed_92(arg0[n], arg1[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static byte[][] cfr_renamed_5751(byte[][] arg0) {
        int n;
        if (sprvof.cfr_renamed_5750(arg0)) {
            throw new NullPointerException(sprgraa.cfr_renamed_9("hZ!\\`G!ZtXm\u0014q[hZuQsG"));
        }
        byte[][] byArrayArray = new byte[arg0.length][];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byArrayArray[n3] = new byte[arg0[n3].length];
            System.arraycopy(arg0[n], 0, byArrayArray[n], 0, arg0[n++].length);
            n2 = n;
        }
        return byArrayArray;
    }

    public static boolean cfr_renamed_5752(long arg0, int arg1, int arg2) {
        if (arg0 == 0L) {
            return false;
        }
        return arg0 % (long)Math.pow(1 << arg1, arg2 + 1) == 0L;
    }

    public static byte[] cfr_renamed_5753(byte[] arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprpzz.cfr_renamed_9("4Z}\t`\u00143A1X"));
        }
        byte[] byArray = new byte[arg0.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        return byArray;
    }

    public static void cfr_renamed_5754(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(sprgraa.cfr_renamed_9("Pr@!\t<\u0014oAmX"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprpzz.cfr_renamed_9("G/W}\t`\u00143A1X"));
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprgraa.cfr_renamed_9("nRgGd@!\\`Gu\u0014u[!Vd\u0014?\t!\u0004"));
        }
        if (arg1.length + arg2 > arg0.length) {
            throw new IllegalArgumentException(sprpzz.cfr_renamed_9(".F>\u00141Q3S)\\}\u001f}[;R.Q)\u00140A.@}Z2@}V8\u0014:F8U)Q/\u0014)\\<Z}G4N8\u00142R}P8G)]3U)]2Z"));
        }
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = arg2 + n;
            byte by = arg1[n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static boolean cfr_renamed_5750(byte[][] arg0) {
        int n;
        if (arg0 == null) {
            return true;
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (arg0[n] == null) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static byte[] cfr_renamed_5755(long arg0, int arg1) {
        int n;
        byte[] byArray = new byte[arg1];
        int n2 = n = arg1 - 1;
        while (n2 >= 0) {
            long l = arg0;
            byArray[n] = (byte)l;
            arg0 = l >>> 8;
            n2 = --n;
        }
        return byArray;
    }

    public static void cfr_renamed_5756(byte[][] arg0) {
        int n;
        if (sprvof.cfr_renamed_5750(arg0)) {
            throw new NullPointerException(sprgraa.cfr_renamed_9("L!\\`G!ZtXm\u0014q[hZuQsG"));
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            System.out.println(sprfqe.cfr_renamed_503(arg0[n++]));
            n2 = n;
        }
    }

    public static int cfr_renamed_1340(int arg0) {
        int n = 0;
        int n2 = arg0;
        while ((arg0 = n2 >> 1) != 0) {
            n2 = arg0;
            ++n;
        }
        return n;
    }

    public static boolean cfr_renamed_5757(long arg0, int arg1, int arg2) {
        if (arg0 == 0L) {
            return false;
        }
        return (arg0 + 1L) % (long)Math.pow(1 << arg1, arg2) == 0L;
    }

    public static int cfr_renamed_5657(sprgf arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprpzz.cfr_renamed_9("9]:Q.@}\t`\u00143A1X"));
        }
        String string = arg0.cfr_renamed_1315();
        if (string.equals("SHAKE128")) {
            return 32;
        }
        if (string.equals("SHAKE256")) {
            return 64;
        }
        return arg0.cfr_renamed_1218();
    }

    public static Object cfr_renamed_5758(byte[] arg0, Class arg1) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        sprrpf sprrpf2 = new sprrpf(arg1, byteArrayInputStream);
        Object object = sprrpf2.readObject();
        if (sprrpf2.available() != 0) {
            throw new IOException(sprgraa.cfr_renamed_9("AoQyDdWuQe\u0014eUuU!RnAoP!Uu\u0014dZe\u0014nR!{c^dWu}oDt@R@sQ`Y"));
        }
        if (arg1.isInstance(object)) {
            return object;
        }
        throw new IOException(sprpzz.cfr_renamed_9("A3Q%D8W)Q9\u0014>X<G.\u0014;[(Z9\u00144Z}{?^8W)}3D(@\u000e@/Q<Y"));
    }

    public static byte[] cfr_renamed_5759(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(sprgraa.cfr_renamed_9("GsW!\t<\u0014oAmX"));
        }
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprpzz.cfr_renamed_9("2R;G8@}\\<G)\u0014)[}V8\u0014c\t}\u0004"));
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprgraa.cfr_renamed_9("mQoSu\\!\\`Gu\u0014u[!Vd\u0014?\t!\u0004"));
        }
        if (arg1 + arg2 > arg0.length) {
            throw new IllegalArgumentException(sprpzz.cfr_renamed_9("[;R.Q)\u0014v\u00141Q3S)\\}Y(G)\u00143[)\u0014?Q}S/Q<@8F}@5Q3\u0014.]'Q}[;\u0014.[(F>Q}U/F<M"));
        }
        byte[] byArray = new byte[arg2];
        int n2 = n = 0;
        while (n2 < byArray.length) {
            int n3 = n++;
            byArray[n3] = arg0[arg1 + n3];
            n2 = n;
        }
        return byArray;
    }

    public static int cfr_renamed_5760(long arg0, int arg1) {
        return (int)(arg0 & (1L << arg1) - 1L);
    }

    public static long cfr_renamed_5761(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(sprgraa.cfr_renamed_9("hZ!\t<\u0014oAmX"));
        }
        long l = 0L;
        int n2 = n = arg1;
        while (n2 < arg1 + arg2) {
            int n3 = arg0[n] & 0xFF;
            l = l << 8 | (long)n3;
            n2 = ++n;
        }
        return l;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 3 ^ 5;
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

    public static int cfr_renamed_5762(int arg0, int arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg1) {
            if ((arg0 >> n & 1) == 0) {
                n2 = n;
                return n2;
            }
            n3 = ++n;
        }
        return n2;
    }

    public static long cfr_renamed_5763(long arg0, int arg1) {
        return arg0 >> arg1;
    }

    public static boolean cfr_renamed_5764(int arg0, long arg1) {
        if (arg1 < 0L) {
            throw new IllegalStateException(sprpzz.cfr_renamed_9("4Z9Q%\u00140A.@}Z2@}V8\u00143Q:U)]+Q"));
        }
        return arg1 < 1L << arg0;
    }
}

