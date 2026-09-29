/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkko;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprsno {
    public static final int cfr_renamed_0 = 6;
    private int cfr_renamed_1;
    private sprkko cfr_renamed_2;
    private int cfr_renamed_3;
    private long cfr_renamed_4;

    public int cfr_renamed_2773() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_1;
    }

    public sprsno(sprkko sprkko2) {
        this.cfr_renamed_2 = sprkko2;
    }

    public int cfr_renamed_16057() {
        return (int)(this.cfr_renamed_4 - this.cfr_renamed_2.cfr_renamed_14060().cfr_renamed_3274());
    }

    public int cfr_renamed_16058() {
        return this.cfr_renamed_3 - 6;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 2;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 2;
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

    public void cfr_renamed_16059() {
        this.cfr_renamed_2.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_4);
    }

    public void cfr_renamed_2933() {
        sprsno sprsno2 = this;
        long l = sprsno2.cfr_renamed_2.cfr_renamed_14060().cfr_renamed_3274();
        sprsno2.cfr_renamed_3 = sprsno2.cfr_renamed_2.cfr_renamed_12261() * 2;
        sprsno2.cfr_renamed_1 = sprsno2.cfr_renamed_2.cfr_renamed_13218() & 0xFFFF;
        sprsno2.cfr_renamed_4 = l + (long)this.cfr_renamed_3;
    }
}

