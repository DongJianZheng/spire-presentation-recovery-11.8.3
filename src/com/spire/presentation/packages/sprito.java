/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprztf;

@sprtea
public final class sprito {
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 2;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = 2;
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
                return sprztf.cfr_renamed_9("3\b\u0016\u0003");
            }
            case 1: {
                return "Space";
            }
            case 2: {
                return sprcmn.cfr_renamed_9("Q(v;x\u0016z4v");
            }
        }
        return sprztf.cfr_renamed_9("1\t\u000f\t\u000b\u0010\nG&\u0006\u0017\u000e\u0007+\u0005\u001e\u000b\u0012\u00104\u0014\u0006\n3\u001d\u0017\u0001G\u0012\u0006\b\u0012\u0001I");
    }

    private /* synthetic */ sprito() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprcmn.cfr_renamed_9("\r|(w").equals(arg0)) {
            return 0;
        }
        if ("Space".equals(arg0)) {
            return 1;
        }
        if (sprztf.cfr_renamed_9("%\u0016\u0002\u0005\f(\u000e\n\u0002").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprcmn.cfr_renamed_9("F4x4|-}zQ;`3p\u0016r#|/g\tc;}\u000ej*vz};~?="));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprztf.cfr_renamed_9("3\b\u0016\u0003");
            }
            case 1: {
                return "Space";
            }
            case 2: {
                return sprcmn.cfr_renamed_9("Q(v;x\u0016z4v");
            }
        }
        return sprztf.cfr_renamed_9("1\t\u000f\t\u000b\u0010\nG&\u0006\u0017\u000e\u0007+\u0005\u001e\u000b\u0012\u00104\u0014\u0006\n3\u001d\u0017\u0001G\u0012\u0006\b\u0012\u0001I");
    }
}

