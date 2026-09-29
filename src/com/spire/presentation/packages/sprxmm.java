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
import com.spire.presentation.packages.sprwfq;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprxmm
extends sprqqe
implements sprlm {
    private sprco cfr_renamed_4;

    public static sprxmm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprxmm) {
            return (sprxmm)arg0;
        }
        if (arg0 instanceof sprdsm) {
            return new sprxmm((sprdsm)arg0);
        }
        if (arg0 instanceof sproug) {
            return new sprxmm((sproug)arg0);
        }
        if (arg0 instanceof sprxgf) {
            return new sprxmm((sprxgf)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwfq.cfr_renamed_9("\u001eC;J0N;\u000f8M=J4[wF9\u000f\u0004F0A2]\u001eK2A#F1F2]m\u000f")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_3972() {
        return this.cfr_renamed_4 instanceof sprnvm;
    }

    public sprco cfr_renamed_19() {
        if (this.cfr_renamed_4 instanceof sprnvm) {
            return sproug.cfr_renamed_5085((sprnvm)this.cfr_renamed_4, false);
        }
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxmm(sproug sproug2) {
        void arg0;
        sprxmm sprxmm2 = this;
        sprxmm2.cfr_renamed_4 = new sprycn(0 != 0, 0, (sprco)arg0);
    }

    public sprxmm(sprdsm sprdsm2) {
        this.cfr_renamed_4 = sprdsm2;
    }

    public sprxmm(sprxgf sprxgf2) {
        this.cfr_renamed_4 = sprxgf2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }
}

