/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.SecureRandom;

public class sprfhf {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

    public static int cfr_renamed_808(SecureRandom arg0, int arg1) {
        int n;
        int n2;
        int n3 = arg1;
        if ((n3 & -n3) == arg1) {
            return (int)((long)arg1 * (long)(arg0.nextInt() >>> 1) >> 31);
        }
        while ((n2 = arg0.nextInt() >>> 1) - (n = n2 % arg1) + (arg1 - 1) < 0) {
        }
        return n;
    }
}

