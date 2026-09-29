/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnm;
import com.spire.presentation.packages.sprnbm;
import java.math.BigInteger;

public class sprcul {
    private sprcnm cfr_renamed_4;

    public sprcnm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprcul(sprcnm sprcnm2) {
        this.cfr_renamed_4 = sprcnm2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 3;
        int cfr_ignored_0 = 2 << 3 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 3;
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

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_4.cfr_renamed_4391().cfr_renamed_1485();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_4391().cfr_renamed_114().cfr_renamed_97();
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_4391().cfr_renamed_102();
    }
}

