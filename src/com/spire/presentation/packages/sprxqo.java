/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprxqo {
    @sprtea
    public short[] cfr_renamed_3;
    @sprtea
    public sprqzo[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprxqo(sprmzo sprmzo2, int n, int n2) {
        void arg1;
        void arg2;
        void arg0;
        int n3;
        this.cfr_renamed_4 = new sprqzo[n];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n3++] = new sprqzo((sprmzo)arg0);
            n4 = n3;
        }
        n3 = arg2 - arg1;
        if (n3 > 0) {
            int n5;
            this.cfr_renamed_3 = new short[n3];
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n5++] = arg0.cfr_renamed_12254();
                n6 = n5;
            }
        }
    }

    @sprtea
    public sprqzo cfr_renamed_18253(int arg0) {
        if (arg0 < this.cfr_renamed_4.length) {
            return this.cfr_renamed_4[arg0];
        }
        sprxqo sprxqo2 = this;
        sprqzo sprqzo2 = sprxqo2.cfr_renamed_4[sprxqo2.cfr_renamed_4.length - 1];
        short s = this.cfr_renamed_3[arg0 - this.cfr_renamed_4.length];
        return new sprqzo(sprqzo2.cfr_renamed_3, s);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 ^ 5);
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
}

