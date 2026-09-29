/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhaj;
import com.spire.presentation.packages.sprhhb;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprdxn {
    public static final int cfr_renamed_102 = 6;
    public static final int cfr_renamed_93 = 8;
    public static final int cfr_renamed_86 = 7;
    public static final int cfr_renamed_152 = 11;
    public static final int cfr_renamed_112 = 3;
    public static final int cfr_renamed_119 = 1;
    public static final int cfr_renamed_91 = 9;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 5;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 10;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 1);
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
                return sprhaj.cfr_renamed_9("?\u0006\u001f\f");
            }
            case 1: {
                return sprhhb.cfr_renamed_9("f|P)\u0003");
            }
            case 2: {
                return sprhaj.cfr_renamed_9("!\r\u0017(@\u000b");
            }
            case 3: {
                return sprhhb.cfr_renamed_9("HR~n)w*\u0006(\u0007");
            }
            case 4: {
                return sprhaj.cfr_renamed_9("!\r\u0017(@\b");
            }
            case 5: {
                return sprhhb.cfr_renamed_9("HR~w*T");
            }
            case 6: {
                return sprhaj.cfr_renamed_9("!\r\u0017(C\b");
            }
            case 7: {
                return sprhhb.cfr_renamed_9("HR~w*C");
            }
            case 8: {
                return sprhaj.cfr_renamed_9("!\r\u0017(B\u000b");
            }
            case 9: {
                return sprhhb.cfr_renamed_9("HR~w+W");
            }
            case 10: {
                return sprhaj.cfr_renamed_9("!\r\u0017(B\u001c");
            }
        }
        return sprhhb.cfr_renamed_9("MXsXwAv\u0016HR~uw[hZqWvU}uwD}\u0016nWtC}\u0018");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[11];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        nArray[7] = 7;
        nArray[8] = 8;
        nArray[9] = 9;
        nArray[10] = 10;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprhaj.cfr_renamed_9("?\u0006\u001f\f");
            }
            case 1: {
                return sprhhb.cfr_renamed_9("f|P)\u0003");
            }
            case 2: {
                return sprhaj.cfr_renamed_9("!\r\u0017(@\u000b");
            }
            case 3: {
                return sprhhb.cfr_renamed_9("HR~n)w*\u0006(\u0007");
            }
            case 4: {
                return sprhaj.cfr_renamed_9("!\r\u0017(@\b");
            }
            case 5: {
                return sprhhb.cfr_renamed_9("HR~w*T");
            }
            case 6: {
                return sprhaj.cfr_renamed_9("!\r\u0017(C\b");
            }
            case 7: {
                return sprhhb.cfr_renamed_9("HR~w*C");
            }
            case 8: {
                return sprhaj.cfr_renamed_9("!\r\u0017(B\u000b");
            }
            case 9: {
                return sprhhb.cfr_renamed_9("HR~w+W");
            }
            case 10: {
                return sprhaj.cfr_renamed_9("!\r\u0017(B\u001c");
            }
        }
        return sprhhb.cfr_renamed_9("MXsXwAv\u0016HR~uw[hZqWvU}uwD}\u0016nWtC}\u0018");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprhaj.cfr_renamed_9("?\u0006\u001f\f").equals(arg0)) {
            return 0;
        }
        if (sprhhb.cfr_renamed_9("f|P)\u0003").equals(arg0)) {
            return 1;
        }
        if (sprhaj.cfr_renamed_9("!\r\u0017(@\u000b").equals(arg0)) {
            return 2;
        }
        if (sprhhb.cfr_renamed_9("HR~n)w*\u0006(\u0007").equals(arg0)) {
            return 3;
        }
        if (sprhaj.cfr_renamed_9("!\r\u0017(@\b").equals(arg0)) {
            return 4;
        }
        if (sprhhb.cfr_renamed_9("HR~w*T").equals(arg0)) {
            return 5;
        }
        if (sprhaj.cfr_renamed_9("!\r\u0017(C\b").equals(arg0)) {
            return 6;
        }
        if (sprhhb.cfr_renamed_9("HR~w*C").equals(arg0)) {
            return 7;
        }
        if (sprhaj.cfr_renamed_9("!\r\u0017(B\u000b").equals(arg0)) {
            return 8;
        }
        if (sprhhb.cfr_renamed_9("HR~w+W").equals(arg0)) {
            return 9;
        }
        if (sprhaj.cfr_renamed_9("!\r\u0017(B\u001c").equals(arg0)) {
            return 10;
        }
        throw new IllegalArgumentException(sprhhb.cfr_renamed_9("cv]vYoX8f|P[YuFt_yX{S[YjS8Xy[}\u0018"));
    }

    private /* synthetic */ sprdxn() {
    }
}

