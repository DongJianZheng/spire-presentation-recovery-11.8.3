/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjbh;
import com.spire.presentation.packages.sprnah;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtxg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprznj;

public class sprdsg
extends sprqqe {
    private final sprnah cfr_renamed_3;
    private final sprjbh cfr_renamed_4;

    public static sprtxg cfr_renamed_7843() {
        return new sprtxg();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdsg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprznj.cfr_renamed_9("h`}}nlh|-khix}c{h8~qw}-wk8?"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprjbh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprnah.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprdsg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdsg) {
            return (sprdsg)arg0;
        }
        if (arg0 != null) {
            return new sprdsg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdsg(sprjbh sprjbh2, sprnah sprnah2) {
        void arg0;
        sprdsg sprdsg2 = this;
        sprdsg2.cfr_renamed_4 = arg0;
        sprdsg2.cfr_renamed_3 = sprnah2;
    }

    public sprnah cfr_renamed_8335() {
        return this.cfr_renamed_3;
    }

    public sprjbh cfr_renamed_8336() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }
}

