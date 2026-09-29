/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;

public class sprjpl {
    public sprak cfr_renamed_4 = null;

    public void cfr_renamed_10802(sprak arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 5;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
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

