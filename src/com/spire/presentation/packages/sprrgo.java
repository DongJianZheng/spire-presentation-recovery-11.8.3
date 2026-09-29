/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprrgo {
    private spravp cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private spravp cfr_renamed_3;
    private sprwbp cfr_renamed_4;

    public void cfr_renamed_16998(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_13193() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_14500() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_13194(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public spravp cfr_renamed_14503() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_13880() {
        return this.cfr_renamed_2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ 3;
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

    public void cfr_renamed_16999(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public sprwbp cfr_renamed_13268() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_13885() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_17000(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_13733(sprwbp arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_17001(int arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_17002(spravp arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public int cfr_renamed_13879() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_17003(spravp arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public sprrgo() {
        sprrgo sprrgo2 = this;
        sprrgo sprrgo3 = this;
        sprrgo3.cfr_renamed_112 = new spravp(false);
        sprrgo2.cfr_renamed_3 = new spravp();
        sprrgo2.cfr_renamed_4 = sprwbp.cfr_renamed_1447;
        sprrgo2.cfr_renamed_1 = 0;
    }

    public spravp cfr_renamed_13888() {
        return this.cfr_renamed_112;
    }
}

