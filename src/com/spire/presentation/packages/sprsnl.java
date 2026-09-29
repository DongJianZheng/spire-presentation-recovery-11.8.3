/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnm;
import com.spire.presentation.packages.sprcul;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprtsm;
import com.spire.presentation.packages.sprvhm;
import java.math.BigInteger;

public class sprsnl {
    private sprtsm cfr_renamed_4;

    public sprsnl cfr_renamed_10846(sprnbm arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4.cfr_renamed_10846(arg0);
        }
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 4 << 3 ^ 4;
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

    public sprsnl() {
        sprsnl sprsnl2 = this;
        sprsnl2.cfr_renamed_4 = new sprtsm();
    }

    public sprcul cfr_renamed_1451() {
        return new sprcul(new sprcnm(this.cfr_renamed_4.cfr_renamed_1451()));
    }

    public sprsnl cfr_renamed_10(BigInteger arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4.cfr_renamed_5001(new sprktm(arg0));
        }
        return this;
    }

    public sprsnl cfr_renamed_10847(sprnbm arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4.cfr_renamed_10847(arg0);
        }
        return this;
    }

    public sprsnl cfr_renamed_10965(sprvhm arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4.cfr_renamed_10965(arg0);
        }
        return this;
    }
}

