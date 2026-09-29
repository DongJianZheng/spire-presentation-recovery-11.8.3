/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhty;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprmph;
import com.spire.presentation.packages.sprnuh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprtcaa;
import com.spire.presentation.packages.sprzuh;
import java.math.BigInteger;

public class sprwqh
extends sprqsh {
    public sprnuh cfr_renamed_2;
    private static final sprlsh[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_2;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprnuh(this, arg0, arg1);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprwqh();
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprnuh(this, arg0, arg1, arg2);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprmph(sprck.cfr_renamed_4);
        cfr_renamed_3 = sprlshArray;
    }

    @Override
    public int cfr_renamed_1938() {
        return 233;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprmph(arg0);
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    public sprwqh() {
        sprwqh sprwqh2 = this;
        super(233, 74, 0, 0);
        sprwqh sprwqh3 = this;
        this.cfr_renamed_2 = new sprnuh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        this.cfr_renamed_93 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprhty.cfr_renamed_9("=\u0014;\u0012;\u0010:aIa;g>\u0017?g:b5g=\u001d?\u0017Of8\u001c?\u0015>f>\u0017>f?\u0014H\u001dNa9\u00165\u0015Ka<\u00158b:`5b4\u0014L`"))));
        this.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprtcaa.cfr_renamed_9("M>M?M?M?M?M?M?M?M?M?M?M?M?M?M?L<86J;88OIENK6O=M<LKO9M<>I8?98")));
        sprwqh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprwqh2.cfr_renamed_152 = 6;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    public int cfr_renamed_2116() {
        return 0;
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

    public int cfr_renamed_1186() {
        return 233;
    }

    public int cfr_renamed_2115() {
        return 74;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 4 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8537(((sprmph)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprmeh.cfr_renamed_8537(((sprmph)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 4);
            n3 = ++n;
            n2 += 4;
        }
        return new sprzuh(this, arg2, lArray);
    }

    public boolean cfr_renamed_1024() {
        return true;
    }
}

