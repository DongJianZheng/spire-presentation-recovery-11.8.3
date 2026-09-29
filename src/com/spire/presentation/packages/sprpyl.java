/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;

public class sprpyl
extends sprzcm {
    public byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11039(10, this.cfr_renamed_4);
    }

    public sprpyl(sprmam sprmam2) throws IOException {
        sprpyl sprpyl2 = this;
        byte[] byArray = new byte[3];
        byArray[0] = 80;
        byArray[1] = 71;
        byArray[2] = 80;
        sprpyl2.cfr_renamed_4 = byArray;
        sprmam2.cfr_renamed_4932(sprpyl2.cfr_renamed_4);
    }
}

