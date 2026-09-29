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
import com.spire.presentation.packages.sprloh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprtxh;
import com.spire.presentation.packages.sprvnh;
import com.spire.presentation.packages.sprvrh;
import com.spire.presentation.packages.sprzuy;
import java.math.BigInteger;

public class sprauh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_2;
    public sprvnh cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

    @Override
    public int cfr_renamed_1938() {
        return 239;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprvnh(this, arg0, arg1);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprauh();
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprtxh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
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

    public int cfr_renamed_2117() {
        return 0;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprvnh(this, arg0, arg1, arg2);
    }

    @Override
    public boolean cfr_renamed_1841() {
        return true;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 4 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8537(((sprtxh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprmeh.cfr_renamed_8537(((sprtxh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 4);
            n3 = ++n;
            n2 += 4;
        }
        return new sprvrh(this, arg2, lArray);
    }

    public int cfr_renamed_1186() {
        return 239;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    public sprauh() {
        sprauh sprauh2 = this;
        sprauh sprauh3 = this;
        super(239, 158, 0, 0);
        sprauh sprauh4 = this;
        this.cfr_renamed_3 = new sprvnh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(0L));
        sprauh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        sprauh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprzuy.cfr_renamed_9("VDTDTDTDTDTDTDTDTDTDTDTDTDTDTDQ5SM\"1'BS7&B!MU2U7U0%LTD!@SL%A")));
        sprauh2.cfr_renamed_107 = BigInteger.valueOf(4L);
        sprauh2.cfr_renamed_152 = 6;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprtxh(arg0);
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    public int cfr_renamed_2115() {
        return 158;
    }

    @Override
    public sprfe cfr_renamed_1994() {
        return new sprloh();
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }
}

