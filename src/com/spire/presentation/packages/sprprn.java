/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfoha;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprprn {
    private sprfoha cfr_renamed_1;
    private String cfr_renamed_2;
    private String cfr_renamed_3;
    private String cfr_renamed_4;

    public String cfr_renamed_1601() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprprn(String string, String string2, String string3, sprfoha sprfoha2) {
        void arg2;
        void arg1;
        void arg0;
        sprprn sprprn2 = this;
        sprprn sprprn3 = this;
        sprprn3.cfr_renamed_3 = arg0;
        sprprn3.cfr_renamed_2 = arg1;
        sprprn2.cfr_renamed_4 = arg2;
        sprprn2.cfr_renamed_1 = sprfoha2;
    }

    public sprfoha cfr_renamed_14266() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_14264() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_14265() {
        return this.cfr_renamed_2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        char c = '\u0001';
        while (n4 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ c);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }
}

