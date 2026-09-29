/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramb;
import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprgbo {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return spramb.cfr_renamed_9("\u001eY>S");
            }
            case 1: {
                return sprdab.cfr_renamed_9("\u0012f |%s3v");
            }
            case 2: {
                return spramb.cfr_renamed_9("\u001dS$W4W$W");
            }
        }
        return sprdab.cfr_renamed_9("\u0014|*|.e/2\u0011v'Q4a5},B3}1w3f(w2W9b.`5Q.`$27s-g$<");
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
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return spramb.cfr_renamed_9("\u001eY>S");
            }
            case 1: {
                return sprdab.cfr_renamed_9("\u0012f |%s3v");
            }
            case 2: {
                return spramb.cfr_renamed_9("\u001dS$W4W$W");
            }
        }
        return sprdab.cfr_renamed_9("\u0014|*|.e/2\u0011v'Q4a5},B3}1w3f(w2W9b.`5Q.`$27s-g$<");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (spramb.cfr_renamed_9("\u001eY>S").equals(arg0)) {
            return 0;
        }
        if (sprdab.cfr_renamed_9("\u0012f |%s3v").equals(arg0)) {
            return 1;
        }
        if (spramb.cfr_renamed_9("\u001dS$W4W$W").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprdab.cfr_renamed_9("G/y/}6|aB%t\u0002g2f.\u007f\u0011`.b$`5{$a\u0004j1}3f\u0002}3wa| \u007f$<"));
    }

    private /* synthetic */ sprgbo() {
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 4;
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
}

