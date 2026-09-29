/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdih;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprjyh;
import com.spire.presentation.packages.sprloh;
import com.spire.presentation.packages.sprlph;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprxpo;
import java.math.BigInteger;

public class spryuh
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    private static final sprlsh[] cfr_renamed_3;
    public sprbxh cfr_renamed_4;

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
        return new sprjyh(this, arg2, lArray);
    }

    @Override
    public sprfe cfr_renamed_1994() {
        return new sprloh();
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprbxh(this, arg0, arg1, arg2);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprlph(sprck.cfr_renamed_4);
        cfr_renamed_3 = sprlshArray;
    }

    public spryuh() {
        spryuh spryuh2 = this;
        spryuh spryuh3 = this;
        super(283, 5, 7, 12);
        spryuh spryuh4 = this;
        this.cfr_renamed_4 = new sprbxh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(0L));
        spryuh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        spryuh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprxpo.cfr_renamed_9("{f\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\r\u0011\u000en\n\u0012y\u0012\u000fg|b|`ya~\u0013\r\u0011|\u0011rc\u007fbz\u0012{az\u0012zax\u0014}f")));
        spryuh2.cfr_renamed_107 = BigInteger.valueOf(4L);
        spryuh2.cfr_renamed_152 = 6;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new spryuh();
    }

    public int cfr_renamed_2117() {
        return 7;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprbxh(this, arg0, arg1);
    }

    public int cfr_renamed_2116() {
        return 12;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprlph(arg0);
    }

    public int cfr_renamed_2115() {
        return 5;
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
    public boolean cfr_renamed_1841() {
        return true;
    }

    public int cfr_renamed_1186() {
        return 283;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1938() {
        return 283;
    }

    public boolean cfr_renamed_1024() {
        return false;
    }
}

