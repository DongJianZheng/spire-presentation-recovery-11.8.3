/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprbgo {
    private sprtbp cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public boolean cfr_renamed_16642() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 1;
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

    public void cfr_renamed_16643(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprbgo(sprtbp sprtbp2, boolean bl) {
        void arg0;
        sprbgo sprbgo2 = this;
        sprbgo2.cfr_renamed_2 = arg0;
        sprbgo2.cfr_renamed_3 = bl;
    }

    public sprtbp cfr_renamed_16644() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_16645() {
        return this.cfr_renamed_4;
    }
}

