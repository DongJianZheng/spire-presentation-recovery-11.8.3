/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryee;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprfxd {
    private spryee cfr_renamed_3;
    private sprege cfr_renamed_4;

    public Set cfr_renamed_665() {
        return sprlod.cfr_renamed_4234(this.cfr_renamed_4.cfr_renamed_98());
    }

    public List cfr_renamed_583() {
        return sprlod.cfr_renamed_582(this.cfr_renamed_4.cfr_renamed_98());
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_4.cfr_renamed_98();
    }

    public spryee cfr_renamed_4233() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_4.cfr_renamed_663();
    }

    /*
     * WARNING - void declaration
     */
    public sprfxd(sprege sprege2, boolean bl, spryee spryee2) {
        sprtie sprtie2;
        void arg2;
        void arg0;
        sprfxd sprfxd2 = this;
        sprfxd2.cfr_renamed_4 = arg0;
        sprfxd2.cfr_renamed_3 = arg2;
        if (bl && arg0.cfr_renamed_663() && (sprtie2 = arg0.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) != null) {
            this.cfr_renamed_3 = spryee.cfr_renamed_23(sprtie2.cfr_renamed_372());
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 3 ^ 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ 1;
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

    public Set cfr_renamed_662() {
        return sprlod.cfr_renamed_4236(this.cfr_renamed_4.cfr_renamed_98());
    }

    public Date cfr_renamed_2139() {
        return this.cfr_renamed_4.cfr_renamed_2139().cfr_renamed_110();
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_98();
        if (sprszd2 != null) {
            return sprszd2.cfr_renamed_100(arg0);
        }
        return null;
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_2136().cfr_renamed_97();
    }
}

