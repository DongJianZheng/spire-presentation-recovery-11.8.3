/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprtza {
    private static final String cfr_renamed_4 = "org.bouncycastle.pqc.jcajce.provider.rainbow.";

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ 3 << 1;
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

