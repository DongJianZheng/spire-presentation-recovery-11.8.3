/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbad;
import com.spire.presentation.packages.sprtu;
import java.security.spec.AlgorithmParameterSpec;

public class sproai
implements AlgorithmParameterSpec {
    public static final String cfr_renamed_2 = "Ed448";
    public static final String cfr_renamed_3 = "Ed25519";
    private final String cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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

    public String cfr_renamed_9198() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sproai(String string) {
        void arg0;
        if (string.equalsIgnoreCase(cfr_renamed_3)) {
            this.cfr_renamed_4 = cfr_renamed_3;
            return;
        }
        if (arg0.equalsIgnoreCase(cfr_renamed_2)) {
            this.cfr_renamed_4 = cfr_renamed_2;
            return;
        }
        if (arg0.equals(sprtu.cfr_renamed_0.cfr_renamed_19())) {
            this.cfr_renamed_4 = cfr_renamed_3;
            return;
        }
        if (arg0.equals(sprtu.cfr_renamed_2.cfr_renamed_19())) {
            this.cfr_renamed_4 = cfr_renamed_2;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbad.cfr_renamed_9(")\u001e.\u0015?\u001f;\u001e5\n9\u0014|\u0013)\u0002*\u0015|\u001e=\u001d9J|")).append((String)arg0).toString());
    }
}

