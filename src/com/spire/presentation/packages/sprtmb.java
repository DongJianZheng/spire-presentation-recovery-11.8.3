/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbb;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprub;
import com.spire.presentation.packages.sprzb;
import java.math.BigInteger;

public class sprtmb
implements sprzb {
    public final sprub cfr_renamed_3;
    public final sprbb cfr_renamed_4;

    @Override
    public sprbb cfr_renamed_1545() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_1763() {
        return this.cfr_renamed_4.cfr_renamed_1763() * this.cfr_renamed_3.cfr_renamed_813();
    }

    @Override
    public int cfr_renamed_813() {
        return this.cfr_renamed_3.cfr_renamed_813();
    }

    @Override
    public BigInteger cfr_renamed_1762() {
        return this.cfr_renamed_4.cfr_renamed_1762();
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ spriwa.cfr_renamed_494(this.cfr_renamed_3.hashCode(), 16);
    }

    @Override
    public sprub cfr_renamed_1764() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprtmb)) {
            return false;
        }
        sprtmb sprtmb2 = (sprtmb)arg0;
        return this.cfr_renamed_4.equals(sprtmb2.cfr_renamed_4) && this.cfr_renamed_3.equals(sprtmb2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprtmb(sprbb sprbb2, sprub sprub2) {
        void arg0;
        sprtmb sprtmb2 = this;
        sprtmb2.cfr_renamed_4 = arg0;
        sprtmb2.cfr_renamed_3 = sprub2;
    }
}

