/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sproze;
import java.security.spec.AlgorithmParameterSpec;

public class sprvei
implements AlgorithmParameterSpec {
    private final String cfr_renamed_0;
    private final sprddm cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private final AlgorithmParameterSpec cfr_renamed_3;
    private final int cfr_renamed_4;

    public String cfr_renamed_5666() {
        return this.cfr_renamed_0;
    }

    public sprddm cfr_renamed_5667() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprvei(String string, int n, AlgorithmParameterSpec algorithmParameterSpec, sprddm sprddm2, byte[] byArray) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvei sprvei2 = this;
        sprvei sprvei3 = this;
        this.cfr_renamed_0 = arg0;
        sprvei3.cfr_renamed_4 = arg1;
        sprvei3.cfr_renamed_3 = arg2;
        sprvei2.cfr_renamed_1 = arg3;
        sprvei2.cfr_renamed_2 = byArray;
    }

    public int cfr_renamed_2398() {
        return this.cfr_renamed_4;
    }

    public AlgorithmParameterSpec cfr_renamed_5682() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_5670() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 3 ^ 5;
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

