/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprrmo {
    private int cfr_renamed_91;
    private sprsuja cfr_renamed_0;
    private sprsuja cfr_renamed_1;
    private sprphja cfr_renamed_2;
    private sprqgp cfr_renamed_3;
    private sprphja cfr_renamed_4;

    public sprphja cfr_renamed_16303() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_16304() {
        return this.cfr_renamed_91;
    }

    public sprsuja cfr_renamed_16305() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_16138(sprphja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_16142(sprphja arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_16136(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public sprsuja cfr_renamed_16306() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprrmo(int n, sprsuja sprsuja2, sprphja sprphja2, sprsuja sprsuja3, sprphja sprphja3, sprqgp sprqgp2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprrmo sprrmo2 = this;
        sprrmo sprrmo3 = this;
        sprrmo3.cfr_renamed_16136((int)arg0);
        sprrmo3.cfr_renamed_16137((sprsuja)arg1);
        sprrmo2.cfr_renamed_16138((sprphja)arg2);
        sprrmo2.cfr_renamed_16141((sprsuja)arg3);
        this.cfr_renamed_16142((sprphja)arg4);
        this.cfr_renamed_3 = sprqgp2;
    }

    public sprqgp cfr_renamed_16307() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 2;
        int cfr_ignored_0 = (3 ^ 5) << 4;
        int n4 = n2;
        int n5 = 4 << 4 ^ 5;
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

    public void cfr_renamed_16141(sprsuja arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_16137(sprsuja arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprphja cfr_renamed_16308() {
        return this.cfr_renamed_2;
    }
}

