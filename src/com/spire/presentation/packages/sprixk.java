/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdnaa;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sproal;
import com.spire.presentation.packages.sprpjc;
import com.spire.presentation.packages.sprybl;

public class sprixk
extends sprjyk {
    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        sprixk sprixk2 = this;
        super.cfr_renamed_5536(arg0);
        if (sprixk2.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 7) {
            this.cfr_renamed_4 = 8;
        } else if (this.cfr_renamed_4 != 8) {
            throw new IllegalArgumentException(sprdnaa.cfr_renamed_9("Y\nNov*dop:n;=-xo+{=-t;noq s(3"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(sprpjc.cfr_renamed_9("<`+n\u001d\\?@\u0016"), 56, null, spriil.cfr_renamed_91));
    }

    @Override
    public byte[] cfr_renamed_2405() {
        byte[] byArray = new byte[8];
        do {
            this.cfr_renamed_3.nextBytes(byArray);
            sproal.cfr_renamed_1520(byArray);
        } while (sproal.cfr_renamed_3378(byArray, 0));
        return byArray;
    }
}

