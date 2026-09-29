/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqp;
import java.io.IOException;

public class sprotm {
    private sprjvm cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprotm(sprqp sprqp2) throws IOException {
        void arg0;
        this.cfr_renamed_4 = (sprktm)sprqp2.cfr_renamed_24();
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_24().cfr_renamed_119());
        sprotm sprotm2 = this;
        sprotm2.cfr_renamed_2 = new sprjvm((sprqp)arg0.cfr_renamed_24());
    }

    public sprjvm cfr_renamed_2589() {
        return this.cfr_renamed_2;
    }

    public sprddm cfr_renamed_4187() {
        return this.cfr_renamed_3;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }
}

