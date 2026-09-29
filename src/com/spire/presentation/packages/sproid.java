/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdnd;
import com.spire.presentation.packages.sprfi;
import com.spire.presentation.packages.sprzra;

public class sproid
implements sprfi {
    private int[] cfr_renamed_4;

    @Override
    public void cfr_renamed_3419(long arg0, byte[] arg1) {
        int[] nArray = sprdnd.cfr_renamed_3429();
        if (arg0 > 0L) {
            int[] nArray2 = sprzra.cfr_renamed_535(this.cfr_renamed_4);
            do {
                if ((arg0 & 1L) != 0L) {
                    sprdnd.cfr_renamed_855(nArray, nArray2);
                }
                sprdnd.cfr_renamed_855(nArray2, nArray2);
            } while ((arg0 >>>= 1) > 0L);
        }
        sprdnd.cfr_renamed_3430(nArray, arg1);
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        this.cfr_renamed_4 = sprdnd.cfr_renamed_3428(arg0);
    }
}

