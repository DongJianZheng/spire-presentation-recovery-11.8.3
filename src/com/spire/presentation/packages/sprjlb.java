/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprub;
import com.spire.presentation.packages.sprzra;

public class sprjlb
implements sprub {
    public final int[] cfr_renamed_4;

    public sprjlb(int[] nArray) {
        this.cfr_renamed_4 = sprzra.cfr_renamed_535(nArray);
    }

    @Override
    public int cfr_renamed_813() {
        sprjlb sprjlb2 = this;
        return sprjlb2.cfr_renamed_4[sprjlb2.cfr_renamed_4.length - 1];
    }

    @Override
    public int[] cfr_renamed_1765() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprjlb)) {
            return false;
        }
        sprjlb sprjlb2 = (sprjlb)arg0;
        return sprzra.cfr_renamed_549(this.cfr_renamed_4, sprjlb2.cfr_renamed_4);
    }

    public int hashCode() {
        return sprzra.cfr_renamed_552(this.cfr_renamed_4);
    }
}

