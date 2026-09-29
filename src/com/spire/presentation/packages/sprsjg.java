/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprij;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryig;
import java.security.Provider;

public class sprsjg {
    private sprrr cfr_renamed_4;

    public sprsjg() {
        sprsjg sprsjg2 = this;
        sprsjg2.cfr_renamed_4 = new sprrul();
    }

    /*
     * WARNING - void declaration
     */
    public sprsjg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprxil((String)arg0);
        return this;
    }

    public sprij cfr_renamed_1451() {
        return new spryig(this);
    }

    /*
     * WARNING - void declaration
     */
    public sprsjg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprkhi((Provider)arg0);
        return this;
    }

    public static /* synthetic */ sprrr cfr_renamed_7400(sprsjg arg0) {
        return arg0.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 2;
        int n4 = n2;
        int n5 = 2 << 3 ^ 2;
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

