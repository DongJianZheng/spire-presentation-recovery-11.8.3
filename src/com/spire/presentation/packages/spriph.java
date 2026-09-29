/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdmp;
import com.spire.presentation.packages.sprdyh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprolh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprqxh;
import com.spire.presentation.packages.spruqh;
import java.math.BigInteger;

public class spriph
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    public spruqh cfr_renamed_1;
    private static final sprlsh[] cfr_renamed_2;
    public static final sprqxh cfr_renamed_3;
    public static final sprqxh cfr_renamed_4;

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 9 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprolh.cfr_renamed_8537(((sprqxh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprolh.cfr_renamed_8537(((sprqxh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 9);
            n3 = ++n;
            n2 += 9;
        }
        return new sprdyh(this, arg2, lArray);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spruqh(this, arg0, arg1);
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprqxh(arg0);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprqxh(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
        cfr_renamed_3 = new sprqxh(new BigInteger(1, sprfqe.cfr_renamed_5217(sprdmp.cfr_renamed_9("3bEd3\u00154\u00151b1aEb:eG\u00151i4a2gAgEcGf1\u00166\u00135\u0011:gE\u0016@\u0012;\u0013F\u0016Ea@\u00145\u0012Bh@\u00157\u0011:\u00112hB\u0014;dE\u0016B\u0012A\u0014;\u0015E\u00116i0c1\u0012FgB\u00145g6fBf5\u00151i7\u0011E\u00142h6\u00114hE\u00162bB\u00116b3\u00157\u0014Fg0iA\u0011@\u00113\u00134\u0016E\u0015E\u00164\u00161i6e4b4\u0011"))));
        cfr_renamed_4 = (sprqxh)cfr_renamed_3.cfr_renamed_1817();
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

    public boolean cfr_renamed_1024() {
        return false;
    }

    public spriph() {
        spriph spriph2 = this;
        spriph spriph3 = this;
        super(571, 2, 5, 10);
        spriph spriph4 = this;
        this.cfr_renamed_1 = new spruqh(this, null, null);
        spriph3.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        spriph3.cfr_renamed_93 = cfr_renamed_3;
        spriph3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprgmg.cfr_renamed_9("k\u0017\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001db\u001e\u0012m\u0015\u0018aj\u001c\u001dbn\u0011b\u001cl\u0017k\u001ck\u0011bfj\u001cm\u001ci\u0017c\u0011ja\u0018\u0013\u001f`bg\u001a\u0015j\u0012j`\u001e\u001dh`n\u0015l\u0010\u001f\u0012mac\u0017c\u0016\u001e\u001d\u0019fib\u001e\u001coao\u0013")));
        spriph2.cfr_renamed_107 = BigInteger.valueOf(2L);
        spriph2.cfr_renamed_152 = 6;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spruqh(this, arg0, arg1, arg2);
    }

    public int cfr_renamed_2117() {
        return 5;
    }

    public int cfr_renamed_2116() {
        return 10;
    }

    @Override
    public int cfr_renamed_1938() {
        return 571;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    public int cfr_renamed_1186() {
        return 571;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new spriph();
    }

    public int cfr_renamed_2115() {
        return 2;
    }
}

