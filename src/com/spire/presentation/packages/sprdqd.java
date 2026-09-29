/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraud;
import com.spire.presentation.packages.sprtzd;

public class sprdqd {
    public static void cfr_renamed_4182(String arg0, String arg1) {
        sprtzd sprtzd2 = new sprtzd(arg0);
        spraud.cfr_renamed_3.cfr_renamed_4097(sprtzd2, arg1);
    }

    public static void cfr_renamed_4183(String arg0, String arg1) {
        sprtzd sprtzd2 = new sprtzd(arg0);
        spraud.cfr_renamed_3.cfr_renamed_4098(sprtzd2, arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 5;
        int cfr_ignored_0 = 5 << 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 2;
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

