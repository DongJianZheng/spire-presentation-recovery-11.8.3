/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhsy;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqdd;
import com.spire.presentation.packages.sprryca;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprxsb;
import com.spire.presentation.packages.spryhs;
import com.spire.presentation.packages.sprzra;

public class sprlld {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ void cfr_renamed_3491(int[] arg0, int arg1, int arg2, int arg3) {
        int n = arg3 * 32;
        int[] nArray = new int[16];
        int[] nArray2 = new int[16];
        int[] nArray3 = new int[n];
        int[] nArray4 = new int[n];
        int[][] nArrayArray = new int[arg2][];
        try {
            int n2;
            int n3;
            System.arraycopy(arg0, arg1, nArray4, 0, n);
            int n4 = n3 = 0;
            while (n4 < arg2) {
                nArrayArray[n3] = sprzra.cfr_renamed_535(nArray4);
                sprlld.cfr_renamed_3492(nArray4, nArray, nArray2, nArray3, arg3);
                n4 = ++n3;
            }
            n3 = arg2 - 1;
            int n5 = n2 = 0;
            while (n5 < arg2) {
                sprlld.cfr_renamed_3493(nArray4, nArrayArray[nArray4[n - 16] & n3], 0, nArray4);
                sprlld.cfr_renamed_3492(nArray4, nArray, nArray2, nArray3, arg3);
                n5 = ++n2;
            }
            System.arraycopy(nArray4, 0, arg0, arg1, n);
        }
        catch (Throwable throwable) {
            sprlld.cfr_renamed_3494(nArrayArray);
            int[][] nArrayArray2 = new int[4][];
            nArrayArray2[0] = nArray4;
            nArrayArray2[1] = nArray;
            nArrayArray2[2] = nArray2;
            nArrayArray2[3] = nArray3;
            sprlld.cfr_renamed_3494(nArrayArray2);
            throw throwable;
        }
        sprlld.cfr_renamed_3494(nArrayArray);
        int[][] nArrayArray3 = new int[4][];
        nArrayArray3[0] = nArray4;
        nArrayArray3[1] = nArray;
        nArrayArray3[2] = nArray2;
        nArrayArray3[3] = nArray3;
        sprlld.cfr_renamed_3494(nArrayArray3);
    }

    private static /* synthetic */ void cfr_renamed_3495(int[] arg0) {
        if (arg0 != null) {
            sprzra.cfr_renamed_556(arg0, 0);
        }
    }

    public static byte[] cfr_renamed_3496(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprhsy.cfr_renamed_9("U\u0003v\u0011u\nw\u0003v\u0007%2%\u000fp\u0011qBg\u0007%\u0012w\rs\u000ba\u0007aL"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(spryhs.cfr_renamed_9("\\Nc[/|/Bz\\{\u000fmJ/_}@yFkJk\u0001"));
        }
        if (arg2 <= 1) {
            throw new IllegalArgumentException(sprhsy.cfr_renamed_9("!j\u0011qBu\u0003w\u0003h\u0007q\u0007wBKBh\u0017v\u0016%\u0000`B;B4L"));
        }
        if (arg3 == 1 && arg2 > 65536) {
            throw new IllegalArgumentException(spryhs.cfr_renamed_9("l`\\{\u000f\u007fN}NbJ{J}\u000fA\u000fbZ|[/Mj\u000f1\u000f>\u000fnAk\u000f3\u000f9\u001a:\u001c9\u0001"));
        }
        if (arg3 < 1) {
            throw new IllegalArgumentException(sprhsy.cfr_renamed_9("G\u000ej\u0001nBv\u000b\u007f\u0007%\u0010%\u000fp\u0011qBg\u0007%\\8B4L"));
        }
        int n = Integer.MAX_VALUE / (128 * arg3 * 8);
        if (arg4 < 1 || arg4 > n) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spryhs.cfr_renamed_9("_N}NcCjCf\\n[f@a\u000f\u007fN}NbJ{J}\u000f\u007f\u000fbZ|[/Mj\u000f1\u0012/\u001e/NaK/\u00132\u000f")).append(n).append(sprhsy.cfr_renamed_9("B-\u0000d\u0011`\u0006%\rkBg\u000ej\u0001nBv\u000b\u007f\u0007%\u0010%\rcB")).append(arg3).append(")").toString());
        }
        if (arg5 < 1) {
            throw new IllegalArgumentException(spryhs.cfr_renamed_9("HJaJ}N{Jk\u000fdJv\u000fcJaH{G/KdcjA/Bz\\{\u000fmJ/\u00112\u000f>\u0001"));
        }
        return sprlld.cfr_renamed_3497(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    private static /* synthetic */ void cfr_renamed_3494(int[][] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlld.cfr_renamed_3495(arg0[n++]);
            n2 = n;
        }
    }

    private static /* synthetic */ void cfr_renamed_3492(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        int n;
        System.arraycopy(arg0, arg0.length - 16, arg1, 0, 16);
        int n2 = 0;
        int n3 = 0;
        int n4 = arg0.length >>> 1;
        int n5 = n = 2 * arg4;
        while (n5 > 0) {
            sprlld.cfr_renamed_3493(arg1, arg0, n2, arg2);
            sprqdd.cfr_renamed_3498(8, arg2, arg1);
            System.arraycopy(arg1, 0, arg3, n3, 16);
            int n6 = n4 + n2;
            n2 += 16;
            n3 = n6 - n3;
            n5 = --n;
        }
        System.arraycopy(arg3, 0, arg0, 0, arg3.length);
    }

    private static /* synthetic */ byte[] cfr_renamed_3499(byte[] arg0, byte[] arg1, int arg2) {
        sprryca sprryca2;
        sprryca sprryca3 = sprryca2 = new sprryca(new sprtfd());
        sprryca3.cfr_renamed_1515(arg0, arg1, 1);
        return ((sprnld)((sprxsb)sprryca3).cfr_renamed_1523(arg2 * 8)).cfr_renamed_1521();
    }

    private static /* synthetic */ void cfr_renamed_3493(int[] arg0, int[] arg1, int arg2, int[] arg3) {
        int n;
        int n2 = n = arg3.length - 1;
        while (n2 >= 0) {
            int n3 = n;
            int n4 = arg0[n3] ^ arg1[arg2 + n];
            arg3[n3] = n4;
            n2 = --n;
        }
    }

    private static /* synthetic */ void cfr_renamed_3500(byte[] arg0) {
        if (arg0 != null) {
            sprzra.cfr_renamed_492(arg0, (byte)0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_3497(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        byte[] byArray;
        int n = arg3 * 128;
        byte[] byArray2 = sprlld.cfr_renamed_3499(arg0, arg1, arg4 * n);
        int[] nArray = null;
        try {
            int n2;
            int n3 = byArray2.length >>> 2;
            nArray = new int[n3];
            sprtsa.cfr_renamed_454(byArray2, 0, nArray);
            int n4 = n >>> 2;
            int n5 = n2 = 0;
            while (n5 < n3) {
                int n6 = n2;
                sprlld.cfr_renamed_3491(nArray, n6, arg2, arg3);
                n5 = n6 + n4;
            }
            sprtsa.cfr_renamed_449(nArray, byArray2, 0);
            byArray = sprlld.cfr_renamed_3499(arg0, byArray2, arg5);
        }
        catch (Throwable throwable) {
            sprlld.cfr_renamed_3500(byArray2);
            sprlld.cfr_renamed_3495(nArray);
            throw throwable;
        }
        sprlld.cfr_renamed_3500(byArray2);
        sprlld.cfr_renamed_3495(nArray);
        return byArray;
    }
}

