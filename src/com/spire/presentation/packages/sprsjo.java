/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprslo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxmo;

@sprtea
public class sprsjo {
    private String cfr_renamed_3;
    private sprslo cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprsjo(String string, sprslo sprslo2) {
        void arg0;
        sprsjo sprsjo2 = this;
        sprsjo2.cfr_renamed_3 = arg0;
        sprsjo2.cfr_renamed_4 = sprslo2;
    }

    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprslo cfr_renamed_15658() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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

    @sprtea
    public sprsjo(String arg0) {
        this(arg0, sprxmo.cfr_renamed_0);
    }

    public boolean equals(Object arg0) {
        sprsjo sprsjo2 = spresca.cfr_renamed_11777(arg0, sprsjo.class);
        if (sprsjo2 == null) {
            return false;
        }
        if (this == sprsjo2) {
            return true;
        }
        return this.cfr_renamed_313().equals(sprsjo2.cfr_renamed_313()) && this.cfr_renamed_15658().cfr_renamed_4651().startsWith("http://www.ofdspec.org");
    }
}

