/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprjom;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprylm
extends sprqqe {
    private boolean cfr_renamed_3;
    private sprjom cfr_renamed_4;

    public sprylm() {
        this.cfr_renamed_3 = true;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3) {
            return sprpen.cfr_renamed_4;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sprylm(sprjom sprjom2) {
        void arg0;
        sprylm sprylm2 = this;
        sprylm2.cfr_renamed_4 = arg0;
        sprylm2.cfr_renamed_3 = false;
    }

    public sprjom cfr_renamed_4657() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_4658() {
        return this.cfr_renamed_3;
    }

    public static sprylm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprylm) {
            return (sprylm)arg0;
        }
        if (arg0 instanceof sprfan || sprylm.cfr_renamed_4659(arg0, 5)) {
            return new sprylm();
        }
        if (arg0 != null) {
            return new sprylm(sprjom.cfr_renamed_23(arg0));
        }
        return null;
    }
}

