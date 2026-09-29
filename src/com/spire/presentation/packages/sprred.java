/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprfhd;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprred
implements spry {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprfhd cfr_renamed_4;

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_4 = (sprfhd)arg0;
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        sprcld sprcld2 = this.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprred.cfr_renamed_3530(sprcld2.cfr_renamed_1604(), this.cfr_renamed_4.cfr_renamed_1295());
        BigInteger bigInteger2 = sprcld2.cfr_renamed_1145().modPow(bigInteger, sprcld2.cfr_renamed_1155());
        return new sprwnd(new spruld(bigInteger2, sprcld2), new sprlnd(bigInteger, sprcld2));
    }

    private static /* synthetic */ BigInteger cfr_renamed_3530(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger;
        int n = arg0.bitLength() >>> 2;
        while (sprotb.cfr_renamed_1794(bigInteger = sprvpa.cfr_renamed_513(cfr_renamed_3, arg0.subtract(cfr_renamed_3), arg1)) < n) {
        }
        return bigInteger;
    }
}

