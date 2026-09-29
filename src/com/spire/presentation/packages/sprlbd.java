/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprlbd {
    public int cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_2928() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprlbd(int n, byte[] byArray) {
        void arg0;
        sprlbd sprlbd2 = this;
        sprlbd2.cfr_renamed_3 = arg0;
        sprlbd2.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 2 << 1;
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3 << 1;
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

