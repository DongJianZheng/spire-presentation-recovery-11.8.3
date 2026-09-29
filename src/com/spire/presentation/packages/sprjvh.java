/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlqh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sprnrh;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.spruwh;
import com.spire.presentation.packages.sprznh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprjvh
extends spriwh {
    public static final BigInteger cfr_renamed_1 = sprlqh.cfr_renamed_119;
    public sprznh cfr_renamed_2;
    private static final sprlsh[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 2;

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprlqh(sprck.cfr_renamed_4);
        cfr_renamed_3 = sprlshArray;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_1.bitLength();
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprznh(this, arg0, arg1);
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
    public sprgxh cfr_renamed_2001() {
        return new sprjvh();
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_2;
    }

    public sprjvh() {
        sprjvh sprjvh2 = this;
        sprjvh sprjvh3 = this;
        super(cfr_renamed_1);
        sprjvh3.cfr_renamed_2 = new sprznh(this, null, null);
        sprjvh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprhna.cfr_renamed_9("U>U>U>U>U>U>U>U>U>U>U>U>U>U>U>U>$>U>U>U;"))));
        sprjvh3.cfr_renamed_93 = sprjvh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprmwd.cfr_renamed_9("2\u001e:jA\u0018E\u001e6iA\u00194\u001c;\u001f5hB\u001eEe:\u001b;lGiGiB\u0019@h5hE\u001c7h"))));
        sprjvh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprhna.cfr_renamed_9("#I#H#H#H#H#H#H#H#H#H#IULP@UA!OR=WKP9$M!J&O")));
        sprjvh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprjvh2.cfr_renamed_152 = 2;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 5 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprqkh.cfr_renamed_8546(((sprlqh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, nArray, n2);
            sprqkh.cfr_renamed_8546(((sprlqh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, nArray, n2 += 5);
            n3 = ++n;
            n2 += 5;
        }
        return new spruwh(this, arg2, nArray);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprznh(this, arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprlqh(arg0);
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprnrh.cfr_renamed_9000(arg0, nArray);
        return new sprlqh(nArray);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprnrh.cfr_renamed_9001(arg0, nArray);
        return new sprlqh(nArray);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_1;
    }
}

