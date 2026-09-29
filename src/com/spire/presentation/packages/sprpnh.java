/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdth;
import com.spire.presentation.packages.sprekh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprish;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprrwh;
import com.spire.presentation.packages.sprxbc;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprpnh
extends spriwh {
    public static final BigInteger cfr_renamed_119 = sprish.cfr_renamed_119;
    public sprdth cfr_renamed_91;
    private static final int cfr_renamed_0 = 2;
    private static final sprlsh[] cfr_renamed_4;

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprish(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprdth(this, arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprish(arg0);
    }

    public sprpnh() {
        sprpnh sprpnh2 = this;
        sprpnh sprpnh3 = this;
        super(cfr_renamed_119);
        this.cfr_renamed_91 = new sprdth(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(sprck.cfr_renamed_0);
        sprpnh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(5L));
        sprpnh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprxbc.cfr_renamed_9("]\u007f]~]~]~]~]~]~]~]~]~]~]~]~]~]\u007f)\r(v)|(\r[\u007fUz.\u000f+~,wZ\u007fZxT\b/\u007f+y")));
        sprpnh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprpnh2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        spraxh.cfr_renamed_9000(arg0, nArray);
        return new sprish(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        spraxh.cfr_renamed_9001(arg0, nArray);
        return new sprish(nArray);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_119;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 7 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprekh.cfr_renamed_8546(((sprish)spreuh2.cfr_renamed_1953()).cfr_renamed_3, 0, nArray, n2);
            sprekh.cfr_renamed_8546(((sprish)spreuh2.cfr_renamed_1954()).cfr_renamed_3, 0, nArray, n2 += 7);
            n3 = ++n;
            n2 += 7;
        }
        return new sprrwh(this, arg2, nArray);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprpnh();
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
        return cfr_renamed_4;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprdth(this, arg0, arg1);
    }
}

