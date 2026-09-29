/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreth;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhph;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprrwja;
import com.spire.presentation.packages.sprthh;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class sprlrh
extends sprqsh {
    private static final sprlsh[] cfr_renamed_2;
    public sprhph cfr_renamed_3;
    private static final int cfr_renamed_4 = 6;

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprbwh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprbwh(arg0);
    }

    @Override
    public int cfr_renamed_1938() {
        return 113;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprlrh();
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprhph(this, arg0, arg1);
    }

    public int cfr_renamed_2115() {
        return 9;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprhph(this, arg0, arg1, arg2);
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

    public int cfr_renamed_1186() {
        return 113;
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 2 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprthh.cfr_renamed_8537(((sprbwh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprthh.cfr_renamed_8537(((sprbwh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 2);
            n3 = ++n;
            n2 += 2;
        }
        return new spreth(this, arg2, lArray);
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    public sprlrh() {
        sprlrh sprlrh2 = this;
        sprlrh sprlrh3 = this;
        super(113, 9, 0, 0);
        sprlrh3.cfr_renamed_3 = new sprhph(this, null, null);
        sprlrh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprxlh.cfr_renamed_9("\\WZ_U^]_(%)$[\"Y&\\#(Q(!/W-&YR/P"))));
        sprlrh3.cfr_renamed_93 = sprlrh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprrwja.cfr_renamed_9("[-R(.$*$.^R_Y$\\_/))[X+.-^$Z%_["))));
        sprlrh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprxlh.cfr_renamed_9("\\V\\W\\W\\W\\W\\W\\W\\V\\_[_U%^SUQ-!UT")));
        sprlrh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprlrh2.cfr_renamed_152 = 6;
    }
}

