/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprmye {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 3;
        int n4 = n2;
        int n5 = 5 << 4;
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

    public static int cfr_renamed_5182(Object arg0) {
        if (null == arg0) {
            return 0;
        }
        return arg0.hashCode();
    }

    public static boolean cfr_renamed_5073(Object arg0, Object arg1) {
        return arg0 == arg1 || null != arg0 && null != arg1 && arg0.equals(arg1);
    }
}

