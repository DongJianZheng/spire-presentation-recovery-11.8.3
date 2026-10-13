/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprfto {
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    public sprfto() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4;
        int cfr_ignored_0 = 5 << 4 ^ 2 << 1;
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

    public sprfto(int n, int n2, int n3, int n4, int n5) {
        sprfto sprfto2 = this;
        sprfto sprfto3 = this;
        this.cfr_renamed_3 = n;
        sprfto3.cfr_renamed_2 = n2;
        sprfto3.cfr_renamed_0 = n3;
        sprfto2.cfr_renamed_4 = n4;
        sprfto2.cfr_renamed_1 = n5;
    }

    public boolean cfr_renamed_18838() {
        return (this.cfr_renamed_1 & 0xFFFF & 1) != 0;
    }
}

