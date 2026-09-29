/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spryye;

public class sprjog {
    private final byte[] cfr_renamed_3;
    private final spryye cfr_renamed_4;

    public spryye cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = 3 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 ^ 5);
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

    public byte[] cfr_renamed_5694() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprjog(spryye spryye2, byte[] byArray) {
        void arg0;
        sprjog sprjog2 = this;
        sprjog2.cfr_renamed_4 = arg0;
        sprjog2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }
}

