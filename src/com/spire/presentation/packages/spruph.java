/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgo;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprrqh;
import com.spire.presentation.packages.spruuh;
import com.spire.presentation.packages.sprwyh;
import java.math.BigInteger;

public class spruph
extends sprqsh {
    private static final int cfr_renamed_0 = 6;
    public sprrqh cfr_renamed_3;
    private static final sprlsh[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwyh(arg0);
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
        return new spruuh(this, arg2, lArray);
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new spruph();
    }

    public int cfr_renamed_2115() {
        return 15;
    }

    public int cfr_renamed_1186() {
        return 193;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprrqh(this, arg0, arg1, arg2);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprwyh(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
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
    public int cfr_renamed_1938() {
        return 193;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprrqh(this, arg0, arg1);
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    public spruph() {
        spruph spruph2 = this;
        spruph spruph3 = this;
        super(193, 15, 0, 0);
        spruph3.cfr_renamed_3 = new sprrqh(this, null, null);
        spruph3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprjfd.cfr_renamed_9("z\u0018|\u001a\f\u001a\u007fh\u007f\u0018y\u001e\t\u001b\tlyl\u000b\u001f\u000fmr\u001f|\u001e{\u0010zkzk\t\u001dyl\tm|\u0010s\u001e}\u001ez\u001b}\u0019sk"))));
        spruph3.cfr_renamed_93 = spruph3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprbgo.cfr_renamed_9("m\t\u001e\u0000\u001f{d|e\u0000o\u000e\u0019\r\u0019\u000fizn\u000ej|ox\u001f\u000be\fkxh{l\u000f\u0018\n\u0018\u007f\u001f\u000e\u001b\u000fl}i\nl\u000f\u001c|"))));
        spruph3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprjfd.cfr_renamed_9("z\u0018z\u0019z\u0019z\u0019z\u0019z\u0019z\u0019z\u0019z\u0019z\u0019z\u0019z\u0019z\u0018\u007fh\u000bk\u007f\u001f{kz\u0019\u007f\u001d{\u001a\tj\u000e\u001d\u000fls\u0010\u000e\u001c")));
        spruph2.cfr_renamed_107 = BigInteger.valueOf(2L);
        spruph2.cfr_renamed_152 = 6;
    }
}

