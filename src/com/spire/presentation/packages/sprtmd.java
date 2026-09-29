/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprzf;
import java.math.BigInteger;

public class sprtmd
implements sprzf {
    public spreed cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        this.cfr_renamed_4 = (spreed)arg0;
    }

    @Override
    public BigInteger cfr_renamed_2501(sprt arg0) {
        sprwmd sprwmd2 = (sprwmd)arg0;
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        BigInteger bigInteger = sprqid2.cfr_renamed_1153().multiply(this.cfr_renamed_4.cfr_renamed_2112()).mod(sprqid2.cfr_renamed_1146());
        sprrlb sprrlb2 = sprwmd2.cfr_renamed_1604().cfr_renamed_1830(bigInteger).cfr_renamed_1775();
        if (sprrlb2.cfr_renamed_1952()) {
            throw new IllegalStateException(sprjze.cfr_renamed_9("0M\u001fJ\u0017J\rZYJ\n\u0003\u0017L\r\u0003\u0018\u0003\u000fB\u0015J\u001d\u0003\u0018D\u000bF\u001cN\u001cM\r\u0003\u000fB\u0015V\u001c\u0003\u001fL\u000b\u0003<`=k:"));
        }
        return sprrlb2.cfr_renamed_1969().cfr_renamed_1779();
    }
}

