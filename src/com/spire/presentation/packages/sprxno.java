/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpo;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprxno {
    private int cfr_renamed_91;
    private sprcpo cfr_renamed_0;
    private sprhio cfr_renamed_1;
    private int cfr_renamed_2;
    private long cfr_renamed_3;
    private int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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

    public long cfr_renamed_16639() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_16638() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_16059() {
        this.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_3);
    }

    public int cfr_renamed_16640() {
        return (int)(this.cfr_renamed_3 - this.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_3274());
    }

    public int cfr_renamed_16058() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_16594() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_2933() {
        sprxno sprxno2 = this;
        long l = sprxno2.cfr_renamed_16064().cfr_renamed_14060().cfr_renamed_3274();
        sprxno2.cfr_renamed_4 = sprxno2.cfr_renamed_1.cfr_renamed_12254();
        sprxno2.cfr_renamed_0.cfr_renamed_16641(this.cfr_renamed_1);
        sprxno2.cfr_renamed_91 = sprxno2.cfr_renamed_1.cfr_renamed_12261();
        sprxno2.cfr_renamed_2 = sprxno2.cfr_renamed_1.cfr_renamed_12261();
        sprxno2.cfr_renamed_3 = l + (long)this.cfr_renamed_91;
    }

    public sprcpo cfr_renamed_4690() {
        return this.cfr_renamed_0;
    }

    public sprhio cfr_renamed_16064() {
        return this.cfr_renamed_1;
    }

    public sprxno(sprhio sprhio2) {
        sprxno sprxno2 = this;
        this.cfr_renamed_0 = new sprcpo();
        this.cfr_renamed_1 = sprhio2;
    }
}

