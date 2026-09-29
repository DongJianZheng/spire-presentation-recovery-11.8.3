/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprkqh;
import com.spire.presentation.packages.sprloh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprmph;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprrvh;
import com.spire.presentation.packages.sprvmaa;
import java.math.BigInteger;

public class sprqth
extends sprqsh {
    public sprkqh cfr_renamed_91;
    private static final int cfr_renamed_0 = 6;
    private static final sprlsh[] cfr_renamed_4;

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprqth();
    }

    public int cfr_renamed_2115() {
        return 74;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprkqh(this, arg0, arg1);
    }

    public sprqth() {
        sprqth sprqth2 = this;
        sprqth sprqth3 = this;
        super(233, 74, 0, 0);
        sprqth sprqth4 = this;
        this.cfr_renamed_91 = new sprkqh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(0L));
        sprqth3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        sprqth3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprvmaa.cfr_renamed_9("l\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0011d\u0017meac\u0016\u0018e\u0014\u0016b\u0010\u0015bd\u0012ce`\u0010\u0014\u0012\u0010c\u0012\u0015c\u0010g")));
        sprqth2.cfr_renamed_107 = BigInteger.valueOf(4L);
        sprqth2.cfr_renamed_152 = 6;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprmph(arg0);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprkqh(this, arg0, arg1, arg2);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprmph(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public int cfr_renamed_1938() {
        return 233;
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
        return new sprrvh(this, arg2, lArray);
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

    public boolean cfr_renamed_1024() {
        return true;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return true;
    }

    @Override
    public sprfe cfr_renamed_1994() {
        return new sprloh();
    }
}

