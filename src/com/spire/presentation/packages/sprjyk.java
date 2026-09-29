/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprjyk {
    public SecureRandom cfr_renamed_3;
    public int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = 2 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
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

    public byte[] cfr_renamed_2405() {
        sprjyk sprjyk2 = this;
        byte[] byArray = new byte[sprjyk2.cfr_renamed_4];
        sprjyk2.cfr_renamed_3.nextBytes(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        sprjyk sprjyk2 = this;
        sprjyk2.cfr_renamed_3 = arg0.cfr_renamed_1295();
        sprjyk2.cfr_renamed_4 = (sprgye2.cfr_renamed_3483() + 7) / 8;
        sprybl.cfr_renamed_9170(new sprfdl(sprfto.cfr_renamed_9("\u0002}<O4}\u0016a?"), arg0.cfr_renamed_3483()));
    }
}

