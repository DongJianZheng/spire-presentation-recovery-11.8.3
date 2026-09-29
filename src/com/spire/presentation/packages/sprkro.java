/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprsuo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprkro {
    private sprbvo cfr_renamed_0;
    private sprgeja cfr_renamed_1 = sprgeja.cfr_renamed_4;
    private int cfr_renamed_2;
    private sprsuo cfr_renamed_3;
    private sprgeja cfr_renamed_4 = sprgeja.cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17591(sprgeja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprbvo cfr_renamed_17540() {
        return this.cfr_renamed_0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 3 ^ 3;
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
    public void cfr_renamed_17590(sprgeja arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @sprtea
    public void cfr_renamed_17588(sprsuo arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public sprgeja cfr_renamed_17643() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public sprgeja cfr_renamed_17542() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprsuo cfr_renamed_17596() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public int cfr_renamed_3098() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public void cfr_renamed_17592(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public void cfr_renamed_17594(sprbvo arg0) {
        this.cfr_renamed_0 = arg0;
    }
}

