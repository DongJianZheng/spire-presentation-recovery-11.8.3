/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhcm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsdz;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtjm;
import com.spire.presentation.packages.sprxgf;

public class spryhm
extends sprqqe {
    private final sprhcm cfr_renamed_3;
    private final sprtjm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public static spryhm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryhm) {
            return (spryhm)arg0;
        }
        if (arg0 != null) {
            return new spryhm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spryhm(sprhcm arg0, String arg1) {
        this(arg0, new sprtjm(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spryhm(sprhcm sprhcm2, sprtjm sprtjm2) {
        void arg0;
        spryhm spryhm2 = this;
        spryhm2.cfr_renamed_3 = arg0;
        spryhm2.cfr_renamed_4 = sprtjm2;
    }

    public sprhcm cfr_renamed_4474() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryhm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 2) {
            spryhm spryhm2 = this;
            spryhm2.cfr_renamed_3 = sprhcm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            spryhm2.cfr_renamed_4 = sprtjm.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        if (arg0.cfr_renamed_84() == 1) {
            if (arg0.cfr_renamed_85(0).cfr_renamed_119() instanceof sprszm) {
                spryhm spryhm3 = this;
                spryhm3.cfr_renamed_3 = sprhcm.cfr_renamed_23(arg0.cfr_renamed_85(0));
                spryhm3.cfr_renamed_4 = null;
                return;
            }
            this.cfr_renamed_4 = sprtjm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            this.cfr_renamed_3 = null;
            return;
        }
        if (arg0.cfr_renamed_84() == 0) {
            spryhm spryhm4 = this;
            spryhm4.cfr_renamed_3 = null;
            spryhm4.cfr_renamed_4 = null;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsdz.cfr_renamed_9("E\u0000cAt\u0004v\u0014b\u000fd\u0004'\u0012n\u001bb['")).append(arg0.cfr_renamed_84()).toString());
    }

    public sprtjm cfr_renamed_4473() {
        return this.cfr_renamed_4;
    }
}

