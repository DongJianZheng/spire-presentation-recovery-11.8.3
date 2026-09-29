/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbth;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprggp;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprpwh;
import com.spire.presentation.packages.sprwrh;
import com.spire.presentation.packages.sprwvj;
import com.spire.presentation.packages.sprzwh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spraqh
extends spriwh {
    private static final BigInteger cfr_renamed_152;
    public sprzwh cfr_renamed_112;
    public static final BigInteger cfr_renamed_119;
    private static final sprlsh[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 4;
    private static final BigInteger cfr_renamed_3;

    public spraqh() {
        spraqh spraqh2 = this;
        spraqh spraqh3 = this;
        super(cfr_renamed_119);
        spraqh3.cfr_renamed_112 = new sprzwh(this, null, null);
        spraqh3.cfr_renamed_79 = this.cfr_renamed_1652(cfr_renamed_3);
        spraqh3.cfr_renamed_93 = spraqh3.cfr_renamed_1652(cfr_renamed_152);
        spraqh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprwvj.cfr_renamed_9("}_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_}[\b*\nV\b*\r]\nXu,\bYyW}]z\\}.y,\nZ\b\\\t+")));
        spraqh2.cfr_renamed_107 = BigInteger.valueOf(8L);
        spraqh2.cfr_renamed_152 = (BigInteger)4;
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_119;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprzwh(this, arg0, arg1, arg2);
    }

    static {
        cfr_renamed_119 = sprwrh.cfr_renamed_119;
        cfr_renamed_3 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprggp.cfr_renamed_9("H!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!;!CXNYKT;QNT")));
        cfr_renamed_152 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprwvj.cfr_renamed_9("{-x]y*\b_uX\u000e[~Z\t+|V{-x]y*\b_uX\u000e[~Z\t+|V{-x]y*\b_uX\u000e[~Y|-y*u,{X}_\u000fWz[")));
        sprlsh[] sprlshArray = new sprlsh[2];
        sprlshArray[0] = new sprwrh(sprck.cfr_renamed_4);
        sprlshArray[1] = new sprwrh(cfr_renamed_3);
        cfr_renamed_91 = sprlshArray;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new spraqh();
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 4: {
                return true;
            }
        }
        return false;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprzwh(this, arg0, arg1);
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_112;
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_9000(arg0, nArray);
        return new sprwrh(nArray);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 8 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8546(((sprwrh)spreuh2.cfr_renamed_1953()).cfr_renamed_3, 0, nArray, n2);
            sprmeh.cfr_renamed_8546(((sprwrh)spreuh2.cfr_renamed_1954()).cfr_renamed_3, 0, nArray, n2 += 8);
            n3 = ++n;
            n2 += 8;
        }
        return new sprpwh(this, arg2, nArray);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_91;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwrh(arg0);
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_9001(arg0, nArray);
        return new sprwrh(nArray);
    }
}

