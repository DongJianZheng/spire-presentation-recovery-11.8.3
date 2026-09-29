/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprupe;
import com.spire.presentation.packages.sprvne;

public class sprjre {
    private sprooe cfr_renamed_86;
    private sprije cfr_renamed_152;
    private spruhe cfr_renamed_112;
    private sprmra cfr_renamed_119;
    private sprooe cfr_renamed_91;
    private sprdce cfr_renamed_0;
    private sprmra cfr_renamed_1;
    private sprszd cfr_renamed_2;
    private spruhe cfr_renamed_3;
    private sprvne cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4817(sprlre arg0, int arg1, boolean arg2, spra arg3) {
        if (arg3 != null) {
            arg0.cfr_renamed_49(new sprhse(arg2, arg1, arg3));
        }
    }

    public sprjre cfr_renamed_4216(spruhe arg0) {
        this.cfr_renamed_112 = arg0;
        return this;
    }

    public sprjre cfr_renamed_4217(spruhe arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprjre cfr_renamed_4767(int n) {
        void arg0;
        this.cfr_renamed_86 = new sprooe((long)arg0);
        return this;
    }

    public sprjre cfr_renamed_30(sprude arg0) {
        return this.cfr_renamed_2603(sprszd.cfr_renamed_23(arg0));
    }

    public sprjre cfr_renamed_4368(sprvne arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprjre cfr_renamed_4818(sprije arg0) {
        this.cfr_renamed_152 = arg0;
        return this;
    }

    public sprjre cfr_renamed_4819(sprmra arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprjre cfr_renamed_2603(sprszd arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = (3 ^ 5) << 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ (2 ^ 5);
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

    public sprjre cfr_renamed_4350(sprdce arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprjre cfr_renamed_4820(sprmra arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprupe cfr_renamed_1451() {
        sprlre sprlre2 = new sprlre();
        sprjre sprjre2 = this;
        sprlre sprlre3 = sprlre2;
        sprjre sprjre3 = this;
        sprlre sprlre4 = sprlre2;
        sprjre sprjre4 = this;
        sprlre sprlre5 = sprlre2;
        this.cfr_renamed_4817(sprlre2, 0, false, this.cfr_renamed_86);
        this.cfr_renamed_4817(sprlre5, 1, false, this.cfr_renamed_91);
        sprjre4.cfr_renamed_4817(sprlre5, 2, false, this.cfr_renamed_152);
        sprjre4.cfr_renamed_4817(sprlre2, 3, true, this.cfr_renamed_112);
        this.cfr_renamed_4817(sprlre4, 4, false, this.cfr_renamed_4);
        sprjre3.cfr_renamed_4817(sprlre4, 5, true, this.cfr_renamed_3);
        sprjre3.cfr_renamed_4817(sprlre2, 6, false, this.cfr_renamed_0);
        this.cfr_renamed_4817(sprlre3, 7, false, this.cfr_renamed_1);
        sprjre2.cfr_renamed_4817(sprlre3, 8, false, this.cfr_renamed_119);
        sprjre2.cfr_renamed_4817(sprlre2, 9, false, this.cfr_renamed_2);
        return sprupe.cfr_renamed_23(new sprpse(sprlre2));
    }

    public sprjre cfr_renamed_11(sprooe arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }
}

