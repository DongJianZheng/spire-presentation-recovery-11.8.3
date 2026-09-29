/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdqh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprjuh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmrh;
import com.spire.presentation.packages.sproxh;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.spryny;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprnwh
extends spriwh {
    public sproxh cfr_renamed_119;
    public static final BigInteger cfr_renamed_91 = sprjuh.cfr_renamed_119;
    private static final int cfr_renamed_0 = 2;
    private static final sprlsh[] cfr_renamed_4;

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sproxh(this, arg0, arg1);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sproxh(this, arg0, arg1, arg2);
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

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprnwh();
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprjuh(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 5 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprqkh.cfr_renamed_8546(((sprjuh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, nArray, n2);
            sprqkh.cfr_renamed_8546(((sprjuh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, nArray, n2 += 5);
            n3 = ++n;
            n2 += 5;
        }
        return new sprdqh(this, arg2, nArray);
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_119;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_9001(arg0, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_9000(arg0, nArray);
        return new sprjuh(nArray);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_91;
    }

    public sprnwh() {
        sprnwh sprnwh2 = this;
        sprnwh sprnwh3 = this;
        super(cfr_renamed_91);
        this.cfr_renamed_119 = new sproxh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(sprck.cfr_renamed_0);
        sprnwh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(7L));
        sprnwh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(spryny.cfr_renamed_9("\n\u0018\n\u0019\n\u0019\n\u0019\n\u0019\n\u0019\n\u0019\n\u0019\n\u0019\n\u0019\n\u0018x\u0011|h\u000b\u001f~o{k\u0003hyh\u000b\u001fx\u001fx\u001a")));
        sprnwh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprnwh2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprjuh(arg0);
    }
}

