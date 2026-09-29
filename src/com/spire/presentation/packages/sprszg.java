/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprejy;
import com.spire.presentation.packages.sprhug;
import com.spire.presentation.packages.sprmro;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruhh;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxgf;

public class sprszg
extends sprqqe {
    private final sprvrg cfr_renamed_3;
    private final spruhh cfr_renamed_4;

    public String toString() {
        return new StringBuilder().insert(0, sprejy.cfr_renamed_9("!\b\u001b\u0000\u0013\u0000\u0003\u0010'\f\u0005\u0000\u0018\r,")).append(this.cfr_renamed_3).append(" ").append(this.cfr_renamed_4).append("]").toString();
    }

    public spruhh cfr_renamed_8333() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public static sprhug cfr_renamed_7843() {
        return new sprhug();
    }

    public sprvrg cfr_renamed_3156() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprszg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprmro.cfr_renamed_9("\u0019L\fQ\u001f@\u0019P\\G\u0019E\tQ\u0012W\u0019\u0014\u000f]\u0006Q\\[\u001a\u0014N"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprvrg.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = spruhh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    /*
     * WARNING - void declaration
     */
    public sprszg(sprvrg sprvrg2, spruhh spruhh2) {
        void arg0;
        sprszg sprszg2 = this;
        sprszg2.cfr_renamed_3 = arg0;
        sprszg2.cfr_renamed_4 = spruhh2;
    }

    public static sprszg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprszg) {
            return (sprszg)arg0;
        }
        if (arg0 != null) {
            return new sprszg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

