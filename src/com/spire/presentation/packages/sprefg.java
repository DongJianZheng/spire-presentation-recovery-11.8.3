/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprefg {
    public Object cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_4.toString();
    }

    public sprefg(Object object) {
        this.cfr_renamed_4 = object;
    }

    public Object cfr_renamed_2539() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 5;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = 3;
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

