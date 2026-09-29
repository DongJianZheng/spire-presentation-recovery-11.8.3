/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgpx;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprxan {
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 3;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprgpx.cfr_renamed_9("5\t\u0015\u0003");
            }
            case 1: {
                return sprriia.cfr_renamed_9("*m\bx\u0013m\u0016");
            }
            case 2: {
                return sprgpx.cfr_renamed_9("(\u001f\u0015\u0005");
            }
            case 3: {
                return sprriia.cfr_renamed_9("J\u000f`\u0016");
            }
            case 4: {
                return sprgpx.cfr_renamed_9("=\u000f\u0015\u000f\b\u000e");
            }
        }
        return sprriia.cfr_renamed_9("Y\u0014g\u0014c\rbZJ\u0016y\td.u\niZz\u001b`\u000fiT");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprgpx.cfr_renamed_9("5\t\u0015\u0003");
            }
            case 1: {
                return sprriia.cfr_renamed_9("*m\bx\u0013m\u0016");
            }
            case 2: {
                return sprgpx.cfr_renamed_9("(\u001f\u0015\u0005");
            }
            case 3: {
                return sprriia.cfr_renamed_9("J\u000f`\u0016");
            }
            case 4: {
                return sprgpx.cfr_renamed_9("=\u000f\u0015\u000f\b\u000e");
            }
        }
        return sprriia.cfr_renamed_9("Y\u0014g\u0014c\rbZJ\u0016y\td.u\niZz\u001b`\u000fiT");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        return nArray;
    }

    private /* synthetic */ sprxan() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprgpx.cfr_renamed_9("5\t\u0015\u0003").equals(arg0)) {
            return 0;
        }
        if (sprriia.cfr_renamed_9("*m\bx\u0013m\u0016").equals(arg0)) {
            return 1;
        }
        if (sprgpx.cfr_renamed_9("(\u001f\u0015\u0005").equals(arg0)) {
            return 2;
        }
        if (sprriia.cfr_renamed_9("J\u000f`\u0016").equals(arg0)) {
            return 3;
        }
        if (sprgpx.cfr_renamed_9("=\u000f\u0015\u000f\b\u000e").equals(arg0)) {
            return 4;
        }
        throw new IllegalArgumentException(sprriia.cfr_renamed_9("/b\u0011b\u0015{\u0014,<`\u000f\u007f\u0012X\u0003|\u001f,\u0014m\u0017iT"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 3 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

