/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprzto {
    public static final int cfr_renamed_1 = 8;
    public int cfr_renamed_2;
    public byte cfr_renamed_3;
    public boolean cfr_renamed_4;

    public byte cfr_renamed_17439() {
        if (this.cfr_renamed_4) {
            return (byte)(128 >> this.cfr_renamed_2);
        }
        return (byte)(1 << this.cfr_renamed_2);
    }

    public sprzto(boolean bl) {
        sprzto sprzto2 = this;
        sprzto2.cfr_renamed_4 = bl;
        sprzto2.cfr_renamed_17441();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 4 << 3 ^ (2 ^ 5);
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

    public void cfr_renamed_17441() {
        sprzto sprzto2 = this;
        sprzto2.cfr_renamed_3 = 0;
        sprzto2.cfr_renamed_2 = 0;
    }
}

