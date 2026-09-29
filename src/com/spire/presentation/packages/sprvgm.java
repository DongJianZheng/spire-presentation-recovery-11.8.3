/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtg;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;

public class sprvgm
extends sprzcm
implements sprtg {
    private byte[] cfr_renamed_1221;
    private int cfr_renamed_725;

    /*
     * WARNING - void declaration
     */
    public sprvgm(int n, sprmam sprmam2) throws IOException {
        void arg0;
        sprvgm sprvgm2 = this;
        sprvgm2.cfr_renamed_725 = arg0;
        sprvgm2.cfr_renamed_1221 = sprmam2.cfr_renamed_145();
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        sprvgm sprvgm2 = this;
        arg0.cfr_renamed_11039(sprvgm2.cfr_renamed_725, sprvgm2.cfr_renamed_1221);
    }

    public int cfr_renamed_8159() {
        return this.cfr_renamed_725;
    }

    public byte[] cfr_renamed_4577() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1221);
    }
}

