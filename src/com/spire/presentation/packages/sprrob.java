/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public class sprrob {
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprrob) {
            sprrob sprrob2 = (sprrob)arg0;
            return this.cfr_renamed_4.equals(sprrob2.cfr_renamed_4) && this.cfr_renamed_3.equals(sprrob2.cfr_renamed_3) && this.cfr_renamed_2.equals(sprrob2.cfr_renamed_2);
        }
        return false;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_2.hashCode();
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprrob(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg1;
        void arg0;
        sprrob sprrob2 = this;
        this.cfr_renamed_3 = arg0;
        sprrob2.cfr_renamed_2 = arg1;
        sprrob2.cfr_renamed_4 = bigInteger3;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 4 ^ 5 << 1;
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

