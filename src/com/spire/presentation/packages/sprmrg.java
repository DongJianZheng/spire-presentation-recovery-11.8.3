/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlyg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;

public class sprmrg {
    private sprcyg cfr_renamed_4;

    public sprmrg() {
        sprmrg sprmrg2 = this;
        sprmrg2.cfr_renamed_4 = new sprcyg(new sprrul());
    }

    public static /* synthetic */ sprcyg cfr_renamed_7985(sprmrg arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprxil((String)arg0));
        return this;
    }

    public sprth cfr_renamed_1451() throws sprtqg {
        return new sprlyg(this);
    }

    public sprmrg(sprcyg sprcyg2) {
        sprmrg sprmrg2 = this;
        this.cfr_renamed_4 = new sprcyg(new sprrul());
        this.cfr_renamed_4 = sprcyg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprkhi((Provider)arg0));
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

