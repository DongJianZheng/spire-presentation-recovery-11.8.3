/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhkm;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprdtm
extends sprqqe
implements sprlm {
    private sprhkm cfr_renamed_3;
    private sprjtm cfr_renamed_4;

    public sprdtm(sprjtm sprjtm2) {
        this.cfr_renamed_4 = sprjtm2;
    }

    public static sprdtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdtm) {
            return (sprdtm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprdtm(sprjtm.cfr_renamed_5085((sprnvm)arg0, false));
        }
        return new sprdtm(sprhkm.cfr_renamed_23(arg0));
    }

    public sprco cfr_renamed_97() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3;
        }
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        return new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4);
    }

    public sprdtm(sprhkm sprhkm2) {
        this.cfr_renamed_3 = sprhkm2;
    }

    public boolean cfr_renamed_4342() {
        return this.cfr_renamed_3 != null;
    }
}

