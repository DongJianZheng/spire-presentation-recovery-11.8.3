/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprkqo {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public byte[] cfr_renamed_954() {
        sprpdja sprpdja2 = this.cfr_renamed_18311();
        try {
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    @sprtea
    public sprpdja cfr_renamed_18311() {
        sprpdja sprpdja2 = new sprpdja();
        sprruo sprruo2 = new sprruo(sprpdja2);
        this.cfr_renamed_18252(sprruo2);
        return sprpdja2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 2;
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

    @sprtea
    public abstract void cfr_renamed_18252(sprruo var1);
}

