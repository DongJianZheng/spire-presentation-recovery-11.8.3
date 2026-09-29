/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdnd;
import com.spire.presentation.packages.sprfi;
import com.spire.presentation.packages.sprzra;
import java.util.Vector;

public class sprvcd
implements sprfi {
    private Vector cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3427(int arg0) {
        int n = this.cfr_renamed_4.size();
        if (n <= arg0) {
            int[] nArray = (int[])this.cfr_renamed_4.elementAt(n - 1);
            do {
                nArray = sprzra.cfr_renamed_535(nArray);
                sprdnd.cfr_renamed_855(nArray, nArray);
                this.cfr_renamed_4.addElement(nArray);
            } while (++n <= arg0);
        }
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        int[] nArray = sprdnd.cfr_renamed_3428(arg0);
        if (this.cfr_renamed_4 != null && sprzra.cfr_renamed_549(nArray, (int[])this.cfr_renamed_4.elementAt(0))) {
            return;
        }
        this.cfr_renamed_4 = new Vector(8);
        this.cfr_renamed_4.addElement(nArray);
    }

    @Override
    public void cfr_renamed_3419(long arg0, byte[] arg1) {
        int[] nArray = sprdnd.cfr_renamed_3429();
        int n = 0;
        long l = arg0;
        while (l > 0L) {
            if ((arg0 & 1L) != 0L) {
                sprvcd sprvcd2 = this;
                sprvcd2.cfr_renamed_3427(n);
                sprdnd.cfr_renamed_855(nArray, (int[])sprvcd2.cfr_renamed_4.elementAt(n));
            }
            ++n;
            l = arg0 >>> 1;
        }
        sprdnd.cfr_renamed_3430(nArray, arg1);
    }
}

