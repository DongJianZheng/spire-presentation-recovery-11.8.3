/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sprnrk;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprruk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruaf;

public class sprlxk {
    private static /* synthetic */ boolean cfr_renamed_10165(int arg0) {
        int n = arg0;
        return (n & n - 1) == 0;
    }

    private static /* synthetic */ void cfr_renamed_3500(byte[] arg0) {
        if (arg0 != null) {
            sproze.cfr_renamed_492(arg0, (byte)0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ void cfr_renamed_10166(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = spruaf.cfr_renamed_5203(arg2);
        int n2 = arg2 >>> arg3;
        int n3 = 1 << arg3;
        int n4 = n2 - 1;
        int n5 = n - arg3;
        int n6 = arg4 * 32;
        int[] nArray = new int[16];
        int[] nArray2 = new int[16];
        int[] nArray3 = new int[n6];
        int[] nArray4 = new int[n6];
        int[][] nArrayArray = new int[n3][];
        try {
            int n7;
            int n8;
            int n9;
            System.arraycopy(arg0, arg1, nArray4, 0, n6);
            int n10 = n9 = 0;
            while (n10 < n3) {
                int n11;
                int[] nArray5 = new int[n2 * n6];
                nArrayArray[n9] = nArray5;
                n8 = 0;
                int n12 = n11 = 0;
                while (n12 < n2) {
                    System.arraycopy(nArray4, 0, nArray5, n8, n6);
                    sprlxk.cfr_renamed_3492(nArray4, nArray, nArray2, nArray3, arg4);
                    System.arraycopy(nArray3, 0, nArray5, n8 += n6, n6);
                    n8 += n6;
                    sprlxk.cfr_renamed_3492(nArray3, nArray, nArray2, nArray4, arg4);
                    n12 = n11 += 2;
                }
                n10 = ++n9;
            }
            n9 = arg2 - 1;
            int n13 = n7 = 0;
            while (n13 < arg2) {
                n8 = nArray4[n6 - 16] & n9;
                int[] nArray6 = nArrayArray[n8 >>> n5];
                int n14 = (n8 & n4) * n6;
                System.arraycopy(nArray6, n14, nArray3, 0, n6);
                sprlxk.cfr_renamed_3493(nArray3, nArray4, 0, nArray3);
                sprlxk.cfr_renamed_3492(nArray3, nArray, nArray2, nArray4, arg4);
                n13 = ++n7;
            }
            System.arraycopy(nArray4, 0, arg0, arg1, n6);
        }
        catch (Throwable throwable) {
            sprlxk.cfr_renamed_3494(nArrayArray);
            int[][] nArrayArray2 = new int[4][];
            nArrayArray2[0] = nArray4;
            nArrayArray2[1] = nArray;
            nArrayArray2[2] = nArray2;
            nArrayArray2[3] = nArray3;
            sprlxk.cfr_renamed_3494(nArrayArray2);
            throw throwable;
        }
        sprlxk.cfr_renamed_3494(nArrayArray);
        int[][] nArrayArray3 = new int[4][];
        nArrayArray3[0] = nArray4;
        nArrayArray3[1] = nArray;
        nArrayArray3[2] = nArray2;
        nArrayArray3[3] = nArray3;
        sprlxk.cfr_renamed_3494(nArrayArray3);
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ byte[] cfr_renamed_3497(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        byte[] byArray;
        int n = arg3 * 128;
        byte[] byArray2 = sprlxk.cfr_renamed_3499(arg0, arg1, arg4 * n);
        int[] nArray = null;
        try {
            int n2;
            int n3 = byArray2.length >>> 2;
            nArray = new int[n3];
            sprpxe.cfr_renamed_454(byArray2, 0, nArray);
            int n4 = 0;
            int n5 = arg2;
            for (int i = arg2 * arg3; n5 - n4 > 2 && i > 1024; i >>>= 1) {
                ++n4;
                n5 = arg2;
            }
            int n6 = n >>> 2;
            int n7 = n2 = 0;
            while (n7 < n3) {
                int n8 = n2;
                sprlxk.cfr_renamed_10166(nArray, n8, arg2, n4, arg3);
                n7 = n8 + n6;
            }
            sprpxe.cfr_renamed_449(nArray, byArray2, 0);
            byArray = sprlxk.cfr_renamed_3499(arg0, byArray2, arg5);
        }
        catch (Throwable throwable) {
            sprlxk.cfr_renamed_3500(byArray2);
            sprlxk.cfr_renamed_3495(nArray);
            throw throwable;
        }
        sprlxk.cfr_renamed_3500(byArray2);
        sprlxk.cfr_renamed_3495(nArray);
        return byArray;
    }

    private static /* synthetic */ void cfr_renamed_3492(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        int n;
        System.arraycopy(arg0, arg0.length - 16, arg1, 0, 16);
        int n2 = 0;
        int n3 = 0;
        int n4 = arg0.length >>> 1;
        int n5 = n = 2 * arg4;
        while (n5 > 0) {
            sprlxk.cfr_renamed_3493(arg1, arg0, n2, arg2);
            sprruk.cfr_renamed_3498(8, arg2, arg1);
            System.arraycopy(arg1, 0, arg3, n3, 16);
            int n6 = n4 + n2;
            n2 += 16;
            n3 = n6 - n3;
            n5 = --n;
        }
    }

    private static /* synthetic */ void cfr_renamed_3494(int[][] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlxk.cfr_renamed_3495(arg0[n++]);
            n2 = n;
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_3499(byte[] arg0, byte[] arg1, int arg2) {
        sprnrk sprnrk2;
        sprnrk sprnrk3 = sprnrk2 = new sprnrk(sprohl.cfr_renamed_7529());
        sprnrk3.cfr_renamed_1515(arg0, arg1, 1);
        return ((sprtpk)((sprkuh)sprnrk3).cfr_renamed_1523(arg2 * 8)).cfr_renamed_1521();
    }

    public static byte[] cfr_renamed_3496(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprnez.cfr_renamed_9("\u001b\u00028\u0010;\u000b9\u00028\u0006k3k\u000e>\u0010?C)\u0006k\u00139\f=\n/\u0006/M"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprdkea.cfr_renamed_9("Bi}|1[1ed{e(sm1xcggaumu&"));
        }
        if (arg2 <= 1 || !sprlxk.cfr_renamed_10165(arg2)) {
            throw new IllegalArgumentException(sprnez.cfr_renamed_9(" $\u0010?C;\u00029\u0002&\u0006?\u00069C\u0005C&\u00168\u0017k\u0001.CuCzC*\r/C*C;\f<\u00069C$\u0005kQ"));
        }
        if (arg3 == 1 && arg2 >= 65536) {
            throw new IllegalArgumentException(sprdkea.cfr_renamed_9("K~{e(aici|memc(_(|}b|1jt(/( (pfu(-('=$;'&"));
        }
        if (arg3 < 1) {
            throw new IllegalArgumentException(sprnez.cfr_renamed_9("\t\u000f$\u0000 C8\n1\u0006k\u0011k\u000e>\u0010?C)\u0006k]vCzM"));
        }
        int n = Integer.MAX_VALUE / (128 * arg3 * 8);
        if (arg4 < 1 || arg4 > n) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("Aici}dtdx{p|xg\u007f(aici|memc(a(|}b|1jt(/5191i\u007fl14,(")).append(n).append(sprnez.cfr_renamed_9("Cc\u0001*\u0010.\u0007k\f%C)\u000f$\u0000 C8\n1\u0006k\u0011k\f-C")).append(arg3).append(")").toString());
        }
        if (arg5 < 1) {
            throw new IllegalArgumentException(sprdkea.cfr_renamed_9("Vm\u007fmciemu(zmh(}m\u007foe`1lzDtf1ed{e(sm16,( &"));
        }
        return sprlxk.cfr_renamed_3497(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    private static /* synthetic */ void cfr_renamed_3495(int[] arg0) {
        if (arg0 != null) {
            sproze.cfr_renamed_556(arg0, 0);
        }
    }

    private /* synthetic */ sprlxk() {
    }
}

