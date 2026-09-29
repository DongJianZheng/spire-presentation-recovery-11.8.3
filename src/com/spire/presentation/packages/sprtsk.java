/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.spriln;
import com.spire.presentation.packages.sprixk;
import com.spire.presentation.packages.sprwwk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzjh;

public class sprtsk
extends sprixk {
    private static final int cfr_renamed_3 = 20;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        this.cfr_renamed_3 = (int)arg0.cfr_renamed_1295();
        this.cfr_renamed_4 = (sprgye2.cfr_renamed_3483() + 7) / 8;
        if (this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 21) {
            this.cfr_renamed_4 = 24;
        } else if (this.cfr_renamed_4 == 14) {
            this.cfr_renamed_4 = 16;
        } else if (this.cfr_renamed_4 != 24 && this.cfr_renamed_4 != 16) {
            throw new IllegalArgumentException(sprzjh.cfr_renamed_9("\u001eb\tB>BzL?^zJ/T.\u00078Bz\u0016c\u0015zH(\u0007k\u0015b\u00078N.TzK5I=\t"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(spriln.cfr_renamed_9("4R#r\u0014r;r\tP\u0015y"), 112, null, spriil.cfr_renamed_91));
    }

    @Override
    public byte[] cfr_renamed_2405() {
        byte[] byArray = new byte[this.cfr_renamed_4];
        int n = 0;
        do {
            this.cfr_renamed_3.nextBytes(byArray);
            sprwwk.cfr_renamed_1520(byArray);
        } while (++n < 20 && (sprwwk.cfr_renamed_3379(byArray, 0, byArray.length) || !sprwwk.cfr_renamed_9992(byArray, 0)));
        if (sprwwk.cfr_renamed_3379(byArray, 0, byArray.length) || !sprwwk.cfr_renamed_9992(byArray, 0)) {
            throw new IllegalStateException(sprzjh.cfr_renamed_9("\u000fI;E6BzS5\u0007=B4B(F.Bzc\u001ftwb\u001ebzL?^"));
        }
        return byArray;
    }
}

