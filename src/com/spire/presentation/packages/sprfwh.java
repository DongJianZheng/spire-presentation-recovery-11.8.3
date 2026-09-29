/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprebaa;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprjuh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmrh;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.sprtgn;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprfwh
extends spriwh {
    public sprbqh cfr_renamed_119;
    private static final sprlsh[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 2;
    public static final BigInteger cfr_renamed_3;

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
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_9000(arg0, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprfwh();
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_119;
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
        return new sprfuh(this, arg2, nArray);
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_9001(arg0, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprbqh(this, arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprbqh(this, arg0, arg1);
    }

    static {
        cfr_renamed_3 = sprjuh.cfr_renamed_119;
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprjuh(sprck.cfr_renamed_4);
        cfr_renamed_91 = sprlshArray;
    }

    public sprfwh() {
        sprfwh sprfwh2 = this;
        sprfwh sprfwh3 = this;
        super(cfr_renamed_3);
        sprfwh3.cfr_renamed_119 = new sprbqh(this, null, null);
        sprfwh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprebaa.cfr_renamed_9("\bn\bn\bn\bn\bn\bn\bn\bn\bn\bn\bn\bn\bn\bn\bn\bm\bn\bn\u000fky\u0018"))));
        sprfwh3.cfr_renamed_93 = sprfwh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprtgn.cfr_renamed_9("\u000f{\b~~{\t|\u000b\rxv\b\ru\r\f\rxx\u007fxyv}{{yy\u000bx\u000e\u000bz}|uw\u000f\u000e"))));
        sprfwh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprebaa.cfr_renamed_9("~\u0019~\u0018~\u0018~\u0018~\u0018~\u0018~\u0018~\u0018~\u0018~\u0018~\u0018}\u001d\u007fm\u000b\u001fv\u001e\u000f\u0010\u007f\u0010\b\u001b\u000f\u0019\u000f\u0019xj")));
        sprfwh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprfwh2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprjuh(arg0);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_91;
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
    }
}

