/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfbp;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprkoh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprqdaa;
import com.spire.presentation.packages.sprwnh;
import com.spire.presentation.packages.sprxxh;
import com.spire.presentation.packages.spryoh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprpxh
extends spriwh {
    public static final BigInteger cfr_renamed_1 = sprwnh.cfr_renamed_119;
    private static final sprlsh[] cfr_renamed_2;
    public spryoh cfr_renamed_3;
    private static final int cfr_renamed_4 = 2;

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwnh(arg0);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spryoh(this, arg0, arg1, arg2);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprwnh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprpxh();
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 8 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8546(((sprwnh)spreuh2.cfr_renamed_1953()).cfr_renamed_112, 0, nArray, n2);
            sprmeh.cfr_renamed_8546(((sprwnh)spreuh2.cfr_renamed_1954()).cfr_renamed_112, 0, nArray, n2 += 8);
            n3 = ++n;
            n2 += 8;
        }
        return new sprkoh(this, arg2, nArray);
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_9001(arg0, nArray);
        return new sprwnh(nArray);
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

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_1;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spryoh(this, arg0, arg1);
    }

    public sprpxh() {
        sprpxh sprpxh2 = this;
        sprpxh sprpxh3 = this;
        super(cfr_renamed_1);
        sprpxh3.cfr_renamed_3 = new spryoh(this, null, null);
        sprpxh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprqdaa.cfr_renamed_9("usususupusususususususususususususususus\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005usususususususuv"))));
        sprpxh3.cfr_renamed_93 = sprpxh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprfbp.cfr_renamed_9("/'X&[^$Z$[$Y(Z.+)[(^$Z)]^Y+*-&\\([,$(%&[*,*\\]%Y$-Y[_\\_[).)[$+-Z$,"))));
        sprpxh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprqdaa.cfr_renamed_9("usususupusususususususususususus\u0004\u0007\u0003\u0006ws\u0005w\u0001\u0004p\u0003\u0003\u0000\u0001w\u0006\u0006qwu\u0001\u0003\f\u0000\fw\u0000\u0007\u0004\u0001\u0006")));
        sprpxh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprpxh2.cfr_renamed_152 = 2;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_1.bitLength();
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_9000(arg0, nArray);
        return new sprwnh(nArray);
    }
}

