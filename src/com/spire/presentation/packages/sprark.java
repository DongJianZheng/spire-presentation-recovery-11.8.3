/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmal;
import com.spire.presentation.packages.sprot;

public class sprark
implements sprot {
    private long[][] cfr_renamed_4;

    @Override
    public void cfr_renamed_10014(long[] arg0) {
        int n;
        long[] lArray;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new long[256][8];
            lArray = arg0;
        } else {
            if (sprmal.cfr_renamed_10021(arg0, this.cfr_renamed_4[1])) {
                return;
            }
            lArray = arg0;
        }
        sprmal.cfr_renamed_7203(lArray, this.cfr_renamed_4[1]);
        int n2 = n = 2;
        while (n2 < 256) {
            sprark sprark2 = this;
            sprmal.cfr_renamed_10022(this.cfr_renamed_4[n >> 1], sprark2.cfr_renamed_4[n]);
            long[] lArray2 = sprark2.cfr_renamed_4[n];
            int n3 = n + 1;
            sprmal.cfr_renamed_7206(lArray2, this.cfr_renamed_4[1], this.cfr_renamed_4[n3]);
            n2 = n += 2;
        }
    }

    @Override
    public void cfr_renamed_10019(long[] arg0) {
        int n;
        long[] lArray = new long[8];
        sprmal.cfr_renamed_7203(this.cfr_renamed_4[(int)(arg0[7] >>> 56) & 0xFF], lArray);
        int n2 = n = 62;
        while (n2 >= 0) {
            sprmal.cfr_renamed_10020(lArray, lArray);
            long[] lArray2 = this.cfr_renamed_4[(int)(arg0[n >>> 3] >>> ((n & 7) << 3)) & 0xFF];
            sprmal.cfr_renamed_7206(lArray2, lArray, lArray);
            n2 = --n;
        }
        sprmal.cfr_renamed_7203(lArray, arg0);
    }
}

