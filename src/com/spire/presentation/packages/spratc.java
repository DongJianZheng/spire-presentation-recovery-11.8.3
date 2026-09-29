/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgkj;
import com.spire.presentation.packages.sprrlb;

public class spratc {
    private final sprrlb cfr_renamed_1;
    private final int cfr_renamed_2;
    private final sprrlb cfr_renamed_3;
    private final int cfr_renamed_4;

    public int cfr_renamed_3317() {
        return this.cfr_renamed_1.cfr_renamed_1769().cfr_renamed_1938();
    }

    public int cfr_renamed_1843() {
        return this.cfr_renamed_4;
    }

    public sprrlb cfr_renamed_1155() {
        return this.cfr_renamed_1;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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

    private static /* synthetic */ int cfr_renamed_1340(int arg0) {
        int n = 0;
        int n2 = arg0;
        while ((arg0 = n2 >> 1) != 0) {
            n2 = arg0;
            ++n;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public spratc(int n, sprrlb sprrlb2, sprrlb sprrlb3, int n2) {
        void arg3;
        void arg1;
        void arg0;
        void arg2;
        if (!sprrlb2.cfr_renamed_1769().cfr_renamed_1931(arg2.cfr_renamed_1769())) {
            throw new IllegalArgumentException(sprgkj.cfr_renamed_9("1z({5fa{$p%55zaw$5.{aa)paf x$5\"`3c$"));
        }
        spratc spratc2 = this;
        this.cfr_renamed_2 = arg0;
        spratc2.cfr_renamed_1 = arg1;
        spratc2.cfr_renamed_3 = arg2;
        this.cfr_renamed_4 = arg3;
    }

    public sprrlb cfr_renamed_1604() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3318() {
        return (this.cfr_renamed_1.cfr_renamed_1769().cfr_renamed_1938() - (13 + spratc.cfr_renamed_1340(this.cfr_renamed_4))) / 8 * 8;
    }

    public int cfr_renamed_3316() {
        return this.cfr_renamed_2;
    }
}

