/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprot;
import com.spire.presentation.packages.sprxqk;

public class sprqrk
implements sprot {
    private long[][] cfr_renamed_4;

    @Override
    public void cfr_renamed_10019(long[] arg0) {
        int n;
        long[] lArray = new long[4];
        sprxqk.cfr_renamed_7203(this.cfr_renamed_4[(int)(arg0[3] >>> 56) & 0xFF], lArray);
        int n2 = n = 30;
        while (n2 >= 0) {
            sprxqk.cfr_renamed_10020(lArray, lArray);
            long[] lArray2 = this.cfr_renamed_4[(int)(arg0[n >>> 3] >>> ((n & 7) << 3)) & 0xFF];
            sprxqk.cfr_renamed_7206(lArray2, lArray, lArray);
            n2 = --n;
        }
        sprxqk.cfr_renamed_7203(lArray, arg0);
    }

    @Override
    public void cfr_renamed_10014(long[] arg0) {
        int n;
        long[] lArray;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new long[256][4];
            lArray = arg0;
        } else {
            if (sprxqk.cfr_renamed_10021(arg0, this.cfr_renamed_4[1])) {
                return;
            }
            lArray = arg0;
        }
        sprxqk.cfr_renamed_7203(lArray, this.cfr_renamed_4[1]);
        int n2 = n = 2;
        while (n2 < 256) {
            sprqrk sprqrk2 = this;
            sprxqk.cfr_renamed_10022(this.cfr_renamed_4[n >> 1], sprqrk2.cfr_renamed_4[n]);
            long[] lArray2 = sprqrk2.cfr_renamed_4[n];
            int n3 = n + 1;
            sprxqk.cfr_renamed_7206(lArray2, this.cfr_renamed_4[1], this.cfr_renamed_4[n3]);
            n2 = n += 2;
        }
    }
}

