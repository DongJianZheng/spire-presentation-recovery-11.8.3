/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryez;
import com.spire.presentation.packages.sprzpf;

@sprtea
public final class sprjjo {
    public static final int cfr_renamed_112 = 2;
    public static final int cfr_renamed_119 = 7;
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 6;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 5;

    public static int cfr_renamed_5644(String arg0) {
        if (sprzpf.cfr_renamed_9("\u000et+w=").equals(arg0)) {
            return 0;
        }
        if (spryez.cfr_renamed_9("PTgMx\\m").equals(arg0)) {
            return 1;
        }
        if (sprzpf.cfr_renamed_9("\tr!~5").equals(arg0)) {
            return 2;
        }
        if (spryez.cfr_renamed_9("DR}S`").equals(arg0)) {
            return 3;
        }
        if (sprzpf.cfr_renamed_9("R7x1").equals(arg0)) {
            return 4;
        }
        if (spryez.cfr_renamed_9("y{^aPqS`").equals(arg0)) {
            return 5;
        }
        if (sprzpf.cfr_renamed_9("\u0014r5w0v<o+").equals(arg0)) {
            return 6;
        }
        throw new IllegalArgumentException(spryez.cfr_renamed_9("AS\u007fS{Jz\u001dSY}zf\\dU}^ghzT`\u001dz\\yX:"));
    }

    private /* synthetic */ sprjjo() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprzpf.cfr_renamed_9("\u000et+w=");
            }
            case 1: {
                return spryez.cfr_renamed_9("PTgMx\\m");
            }
            case 2: {
                return sprzpf.cfr_renamed_9("\tr!~5");
            }
            case 3: {
                return spryez.cfr_renamed_9("DR}S`");
            }
            case 4: {
                return sprzpf.cfr_renamed_9("R7x1");
            }
            case 5: {
                return spryez.cfr_renamed_9("y{^aPqS`");
            }
            case 6: {
                return sprzpf.cfr_renamed_9("\u0014r5w0v<o+");
            }
        }
        return spryez.cfr_renamed_9("hzVzRcS4zpTSOuM|TwNAS}I4KuQaX:");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprzpf.cfr_renamed_9("\u000et+w=");
            }
            case 1: {
                return spryez.cfr_renamed_9("PTgMx\\m");
            }
            case 2: {
                return sprzpf.cfr_renamed_9("\tr!~5");
            }
            case 3: {
                return spryez.cfr_renamed_9("DR}S`");
            }
            case 4: {
                return sprzpf.cfr_renamed_9("R7x1");
            }
            case 5: {
                return spryez.cfr_renamed_9("y{^aPqS`");
            }
            case 6: {
                return sprzpf.cfr_renamed_9("\u0014r5w0v<o+");
            }
        }
        return spryez.cfr_renamed_9("hzVzRcS4zpTSOuM|TwNAS}I4KuQaX:");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[7];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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

