/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcez;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprukm
extends sprqqe {
    private sprhmm cfr_renamed_3;
    private sprigm cfr_renamed_4;

    public static sprukm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprukm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprukm(sprhmm sprhmm2, sprigm sprigm2) {
        void arg0;
        sprukm sprukm2 = this;
        sprukm2.cfr_renamed_3 = arg0;
        sprukm2.cfr_renamed_4 = sprigm2;
    }

    public sprukm(sprhmm arg0) {
        this(arg0, null);
    }

    public static sprukm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprukm) {
            return (sprukm)arg0;
        }
        if (arg0 != null) {
            return new sprukm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprukm sprukm2 = this;
        sprrvm2.cfr_renamed_5004(sprukm2.cfr_renamed_3);
        if (sprukm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprhmm cfr_renamed_4768() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprukm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprhmm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprigm cfr_renamed_2607() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprgpa.cfr_renamed_9("\u001bu\u001cp\u001aQ-L-m0W6@:\u0003$)+Q>M,B<W6L1p+B+V,\u0019\u007f")).append(this.cfr_renamed_3).append("\n").append(this.cfr_renamed_4 != null ? new StringBuilder().insert(0, sprcez.cfr_renamed_9("\u0001x\u0014d\u0006k\u0016~\u001ce\u001bC\u0011o\u001b~\u001cl\u001co\u00070U")).append(this.cfr_renamed_4).append("\n").toString() : "").append(sprgpa.cfr_renamed_9("^U")).toString();
    }
}

