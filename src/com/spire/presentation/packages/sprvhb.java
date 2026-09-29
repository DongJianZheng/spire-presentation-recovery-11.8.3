/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprqdb;
import com.spire.presentation.packages.sprrwd;
import java.security.Provider;

public class sprvhb {
    private sprlxa cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvhb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    public spraa cfr_renamed_1451() throws sprfya {
        return new sprqdb(this);
    }

    public static /* synthetic */ sprlxa cfr_renamed_1558(sprvhb arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprvhb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 5;
        int cfr_ignored_0 = 4 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1 << 1;
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

    public sprvhb() {
        sprvhb sprvhb2 = this;
        sprvhb2.cfr_renamed_4 = new sprlxa(new sprkvd());
    }
}

