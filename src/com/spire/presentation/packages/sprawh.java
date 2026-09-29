/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbph;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfxh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhqh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprqwl;
import com.spire.presentation.packages.spruxh;
import com.spire.presentation.packages.sprxko;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprawh
extends spriwh {
    public sprfxh cfr_renamed_1;
    public static final BigInteger cfr_renamed_2 = sprbph.cfr_renamed_119;
    private static final sprlsh[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 2;

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

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprawh();
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprbph(sprck.cfr_renamed_4);
        cfr_renamed_3 = sprlshArray;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_2.bitLength();
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 6 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprinh.cfr_renamed_8546(((sprbph)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, nArray, n2);
            sprinh.cfr_renamed_8546(((sprbph)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, nArray, n2 += 6);
            n3 = ++n;
            n2 += 6;
        }
        return new spruxh(this, arg2, nArray);
    }

    public sprawh() {
        sprawh sprawh2 = this;
        sprawh sprawh3 = this;
        super(cfr_renamed_2);
        sprawh3.cfr_renamed_1 = new sprfxh(this, null, null);
        sprawh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprqwl.cfr_renamed_9("&U&U&U&U&U&U&U&U&U&U&U&U&U&U&U&V&U&U&U&U&U&U&U&P"))));
        sprawh3.cfr_renamed_93 = sprawh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprxko.cfr_renamed_9("\u000b}\u000fx\r|\fpx|\u0004\n\u0005yx~\r\u000f|~xp|\u000b\n{\u000f}\u000ey\tp{\f\u007fqy\fx\n~x\t\u007f\u007fp\u007fx"))));
        sprawh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprqwl.cfr_renamed_9("&U&U&U&U&U&U&U&U&U&U&U&UY*$V&+S%Q'VQ#*\"\"\"'$!R+S\"")));
        sprawh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprawh2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_9001(arg0, nArray);
        return new sprbph(nArray);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprfxh(this, arg0, arg1);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprbph(arg0);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprfxh(this, arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_9000(arg0, nArray);
        return new sprbph(nArray);
    }
}

