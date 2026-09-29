/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprjid;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.sprzid;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;

public class sprnnd
implements spry {
    private sprjid cfr_renamed_4;

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_4 = (sprjid)arg0;
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        sprzid sprzid2 = sprzid.cfr_renamed_3;
        sprzmd sprzmd2 = this.cfr_renamed_4.cfr_renamed_284();
        sprzid sprzid3 = sprzid2;
        BigInteger bigInteger = sprzid3.cfr_renamed_3521(sprzmd2, this.cfr_renamed_4.cfr_renamed_1295());
        BigInteger bigInteger2 = sprzid3.cfr_renamed_3522(sprzmd2, bigInteger);
        return new sprwnd(new sprmgd(bigInteger2, sprzmd2), new sprrkd(bigInteger, sprzmd2));
    }
}

