/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralh;
import com.spire.presentation.packages.sprbly;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsch;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtgh;
import com.spire.presentation.packages.sprxgf;

public class sprvjh
extends sprqqe {
    private final sprsch cfr_renamed_3;
    private final sprtgh cfr_renamed_4;

    public sprtgh cfr_renamed_8235() {
        return this.cfr_renamed_4;
    }

    public sprsch cfr_renamed_8236() {
        return this.cfr_renamed_3;
    }

    public static spralh cfr_renamed_7843() {
        return new spralh();
    }

    public static sprvjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvjh) {
            return (sprvjh)arg0;
        }
        if (arg0 != null) {
            return new sprvjh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprvjh(sprtgh sprtgh2, sprsch sprsch2) {
        void arg0;
        sprvjh sprvjh2 = this;
        sprvjh2.cfr_renamed_4 = arg0;
        sprvjh2.cfr_renamed_3 = sprsch2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvjh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprbly.cfr_renamed_9("1,$17 10t'1%!1:71t'=.1t;2tf"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprtgh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprsch.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

