/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfb;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprwa;
import java.security.Provider;

public class sprbfb {
    private sprhn cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbfb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprrwd((String)arg0);
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 3);
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

    public static /* synthetic */ sprhn cfr_renamed_1612(sprbfb arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprwa cfr_renamed_1480(char[] arg0) {
        return new sprcfb(this, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprbfb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new spritd((Provider)arg0);
        return this;
    }

    public sprbfb() {
        sprbfb sprbfb2 = this;
        sprbfb2.cfr_renamed_4 = new sprkvd();
    }
}

