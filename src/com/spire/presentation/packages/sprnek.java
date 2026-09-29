/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprqjk;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxil;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

public class sprnek {
    private sprrr cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnek cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprxil((String)arg0);
        return this;
    }

    public sprqjk cfr_renamed_1451() throws NoSuchProviderException, NoSuchAlgorithmException {
        return new sprqjk(this.cfr_renamed_4);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 ^ 5;
        int cfr_ignored_0 = 4 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

    public sprnek() {
        sprnek sprnek2 = this;
        sprnek2.cfr_renamed_4 = new sprrul();
    }

    /*
     * WARNING - void declaration
     */
    public sprnek cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprkhi((Provider)arg0);
        return this;
    }
}

