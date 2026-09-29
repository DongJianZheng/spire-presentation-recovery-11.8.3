/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprstf;
import com.spire.presentation.packages.sprudg;

public class sprreg {
    public final sprstf[] cfr_renamed_2;
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprreg(sprqag sprqag2) {
        int n;
        void arg0;
        sprreg sprreg2 = this;
        this.cfr_renamed_4 = new byte[32];
        sprreg2.cfr_renamed_3 = new byte[sprudg.cfr_renamed_6204(arg0.cfr_renamed_91 * 2)];
        sprreg2.cfr_renamed_2 = new sprstf[sprqag2.cfr_renamed_91];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.length) {
            this.cfr_renamed_2[n++] = new sprstf((sprqag)arg0);
            n2 = n;
        }
    }
}

