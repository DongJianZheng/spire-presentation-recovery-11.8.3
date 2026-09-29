/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprash;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprkwh;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprruh;
import com.spire.presentation.packages.sprsqh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprtsh
extends spriwh {
    private static final int cfr_renamed_0 = 2;
    private static final sprlsh[] cfr_renamed_2;
    public static final BigInteger cfr_renamed_3;
    public sprkwh cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprruh.cfr_renamed_9000(arg0, nArray);
        return new sprsqh(nArray);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprkwh(this, arg0, arg1, arg2);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprtsh();
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprkwh(this, arg0, arg1);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprsqh(arg0);
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

    static {
        cfr_renamed_3 = sprsqh.cfr_renamed_119;
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprsqh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 8 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8546(((sprsqh)spreuh2.cfr_renamed_1953()).cfr_renamed_112, 0, nArray, n2);
            sprmeh.cfr_renamed_8546(((sprsqh)spreuh2.cfr_renamed_1954()).cfr_renamed_112, 0, nArray, n2 += 8);
            n3 = ++n;
            n2 += 8;
        }
        return new sprash(this, arg2, nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }

    public sprtsh() {
        sprtsh sprtsh2 = this;
        sprtsh sprtsh3 = this;
        super(cfr_renamed_3);
        this.cfr_renamed_4 = new sprkwh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(sprck.cfr_renamed_0);
        sprtsh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(7L));
        sprtsh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprlfk.cfr_renamed_9("e\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u001ae\u0019a\u001db\u0019g\u001ffjb\u001a\u0017dbl\u0010\u001ea\u001agn\u0016\u0019\u001b\u001fgl\u0010j\u0017m\u0017m")));
        sprtsh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprtsh2.cfr_renamed_152 = 2;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprruh.cfr_renamed_9001(arg0, nArray);
        return new sprsqh(nArray);
    }
}

