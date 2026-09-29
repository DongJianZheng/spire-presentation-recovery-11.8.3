/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyk;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprvmp;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprytk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprvzk
implements sprii {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprcyk cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprcyk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprvmp.cfr_renamed_9("\u0018\u0015\u001d\r9?\u001b#2"), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()), this.cfr_renamed_4.cfr_renamed_284(), spriil.cfr_renamed_91));
    }

    private static /* synthetic */ BigInteger cfr_renamed_3530(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger;
        int n = arg0.bitLength() >>> 2;
        while (sprdvh.cfr_renamed_1794(bigInteger = sprhdf.cfr_renamed_513(cfr_renamed_3, arg0.subtract(cfr_renamed_3), arg1)) < n) {
        }
        return bigInteger;
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprmqk sprmqk2 = this.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprvzk.cfr_renamed_3530(sprmqk2.cfr_renamed_1604(), this.cfr_renamed_4.cfr_renamed_1295());
        BigInteger bigInteger2 = sprmqk2.cfr_renamed_1145().modPow(bigInteger, sprmqk2.cfr_renamed_1155());
        return new sprsil(new sprytk(bigInteger2, sprmqk2), new sprusk(bigInteger, sprmqk2));
    }
}

