/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.security.spec.AlgorithmParameterSpec;

public class sprobi
implements AlgorithmParameterSpec {
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public sprobi(byte[] arg0) {
        this(arg0, null);
    }

    public byte[] cfr_renamed_4032() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_1477() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
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
    public sprobi(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprobi sprobi2 = this;
        sprobi2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
        sprobi2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray2);
    }
}

