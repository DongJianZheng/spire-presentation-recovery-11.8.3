/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdcz;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;

public class spryml
implements spruy {
    private sprwsk cfr_renamed_2;
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprquk cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155().bitLength() + 7) / 8;
    }

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        sprryk sprryk2 = (sprryk)arg0;
        if (!sprryk2.cfr_renamed_284().equals(this.cfr_renamed_2)) {
            throw new IllegalArgumentException(sprdcz.cfr_renamed_9("5B\u0017M\u0018N\\c\u0014G\u001dF\u0010EQ[\u0004I\u001dB\u0012\u000b\u001aN\b\u000b\u0019J\u0002\u000b\u0006Y\u001eE\u0016\u000b\u0001J\u0003J\u001cN\u0005N\u0003X_"));
        }
        BigInteger bigInteger = this.cfr_renamed_2.cfr_renamed_1155();
        BigInteger bigInteger2 = sprryk2.spr\u3181();
        if (bigInteger2 == null || bigInteger2.compareTo(cfr_renamed_3) <= 0 || bigInteger2.compareTo(bigInteger.subtract(cfr_renamed_3)) >= 0) {
            throw new IllegalArgumentException(sprqry.cfr_renamed_9("VLtC{@?mwI~HsK2UgG~Lq\u0005y@k\u0005{V2RwDy"));
        }
        BigInteger bigInteger3 = bigInteger2.modPow(this.cfr_renamed_4.cfr_renamed_1980(), bigInteger);
        if (bigInteger3.equals(cfr_renamed_3)) {
            throw new IllegalStateException(sprdcz.cfr_renamed_9("\"C\u0010Y\u0014OQ@\u0014RQH\u0010EV_QI\u0014\u000b@"));
        }
        return bigInteger3;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        spryye spryye2;
        if (!((arg0 instanceof sprbgk ? (spryye2 = (spryye)((sprbgk)arg0).cfr_renamed_284()) : (spryye2 = (spryye)arg0)) instanceof sprquk)) {
            throw new IllegalArgumentException(sprqry.cfr_renamed_9("VmWKuL|@2@jUwFfV2aZu`LdDf@Y@kusWsHwQwWa"));
        }
        this.cfr_renamed_4 = (sprquk)spryye2;
        this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_284();
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10590(sprdcz.cfr_renamed_9("5c3"), this.cfr_renamed_4));
    }
}

