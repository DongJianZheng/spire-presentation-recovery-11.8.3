/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgh;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmpg;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.spruqb;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;
import java.security.SecureRandom;

public class sprklg {
    private SecureRandom cfr_renamed_2;
    private sprrr cfr_renamed_3;
    private final String cfr_renamed_4;

    public sprklg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public static /* synthetic */ String cfr_renamed_7510(sprklg arg0) {
        return arg0.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
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

    public sprgh cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_2 == null) {
            sprklg sprklg2 = this;
            sprklg2.cfr_renamed_2 = new SecureRandom();
        }
        int n = this.cfr_renamed_4.startsWith(spruqb.cfr_renamed_9("O\f]d")) ? 16 : 8;
        byte[] byArray = new byte[n];
        this.cfr_renamed_2.nextBytes(byArray);
        return new sprmpg(this, byArray, arg0);
    }

    public static /* synthetic */ sprrr cfr_renamed_7511(sprklg arg0) {
        return arg0.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprklg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprkhi((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprklg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprxil((String)arg0);
        return this;
    }

    public sprklg(String string) {
        sprklg sprklg2 = this;
        this.cfr_renamed_3 = new sprrul();
        this.cfr_renamed_4 = string;
    }
}

