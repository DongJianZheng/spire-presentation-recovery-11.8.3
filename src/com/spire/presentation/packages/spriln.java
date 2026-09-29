/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class spriln {
    private sprsuja cfr_renamed_1;
    private sprsuja cfr_renamed_2;
    private sprsuja cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    public sprsuja cfr_renamed_13167() {
        return this.cfr_renamed_3;
    }

    public sprsuja cfr_renamed_13170() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_13621(sprsuja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ (2 ^ 5);
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

    public void cfr_renamed_13622(sprsuja arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_13183(sprsuja arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_13623(sprsuja arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprsuja cfr_renamed_13171() {
        return this.cfr_renamed_4;
    }

    public sprsuja cfr_renamed_13169() {
        return this.cfr_renamed_2;
    }
}

