/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprqlaa;
import com.spire.presentation.packages.sprqph;
import com.spire.presentation.packages.sprtkfa;
import com.spire.presentation.packages.sprunh;
import com.spire.presentation.packages.sprwwh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprdoh
extends spriwh {
    private static final int cfr_renamed_0 = 2;
    public static final BigInteger cfr_renamed_2 = sprwwh.cfr_renamed_119;
    public sprayh cfr_renamed_3;
    private static final sprlsh[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_9000(arg0, nArray);
        return new sprwwh(nArray);
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
        return cfr_renamed_2;
    }

    public sprdoh() {
        sprdoh sprdoh2 = this;
        sprdoh sprdoh3 = this;
        super(cfr_renamed_2);
        sprdoh3.cfr_renamed_3 = new sprayh(this, null, null);
        sprdoh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprtkfa.cfr_renamed_9("4B4B4B4BB4B4B4B5B4B4B4B4B4B4B4B4B4B4B4B44B4B4B4B4B4B4B4B4B4B4B4G"))));
        sprdoh3.cfr_renamed_93 = sprdoh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprqlaa.cfr_renamed_9("\u0007\u0018qo\u0001lvas\u0018\u0001\u0018\u000bjwnpjw\u001bp\u001d\u0007l\u0005o\u000ba\nop\u001a\u0004l\u0003\u001d\u0002opiq\u001a\u0007jpito\u0001\u001bq\u001c\u0001\u001a\u0001\u001c\u0000nvk\u0004i\u0006\u001b"))));
        sprdoh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprtkfa.cfr_renamed_9("4B4B4B4BB4B4B4B44B4B4B4B4B4B4B4B0G724E3@33C3KAJ0470=1E164GD7@1G5")));
        sprdoh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprdoh2.cfr_renamed_152 = 2;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_2.bitLength();
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprayh(this, arg0, arg1, arg2);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 8 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8546(((sprwwh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, nArray, n2);
            sprmeh.cfr_renamed_8546(((sprwwh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, nArray, n2 += 8);
            n3 = ++n;
            n2 += 8;
        }
        return new sprqph(this, arg2, nArray);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwwh(arg0);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprwwh(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_9001(arg0, nArray);
        return new sprwwh(nArray);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprdoh();
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprayh(this, arg0, arg1);
    }
}

