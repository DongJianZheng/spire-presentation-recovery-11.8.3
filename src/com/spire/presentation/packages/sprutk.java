/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfs;
import com.spire.presentation.packages.sprrzk;

public class sprutk
implements sprfs {
    private long[] cfr_renamed_4;

    @Override
    public void cfr_renamed_3419(long arg0, byte[] arg1) {
        long[] lArray = sprrzk.cfr_renamed_3445();
        if (arg0 > 0L) {
            long[] lArray2 = new long[2];
            sprrzk.cfr_renamed_7203(this.cfr_renamed_4, lArray2);
            do {
                if ((arg0 & 1L) != 0L) {
                    sprrzk.cfr_renamed_3434(lArray, lArray2);
                }
                sprrzk.cfr_renamed_7210(lArray2, lArray2);
            } while ((arg0 >>>= 1) > 0L);
        }
        sprrzk.cfr_renamed_3443(lArray, arg1);
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        this.cfr_renamed_4 = sprrzk.cfr_renamed_3441(arg0);
    }
}

