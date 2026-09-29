/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgpx;
import com.spire.presentation.packages.spridr;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprdmp {
    public static final int cfr_renamed_119 = 3;
    public static final int cfr_renamed_91 = 0;
    public static final int cfr_renamed_0 = 5;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 6;
    public static final int cfr_renamed_4 = 1;

    public static int cfr_renamed_5644(String arg0) {
        if (spridr.cfr_renamed_9("+1\u001e+").equals(arg0)) {
            return 0;
        }
        if (sprgpx.cfr_renamed_9("4\u0014\u000b\u001a\b").equals(arg0)) {
            return 1;
        }
        if (spridr.cfr_renamed_9("\u0017\u001d-\u00197").equals(arg0)) {
            return 2;
        }
        if (sprgpx.cfr_renamed_9("6\t\u001f\u0003\t\b").equals(arg0)) {
            return 3;
        }
        if (spridr.cfr_renamed_9("9'\u0018-\u001a0").equals(arg0)) {
            return 4;
        }
        if (sprgpx.cfr_renamed_9("?\u0003\u0018\t\t\u0007\u000f\u000f\r\u0003").equals(arg0)) {
            return 5;
        }
        throw new IllegalArgumentException(spridr.cfr_renamed_9("?*\u0001*\u00053\u0004d,+\u00040,%\u0007-\u0006=)+\u0018!J*\u000b)\u000fj"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 5 << 4;
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

    private /* synthetic */ sprdmp() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprgpx.cfr_renamed_9(":\u0013\u000f\t");
            }
            case 1: {
                return spridr.cfr_renamed_9("\u0016\u0005)\u000b*");
            }
            case 2: {
                return sprgpx.cfr_renamed_9("5\f\u000f\b\u0015");
            }
            case 3: {
                return spridr.cfr_renamed_9("'+\u000e!\u0018*");
            }
            case 4: {
                return sprgpx.cfr_renamed_9("(\u0005\t\u000f\u000b\u0012");
            }
            case 5: {
                return spridr.cfr_renamed_9(".!\t+\u0018%\u001e-\u001c!");
            }
        }
        return sprgpx.cfr_renamed_9("3\u0015\r\u0015\t\f\b[ \u0014\b\u000f \u001a\u000b\u0012\n\u0002%\u0014\u0014\u001eF\r\u0007\u0017\u0013\u001eH");
    }

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

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return spridr.cfr_renamed_9("+1\u001e+");
            }
            case 1: {
                return sprgpx.cfr_renamed_9("4\u0014\u000b\u001a\b");
            }
            case 2: {
                return spridr.cfr_renamed_9("\u0017\u001d-\u00197");
            }
            case 3: {
                return sprgpx.cfr_renamed_9("6\t\u001f\u0003\t\b");
            }
            case 4: {
                return spridr.cfr_renamed_9("9'\u0018-\u001a0");
            }
            case 5: {
                return sprgpx.cfr_renamed_9("?\u0003\u0018\t\t\u0007\u000f\u000f\r\u0003");
            }
        }
        return spridr.cfr_renamed_9("\u0011\u0004/\u0004+\u001d*J\u0002\u0005*\u001e\u0002\u000b)\u0003(\u0013\u0007\u00056\u000fd\u001c%\u00061\u000fj");
    }
}

