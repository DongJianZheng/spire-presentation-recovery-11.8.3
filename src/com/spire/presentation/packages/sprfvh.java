/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprato;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprekh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.spriyh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnyh;
import com.spire.presentation.packages.sprtph;
import com.spire.presentation.packages.spryqh;
import com.spire.presentation.packages.sprzmq;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprfvh
extends spriwh {
    public spriyh cfr_renamed_91;
    private static final int cfr_renamed_0 = 2;
    private static final sprlsh[] cfr_renamed_2;
    public static final BigInteger cfr_renamed_3;

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spriyh(this, arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_91;
    }

    public sprfvh() {
        sprfvh sprfvh2 = this;
        sprfvh sprfvh3 = this;
        super(cfr_renamed_3);
        sprfvh3.cfr_renamed_91 = new spriyh(this, null, null);
        sprfvh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprzmq.cfr_renamed_9("`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\b"))));
        sprfvh3.cfr_renamed_93 = sprfvh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprato.cfr_renamed_9("Xt*u*\u0001\"u*\u0003*tXs[\u0002\\u.q)r/v/p.tXpXw^wX\u0006^xX\u0001(w*\u0002)y.s(s/u\\\u0006Xt"))));
        sprfvh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprzmq.cfr_renamed_9("`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b`\u000b\u0017{g\u007fc}du`}\u0015\b\u0017~b\t\u0014t\u0012x\u0013\u000e\u0013\u000e\u0014\f\u0015\t")));
        sprfvh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprfvh2.cfr_renamed_152 = 2;
    }

    static {
        cfr_renamed_3 = sprtph.cfr_renamed_119;
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprtph(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spriyh(this, arg0, arg1);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprtph(arg0);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 7 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprekh.cfr_renamed_8546(((sprtph)spreuh2.cfr_renamed_1953()).cfr_renamed_112, 0, nArray, n2);
            sprekh.cfr_renamed_8546(((sprtph)spreuh2.cfr_renamed_1954()).cfr_renamed_112, 0, nArray, n2 += 7);
            n3 = ++n;
            n2 += 7;
        }
        return new spryqh(this, arg2, nArray);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_9001(arg0, nArray);
        return new sprtph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_9000(arg0, nArray);
        return new sprtph(nArray);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprfvh();
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
        return cfr_renamed_2;
    }
}

