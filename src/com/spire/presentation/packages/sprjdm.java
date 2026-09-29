/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprxam;
import java.io.IOException;

public class sprjdm
extends sprxam {
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjdm(sprmam sprmam2) throws IOException {
        super((sprmam)arg0);
        void arg0;
        this.cfr_renamed_4 = sprmam2.read();
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_4;
    }
}

