/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprjwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprtyh;
import com.spire.presentation.packages.sprvvh;
import com.spire.presentation.packages.sprwxh;
import com.spire.presentation.packages.sprywe;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprdwh
extends spriwh {
    private static final sprlsh[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 2;
    public static final BigInteger cfr_renamed_3;
    public sprvvh cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprtyh.cfr_renamed_9000(arg0, nArray);
        return new sprwxh(nArray);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprvvh(this, arg0, arg1, arg2);
    }

    public sprdwh() {
        sprdwh sprdwh2 = this;
        sprdwh sprdwh3 = this;
        super(cfr_renamed_3);
        this.cfr_renamed_4 = new sprvvh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(sprck.cfr_renamed_0);
        sprdwh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(3L));
        sprdwh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprywe.cfr_renamed_9("\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0015\u001f\u0016ke\u001fa\u001f\u0010hdi\u0015ojmeo\u0012ng\u001d\u0016\u001f\u0017a\u0017")));
        sprdwh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprdwh2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprtyh.cfr_renamed_9001(arg0, nArray);
        return new sprwxh(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprdwh();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 2: {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_91;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 6 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprinh.cfr_renamed_8546(((sprwxh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, nArray, n2);
            sprinh.cfr_renamed_8546(((sprwxh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, nArray, n2 += 6);
            n3 = ++n;
            n2 += 6;
        }
        return new sprjwh(this, arg2, nArray);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprvvh(this, arg0, arg1);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwxh(arg0);
    }

    static {
        cfr_renamed_3 = sprwxh.cfr_renamed_119;
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprwxh(sprck.cfr_renamed_4);
        cfr_renamed_91 = sprlshArray;
    }
}

