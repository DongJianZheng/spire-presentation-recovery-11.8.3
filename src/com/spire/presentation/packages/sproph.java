/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprquo;
import com.spire.presentation.packages.sprrth;
import com.spire.presentation.packages.sprsyh;
import com.spire.presentation.packages.sprwyh;
import com.spire.presentation.packages.spryky;
import java.math.BigInteger;

public class sproph
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    private static final sprlsh[] cfr_renamed_3;
    public sprrth cfr_renamed_4;

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

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sproph();
    }

    public int cfr_renamed_2115() {
        return 15;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprwyh(sprck.cfr_renamed_4);
        cfr_renamed_3 = sprlshArray;
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 4 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprmeh.cfr_renamed_8537(((sprwyh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprmeh.cfr_renamed_8537(((sprwyh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 4);
            n3 = ++n;
            n2 += 4;
        }
        return new sprsyh(this, arg2, lArray);
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprrth(this, arg0, arg1);
    }

    public sproph() {
        sproph sproph2 = this;
        sproph sproph3 = this;
        super(193, 15, 0, 0);
        sproph3.cfr_renamed_4 = new sprrth(this, null, null);
        sproph3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(spryky.cfr_renamed_9("MbLeEgE\u00148\u0010J\u0013DjDeHcKk8cJc;eJ\u0010IbEe9\u0017MkE\u0013>j<kLc9\u0014J\u0010Mc"))));
        sproph3.cfr_renamed_93 = sproph3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprquo.cfr_renamed_9("\u0014\u001fbkbm\u0010\u0016fia\u0019g\u001ce\u0017\u001dieleken\u0013n\u0015j\u0011mfl\u0013lg\u001eg\u001da\u001a`\u0017\u0017\u001e\u0010\u0018\u001c\u0017\u0015\u001b"))));
        sproph3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(spryky.cfr_renamed_9("McMbMbMbMbMbMbMbMbMbMbMbMb>e;aI\u0013JeE\u0014IfN\u0013>\u0011D`M\u0017?\u0013Ik")));
        sproph2.cfr_renamed_107 = BigInteger.valueOf(2L);
        sproph2.cfr_renamed_152 = 6;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprrth(this, arg0, arg1, arg2);
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    public int cfr_renamed_1186() {
        return 193;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwyh(arg0);
    }

    @Override
    public int cfr_renamed_1938() {
        return 193;
    }
}

