/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprqmn {
    public float cfr_renamed_3;
    public float cfr_renamed_4;

    public sprqmn() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 3 << 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 4 ^ 2 << 1;
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
    public sprqmn(float f, float f2) {
        void arg0;
        sprqmn sprqmn2 = this;
        sprqmn2.cfr_renamed_4 = arg0;
        sprqmn2.cfr_renamed_3 = f2;
    }
}

