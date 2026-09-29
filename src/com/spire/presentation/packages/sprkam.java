/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spredn;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkam
extends sprqqe {
    private spridn cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprkam sprkam2 = this;
        sprrvm2.cfr_renamed_5004(sprkam2.cfr_renamed_3);
        sprrvm sprrvm3 = sprrvm2;
        sprrvm2.cfr_renamed_5004(new spredn(true, 0, this.cfr_renamed_4));
        if (sprkam2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprfdn(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprkam(sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        sprkam sprkam2 = this;
        this.cfr_renamed_3 = arg0;
        sprkam2.cfr_renamed_4 = arg1;
        sprkam2.cfr_renamed_2 = null;
    }

    public static sprkam cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkam) {
            return (sprkam)arg0;
        }
        if (arg0 != null) {
            return new sprkam(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco cfr_renamed_1458() {
        return this.cfr_renamed_4;
    }

    public sprlem cfr_renamed_1457() {
        return this.cfr_renamed_3;
    }

    public spridn cfr_renamed_1461() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprkam(sprlem sprlem2, sprco sprco2, spridn spridn2) {
        void arg1;
        void arg0;
        sprkam sprkam2 = this;
        this.cfr_renamed_3 = arg0;
        sprkam2.cfr_renamed_4 = arg1;
        sprkam2.cfr_renamed_2 = spridn2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkam(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_4 = ((sprnvm)arg0.cfr_renamed_85(1)).cfr_renamed_8225();
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_2 = (spridn)arg0.cfr_renamed_85(2);
        }
    }
}

