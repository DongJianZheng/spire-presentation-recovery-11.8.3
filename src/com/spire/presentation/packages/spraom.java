/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spraom
extends sprqqe {
    private final byte[] cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraom(sprddm sprddm2, int n, byte[] byArray) {
        void arg1;
        void arg0;
        spraom spraom2 = this;
        this.cfr_renamed_3 = arg0;
        spraom2.cfr_renamed_4 = arg1;
        spraom2.cfr_renamed_2 = byArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm();
        spraom spraom2 = this;
        sprrvm2.cfr_renamed_5004(spraom2.cfr_renamed_3);
        sprrvm sprrvm3 = sprrvm2;
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        if (spraom2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprfvg(this.cfr_renamed_2)));
        }
        return new sprcen(sprrvm2);
    }

    public spraom(sprddm arg0, int arg1) {
        this(arg0, arg1, null);
    }
}

