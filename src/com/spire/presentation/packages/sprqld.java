/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzra;

public class sprqld {
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public int hashCode() {
        sprqld sprqld2 = this;
        return sprqld2.cfr_renamed_2 ^ sprzra.cfr_renamed_95(sprqld2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprqld(byte[] byArray, int n, int n2) {
        void arg1;
        void arg0;
        sprqld sprqld2 = this;
        this.cfr_renamed_4 = arg0;
        sprqld2.cfr_renamed_2 = arg1;
        sprqld2.cfr_renamed_3 = n2;
    }

    public int cfr_renamed_3374() {
        return this.cfr_renamed_2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprqld)) {
            return false;
        }
        sprqld sprqld2 = (sprqld)arg0;
        if (sprqld2.cfr_renamed_2 != this.cfr_renamed_2) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprqld2.cfr_renamed_4);
    }

    public int cfr_renamed_3375() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 4;
        int cfr_ignored_0 = 4 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5);
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

    public sprqld(byte[] arg0, int arg1) {
        this(arg0, arg1, -1);
    }
}

