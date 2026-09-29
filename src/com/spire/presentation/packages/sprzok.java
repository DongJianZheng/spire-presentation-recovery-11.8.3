/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public class sprzok {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzok(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprzok sprzok2 = this;
        sprzok2.cfr_renamed_3 = arg0;
        sprzok2.cfr_renamed_4 = bigInteger2;
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 5;
        int cfr_ignored_0 = 1 << 3 ^ 1;
        int n4 = n2;
        int n5 = 1;
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

