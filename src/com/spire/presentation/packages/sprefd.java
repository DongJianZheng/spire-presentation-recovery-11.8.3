/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public class sprefd {
    private final String cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprefd(String string, BigInteger bigInteger) {
        void arg0;
        sprefd sprefd2 = this;
        sprefd2.cfr_renamed_3 = arg0;
        sprefd2.cfr_renamed_4 = bigInteger;
    }

    public BigInteger cfr_renamed_3931() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_3932() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 5;
        int n4 = n2;
        int n5 = 1 << 3 ^ 2;
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

