/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprygn;

@sprtea
public final class sprcvo {
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 2 << 3 ^ 1;
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
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprygn.cfr_renamed_9("\t\u001a3\u001c");
            }
            case 2: {
                return sprawc.cfr_renamed_9("OLu`lZj");
            }
        }
        return sprygn.cfr_renamed_9("\"$\u001c$\u0018=\u0019j##\u0011,>$\u001c\u0019\u0012>4%\u0005/W<\u0016&\u0002/Y");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprawc.cfr_renamed_9("`lZj");
            }
            case 2: {
                return sprygn.cfr_renamed_9("9%\u0003\t\u001a3\u001c");
            }
        }
        return sprawc.cfr_renamed_9("TMjMnTo\u0003UJgEHMjpdWBLsF!U`OtF/");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 1;
        nArray[1] = 2;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprygn.cfr_renamed_9("\t\u001a3\u001c").equals(arg0)) {
            return 1;
        }
        if (sprawc.cfr_renamed_9("OLu`lZj").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprygn.cfr_renamed_9("\u001f\u0019!\u0019%\u0000$W\u001e\u001e,\u0011\u0003\u0019!$/\u0003\t\u00188\u0012j\u0019+\u001a/Y"));
    }

    private /* synthetic */ sprcvo() {
    }
}

