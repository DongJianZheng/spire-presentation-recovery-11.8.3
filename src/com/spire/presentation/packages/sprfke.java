/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbee;
import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvva;

public class sprfke {
    public sprdce cfr_renamed_112;
    public spruhe cfr_renamed_119;
    public sprhse cfr_renamed_91;
    public spruhe cfr_renamed_0;
    public sprije cfr_renamed_1;
    public spruzd cfr_renamed_2;
    public spruzd cfr_renamed_3;
    public sprooe cfr_renamed_4;

    public void cfr_renamed_53(sprije arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_4217(spruhe arg0) {
        this.cfr_renamed_119 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4466(sprgpe sprgpe2) {
        void arg0;
        sprfke sprfke2 = this;
        sprfke2.cfr_renamed_3 = new spruzd((sprvva)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4465(sprgpe sprgpe2) {
        void arg0;
        sprfke sprfke2 = this;
        sprfke2.cfr_renamed_2 = new spruzd((sprvva)arg0);
    }

    public void cfr_renamed_17(spruib arg0) {
        this.cfr_renamed_119 = spruhe.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    public void cfr_renamed_11(sprooe arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_44(spruib arg0) {
        this.cfr_renamed_0 = spruhe.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    public void cfr_renamed_13(spruzd arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = (2 ^ 5) << 3;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 3);
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

    public void cfr_renamed_46(spruzd arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprfke() {
        sprfke sprfke2 = this;
        sprfke2.cfr_renamed_91 = new sprhse(true, 0, new sprooe(0L));
    }

    public void cfr_renamed_22(sprdce arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public sprbee cfr_renamed_32() {
        sprlre sprlre2;
        sprlre sprlre3;
        if (this.cfr_renamed_4 == null || this.cfr_renamed_1 == null || this.cfr_renamed_0 == null || this.cfr_renamed_2 == null || this.cfr_renamed_3 == null || this.cfr_renamed_119 == null || this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprbtm.cfr_renamed_9("\u000b;\u0011t\u00048\tt\b5\u000b0\u0004 \n&\u001ct\u0003=\u00008\u0001'E'\u0000 E=\u000bt3eE\u0000'\u0007\u00061\u0017 \f2\f7\u0004 \u0000t\u00021\u000b1\u00175\u0011;\u0017"));
        }
        sprlre sprlre4 = sprlre3 = new sprlre();
        sprfke sprfke2 = this;
        sprlre3.cfr_renamed_49(sprfke2.cfr_renamed_4);
        sprlre4.cfr_renamed_49(sprfke2.cfr_renamed_1);
        sprlre4.cfr_renamed_49(this.cfr_renamed_0);
        sprlre sprlre5 = sprlre2 = new sprlre();
        sprlre5.cfr_renamed_49(this.cfr_renamed_2);
        sprlre5.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(new sprpse(sprlre2));
        sprlre3.cfr_renamed_49(this.cfr_renamed_119);
        sprlre3.cfr_renamed_49(this.cfr_renamed_112);
        return sprbee.cfr_renamed_23(new sprpse(sprlre3));
    }

    public void cfr_renamed_4216(spruhe arg0) {
        this.cfr_renamed_0 = arg0;
    }
}

