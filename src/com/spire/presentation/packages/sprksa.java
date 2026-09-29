/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprksa {
    public int cfr_renamed_2;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    public static sprksa cfr_renamed_712(int arg0, int arg1) {
        int n = 0;
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        int n5 = arg1;
        while (n5 != 0) {
            int n6 = arg0 / arg1;
            int n7 = arg0;
            arg0 = arg1;
            arg1 = n7 % arg1;
            n7 = n;
            n = n2 - n6 * n;
            n2 = n7;
            n7 = n3;
            n3 = n4 - n6 * n3;
            n4 = n7;
            n5 = arg1;
        }
        sprksa sprksa2 = new sprksa();
        sprksa2.cfr_renamed_4 = n2;
        sprksa2.cfr_renamed_3 = n4;
        sprksa2.cfr_renamed_2 = arg0;
        return sprksa2;
    }

    private /* synthetic */ sprksa() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 5;
        int cfr_ignored_0 = 3 << 3;
        int n4 = n2;
        int n5 = 5 << 3 ^ 2;
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

