/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprcfd;
import com.spire.presentation.packages.spreld;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprpcd;
import com.spire.presentation.packages.sprshd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprukd
implements spry {
    private spreld cfr_renamed_4;

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_4 = (spreld)arg0;
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        BigInteger bigInteger;
        sprukd sprukd2 = this;
        sprcfd sprcfd2 = sprukd2.cfr_renamed_4.cfr_renamed_284();
        SecureRandom secureRandom = sprukd2.cfr_renamed_4.cfr_renamed_1295();
        sprcfd sprcfd3 = sprcfd2;
        BigInteger bigInteger2 = sprcfd3.cfr_renamed_1604();
        BigInteger bigInteger3 = sprcfd3.cfr_renamed_1155();
        BigInteger bigInteger4 = sprcfd3.cfr_renamed_1778();
        int n = 64;
        while ((bigInteger = new BigInteger(256, secureRandom)).signum() < 1 || bigInteger.compareTo(bigInteger2) >= 0 || sprotb.cfr_renamed_1794(bigInteger) < n) {
        }
        BigInteger bigInteger5 = bigInteger4.modPow(bigInteger, bigInteger3);
        return new sprwnd(new sprpcd(bigInteger5, sprcfd2), new sprshd(bigInteger, sprcfd2));
    }
}

