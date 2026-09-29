/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwvn;

@sprtea
public abstract class sprduo {
    public double cfr_renamed_102;
    public sprerp cfr_renamed_93;
    public int cfr_renamed_86;
    public sprwvn cfr_renamed_152;
    public double cfr_renamed_112;
    public double cfr_renamed_119;
    public sprerp cfr_renamed_91;
    public double cfr_renamed_0;
    public double cfr_renamed_1;
    public double cfr_renamed_2;
    public double cfr_renamed_3;
    public double cfr_renamed_4;

    public int cfr_renamed_17031() {
        return this.cfr_renamed_86;
    }

    public boolean cfr_renamed_17032() {
        return false;
    }

    public double cfr_renamed_17033() {
        return this.cfr_renamed_119;
    }

    public double cfr_renamed_17034() {
        return this.cfr_renamed_0;
    }

    public double cfr_renamed_17035(int arg0) {
        return this.cfr_renamed_91.cfr_renamed_576(arg0);
    }

    public sprwbp cfr_renamed_17036(int arg0) {
        return (sprwbp)this.cfr_renamed_152.get(arg0);
    }

    public double cfr_renamed_17037() {
        return this.cfr_renamed_2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (2 ^ 5);
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

    public double cfr_renamed_17038() {
        return this.cfr_renamed_112;
    }

    public double cfr_renamed_17039() {
        return this.cfr_renamed_3;
    }

    public double cfr_renamed_17040() {
        return this.cfr_renamed_102;
    }

    public double cfr_renamed_17041() {
        return this.cfr_renamed_1;
    }

    public double cfr_renamed_17042(int arg0) {
        return this.cfr_renamed_93.cfr_renamed_576(arg0);
    }

    public double cfr_renamed_17043() {
        return this.cfr_renamed_4;
    }
}

