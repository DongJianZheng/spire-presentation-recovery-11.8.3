/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravr;
import com.spire.presentation.packages.sprbuh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprkvh;
import com.spire.presentation.packages.sprloh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprpph;
import com.spire.presentation.packages.sprqsh;
import java.math.BigInteger;

public class sprzsh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_2;
    public sprkvh cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

    public boolean cfr_renamed_1024() {
        return false;
    }

    public int cfr_renamed_2116() {
        return 7;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return true;
    }

    public int cfr_renamed_2115() {
        return 3;
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

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprzsh();
    }

    public int cfr_renamed_2117() {
        return 6;
    }

    public int cfr_renamed_1186() {
        return 163;
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
        return new sprpph(this, arg2, lArray);
    }

    @Override
    public sprfe cfr_renamed_1994() {
        return new sprloh();
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprkvh(this, arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprkvh(this, arg0, arg1);
    }

    public sprzsh() {
        sprzsh sprzsh2 = this;
        super(163, 3, 6, 7);
        sprzsh sprzsh3 = this;
        this.cfr_renamed_3 = new sprkvh(this, null, null);
        this.cfr_renamed_93 = this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        this.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(spravr.cfr_renamed_9("\tr\tv\tv\tv\tv\tv\tv\tv\tv\tv\tt\tw\t~xt|vz\u0005\t\u0002\u0000\u007f\u007f~xs|\u0000")));
        sprzsh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprzsh2.cfr_renamed_152 = 6;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_1938() {
        return 163;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }
}

