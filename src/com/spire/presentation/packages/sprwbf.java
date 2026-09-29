/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprsuf;
import java.security.spec.AlgorithmParameterSpec;

public class sprwbf
implements AlgorithmParameterSpec {
    private final sprsuf cfr_renamed_3;
    private final sprgzf cfr_renamed_4;

    public sprsuf cfr_renamed_5645() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (2 ^ 5);
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

    public sprgzf cfr_renamed_5646() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwbf(sprgzf sprgzf2, sprsuf sprsuf2) {
        void arg0;
        sprwbf sprwbf2 = this;
        sprwbf2.cfr_renamed_4 = arg0;
        sprwbf2.cfr_renamed_3 = sprsuf2;
    }
}

