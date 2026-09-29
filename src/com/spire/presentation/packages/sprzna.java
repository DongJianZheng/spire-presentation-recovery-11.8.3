/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjta;
import java.security.spec.KeySpec;

public class sprzna
implements KeySpec {
    private int cfr_renamed_1;
    private sprjta cfr_renamed_2;
    private int cfr_renamed_3;
    private String cfr_renamed_4;

    public int cfr_renamed_1146() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzna(String string, int n, int n2, byte[] byArray) {
        void arg3;
        void arg1;
        void arg0;
        sprzna sprzna2 = this;
        this.cfr_renamed_4 = arg0;
        sprzna2.cfr_renamed_3 = arg1;
        sprzna2.cfr_renamed_1 = n2;
        sprzna sprzna3 = this;
        sprzna2.cfr_renamed_2 = new sprjta((byte[])arg3);
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 3;
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public sprjta cfr_renamed_1154() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzna(String string, int n, int n2, sprjta sprjta2) {
        void arg3;
        void arg1;
        void arg0;
        sprzna sprzna2 = this;
        this.cfr_renamed_4 = arg0;
        sprzna2.cfr_renamed_3 = arg1;
        sprzna2.cfr_renamed_1 = n2;
        sprzna sprzna3 = this;
        sprzna2.cfr_renamed_2 = new sprjta((sprjta)arg3);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_1;
    }
}

