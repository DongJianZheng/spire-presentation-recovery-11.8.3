/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxuo;

@sprtea
public class sprsap {
    public int cfr_renamed_2;
    public sprxuo[] cfr_renamed_3;
    public sprxuo[] cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 1;
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 4;
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

    /*
     * WARNING - void declaration
     */
    public sprsap(int n, sprxuo[] sprxuoArray, sprxuo[] sprxuoArray2) {
        void arg1;
        void arg0;
        sprsap sprsap2 = this;
        this.cfr_renamed_2 = arg0;
        sprsap2.cfr_renamed_3 = arg1;
        sprsap2.cfr_renamed_4 = sprxuoArray2;
    }
}

