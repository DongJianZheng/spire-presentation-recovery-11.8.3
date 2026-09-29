/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprewh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgsh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprjjo;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprtrh;
import java.math.BigInteger;

public class sprurh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_2;
    public sprtrh cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

    public int cfr_renamed_2115() {
        return 2;
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
        return 3;
    }

    public int cfr_renamed_2116() {
        return 8;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    public sprurh() {
        sprurh sprurh2 = this;
        sprurh sprurh3 = this;
        super(131, 2, 3, 8);
        sprurh3.cfr_renamed_3 = new sprtrh(this, null, null);
        sprurh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprcye.cfr_renamed_9("Ek4mD\u001eEe4kC\u001e@jGmAhAmM\u001a3o3\u001aM\u001fGiBl7d"))));
        sprurh3.cfr_renamed_93 = sprurh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprjjo.cfr_renamed_9("\u0016S\u0017VeQ\u0013W\u0017Q\u001eY\u0012#\u0010RdXeWeV\u0014X\u0017W\u0011Y`XbR\u0012P"))));
        sprurh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprcye.cfr_renamed_9("EhElElElElElElElEnFmGoLiF\u001dLhCh7iA\u0018")));
        sprurh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprurh2.cfr_renamed_152 = 6;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprtrh(this, arg0, arg1);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprgsh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprtrh(this, arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_1938() {
        return 131;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprurh();
    }

    public int cfr_renamed_1186() {
        return 131;
    }

    public boolean cfr_renamed_1024() {
        return false;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 3 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprinh.cfr_renamed_8537(((sprgsh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprinh.cfr_renamed_8537(((sprgsh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 3);
            n3 = ++n;
            n2 += 3;
        }
        return new sprewh(this, arg2, lArray);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprgsh(arg0);
    }
}

