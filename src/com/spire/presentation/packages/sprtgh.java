/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprnch;
import com.spire.presentation.packages.sprnrj;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwhh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzgh;

public class sprtgh
extends sprqqe {
    private final sprwhh cfr_renamed_3;
    private final sprzgh cfr_renamed_4;

    public sprzgh cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtgh(sprzgh sprzgh2, sprwhh sprwhh2) {
        void arg0;
        sprtgh sprtgh2 = this;
        sprtgh2.cfr_renamed_4 = arg0;
        sprtgh2.cfr_renamed_3 = sprwhh2;
    }

    public static sprtgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtgh) {
            return (sprtgh)arg0;
        }
        if (arg0 != null) {
            return new sprtgh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtgh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprnrj.cfr_renamed_9("\u0017R\u0002O\u0011^\u0017NRY\u0017[\u0007O\u001cI\u0017\n\u0001C\bORE\u0014\n@"));
        }
        this.cfr_renamed_4 = sprenh.cfr_renamed_8135(sprzgh.class, arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprenh.cfr_renamed_8135(sprwhh.class, arg0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        return new sprcen(sprcoArray);
    }

    public static sprnch cfr_renamed_7843() {
        return new sprnch();
    }

    public sprwhh cfr_renamed_8269() {
        return this.cfr_renamed_3;
    }
}

