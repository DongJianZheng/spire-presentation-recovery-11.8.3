/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprfhb;
import com.spire.presentation.packages.sprhya;
import com.spire.presentation.packages.sprknd;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwfd;
import com.spire.presentation.packages.sprxdd;
import java.security.SecureRandom;

public class sprkhb {
    private sprko cfr_renamed_1;
    private sprtzd cfr_renamed_2;
    private sprxdd cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public static /* synthetic */ sprtzd cfr_renamed_1526(sprkhb arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprkhb(sprtzd sprtzd2, sprff sprff2, sprko sprko2) {
        void arg1;
        void arg0;
        sprkhb sprkhb2 = this;
        sprkhb2.cfr_renamed_2 = arg0;
        sprkhb sprkhb3 = this;
        sprkhb2.cfr_renamed_3 = new sprknd((sprff)arg1, new sprwfd());
        sprkhb2.cfr_renamed_1 = sprko2;
    }

    public sproa cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_4 == null) {
            sprkhb sprkhb2 = this;
            sprkhb2.cfr_renamed_4 = new SecureRandom();
        }
        byte[] byArray = new byte[20];
        sprkhb sprkhb3 = this;
        sprkhb3.cfr_renamed_4.nextBytes(byArray);
        sprfbe sprfbe2 = new sprfbe(byArray, 1024);
        sprkhb sprkhb4 = this;
        sprt sprt2 = sprfhb.cfr_renamed_1514(sprkhb3.cfr_renamed_2, this.cfr_renamed_1, sprkhb4.cfr_renamed_3.cfr_renamed_1195(), sprfbe2, arg0);
        sprkhb4.cfr_renamed_3.cfr_renamed_1217(true, sprt2);
        return new sprhya(this, sprfbe2, arg0);
    }

    public sprkhb(sprtzd arg0, sprff arg1) {
        this(arg0, arg1, new sprlid());
    }

    public static /* synthetic */ sprxdd cfr_renamed_1527(sprkhb arg0) {
        return arg0.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 4 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
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

