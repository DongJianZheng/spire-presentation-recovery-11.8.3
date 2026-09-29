/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerz;
import com.spire.presentation.packages.sprhpg;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprtwn {
    public static final byte cfr_renamed_2 = 1;
    public static final byte cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 2;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ 4 << 1;
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

    private /* synthetic */ sprtwn() {
    }

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return sprerz.cfr_renamed_9("]\u0018s\u0019g\r");
        }
        if (1 == arg0) {
            return sprhpg.cfr_renamed_9("\u001bq.m<s.q*m;");
        }
        return sprerz.cfr_renamed_9("G\u0006y\u0006}\u001f|HF\u001as\u0006a\u0018s\u001aw\u0006f%}\fwHd\t~\u001dwF");
    }

    public static byte cfr_renamed_5644(String arg0) {
        if (sprhpg.cfr_renamed_9("L?b>v*").equals(arg0)) {
            return 0;
        }
        if (sprerz.cfr_renamed_9("<`\t|\u001bb\t`\r|\u001c").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprhpg.cfr_renamed_9("\u001am$m t!#\u001bq.m<s.q*m;N g*#!b\"fa"));
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return sprerz.cfr_renamed_9("]\u0018s\u0019g\r");
        }
        if (1 == arg0) {
            return sprhpg.cfr_renamed_9("\u001bq.m<s.q*m;");
        }
        return sprerz.cfr_renamed_9("G\u0006y\u0006}\u001f|HF\u001as\u0006a\u0018s\u001aw\u0006f%}\fwHd\t~\u001dwF");
    }

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[2];
        byArray[0] = 0;
        byArray[1] = 1;
        return byArray;
    }
}

