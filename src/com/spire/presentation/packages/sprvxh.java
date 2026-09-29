/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprggk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprloh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnoh;
import com.spire.presentation.packages.sprouh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprsnh;
import com.spire.presentation.packages.sprweh;
import java.math.BigInteger;

public class sprvxh
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    public sprsnh cfr_renamed_3;
    private static final sprlsh[] cfr_renamed_4;

    public int cfr_renamed_2117() {
        return 0;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return true;
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

    public int cfr_renamed_2115() {
        return 87;
    }

    public int cfr_renamed_1186() {
        return 409;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprsnh(this, arg0, arg1, arg2);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 7 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprweh.cfr_renamed_8537(((sprnoh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprweh.cfr_renamed_8537(((sprnoh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 7);
            n3 = ++n;
            n2 += 7;
        }
        return new sprouh(this, arg2, lArray);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprsnh(this, arg0, arg1);
    }

    public sprvxh() {
        sprvxh sprvxh2 = this;
        sprvxh sprvxh3 = this;
        super(409, 87, 0, 0);
        sprvxh sprvxh4 = this;
        this.cfr_renamed_3 = new sprsnh(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(0L));
        sprvxh3.cfr_renamed_93 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        sprvxh3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprggk.cfr_renamed_9("mo\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001co\u001cloob\u001a\u0018\u001b\u001e\u001d\u001fhh\u0019n\u0019jl\u0019\u001do\u001cmmol\u001e\u001a\u001f\u001a\u001f\u001e\u0019hoknkojb\u001a\u0018\u0011\u001f\u0019kloo\u0019o")));
        sprvxh2.cfr_renamed_107 = BigInteger.valueOf(4L);
        sprvxh2.cfr_renamed_152 = 6;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprvxh();
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    @Override
    public sprfe cfr_renamed_1994() {
        return new sprloh();
    }

    @Override
    public int cfr_renamed_1938() {
        return 409;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprnoh(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprnoh(arg0);
    }
}

