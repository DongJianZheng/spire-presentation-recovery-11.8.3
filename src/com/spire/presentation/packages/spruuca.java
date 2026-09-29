/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprzf;
import java.math.BigInteger;

public class spruuca
implements sprzf {
    private spreed cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    @Override
    public BigInteger cfr_renamed_2501(sprt arg0) {
        sprrlb sprrlb2 = ((sprwmd)arg0).cfr_renamed_1604().cfr_renamed_1830(this.cfr_renamed_4.cfr_renamed_2112()).cfr_renamed_1775();
        if (sprrlb2.cfr_renamed_1952()) {
            throw new IllegalStateException(sproqr.cfr_renamed_9("&\u000b\t\f\u0001\f\u001b\u001cO\f\u001cE\u0001\n\u001bE\u000eE\u0019\u0004\u0003\f\u000bE\u000e\u0002\u001d\u0000\n\b\n\u000b\u001bE\u0019\u0004\u0003\u0010\nE\t\n\u001dE*&+-"));
        }
        return sprrlb2.cfr_renamed_1969().cfr_renamed_1779();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        this.cfr_renamed_4 = (spreed)arg0;
    }
}

