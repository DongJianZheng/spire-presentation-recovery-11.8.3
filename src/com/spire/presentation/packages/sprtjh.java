/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdnh;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprkih;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvch;
import com.spire.presentation.packages.sprxgf;

public class sprtjh
extends sprqqe {
    private final sprkih cfr_renamed_2;
    private final sprvch cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public sprvch cfr_renamed_2141() {
        return this.cfr_renamed_3;
    }

    public static sprdnh cfr_renamed_7843() {
        return new sprdnh();
    }

    public static sprtjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtjh) {
            return (sprtjh)arg0;
        }
        if (arg0 != null) {
            return new sprtjh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprtjh(sproug sproug2, sprkih sprkih2, sprvch sprvch2) {
        void arg1;
        void arg0;
        sprtjh sprtjh2 = this;
        this.cfr_renamed_4 = arg0;
        sprtjh2.cfr_renamed_2 = arg1;
        sprtjh2.cfr_renamed_3 = sprvch2;
    }

    public sproug cfr_renamed_8445() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtjh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprbgp.cfr_renamed_9("'42)!8'(b?'=7),/'l1%8)b#$lq"));
        }
        sprtjh sprtjh2 = this;
        sprtjh2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprtjh2.cfr_renamed_2 = sprkih.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_3 = sprenh.cfr_renamed_8135(sprvch.class, arg0.cfr_renamed_85(2));
    }

    public sprkih cfr_renamed_8446() {
        return this.cfr_renamed_2;
    }
}

