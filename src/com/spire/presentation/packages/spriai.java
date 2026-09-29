/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;

public class spriai
implements AlgorithmParameterSpec {
    private final PrivateKey cfr_renamed_2;
    private final String cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public PrivateKey cfr_renamed_1369() {
        return this.cfr_renamed_2;
    }

    public String cfr_renamed_5666() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spriai(PrivateKey privateKey, byte[] byArray, String string) {
        void arg1;
        void arg0;
        spriai spriai2 = this;
        this.cfr_renamed_2 = arg0;
        spriai2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
        spriai2.cfr_renamed_3 = string;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    public byte[] cfr_renamed_5684() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

