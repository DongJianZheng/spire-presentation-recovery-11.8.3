/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprpdp {
    public String cfr_renamed_3;
    public String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpdp(String string, String string2) {
        void arg0;
        sprpdp sprpdp2 = this;
        sprpdp2.cfr_renamed_3 = arg0;
        sprpdp2.cfr_renamed_4 = string2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 3);
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

