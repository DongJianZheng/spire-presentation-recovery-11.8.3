/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sprwyk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryml;
import com.spire.presentation.packages.sprywk;
import java.math.BigInteger;

public class sprshl {
    private sprywk cfr_renamed_4;

    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().cfr_renamed_1155().bitLength() + 7) / 8;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3 << 1;
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

    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprywk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10590(sprngk.cfr_renamed_9("5j$"), this.cfr_renamed_4.cfr_renamed_2095()));
    }

    public byte[] cfr_renamed_5695(sprbj arg0) {
        sprwyk sprwyk2 = (sprwyk)arg0;
        spryml spryml2 = new spryml();
        spryml spryml3 = new spryml();
        spryml spryml4 = spryml2;
        spryml4.cfr_renamed_5692(this.cfr_renamed_4.cfr_renamed_2095());
        BigInteger bigInteger = spryml4.cfr_renamed_5695(sprwyk2.cfr_renamed_3351());
        spryml spryml5 = spryml3;
        spryml5.cfr_renamed_5692(this.cfr_renamed_4.cfr_renamed_2094());
        BigInteger bigInteger2 = spryml5.cfr_renamed_5695(sprwyk2.cfr_renamed_2096());
        int n = this.cfr_renamed_1938();
        byte[] byArray = new byte[n * 2];
        sprhdf.cfr_renamed_5224(bigInteger2, byArray, 0, n);
        int n2 = n;
        sprhdf.cfr_renamed_5224(bigInteger, byArray, n2, n2);
        return byArray;
    }
}

