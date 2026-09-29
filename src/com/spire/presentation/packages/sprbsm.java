/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhcm;
import com.spire.presentation.packages.sprhry;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtjm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprbsm
extends sprqqe {
    private sprhcm cfr_renamed_3;
    private sprtjm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbsm(sprhcm sprhcm2, sprtjm sprtjm2) {
        void arg0;
        sprbsm sprbsm2 = this;
        sprbsm2.cfr_renamed_3 = arg0;
        sprbsm2.cfr_renamed_4 = sprtjm2;
    }

    public sprhcm cfr_renamed_4474() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprbsm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprco sprco2 = (sprco)enumeration.nextElement();
            if (sprco2 instanceof sprtjm || sprco2 instanceof sprml) {
                this.cfr_renamed_4 = sprtjm.cfr_renamed_23(sprco2);
                continue;
            }
            if (sprco2 instanceof sprhcm || sprco2 instanceof sprszm) {
                this.cfr_renamed_3 = sprhcm.cfr_renamed_23(sprco2);
                continue;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhry.cfr_renamed_9("sCLLVD^\r_A_@_CN\rSC\u001a\ni}o^__tBNDYH\u001d\u0017\u001a")).append(sprco2.getClass().getName()).toString());
        }
    }

    public static sprbsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbsm) {
            return (sprbsm)arg0;
        }
        if (arg0 != null) {
            return new sprbsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

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

    public sprtjm cfr_renamed_4473() {
        return this.cfr_renamed_4;
    }
}

