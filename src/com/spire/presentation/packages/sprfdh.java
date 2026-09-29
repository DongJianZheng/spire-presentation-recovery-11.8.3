/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjkh;
import com.spire.presentation.packages.sprprca;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprwhh;
import com.spire.presentation.packages.sprxgf;

public class sprfdh
extends sprqqe {
    private final sprwhh cfr_renamed_3;
    private final sprvrg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfdh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprprca.cfr_renamed_9("Q.D3W\"Q2\u0014%Q'A3Z5QvG?N3\u00149Rv\u0006"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprvrg.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprwhh.cfr_renamed_23(v0.cfr_renamed_85(1));
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
    public sprfdh(sprvrg sprvrg2, sprwhh sprwhh2) {
        void arg0;
        sprfdh sprfdh2 = this;
        sprfdh2.cfr_renamed_4 = arg0;
        sprfdh2.cfr_renamed_3 = sprwhh2;
    }

    public static sprjkh cfr_renamed_7843() {
        return new sprjkh();
    }

    public static sprfdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfdh) {
            return (sprfdh)arg0;
        }
        if (arg0 != null) {
            return new sprfdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvrg cfr_renamed_5372() {
        return this.cfr_renamed_4;
    }

    public sprwhh cfr_renamed_4637() {
        return this.cfr_renamed_3;
    }
}

