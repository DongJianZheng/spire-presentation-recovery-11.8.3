/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprtvk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprabl {
    private SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = 5 << 3 ^ 3;
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

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprabl sprabl2 = this;
        this.cfr_renamed_3 = arg0;
        sprabl2.cfr_renamed_4 = arg1;
        sprabl2.cfr_renamed_2 = secureRandom;
    }

    public sprcuk cfr_renamed_2493() {
        sprabl sprabl2 = this;
        BigInteger[] bigIntegerArray = sprtvk.cfr_renamed_3519(sprabl2.cfr_renamed_3, sprabl2.cfr_renamed_4, this.cfr_renamed_2);
        BigInteger bigInteger = bigIntegerArray[0];
        BigInteger bigInteger2 = bigIntegerArray[1];
        BigInteger bigInteger3 = sprtvk.cfr_renamed_3520(bigInteger, bigInteger2, this.cfr_renamed_2);
        return new sprcuk(bigInteger, bigInteger3);
    }
}

