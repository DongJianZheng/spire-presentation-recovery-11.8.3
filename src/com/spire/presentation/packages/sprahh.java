/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprffh;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvch;
import com.spire.presentation.packages.sprxgf;

public class sprahh
extends sprqqe {
    private final sprvch cfr_renamed_3;
    private final sprvch cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprahh(sprvch sprvch2, sprvch sprvch3) {
        void arg0;
        sprahh sprahh2 = this;
        sprahh2.cfr_renamed_3 = arg0;
        sprahh2.cfr_renamed_4 = sprvch3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprahh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprjgba.cfr_renamed_9("vecxpivy3nvlfx}~v=`tix3ru=!"));
        }
        this.cfr_renamed_3 = sprvch.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprenh.cfr_renamed_8135(sprvch.class, arg0.cfr_renamed_85(1));
    }

    public static sprahh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprahh) {
            return (sprahh)arg0;
        }
        if (arg0 != null) {
            return new sprahh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvch cfr_renamed_8444() {
        return this.cfr_renamed_3;
    }

    public sprvch cfr_renamed_8437() {
        return this.cfr_renamed_4;
    }

    public static sprffh cfr_renamed_7843() {
        return new sprffh();
    }
}

