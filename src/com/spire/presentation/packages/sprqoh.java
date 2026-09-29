/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdih;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlph;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprsuh;
import com.spire.presentation.packages.sprvoh;
import com.spire.presentation.packages.sprwlo;
import java.math.BigInteger;

public class sprqoh
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    public sprsuh cfr_renamed_3;
    private static final sprlsh[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprlph(arg0);
    }

    public boolean cfr_renamed_1024() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprsuh(this, arg0, arg1);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 5 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprdih.cfr_renamed_8537(((sprlph)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprdih.cfr_renamed_8537(((sprlph)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 5);
            n3 = ++n;
            n2 += 5;
        }
        return new sprvoh(this, arg2, lArray);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprsuh(this, arg0, arg1, arg2);
    }

    public int cfr_renamed_2115() {
        return 5;
    }

    @Override
    public int cfr_renamed_1938() {
        return 283;
    }

    public int cfr_renamed_1186() {
        return 283;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprqoh();
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprlph(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    public int cfr_renamed_2116() {
        return 12;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 6: {
                return true;
            }
        }
        return false;
    }

    public sprqoh() {
        sprqoh sprqoh2 = this;
        super(283, 5, 7, 12);
        sprqoh sprqoh3 = this;
        this.cfr_renamed_3 = new sprsuh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        this.cfr_renamed_93 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprqad.cfr_renamed_9("\u0014U\u0013%\u0012_\u0014&g_f_\u0011^\u0012#eReSe!\u001c&\u0015^eW\u0017W\u0017!g&\u001dPb#\u0013Q\u0010R\u0017W\u001d!eUeR\u001cV\u0010_\u0011&bQ\u0016Q\u0017\"\u0017V\u0017%\u0013^eUbR"))));
        this.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprwlo.cfr_renamed_9("\u0012Ud d d d d d d d d d d d d d d d d g \u001bV\u0011_\u001bP\u0014Vd%\u001bU\u001a'\u001bV\u0013P\u0017$\u0012R\u0010'\u0015%g c\"`U\u0012Q")));
        sprqoh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprqoh2.cfr_renamed_152 = 6;
    }

    public int cfr_renamed_2117() {
        return 7;
    }
}

