/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprdld;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprmdd
implements spry,
sprpb {
    public SecureRandom cfr_renamed_3;
    public sprqid cfr_renamed_4;

    @Override
    public sprwnd cfr_renamed_1223() {
        BigInteger bigInteger;
        BigInteger bigInteger2 = this.cfr_renamed_4.cfr_renamed_1146();
        int n = bigInteger2.bitLength();
        int n2 = n >>> 2;
        while ((bigInteger = new BigInteger(n, this.cfr_renamed_3)).compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || bigInteger.compareTo(bigInteger2) >= 0 || sprotb.cfr_renamed_1794(bigInteger) < n2) {
        }
        sprrlb sprrlb2 = this.cfr_renamed_3284().cfr_renamed_1968(this.cfr_renamed_4.cfr_renamed_1145(), bigInteger);
        return new sprwnd(new sprwmd(sprrlb2, this.cfr_renamed_4), new spreed(bigInteger, this.cfr_renamed_4));
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        sprdld sprdld2 = (sprdld)arg0;
        this.cfr_renamed_3 = sprdld2.cfr_renamed_1295();
        this.cfr_renamed_4 = sprdld2.cfr_renamed_3373();
        if (this.cfr_renamed_3 == null) {
            sprmdd sprmdd2 = this;
            sprmdd2.cfr_renamed_3 = new SecureRandom();
        }
    }

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }
}

