/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlkaa;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtks;

@sprtea
public final class sprhao {
    public static final int cfr_renamed_93 = 3;
    public static final int cfr_renamed_86 = 2;
    public static final int cfr_renamed_152 = 5;
    public static final int cfr_renamed_112 = 9;
    public static final int cfr_renamed_119 = 10;
    public static final int cfr_renamed_91 = 8;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 7;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 6;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[10];
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
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprtks.cfr_renamed_9("EvsM$'");
            }
            case 1: {
                return sprlkaa.cfr_renamed_9("n_Xd\u000f\f");
            }
            case 2: {
                return sprtks.cfr_renamed_9("EvsM'\"");
            }
            case 3: {
                return sprlkaa.cfr_renamed_9("n_Xdfd\u000fd\u007fd\f\u000b\u000e\n");
            }
            case 4: {
                return sprtks.cfr_renamed_9("BqtJSJ#Js");
            }
            case 5: {
                return sprlkaa.cfr_renamed_9("kZ]aza\naY");
            }
            case 6: {
                return sprtks.cfr_renamed_9("BqtJSJ Js");
            }
            case 7: {
                return sprlkaa.cfr_renamed_9("kZ]aza\taN");
            }
            case 8: {
                return sprtks.cfr_renamed_9("BqtJSJ&");
            }
            case 9: {
                return sprlkaa.cfr_renamed_9("n_XdkZa\n");
            }
        }
        return sprtks.cfr_renamed_9("G{y{}b|5BqtFft|qsgvCwga|}{2csygp<");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprlkaa.cfr_renamed_9("kZ]\u000f\u000e");
            }
            case 1: {
                return sprtks.cfr_renamed_9("Bqt$%");
            }
            case 2: {
                return sprlkaa.cfr_renamed_9("kZ]\f\u000b");
            }
            case 3: {
                return sprtks.cfr_renamed_9("EvsJ$S'\"%#");
            }
            case 4: {
                return sprlkaa.cfr_renamed_9("n_Xz\u000fZ");
            }
            case 5: {
                return sprtks.cfr_renamed_9("EvsS$p");
            }
            case 6: {
                return sprlkaa.cfr_renamed_9("n_Xz\fZ");
            }
            case 7: {
                return sprtks.cfr_renamed_9("EvsS'g");
            }
            case 8: {
                return sprlkaa.cfr_renamed_9("kZ]\u007f\u000f");
            }
            case 9: {
                return sprtks.cfr_renamed_9("EvsGt#");
            }
        }
        return sprlkaa.cfr_renamed_9("nPPPTIU\u001ekZ]mO_UZZL_h^LHWTP\u001bHZRN[\u0015");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 5;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public static int cfr_renamed_5644(String arg0) {
        if (sprtks.cfr_renamed_9("EvsM$'").equals(arg0)) {
            return 0;
        }
        if (sprlkaa.cfr_renamed_9("n_Xd\u000f\f").equals(arg0)) {
            return 1;
        }
        if (sprtks.cfr_renamed_9("EvsM'\"").equals(arg0)) {
            return 2;
        }
        if (sprlkaa.cfr_renamed_9("n_Xdfd\u000fd\u007fd\f\u000b\u000e\n").equals(arg0)) {
            return 3;
        }
        if (sprtks.cfr_renamed_9("BqtJSJ#Js").equals(arg0)) {
            return 4;
        }
        if (sprlkaa.cfr_renamed_9("kZ]aza\naY").equals(arg0)) {
            return 5;
        }
        if (sprtks.cfr_renamed_9("BqtJSJ Js").equals(arg0)) {
            return 6;
        }
        if (sprlkaa.cfr_renamed_9("kZ]aza\taN").equals(arg0)) {
            return 7;
        }
        if (sprtks.cfr_renamed_9("BqtJSJ&").equals(arg0)) {
            return 8;
        }
        if (sprlkaa.cfr_renamed_9("n_XdkZa\n").equals(arg0)) {
            return 9;
        }
        throw new IllegalArgumentException(sprtks.cfr_renamed_9("@|~|ze{2EvsAas{vt`qDp`f{z|5|t\u007fp<"));
    }

    private /* synthetic */ sprhao() {
    }
}

