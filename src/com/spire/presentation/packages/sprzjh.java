/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public abstract class sprzjh {
    public static long cfr_renamed_8608(long arg0, long arg1, int arg2) {
        return (arg0 & arg1) << arg2 | arg0 >>> arg2 & arg1;
    }

    public static int cfr_renamed_6263(int arg0, int arg1, int arg2) {
        return (arg0 & arg1) << arg2 | arg0 >>> arg2 & arg1;
    }

    public static int cfr_renamed_8598(int arg0, int arg1, int arg2) {
        int n = arg0;
        int n2 = (n ^ n >>> arg2) & arg1;
        return n2 ^ n2 << arg2 ^ arg0;
    }

    public static long cfr_renamed_8593(long arg0, long arg1, int arg2) {
        long l = arg0;
        long l2 = (l ^ l >>> arg2) & arg1;
        return l2 ^ l2 << arg2 ^ arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 5 << 1;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 4 << 3 ^ (2 ^ 5);
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

