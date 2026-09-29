/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprlfo {
    private sprxln cfr_renamed_3;
    private sprhbja cfr_renamed_4;

    public sprhbja cfr_renamed_16725() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_12099();
        }
        return null;
    }

    public sprxln cfr_renamed_16726() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.dispose();
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5;
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
    public sprlfo(sprhbja sprhbja2, sprxln sprxln2) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprhbja2 != null ? arg0.cfr_renamed_12099() : null;
        this.cfr_renamed_3 = arg1;
    }
}

