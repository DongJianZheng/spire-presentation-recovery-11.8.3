/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblh;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdeh;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprnlh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsfh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprbeh
extends sprqqe {
    private final sprnlh cfr_renamed_2;
    private final sprdeh cfr_renamed_3;
    private final sprsfh cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_2);
        return new sprcen(sprcoArray);
    }

    public static sprbeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbeh) {
            return (sprbeh)arg0;
        }
        if (arg0 != null) {
            return new sprbeh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsfh cfr_renamed_8287() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprbeh(sprsfh sprsfh2, sprdeh sprdeh2, sprnlh sprnlh2) {
        void arg1;
        void arg0;
        sprbeh sprbeh2 = this;
        this.cfr_renamed_4 = arg0;
        sprbeh2.cfr_renamed_3 = arg1;
        sprbeh2.cfr_renamed_2 = sprnlh2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbeh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprbva.cfr_renamed_9("vZcGpVvF3QvSfG}Av\u0002`KiG3Mu\u0002 "));
        }
        sprbeh sprbeh2 = this;
        sprbeh2.cfr_renamed_4 = sprsfh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprbeh2.cfr_renamed_3 = sprdeh.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sprenh.cfr_renamed_8135(sprnlh.class, arg0.cfr_renamed_85(2));
    }

    public sprdeh cfr_renamed_8288() {
        return this.cfr_renamed_3;
    }

    public sprnlh cfr_renamed_8289() {
        return this.cfr_renamed_2;
    }

    public static sprblh cfr_renamed_7843() {
        return new sprblh();
    }
}

