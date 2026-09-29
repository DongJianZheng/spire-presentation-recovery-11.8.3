/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.SecureRandom;

public class sprccb {
    private SecureRandom cfr_renamed_3;
    private int cfr_renamed_4;

    public SecureRandom cfr_renamed_1295() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5;
        int cfr_ignored_0 = (3 ^ 5) << 4;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
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

    /*
     * WARNING - void declaration
     */
    public sprccb(SecureRandom secureRandom, int n) {
        void arg0;
        sprccb sprccb2 = this;
        sprccb2.cfr_renamed_3 = arg0;
        sprccb2.cfr_renamed_4 = n;
    }

    public int cfr_renamed_3483() {
        return this.cfr_renamed_4;
    }
}

