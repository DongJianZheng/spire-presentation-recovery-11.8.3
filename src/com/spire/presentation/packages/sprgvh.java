/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawba;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgsh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.spruvh;
import com.spire.presentation.packages.sprxwh;
import java.math.BigInteger;

public class sprgvh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 6;
    public spruvh cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return 131;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 3 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprinh.cfr_renamed_8537(((sprgsh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprinh.cfr_renamed_8537(((sprgsh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 3);
            n3 = ++n;
            n2 += 3;
        }
        return new sprxwh(this, arg2, lArray);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spruvh(this, arg0, arg1);
    }

    public int cfr_renamed_2117() {
        return 3;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprgsh(sprck.cfr_renamed_4);
        cfr_renamed_91 = sprlshArray;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprgsh(arg0);
    }

    public boolean cfr_renamed_1024() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 6: {
                return true;
            }
        }
        return false;
    }

    public sprgvh() {
        sprgvh sprgvh2 = this;
        sprgvh sprgvh3 = this;
        super(131, 2, 3, 8);
        sprgvh3.cfr_renamed_4 = new spruvh(this, null, null);
        sprgvh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprseca.cfr_renamed_9("$EQCUN,O%OPAW7R5V0 G!0$AWD%A\"C#EVD"))));
        sprgvh3.cfr_renamed_93 = sprgvh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprawba.cfr_renamed_9("AU3YCWG EW2TDWDV0\"FRE\"4RI'API'CPHS"))));
        sprgvh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprseca.cfr_renamed_9("$B$F$F$F$F$F$F$F$G\"O!BUD'E$B-4UO,0")));
        sprgvh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprgvh2.cfr_renamed_152 = 6;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprgvh();
    }

    public int cfr_renamed_2116() {
        return 8;
    }

    public int cfr_renamed_2115() {
        return 2;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_91;
    }

    public int cfr_renamed_1186() {
        return 131;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spruvh(this, arg0, arg1, arg2);
    }
}

