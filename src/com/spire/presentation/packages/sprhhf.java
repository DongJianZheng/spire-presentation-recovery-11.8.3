/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsgf;
import java.math.BigInteger;

public class sprhhf {
    public sprsgf cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 3 << 3 ^ 2;
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
    public sprhhf(sprsgf sprsgf2, BigInteger bigInteger) {
        void arg0;
        sprhhf sprhhf2 = this;
        sprhhf2.cfr_renamed_3 = arg0;
        sprhhf2.cfr_renamed_4 = bigInteger;
    }
}

