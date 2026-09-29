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
import com.spire.presentation.packages.sprolh;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprqxh;
import com.spire.presentation.packages.spruth;
import com.spire.presentation.packages.sprzrh;
import java.math.BigInteger;

public class sprysh
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    public spruth cfr_renamed_3;
    private static final sprlsh[] cfr_renamed_4;

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spruth(this, arg0, arg1);
    }

    @Override
    public int cfr_renamed_1938() {
        return 571;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprysh();
    }

    @Override
    public boolean cfr_renamed_1841() {
        return true;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprqxh(arg0);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spruth(this, arg0, arg1, arg2);
    }

    public sprysh() {
        sprysh sprysh2 = this;
        sprysh sprysh3 = this;
        super(571, 2, 5, 10);
        sprysh sprysh4 = this;
        this.cfr_renamed_3 = new spruth(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(0L));
        sprysh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        sprysh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprqkh.cfr_renamed_9("(\u0000(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002(\u0002)\u0001)\n-\u0002]\u0003^\u0003!s.\u0001]\u0006Z\u0001!\u0003Y\n\\p!\u0003/t,\u0003+\nZ\u0004+\u0002\\\n,p]\u0007\\\u0004+\u000b+\n)w!\u0003\\wZ\u0006-q^w/\u0005 t.\u0001/q)\u0002(\u0003")));
        sprysh2.cfr_renamed_107 = BigInteger.valueOf(4L);
        sprysh2.cfr_renamed_152 = 6;
    }

    public int cfr_renamed_2115() {
        return 2;
    }

    public int cfr_renamed_2117() {
        return 5;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprqxh(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    public boolean cfr_renamed_1024() {
        return false;
    }

    public int cfr_renamed_1186() {
        return 571;
    }

    public int cfr_renamed_2116() {
        return 10;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 9 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprolh.cfr_renamed_8537(((sprqxh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprolh.cfr_renamed_8537(((sprqxh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 9);
            n3 = ++n;
            n2 += 9;
        }
        return new sprzrh(this, arg2, lArray);
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
    public sprfe cfr_renamed_1994() {
        return new sprloh();
    }
}

