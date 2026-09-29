/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfs;
import com.spire.presentation.packages.sprrzk;
import java.util.ArrayList;
import java.util.List;

public class sprsyk
implements sprfs {
    private List cfr_renamed_4;

    @Override
    public void cfr_renamed_3419(long arg0, byte[] arg1) {
        long[] lArray = sprrzk.cfr_renamed_3445();
        int n = 0;
        long l = arg0;
        while (l > 0L) {
            if ((arg0 & 1L) != 0L) {
                sprrzk.cfr_renamed_3434(lArray, this.cfr_renamed_10072(n));
            }
            ++n;
            l = arg0 >>> 1;
        }
        sprrzk.cfr_renamed_3443(lArray, arg1);
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        long[] lArray = sprrzk.cfr_renamed_3441(arg0);
        if (this.cfr_renamed_4 != null && 0L != sprrzk.cfr_renamed_565(lArray, (long[])this.cfr_renamed_4.get(0))) {
            return;
        }
        this.cfr_renamed_4 = new ArrayList(8);
        this.cfr_renamed_4.add(lArray);
    }

    private /* synthetic */ long[] cfr_renamed_10072(int arg0) {
        int n = this.cfr_renamed_4.size() - 1;
        if (n < arg0) {
            long[] lArray = (long[])this.cfr_renamed_4.get(n);
            do {
                long[] lArray2 = new long[2];
                sprrzk.cfr_renamed_7210(lArray, lArray2);
                this.cfr_renamed_4.add(lArray2);
                lArray = lArray2;
            } while (++n < arg0);
        }
        return (long[])this.cfr_renamed_4.get(arg0);
    }
}

