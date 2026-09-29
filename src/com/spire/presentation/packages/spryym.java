/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceaa;
import com.spire.presentation.packages.sprgeh;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class spryym {
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 3;

    public static int cfr_renamed_5644(String arg0) {
        if (sprgeh.cfr_renamed_9("QTq^").equals(arg0)) {
            return 0;
        }
        if (sprceaa.cfr_renamed_9("h\u0000B\f}\u0010]\u001dK\u0004").equals(arg0)) {
            return 1;
        }
        if (sprgeh.cfr_renamed_9("LOm^~V").equals(arg0)) {
            return 2;
        }
        if (sprceaa.cfr_renamed_9("3G\u0019h\u0000B\f").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(sprgeh.cfr_renamed_9("JUtUpLq\u001bERo~qOmBLTjI|^?U~Vz\u0015"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprceaa.cfr_renamed_9("`\u0006@\f");
            }
            case 1: {
                return sprgeh.cfr_renamed_9("YRs^LBlOzV");
            }
            case 2: {
                return sprceaa.cfr_renamed_9("}\u001d\\\fO\u0004");
            }
            case 3: {
                return sprgeh.cfr_renamed_9("avKYRs^");
            }
        }
        return sprceaa.cfr_renamed_9("<@\u0002@\u0006Y\u0007\u000e3G\u0019k\u0007Z\u001bW:A\u001c\\\nKIX\bB\u001cKG");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5;
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
            case 0: {
                return sprgeh.cfr_renamed_9("QTq^");
            }
            case 1: {
                return sprceaa.cfr_renamed_9("h\u0000B\f}\u0010]\u001dK\u0004");
            }
            case 2: {
                return sprgeh.cfr_renamed_9("LOm^~V");
            }
            case 3: {
                return sprceaa.cfr_renamed_9("3G\u0019h\u0000B\f");
            }
        }
        return sprgeh.cfr_renamed_9("nqPqThU?avKZUkIfhpNmXz\u001biZsNz\u0015");
    }

    private /* synthetic */ spryym() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }
}

