/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgida;
import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class spriko {
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 6;
    public static final int cfr_renamed_3 = 5;
    public static final int cfr_renamed_4 = 0;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[6];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        return nArray;
    }

    private /* synthetic */ spriko() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprppy.cfr_renamed_9("L7s8i0a").equals(arg0)) {
            return 0;
        }
        if (sprgida.cfr_renamed_9("\u0004I5").equals(arg0)) {
            return 1;
        }
        if (sprppy.cfr_renamed_9("\u000eh?U5d:`8g5`").equals(arg0)) {
            return 2;
        }
        if (sprgida.cfr_renamed_9("\u0016I5k=H*").equals(arg0)) {
            return 3;
        }
        if (sprppy.cfr_renamed_9("@4c\ti,v\u0016k5|").equals(arg0)) {
            return 4;
        }
        if (sprgida.cfr_renamed_9("\u0016I5t?Q `&E?").equals(arg0)) {
            return 5;
        }
        throw new IllegalArgumentException(sprppy.cfr_renamed_9("\fk2k6r7%\u0014c\u0014`-d?l5`\r|)`yk8h<+"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprgida.cfr_renamed_9("\u001aJ%E?M7");
            }
            case 1: {
                return sprppy.cfr_renamed_9("R4c");
            }
            case 2: {
                return sprgida.cfr_renamed_9("s>B\u0003H2G6E1H6");
            }
            case 3: {
                return sprppy.cfr_renamed_9("@4c\u0016k5|");
            }
            case 4: {
                return sprgida.cfr_renamed_9("\u0016I5t?Q k=H*");
            }
            case 5: {
                return sprppy.cfr_renamed_9("@4c\ti,v\u001dp8i");
            }
        }
        return sprgida.cfr_renamed_9("\u0006J8J<S=\u0004\u001eB\u001eA'E5M?A\u0007]#AsR2H&A}");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 3 ^ 1;
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
                return sprppy.cfr_renamed_9("L7s8i0a");
            }
            case 1: {
                return sprgida.cfr_renamed_9("\u0004I5");
            }
            case 2: {
                return sprppy.cfr_renamed_9("\u000eh?U5d:`8g5`");
            }
            case 3: {
                return sprgida.cfr_renamed_9("\u0016I5k=H*");
            }
            case 4: {
                return sprppy.cfr_renamed_9("@4c\ti,v\u0016k5|");
            }
            case 5: {
                return sprgida.cfr_renamed_9("\u0016I5t?Q `&E?");
            }
        }
        return sprppy.cfr_renamed_9("P7n7j.kyH?H<q8c0i<Q u<%/d5p<+");
    }
}

