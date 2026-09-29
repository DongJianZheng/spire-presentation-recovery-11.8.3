/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprspx;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprtnm
extends sprqqe
implements sprlm {
    private sprco cfr_renamed_4;

    public sprtnm(sprdsm sprdsm2) {
        this.cfr_renamed_4 = sprdsm2;
    }

    public sprtnm(sprxgf sprxgf2) {
        this.cfr_renamed_4 = sprxgf2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprco cfr_renamed_19() {
        if (this.cfr_renamed_4 instanceof sprnvm) {
            return sproug.cfr_renamed_5085((sprnvm)this.cfr_renamed_4, false);
        }
        return sprdsm.cfr_renamed_23(this.cfr_renamed_4);
    }

    public static sprtnm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtnm) {
            return (sprtnm)arg0;
        }
        if (arg0 instanceof sprdsm) {
            return new sprtnm((sprdsm)arg0);
        }
        if (arg0 instanceof sproug) {
            return new sprtnm((sproug)arg0);
        }
        if (arg0 instanceof sprxgf) {
            return new sprtnm((sprxgf)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprspx.cfr_renamed_9(")&\f/\u0007+\fj\u000f(\n/\u0003>@#\u000ej2/\u0003#\u0010#\u0005$\u0014\u0003\u0004/\u000e>\t,\t/\u0012p@")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_3972() {
        return this.cfr_renamed_4 instanceof sprnvm;
    }

    /*
     * WARNING - void declaration
     */
    public sprtnm(sproug sproug2) {
        void arg0;
        sprtnm sprtnm2 = this;
        sprtnm2.cfr_renamed_4 = new sprycn(0 != 0, 0, (sprco)arg0);
    }
}

