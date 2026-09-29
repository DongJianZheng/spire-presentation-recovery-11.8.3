/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprvrc {
    public static final short cfr_renamed_0 = 23;
    public static final short cfr_renamed_1 = 21;
    public static final short cfr_renamed_2 = 24;
    public static final short cfr_renamed_3 = 20;
    public static final short cfr_renamed_4 = 22;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 1);
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

