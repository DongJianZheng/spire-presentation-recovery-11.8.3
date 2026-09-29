/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public final class sprzme {
    public static long cfr_renamed_5140(String arg0) {
        if (arg0.charAt(1) == 'x' || arg0.charAt(1) == 'X') {
            return Long.parseLong(arg0.substring(2), 16);
        }
        return Long.parseLong(arg0, 16);
    }

    private /* synthetic */ sprzme() {
    }

    public static int cfr_renamed_5141(String arg0) {
        if (arg0.charAt(1) == 'x' || arg0.charAt(1) == 'X') {
            return Integer.parseInt(arg0.substring(2), 16);
        }
        return Integer.parseInt(arg0, 16);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = 1 << 3 ^ 2;
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

