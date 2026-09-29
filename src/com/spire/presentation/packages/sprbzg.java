/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprpah;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrzg;
import com.spire.presentation.packages.sprshl;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprywg;

public class sprbzg
extends sprqqe {
    private final sprrzg cfr_renamed_2;
    private final sprrzg cfr_renamed_3;
    private final sprywg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbzg(sprrzg sprrzg2, sprywg sprywg2, sprrzg sprrzg3) {
        void arg1;
        void arg0;
        sprbzg sprbzg2 = this;
        this.cfr_renamed_3 = arg0;
        sprbzg2.cfr_renamed_4 = arg1;
        sprbzg2.cfr_renamed_2 = sprrzg3;
    }

    public sprrzg cfr_renamed_8220() {
        return this.cfr_renamed_2;
    }

    public sprywg cfr_renamed_8221() {
        return this.cfr_renamed_4;
    }

    public sprrzg cfr_renamed_8222() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbzg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprshl.cfr_renamed_9("\u00136\u0006+\u0015:\u0013*V=\u0013?\u0003+\u0018-\u0013n\u0005'\f+V!\u0010nE"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprrzg.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprywg.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sprrzg.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public static sprpah cfr_renamed_7843() {
        return new sprpah();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        sprcoArray[2] = this.cfr_renamed_2;
        return new sprcen(sprcoArray);
    }

    public static sprbzg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbzg) {
            return (sprbzg)arg0;
        }
        if (arg0 != null) {
            return new sprbzg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

