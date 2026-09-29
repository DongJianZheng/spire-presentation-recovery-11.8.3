/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class sprzqh
implements KeySpec {
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzqh(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        void arg2;
        void arg1;
        void arg0;
        sprzqh sprzqh2 = this;
        sprzqh sprzqh3 = this;
        sprzqh3.cfr_renamed_2 = arg0;
        sprzqh3.cfr_renamed_3 = arg1;
        sprzqh2.cfr_renamed_1 = arg2;
        sprzqh2.cfr_renamed_4 = bigInteger4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 4;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 4;
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

    public BigInteger spr\u3181() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }
}

