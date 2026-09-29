/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprsk;
import com.spire.presentation.packages.spruaf;
import java.math.BigInteger;

public class sprskh
implements sprik {
    public final sprsk cfr_renamed_3;
    public final sprjd cfr_renamed_4;

    @Override
    public int cfr_renamed_813() {
        return this.cfr_renamed_3.cfr_renamed_813();
    }

    @Override
    public int cfr_renamed_1763() {
        return this.cfr_renamed_4.cfr_renamed_1763() * this.cfr_renamed_3.cfr_renamed_813();
    }

    /*
     * WARNING - void declaration
     */
    public sprskh(sprjd sprjd2, sprsk sprsk2) {
        void arg0;
        sprskh sprskh2 = this;
        sprskh2.cfr_renamed_4 = arg0;
        sprskh2.cfr_renamed_3 = sprsk2;
    }

    @Override
    public sprjd cfr_renamed_1545() {
        return this.cfr_renamed_4;
    }

    @Override
    public BigInteger cfr_renamed_1762() {
        return this.cfr_renamed_4.cfr_renamed_1762();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprskh)) {
            return false;
        }
        sprskh sprskh2 = (sprskh)arg0;
        return this.cfr_renamed_4.equals(sprskh2.cfr_renamed_4) && this.cfr_renamed_3.equals(sprskh2.cfr_renamed_3);
    }

    @Override
    public sprsk cfr_renamed_1764() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ spruaf.cfr_renamed_494(this.cfr_renamed_3.hashCode(), 16);
    }
}

