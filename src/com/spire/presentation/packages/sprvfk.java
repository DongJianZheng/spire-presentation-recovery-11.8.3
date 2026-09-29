/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhp;
import com.spire.presentation.packages.sprrpk;
import com.spire.presentation.packages.spryfk;

public class sprvfk {
    private final spryfk cfr_renamed_3;
    private final sprhp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvfk(spryfk spryfk2, sprhp sprhp2) {
        void arg0;
        sprvfk sprvfk2 = this;
        sprvfk2.cfr_renamed_3 = arg0;
        sprvfk2.cfr_renamed_4 = sprhp2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ (3 ^ 5);
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

    public boolean cfr_renamed_9805() {
        return this.cfr_renamed_3 != null;
    }

    public Object cfr_renamed_9701() {
        return this.cfr_renamed_4.cfr_renamed_9701();
    }

    public spryfk cfr_renamed_9806() {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprrpk.cfr_renamed_9("\u0018b9w%i9bjo+tji%'\tT\u0018F>s8n(r>b9U/t:h$t/)"));
        }
        return this.cfr_renamed_3;
    }

    public sprhp cfr_renamed_9765() {
        return this.cfr_renamed_4;
    }
}

