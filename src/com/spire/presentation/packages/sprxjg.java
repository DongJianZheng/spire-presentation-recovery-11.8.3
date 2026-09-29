/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxg;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprzjg;
import java.security.Provider;

public class sprxjg {
    private sprrr cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxjg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprkhi((Provider)arg0);
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 2 << 1;
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
    public sprxjg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprxil((String)arg0);
        return this;
    }

    public sprxg cfr_renamed_2588(byte[] arg0) {
        byte[] byArray = sproze.cfr_renamed_158(arg0);
        return new sprzjg(this, byArray);
    }

    public sprxjg() {
        sprxjg sprxjg2 = this;
        sprxjg2.cfr_renamed_4 = new sprrul();
    }

    public static /* synthetic */ sprrr cfr_renamed_7449(sprxjg arg0) {
        return arg0.cfr_renamed_4;
    }
}

