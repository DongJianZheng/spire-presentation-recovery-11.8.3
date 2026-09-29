/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgep {
    private sprgep cfr_renamed_3;
    private int cfr_renamed_4;

    @sprtea
    public sprgep cfr_renamed_12446() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprgep(int n, sprgep sprgep2) {
        void arg0;
        sprgep sprgep3 = this;
        sprgep3.cfr_renamed_4 = arg0;
        sprgep3.cfr_renamed_3 = sprgep2;
    }

    @sprtea
    public int cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_19105(sprgep arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
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
    public void cfr_renamed_5866(int arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

