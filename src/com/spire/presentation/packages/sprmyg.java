/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprfxg;
import com.spire.presentation.packages.sprkro;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqtg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruug;
import com.spire.presentation.packages.sprxgf;

public class sprmyg
extends sprqqe {
    private final spruug cfr_renamed_3;
    private final sprfxg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmyg(sprfxg sprfxg2, spruug spruug2) {
        void arg0;
        sprmyg sprmyg2 = this;
        sprmyg2.cfr_renamed_4 = arg0;
        sprmyg2.cfr_renamed_3 = spruug2;
    }

    public static sprmyg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmyg) {
            return (sprmyg)arg0;
        }
        if (arg0 != null) {
            return new sprmyg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprqtg cfr_renamed_7843() {
        return new sprqtg();
    }

    public sprfxg cfr_renamed_8305() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmyg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprkro.cfr_renamed_9("FXSE@TFD\u0003SFQVEMCF\u0000PIYE\u0003OE\u0000\u0011"));
        }
        this.cfr_renamed_4 = sprfxg.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprenh.cfr_renamed_8135(spruug.class, arg0.cfr_renamed_85(1));
    }

    public spruug cfr_renamed_8372() {
        return this.cfr_renamed_3;
    }
}

