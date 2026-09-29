/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.spryjd;
import com.spire.presentation.packages.sprzid;
import com.spire.presentation.packages.sprzkd;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;

public class sprnmd
implements spry {
    private spryjd cfr_renamed_4;

    @Override
    public sprwnd cfr_renamed_1223() {
        sprzid sprzid2 = sprzid.cfr_renamed_3;
        sprpgd sprpgd2 = this.cfr_renamed_4.cfr_renamed_284();
        sprzmd sprzmd2 = new sprzmd(sprpgd2.cfr_renamed_1155(), sprpgd2.cfr_renamed_1145(), null, sprpgd2.cfr_renamed_2331());
        sprzid sprzid3 = sprzid2;
        BigInteger bigInteger = sprzid3.cfr_renamed_3521(sprzmd2, this.cfr_renamed_4.cfr_renamed_1295());
        BigInteger bigInteger2 = sprzid3.cfr_renamed_3522(sprzmd2, bigInteger);
        return new sprwnd(new sprzkd(bigInteger2, sprpgd2), new sprimd(bigInteger, sprpgd2));
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_4 = (spryjd)arg0;
    }
}

