/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprsuf;

public class sprztf {
    private final sprsuf cfr_renamed_3;
    private final sprgzf cfr_renamed_4;

    public sprsuf cfr_renamed_6489() {
        return this.cfr_renamed_3;
    }

    public sprgzf cfr_renamed_6467() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 2 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5);
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
    public sprztf(sprgzf sprgzf2, sprsuf sprsuf2) {
        void arg0;
        sprztf sprztf2 = this;
        sprztf2.cfr_renamed_4 = arg0;
        sprztf2.cfr_renamed_3 = sprsuf2;
    }
}

