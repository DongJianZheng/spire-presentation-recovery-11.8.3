/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsk;

public class sprohh
implements sprsk {
    public final int[] cfr_renamed_4;

    @Override
    public int[] cfr_renamed_1765() {
        return sproze.cfr_renamed_535(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_813() {
        sprohh sprohh2 = this;
        return sprohh2.cfr_renamed_4[sprohh2.cfr_renamed_4.length - 1];
    }

    public int hashCode() {
        return sproze.cfr_renamed_552(this.cfr_renamed_4);
    }

    public sprohh(int[] nArray) {
        this.cfr_renamed_4 = sproze.cfr_renamed_535(nArray);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprohh)) {
            return false;
        }
        sprohh sprohh2 = (sprohh)arg0;
        return sproze.cfr_renamed_549(this.cfr_renamed_4, sprohh2.cfr_renamed_4);
    }
}

