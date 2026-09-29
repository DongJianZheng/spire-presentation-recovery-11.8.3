/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraih;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spremo;
import com.spire.presentation.packages.sprklh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsih;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprgch
extends sprqqe {
    private final sprklh cfr_renamed_3;
    private final spraih cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgch(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spremo.cfr_renamed_9("R>G#T2R\"\u00175R7B#Y%RfD/M#\u0017)Qf\u0005"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = spraih.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprklh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprgch(spraih spraih2, sprklh sprklh2) {
        void arg0;
        sprgch sprgch2 = this;
        sprgch2.cfr_renamed_4 = arg0;
        sprgch2.cfr_renamed_3 = sprklh2;
    }

    public spraih cfr_renamed_8256() {
        return this.cfr_renamed_4;
    }

    public sprklh cfr_renamed_8245() {
        return this.cfr_renamed_3;
    }

    public static sprgch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgch) {
            return (sprgch)arg0;
        }
        if (arg0 != null) {
            return new sprgch(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprsih cfr_renamed_7843() {
        return new sprsih();
    }
}

