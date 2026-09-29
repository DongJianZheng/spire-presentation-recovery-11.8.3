/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpu;
import com.spire.presentation.packages.sprsil;

public class sprhml {
    private sprsil cfr_renamed_3;
    private sprpu cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhml(sprsil sprsil2, sprpu sprpu2) {
        void arg0;
        sprhml sprhml2 = this;
        sprhml2.cfr_renamed_3 = arg0;
        sprhml2.cfr_renamed_4 = sprpu2;
    }

    public byte[] cfr_renamed_3536() {
        sprhml sprhml2 = this;
        return sprhml2.cfr_renamed_4.cfr_renamed_5983(sprhml2.cfr_renamed_3.cfr_renamed_1224());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 1 << 3 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 1 << 1;
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

    public sprsil cfr_renamed_3537() {
        return this.cfr_renamed_3;
    }
}

