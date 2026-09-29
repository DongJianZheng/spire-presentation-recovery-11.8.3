/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.spruhm;
import com.spire.presentation.packages.sprxgf;

public class sprbem
extends sprqqe {
    private sproug cfr_renamed_4;

    public static sprbem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbem) {
            return (sprbem)arg0;
        }
        if (arg0 != null) {
            return new sprbem(sproug.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbem(spreuh spreuh2) {
        void arg0;
        sprbem sprbem2 = this;
        sprbem2.cfr_renamed_4 = new sprfvg(spruhm.cfr_renamed_9445((spreuh)arg0));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprbem(sproug sproug2) {
        this.cfr_renamed_4 = sproug2;
    }
}

