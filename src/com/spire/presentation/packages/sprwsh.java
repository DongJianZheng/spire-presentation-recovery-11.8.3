/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwh;
import com.spire.presentation.packages.sprbxp;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfqh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprjoca;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprpyh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprthh;
import java.math.BigInteger;

public class sprwsh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_2;
    public sprfqh cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

    public int cfr_renamed_2115() {
        return 9;
    }

    @Override
    public int cfr_renamed_1938() {
        return 113;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
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

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprfqh(this, arg0, arg1);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprfqh(this, arg0, arg1, arg2);
    }

    public sprwsh() {
        sprwsh sprwsh2 = this;
        sprwsh sprwsh3 = this;
        super(113, 9, 0, 0);
        sprwsh3.cfr_renamed_3 = new sprfqh(this, null, null);
        sprwsh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprjoca.cfr_renamed_9("b*a*j\"`/bY\u0013,\u0017-\u0011-\u0014_d.kY\u0017\"g\"`*\u0014-"))));
        sprwsh3.cfr_renamed_93 = sprwsh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprbxp.cfr_renamed_9(".\u001f[\u0017\\j[\u001bZ\u001c[\u001d,\u0019.\u0018*\u001b/\u0017&m[\u001f[\u0016]\u0018,\u001c"))));
        sprwsh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprjoca.cfr_renamed_9("b+b*b*b*b*b*b*b*\u0016#\u0011Y\u0017Yj[a#\u0017/d\\")));
        sprwsh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprwsh2.cfr_renamed_152 = 6;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 2 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprthh.cfr_renamed_8537(((sprbwh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprthh.cfr_renamed_8537(((sprbwh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 2);
            n3 = ++n;
            n2 += 2;
        }
        return new sprpyh(this, arg2, lArray);
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprbwh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprwsh();
    }

    public int cfr_renamed_1186() {
        return 113;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprbwh(arg0);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }
}

