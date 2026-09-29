/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;

public class sprfom
extends sprqqe {
    private sprupm cfr_renamed_2;
    private sprszm cfr_renamed_3;
    private sprvhm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfom(sprszm sprszm2) {
        void arg0;
        sprfom sprfom2 = this;
        this.cfr_renamed_3 = arg0;
        sprfom2.cfr_renamed_4 = sprvhm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(0));
        sprfom2.cfr_renamed_2 = sprupm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_4;
    }

    public sprnrm cfr_renamed_2366() {
        if (null == this.cfr_renamed_2 || this.cfr_renamed_2 instanceof sprnrm) {
            return (sprnrm)this.cfr_renamed_2;
        }
        return new sprnrm(this.cfr_renamed_2.cfr_renamed_314(), false);
    }

    public sprupm cfr_renamed_11208() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    public static sprfom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfom) {
            return (sprfom)arg0;
        }
        if (arg0 != null) {
            return new sprfom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

