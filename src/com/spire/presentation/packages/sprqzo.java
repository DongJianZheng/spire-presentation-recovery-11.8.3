/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprqzo {
    @sprtea
    public short cfr_renamed_3;
    @sprtea
    public short cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_18252(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_14639(this.cfr_renamed_3);
        v0.cfr_renamed_14639(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprqzo(sprmzo sprmzo2) {
        void arg0;
        sprqzo sprqzo2 = this;
        sprqzo2.cfr_renamed_3 = arg0.cfr_renamed_12254();
        sprqzo2.cfr_renamed_4 = sprmzo2.cfr_renamed_12254();
    }

    public sprqzo() {
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprqzo(short s, short s2) {
        void arg0;
        sprqzo sprqzo2 = this;
        sprqzo2.cfr_renamed_3 = arg0;
        sprqzo2.cfr_renamed_4 = s2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4;
        int cfr_ignored_0 = 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 3);
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

