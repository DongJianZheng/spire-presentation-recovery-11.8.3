/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreno;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrhf;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;

public class sprevk
implements sprbj {
    private sprzuk cfr_renamed_2;
    private sprzuk cfr_renamed_3;
    private sprnzk cfr_renamed_4;

    public sprzuk cfr_renamed_2095() {
        return this.cfr_renamed_2;
    }

    public sprnzk cfr_renamed_2096() {
        return this.cfr_renamed_4;
    }

    public sprevk(sprzuk arg0, sprzuk arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprevk(sprzuk sprzuk2, sprzuk sprzuk3, sprnzk sprnzk2) {
        sprevk sprevk2;
        sprnzk arg2;
        void arg0;
        void arg1;
        if (sprzuk2 == null) {
            throw new NullPointerException(sprrhf.cfr_renamed_9("  2 :7\u0003&:\"2 6\u001f6-s72:=;'t11s:&8?"));
        }
        if (arg1 == null) {
            throw new NullPointerException(spreno.cfr_renamed_9("\u0002\u0014\u000f\u0001\n\u0001\u0015\u0005\u000b4\u0015\r\u0011\u0005\u0013\u0001,\u0001\u001eD\u0004\u0005\t\n\b\u0010G\u0006\u0002D\t\u0011\u000b\b"));
        }
        sprqxk sprqxk2 = arg0.cfr_renamed_284();
        if (!sprqxk2.equals(arg1.cfr_renamed_284())) {
            throw new IllegalArgumentException(sprrhf.cfr_renamed_9("''5'=0t2:7t6$;1>1!5?t#&:\"2 6t81*'s<2\"6t7=526&6:'t7;>5::s$2&296 6& "));
        }
        if (arg2 == null) {
            spreuh spreuh2 = new sprzph().cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), arg1.cfr_renamed_2112());
            arg2 = new sprnzk(spreuh2, sprqxk2);
            sprevk2 = this;
        } else {
            if (!sprqxk2.equals(arg2.cfr_renamed_284())) {
                throw new IllegalArgumentException(spreno.cfr_renamed_9("\u0002\u0014\u000f\u0001\n\u0001\u0015\u0005\u000bD\u0017\u0011\u0005\b\u000e\u0007G\u000f\u0002\u001dG\f\u0006\u0017G\u0000\u000e\u0002\u0001\u0001\u0015\u0001\t\u0010G\u0000\b\t\u0006\r\tD\u0017\u0005\u0015\u0005\n\u0001\u0013\u0001\u0015\u0017"));
            }
            sprevk2 = this;
        }
        sprevk2.cfr_renamed_2 = arg0;
        sprevk sprevk3 = this;
        sprevk3.cfr_renamed_3 = arg1;
        sprevk3.cfr_renamed_4 = arg2;
    }

    public sprzuk cfr_renamed_2094() {
        return this.cfr_renamed_3;
    }
}

