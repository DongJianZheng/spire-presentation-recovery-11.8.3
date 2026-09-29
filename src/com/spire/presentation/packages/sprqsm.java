/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvub;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprqsm
extends sprqqe {
    private final sprlem cfr_renamed_2;
    private final sprybn cfr_renamed_3;
    private final spridn cfr_renamed_4;

    public spridn cfr_renamed_206() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqsm(sprybn sprybn2, sprlem sprlem2, spridn spridn2) {
        void arg1;
        void arg0;
        sprqsm sprqsm2 = this;
        this.cfr_renamed_3 = arg0;
        sprqsm2.cfr_renamed_2 = arg1;
        sprqsm2.cfr_renamed_4 = spridn2;
    }

    public sprybn cfr_renamed_11361() {
        return this.cfr_renamed_3;
    }

    public static sprqsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqsm) {
            return (sprqsm)arg0;
        }
        if (arg0 != null) {
            return new sprqsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlem cfr_renamed_204() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqsm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprvub.cfr_renamed_9("8\u00052\u0004#\u00194\b%K\"\u000e \u001e4\u00052\u000eq\u00188\u00114"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprybn.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_4 = spridn.cfr_renamed_23(v0.cfr_renamed_85(2));
    }
}

