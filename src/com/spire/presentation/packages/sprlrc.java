/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprlrc {
    public static final short cfr_renamed_3 = 2;
    public static final short cfr_renamed_4 = 1;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 ^ 5) << 1;
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

    public static boolean cfr_renamed_2963(short arg0) {
        return arg0 >= 1 && arg0 <= 2;
    }
}

