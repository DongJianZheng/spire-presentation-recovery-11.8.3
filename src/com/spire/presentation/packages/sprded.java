/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprtdd;
import com.spire.presentation.packages.sprwed;
import com.spire.presentation.packages.sprxnc;

public class sprded
extends sprwed {
    @Override
    public byte[] cfr_renamed_2405() {
        byte[] byArray = new byte[8];
        do {
            this.cfr_renamed_4.nextBytes(byArray);
            sprtdd.cfr_renamed_1520(byArray);
        } while (sprtdd.cfr_renamed_3378(byArray, 0));
        return byArray;
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        sprded sprded2 = this;
        super.cfr_renamed_1222(arg0);
        if (sprded2.cfr_renamed_3 == 0 || this.cfr_renamed_3 == 7) {
            this.cfr_renamed_3 = 8;
            return;
        }
        if (this.cfr_renamed_3 != 8) {
            throw new IllegalArgumentException(sprxnc.cfr_renamed_9("\u0005f\u0012\u0003*F8\u0003,V2WaA$\u0003w\u0017aA(W2\u0003-L/Do"));
        }
    }
}

