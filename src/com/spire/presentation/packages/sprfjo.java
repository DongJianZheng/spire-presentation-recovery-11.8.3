/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprfjo {
    public static final int cfr_renamed_86 = 9;
    public static final int cfr_renamed_152 = 5;
    public static final int cfr_renamed_112 = 6;
    public static final int cfr_renamed_119 = 8;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 9;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 7;
    public static final int cfr_renamed_4 = 1;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[9];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 3;
        nArray[3] = 4;
        nArray[4] = 5;
        nArray[5] = 6;
        nArray[6] = 7;
        nArray[7] = 8;
        nArray[8] = 9;
        return nArray;
    }

    private /* synthetic */ sprfjo() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return "Text";
            }
            case 2: {
                return sprboj.cfr_renamed_9("deeo\\xAi");
            }
            case 3: {
                return sprseca.cfr_renamed_9("\\\u001fY\u0013`\u0004}\u0015");
            }
            case 4: {
                return sprboj.cfr_renamed_9("FGOFmDc[b");
            }
            case 5: {
                return sprseca.cfr_renamed_9(">}3z\u0011x\u001fg\u001e");
            }
            case 6: {
                return sprboj.cfr_renamed_9("^_cXy");
            }
            case 7: {
                return sprseca.cfr_renamed_9("?g\u0019`\u0004{\u0006}\u0015");
            }
            case 8: {
                return sprboj.cfr_renamed_9("KFc[e\\xGzAi");
            }
            case 9: {
                return sprseca.cfr_renamed_9("2d\u001f");
            }
        }
        return sprboj.cfr_renamed_9("_FaFe_d\bMLcekXGGnM*^kD\u007fM$");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
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
            case 1: {
                return "Text";
            }
            case 2: {
                return sprseca.cfr_renamed_9("X\u0019Y\u0013`\u0004}\u0015");
            }
            case 3: {
                return sprboj.cfr_renamed_9("`ceo\\xAi");
            }
            case 4: {
                return sprseca.cfr_renamed_9(":{3z\u0011x\u001fg\u001e");
            }
            case 5: {
                return sprboj.cfr_renamed_9("BAOFmDc[b");
            }
            case 6: {
                return sprseca.cfr_renamed_9("\"c\u001fd\u0005");
            }
            case 7: {
                return sprboj.cfr_renamed_9("C[e\\xGzAi");
            }
            case 8: {
                return sprseca.cfr_renamed_9("7z\u001fg\u0019`\u0004{\u0006}\u0015");
            }
            case 9: {
                return sprboj.cfr_renamed_9("NXc");
            }
        }
        return sprseca.cfr_renamed_9("#z\u001dz\u0019c\u001841p\u001fY\u0017d;{\u0012qVb\u0017x\u0003qX");
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("Text".equals(arg0)) {
            return 1;
        }
        if (sprboj.cfr_renamed_9("deeo\\xAi").equals(arg0)) {
            return 2;
        }
        if (sprseca.cfr_renamed_9("\\\u001fY\u0013`\u0004}\u0015").equals(arg0)) {
            return 3;
        }
        if (sprboj.cfr_renamed_9("FGOFmDc[b").equals(arg0)) {
            return 4;
        }
        if (sprseca.cfr_renamed_9(">}3z\u0011x\u001fg\u001e").equals(arg0)) {
            return 5;
        }
        if (sprboj.cfr_renamed_9("^_cXy").equals(arg0)) {
            return 6;
        }
        if (sprseca.cfr_renamed_9("?g\u0019`\u0004{\u0006}\u0015").equals(arg0)) {
            return 7;
        }
        if (sprboj.cfr_renamed_9("KFc[e\\xGzAi").equals(arg0)) {
            return 8;
        }
        if (sprseca.cfr_renamed_9("2d\u001f").equals(arg0)) {
            return 9;
        }
        throw new IllegalArgumentException(sprboj.cfr_renamed_9("}dCdG}F*onAGIzeeLo\bdIgM$"));
    }
}

