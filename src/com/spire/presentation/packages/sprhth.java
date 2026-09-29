/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spresh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprpvh;
import com.spire.presentation.packages.sprsnl;
import com.spire.presentation.packages.sprsrh;
import com.spire.presentation.packages.sprthh;
import com.spire.presentation.packages.sprxcca;
import com.spire.presentation.packages.sprxoh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprhth
extends spriwh {
    public static final BigInteger cfr_renamed_1 = sprsrh.cfr_renamed_119;
    private static final sprlsh[] cfr_renamed_2;
    public sprpvh cfr_renamed_3;
    private static final int cfr_renamed_4 = 2;

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_1.bitLength();
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
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
        return new sprhth();
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprsrh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprpvh(this, arg0, arg1);
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_9000(arg0, nArray);
        return new sprsrh(nArray);
    }

    public sprhth() {
        sprhth sprhth2 = this;
        sprhth sprhth3 = this;
        super(cfr_renamed_1);
        sprhth3.cfr_renamed_3 = new sprpvh(this, null, null);
        sprhth3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprsnl.cfr_renamed_9("\u001fb\u001fb\u001fb\u001f`\u001fb\u001fb\u001fb\u001fb\u001fb\u001fb\u001fb\u001fb\u001fb\u001fb\u001fb\u001fg"))));
        sprhth3.cfr_renamed_93 = sprhth3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprxcca.cfr_renamed_9("l`\u001em\u001eaji\u0018h\u001eaol\u001a\u001cm`\u001bl\u0010a\u001a\u001b\u001b\u001bl\u001d\u001c\u001dmk"))));
        sprhth3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprsnl.cfr_renamed_9("\u001fb\u001fb\u001fb\u001fai\u0014i\u0014i\u0014i\u0014n\u0011\u0018\u0017i`hf`\u0014j\u001c\u0018\u0015h\u0011")));
        sprhth2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprhth2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_9001(arg0, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 4 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprthh.cfr_renamed_8546(((sprsrh)spreuh2.cfr_renamed_1953()).cfr_renamed_112, 0, nArray, n2);
            sprthh.cfr_renamed_8546(((sprsrh)spreuh2.cfr_renamed_1954()).cfr_renamed_112, 0, nArray, n2 += 4);
            n3 = ++n;
            n2 += 4;
        }
        return new spresh(this, arg2, nArray);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_1;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprsrh(arg0);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprpvh(this, arg0, arg1, arg2);
    }
}

