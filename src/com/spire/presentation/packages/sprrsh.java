/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbuh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.spreyh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprkgka;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmqh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprzna;
import java.math.BigInteger;

public class sprrsh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_2;
    public spreyh cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

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

    public sprrsh() {
        sprrsh sprrsh2 = this;
        super(163, 3, 6, 7);
        sprrsh sprrsh3 = this;
        this.cfr_renamed_3 = new spreyh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        this.cfr_renamed_93 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprzna.cfr_renamed_9(";;;H=9:0;>I1H0>:HH:=38NK:9>89O<1<=?H8;;<MM"))));
        this.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprkgka.cfr_renamed_9("BABEBEBEBEBEBEBEBEBEBGKG40EB7BB6CG3A@FF6AF")));
        sprrsh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprrsh2.cfr_renamed_152 = 6;
    }

    public int cfr_renamed_2117() {
        return 6;
    }

    @Override
    public int cfr_renamed_1938() {
        return 163;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spreyh(this, arg0, arg1, arg2);
    }

    public int cfr_renamed_1186() {
        return 163;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprrsh();
    }

    public int cfr_renamed_2115() {
        return 3;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 3 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprinh.cfr_renamed_8537(((sprbuh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprinh.cfr_renamed_8537(((sprbuh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 3);
            n3 = ++n;
            n2 += 3;
        }
        return new sprmqh(this, arg2, lArray);
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprbuh(arg0);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprbuh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    public boolean cfr_renamed_1024() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spreyh(this, arg0, arg1);
    }

    public int cfr_renamed_2116() {
        return 7;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }
}

