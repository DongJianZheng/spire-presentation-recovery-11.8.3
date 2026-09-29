/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprgkj;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprodm;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvgp;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzxl;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;

public class sprjnl {
    private sprodm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjnl(sprnbm sprnbm2, BigInteger bigInteger, sprrcm sprrcm2, sprrcm sprrcm3, sprnbm sprnbm3, sprvhm sprvhm2) {
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        void arg5;
        if (sprnbm2 == null) {
            throw new IllegalArgumentException(sprgkj.cfr_renamed_9("(f2`$gax4f55/z55#pa{4y-"));
        }
        if (arg5 == null) {
            throw new IllegalArgumentException(sprvgp.cfr_renamed_9("\u001e\u001f\f\u0006\u0007\t%\u000f\u0017#\u0000\f\u0001J\u0003\u001f\u001d\u001eN\u0004\u0001\u001eN\b\u000bJ\u0000\u001f\u0002\u0006"));
        }
        sprjnl sprjnl2 = this;
        sprjnl2.cfr_renamed_4 = new sprodm();
        sprjnl2.cfr_renamed_4.cfr_renamed_5001(new sprktm((BigInteger)arg1));
        sprjnl2.cfr_renamed_4.cfr_renamed_10846((sprnbm)arg0);
        sprjnl2.cfr_renamed_4.cfr_renamed_4999((sprrcm)arg2);
        sprjnl2.cfr_renamed_4.cfr_renamed_5005((sprrcm)arg3);
        sprjnl2.cfr_renamed_4.cfr_renamed_10847((sprnbm)arg4);
        sprjnl2.cfr_renamed_4.cfr_renamed_5006((sprvhm)arg5);
    }

    public sprjnl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, sprnbm arg4, sprvhm arg5) {
        this(arg0, arg1, new sprrcm(arg2), new sprrcm(arg3), arg4, arg5);
    }

    public sprtpl cfr_renamed_7373(sprcf arg0) {
        sprjnl sprjnl2 = this;
        sprcf sprcf2 = arg0;
        sprjnl2.cfr_renamed_4.cfr_renamed_4996(sprcf2.cfr_renamed_615());
        return sprzxl.cfr_renamed_10867(sprcf2, sprjnl2.cfr_renamed_4.cfr_renamed_32());
    }

    public sprjnl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, Locale arg4, sprnbm arg5, sprvhm arg6) {
        this(arg0, arg1, new sprrcm(arg2, arg4), new sprrcm(arg3, arg4), arg5, arg6);
    }
}

