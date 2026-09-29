/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.spryfd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprvnd {
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprvnd sprvnd2 = this;
        this.cfr_renamed_2 = arg0;
        sprvnd2.cfr_renamed_4 = arg1;
        sprvnd2.cfr_renamed_3 = secureRandom;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
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

    public sprpgd cfr_renamed_2493() {
        sprvnd sprvnd2 = this;
        BigInteger[] bigIntegerArray = spryfd.cfr_renamed_3519(sprvnd2.cfr_renamed_2, sprvnd2.cfr_renamed_4, this.cfr_renamed_3);
        BigInteger bigInteger = bigIntegerArray[0];
        BigInteger bigInteger2 = bigIntegerArray[1];
        BigInteger bigInteger3 = spryfd.cfr_renamed_3520(bigInteger, bigInteger2, this.cfr_renamed_3);
        return new sprpgd(bigInteger, bigInteger3);
    }
}

