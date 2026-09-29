/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbuh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnxh;
import com.spire.presentation.packages.sprqcs;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprtuh;
import java.math.BigInteger;

public class sprowh
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    private static final sprlsh[] cfr_renamed_3;
    public sprnxh cfr_renamed_4;

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    public int cfr_renamed_2116() {
        return 7;
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

    public int cfr_renamed_2117() {
        return 6;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprbuh(sprck.cfr_renamed_4);
        cfr_renamed_3 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprnxh(this, arg0, arg1);
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
        return new sprtuh(this, arg2, lArray);
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    @Override
    public int cfr_renamed_1938() {
        return 163;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprbuh(arg0);
    }

    public sprowh() {
        sprowh sprowh2 = this;
        sprowh sprowh3 = this;
        super(163, 3, 6, 7);
        sprowh3.cfr_renamed_4 = new sprnxh(this, null, null);
        sprowh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprqks.cfr_renamed_9("]K/JUD_?,=(:,DY:TIXH+:UH_D/8UD(NYJ)NZD_=(N"))));
        sprowh3.cfr_renamed_93 = sprowh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprqcs.cfr_renamed_9("{\u001dz\u0019}\u001byn\bn\u000fi\t\u001e{k\nhr\u001e}h\u000fky\u0013\bkr\u001b\r\u001dxk\r\u0013~\u0012\nl\u000f\u0013"))));
        sprowh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprqks.cfr_renamed_9("]O+:+:+:+:+:+:+:+:+:+:YD,=/JUE.NT?,K\\L_KT>")));
        sprowh2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sprowh2.cfr_renamed_152 = 6;
    }

    public int cfr_renamed_2115() {
        return 3;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprnxh(this, arg0, arg1, arg2);
    }

    public boolean cfr_renamed_1024() {
        return false;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprowh();
    }

    public int cfr_renamed_1186() {
        return 163;
    }
}

