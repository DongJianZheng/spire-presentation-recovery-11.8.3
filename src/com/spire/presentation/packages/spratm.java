/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgnm;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class spratm
extends sprqqe
implements sprlm {
    private sproug cfr_renamed_3;
    private sprgnm cfr_renamed_4;

    public spratm(sprgnm sprgnm2) {
        this.cfr_renamed_4 = sprgnm2;
    }

    private /* synthetic */ spratm(sproug sproug2) {
        this.cfr_renamed_3 = sproug2;
    }

    public sprddm cfr_renamed_579() {
        if (null == this.cfr_renamed_4) {
            return new sprddm(sprgt.cfr_renamed_0);
        }
        return this.cfr_renamed_4.cfr_renamed_579();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (null == this.cfr_renamed_4) {
            return this.cfr_renamed_3;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public spratm(byte[] byArray) {
        void arg0;
        spratm spratm2 = this;
        spratm2.cfr_renamed_3 = new sprfvg((byte[])arg0);
    }

    public byte[] cfr_renamed_4669() {
        if (null == this.cfr_renamed_4) {
            return this.cfr_renamed_3.cfr_renamed_186();
        }
        return this.cfr_renamed_4.cfr_renamed_4669().cfr_renamed_186();
    }

    public static spratm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spratm) {
            return (spratm)arg0;
        }
        if (arg0 instanceof sproug) {
            return new spratm((sproug)arg0);
        }
        return new spratm(sprgnm.cfr_renamed_23(arg0));
    }
}

