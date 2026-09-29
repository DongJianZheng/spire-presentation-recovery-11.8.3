/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.SecureRandom;

public class sprged {
    private final int cfr_renamed_119;
    public static final int cfr_renamed_91 = 2;
    private final SecureRandom cfr_renamed_0;
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    public sprged(int arg0, int arg1, int arg2, SecureRandom arg3) {
        this(arg0, arg1, arg2, arg3, -1);
    }

    public int cfr_renamed_3341() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprged(int n, int n2, int n3, SecureRandom secureRandom, int n4) {
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        sprged sprged2 = this;
        sprged sprged3 = this;
        this.cfr_renamed_1 = arg0;
        sprged3.cfr_renamed_4 = arg1;
        sprged3.cfr_renamed_3 = arg2;
        sprged2.cfr_renamed_119 = arg4;
        sprged2.cfr_renamed_0 = secureRandom;
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 3 << 3 ^ 3;
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

    public int cfr_renamed_3375() {
        return this.cfr_renamed_119;
    }

    public SecureRandom cfr_renamed_1295() {
        return this.cfr_renamed_0;
    }
}

