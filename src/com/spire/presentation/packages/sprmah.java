/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprifm;

public class sprmah {
    private sprar cfr_renamed_2;
    private sprifm cfr_renamed_3;
    private long cfr_renamed_4;

    public long cfr_renamed_7541() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5;
        int n4 = n2;
        int n5 = 5 << 4 ^ 1;
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
    public sprmah(long l, sprifm sprifm2, sprar sprar2) {
        void arg1;
        void arg0;
        sprmah sprmah2 = this;
        this.cfr_renamed_4 = arg0;
        sprmah2.cfr_renamed_3 = arg1;
        sprmah2.cfr_renamed_2 = sprar2;
    }

    public sprar cfr_renamed_7758() {
        return this.cfr_renamed_2;
    }

    public sprifm cfr_renamed_7735() {
        return this.cfr_renamed_3;
    }
}

