/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprwff;

public abstract class sprzye {
    public static final char cfr_renamed_119 = 'U';
    public static final char cfr_renamed_91 = 'Z';
    public static final char cfr_renamed_0 = 'L';
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public static final char cfr_renamed_3 = 'R';
    public static final char cfr_renamed_4 = 'I';

    public abstract sprcye cfr_renamed_5484(sprcye var1);

    public abstract sprcye cfr_renamed_5485(sprcye var1);

    public abstract boolean cfr_renamed_805();

    public abstract byte[] cfr_renamed_91();

    public int cfr_renamed_884() {
        return this.cfr_renamed_2;
    }

    public abstract String toString();

    public abstract sprzye cfr_renamed_5486(sprzye var1);

    public abstract sprzye cfr_renamed_875();

    public abstract sprzye cfr_renamed_5483(sprwff var1);

    public int cfr_renamed_883() {
        return this.cfr_renamed_1;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

