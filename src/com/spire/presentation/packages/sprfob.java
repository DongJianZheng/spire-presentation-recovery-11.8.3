/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrpb;
import java.security.SecureRandom;

public abstract class sprfob {
    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ int cfr_renamed_1755(int[] arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        var5_5 = arg0.length;
        var6_6 = 0;
        v0 = arg1;
        while (v0[0] == 0) {
            var6_6 += 32;
            sprrpb.cfr_renamed_1736(arg2, arg1, 0);
            v0 = arg1;
        }
        var7_7 = sprfob.cfr_renamed_1756(arg1[0]);
        if (var7_7 > 0) {
            sprrpb.cfr_renamed_1689(arg2, arg1, var7_7, 0);
            var6_6 += var7_7;
        }
        v1 = var7_7 = 0;
        while (v1 < var6_6) {
            if ((arg3[0] & 1) == 0) ** GOTO lbl23
            if (arg4 < 0) {
                arg4 += sprrpb.cfr_renamed_1688(var5_5, arg0, arg3);
                v2 = var5_5;
            } else {
                arg4 += sprrpb.cfr_renamed_1687(var5_5, arg0, arg3);
lbl23:
                // 2 sources

                v2 = var5_5;
            }
            sprrpb.cfr_renamed_1725(v2, arg3, arg4);
            v1 = ++var7_7;
        }
        return arg4;
    }

    public static void cfr_renamed_1757(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n = arg0.length;
        if (sprrpb.cfr_renamed_1696(n, arg1, arg2, arg3) != 0) {
            sprrpb.cfr_renamed_1687(n, arg0, arg3);
        }
    }

    public static int[] cfr_renamed_1758(int[] arg0) {
        int n = arg0.length;
        SecureRandom secureRandom = new SecureRandom();
        int[] nArray = sprrpb.cfr_renamed_1716(n);
        int n2 = arg0[n - 1];
        n2 |= n2 >>> 1;
        n2 |= n2 >>> 2;
        n2 |= n2 >>> 4;
        n2 |= n2 >>> 8;
        n2 |= n2 >>> 16;
        do {
            int n3;
            int n4 = n3 = 0;
            while (n4 != n) {
                nArray[n3++] = secureRandom.nextInt();
                n4 = n3;
            }
            int n5 = n - 1;
            nArray[n5] = nArray[n5] & n2;
        } while (sprrpb.cfr_renamed_1683(n, nArray, arg0));
        return nArray;
    }

    public static int cfr_renamed_1753(int arg0) {
        int n;
        int n2 = n = arg0;
        int n3 = n = n2 * (2 - arg0 * n2);
        int n4 = n = n3 * (2 - arg0 * n3);
        int n5 = n = n4 * (2 - arg0 * n4);
        n = n5 * (2 - arg0 * n5);
        return n;
    }

    public static void cfr_renamed_1759(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n = arg0.length;
        if (sprrpb.cfr_renamed_1707(n, arg1, arg2, arg3) != 0) {
            sprrpb.cfr_renamed_1688(n, arg0, arg3);
        }
    }

    private static /* synthetic */ int cfr_renamed_1756(int arg0) {
        int n = 0;
        int n2 = arg0;
        while ((n2 & 1) == 0) {
            ++n;
            n2 = arg0 >>>= 1;
        }
        return n;
    }

    public static void cfr_renamed_1760(int[] arg0, int[] arg1, int[] arg2) {
        int n = arg0.length;
        if (sprrpb.cfr_renamed_1737(n, arg1)) {
            throw new IllegalArgumentException(sprriia.cfr_renamed_9("]t],\u0019m\u0014b\u0015xZn\u001f,J"));
        }
        if (sprrpb.cfr_renamed_1710(n, arg1)) {
            System.arraycopy(arg1, 0, arg2, 0, n);
            return;
        }
        int[] nArray = sprrpb.cfr_renamed_1733(n, arg1);
        int[] nArray2 = sprrpb.cfr_renamed_1716(n);
        nArray2[0] = 1;
        int n2 = 0;
        if ((nArray[0] & 1) == 0) {
            n2 = sprfob.cfr_renamed_1755(arg0, nArray, n, nArray2, n2);
        }
        if (sprrpb.cfr_renamed_1710(n, nArray)) {
            sprfob.cfr_renamed_1761(arg0, n2, nArray2, arg2);
            return;
        }
        int[] nArray3 = sprrpb.cfr_renamed_1733(n, arg0);
        int[] nArray4 = sprrpb.cfr_renamed_1716(n);
        int n3 = 0;
        int n4 = n;
        while (true) {
            int[] nArray5 = nArray;
            while (nArray5[n4 - 1] == 0 && nArray3[n4 - 1] == 0) {
                nArray5 = nArray;
                --n4;
            }
            if (sprrpb.cfr_renamed_1683(n4, nArray, nArray3)) {
                sprrpb.cfr_renamed_1687(n4, nArray3, nArray);
                n2 += sprrpb.cfr_renamed_1687(n, nArray4, nArray2) - n3;
                n2 = sprfob.cfr_renamed_1755(arg0, nArray, n4, nArray2, n2);
                if (!sprrpb.cfr_renamed_1710(n4, nArray)) continue;
                sprfob.cfr_renamed_1761(arg0, n2, nArray2, arg2);
                return;
            }
            sprrpb.cfr_renamed_1687(n4, nArray, nArray3);
            n3 += sprrpb.cfr_renamed_1687(n, nArray2, nArray4) - n2;
            n3 = sprfob.cfr_renamed_1755(arg0, nArray3, n4, nArray4, n3);
            if (sprrpb.cfr_renamed_1710(n4, nArray3)) break;
        }
        sprfob.cfr_renamed_1761(arg0, n3, nArray4, arg2);
    }

    private static /* synthetic */ void cfr_renamed_1761(int[] arg0, int arg1, int[] arg2, int[] arg3) {
        if (arg1 < 0) {
            sprrpb.cfr_renamed_1696(arg0.length, arg2, arg0, arg3);
            return;
        }
        System.arraycopy(arg2, 0, arg3, 0, arg0.length);
    }
}

