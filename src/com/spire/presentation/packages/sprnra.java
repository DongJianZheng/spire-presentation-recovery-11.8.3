/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprula;

public abstract class sprnra {
    public static final char cfr_renamed_119 = 'I';
    public static final char cfr_renamed_91 = 'Z';
    public int cfr_renamed_0;
    public static final char cfr_renamed_1 = 'L';
    public static final char cfr_renamed_2 = 'U';
    public int cfr_renamed_3;
    public static final char cfr_renamed_4 = 'R';

    public abstract sprula cfr_renamed_880(sprula var1);

    public abstract sprnra cfr_renamed_875();

    public abstract String toString();

    public abstract sprula cfr_renamed_881(sprula var1);

    public abstract boolean cfr_renamed_805();

    public abstract sprnra cfr_renamed_879(sprkqa var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
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

    public abstract sprnra cfr_renamed_882(sprnra var1);

    public int cfr_renamed_883() {
        return this.cfr_renamed_0;
    }

    public abstract byte[] cfr_renamed_91();

    public int cfr_renamed_884() {
        return this.cfr_renamed_3;
    }
}

