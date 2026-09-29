/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprrvm;

public class sprchm {
    private sprrvm cfr_renamed_4;

    public sprrvm cfr_renamed_3968() {
        return this.cfr_renamed_4;
    }

    public sprchm() {
        sprchm sprchm2 = this;
        sprchm2.cfr_renamed_4 = new sprrvm();
    }

    public void cfr_renamed_11192(sprlem arg0) {
        this.cfr_renamed_4.cfr_renamed_5004(new sprcen(arg0));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 1;
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

    public void cfr_renamed_11193(sprlem arg0, sprco arg1) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1);
        this.cfr_renamed_4.cfr_renamed_5004(new sprcen(sprrvm2));
    }

    public void cfr_renamed_11194(sprlem arg0, int arg1) {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(arg0);
        sprrvm2.cfr_renamed_5004(new sprktm(arg1));
        this.cfr_renamed_4.cfr_renamed_5004(new sprcen(sprrvm2));
    }
}

