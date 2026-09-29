/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsk;
import com.spire.presentation.packages.sprot;

public class sprluk
implements sprot {
    private long[][] cfr_renamed_4;

    @Override
    public void cfr_renamed_10019(long[] arg0) {
        int n;
        long[] lArray = new long[2];
        sprdsk.cfr_renamed_7203(this.cfr_renamed_4[(int)(arg0[1] >>> 56) & 0xFF], lArray);
        int n2 = n = 14;
        while (n2 >= 0) {
            sprdsk.cfr_renamed_10020(lArray, lArray);
            long[] lArray2 = this.cfr_renamed_4[(int)(arg0[n >>> 3] >>> ((n & 7) << 3)) & 0xFF];
            sprdsk.cfr_renamed_7206(lArray2, lArray, lArray);
            n2 = --n;
        }
        sprdsk.cfr_renamed_7203(lArray, arg0);
    }

    @Override
    public void cfr_renamed_10014(long[] arg0) {
        int n;
        long[] lArray;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new long[256][2];
            lArray = arg0;
        } else {
            if (sprdsk.cfr_renamed_10021(arg0, this.cfr_renamed_4[1])) {
                return;
            }
            lArray = arg0;
        }
        sprdsk.cfr_renamed_7203(lArray, this.cfr_renamed_4[1]);
        int n2 = n = 2;
        while (n2 < 256) {
            sprluk sprluk2 = this;
            sprdsk.cfr_renamed_10022(this.cfr_renamed_4[n >> 1], sprluk2.cfr_renamed_4[n]);
            long[] lArray2 = sprluk2.cfr_renamed_4[n];
            int n3 = n + 1;
            sprdsk.cfr_renamed_7206(lArray2, this.cfr_renamed_4[1], this.cfr_renamed_4[n3]);
            n2 = n += 2;
        }
    }
}

