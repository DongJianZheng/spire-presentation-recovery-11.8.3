/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprnjo;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class spryio {
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    public static int cfr_renamed_5644(String arg0) {
        if (sprkrl.cfr_renamed_9("\u000e7! ").equals(arg0)) {
            return 0;
        }
        if (sprnjo.cfr_renamed_9("vH[YP_").equals(arg0)) {
            return 1;
        }
        if (sprkrl.cfr_renamed_9("\u0014! ").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprnjo.cfr_renamed_9("`C^CZZ[\rp@S}YXF~A_\\CRlYDRCXH[Y\u0015CT@P\u0003"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3;
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

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprkrl.cfr_renamed_9("\u000e7! ");
            }
            case 1: {
                return sprnjo.cfr_renamed_9("vH[YP_");
            }
            case 2: {
                return sprkrl.cfr_renamed_9("\u0014! ");
            }
        }
        return sprnjo.cfr_renamed_9("x[F[BBC\u0015hXKeA@^fYGD[JtA\\J[@PCA\rCLYXP\u0003");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprkrl.cfr_renamed_9("\u000e7! ");
            }
            case 1: {
                return sprnjo.cfr_renamed_9("vH[YP_");
            }
            case 2: {
                return sprkrl.cfr_renamed_9("\u0014! ");
            }
        }
        return sprnjo.cfr_renamed_9("x[F[BBC\u0015hXKeA@^fYGD[JtA\\J[@PCA\rCLYXP\u0003");
    }

    private /* synthetic */ spryio() {
    }
}

