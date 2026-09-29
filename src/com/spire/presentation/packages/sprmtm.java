/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprejk;
import com.spire.presentation.packages.sprhum;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmtm
extends sprqqe {
    public sprszm cfr_renamed_3;
    public sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmtm(sprhum sprhum2) {
        void arg0;
        sprmtm sprmtm2 = this;
        sprmtm2.cfr_renamed_3 = new sprcen((sprco)arg0);
    }

    public static sprmtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmtm) {
            return (sprmtm)arg0;
        }
        if (arg0 != null) {
            return new sprmtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdcm[] cfr_renamed_4648() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprdcm[] sprdcmArray = new sprdcm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprdcmArray[n3] = sprdcm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprdcmArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmtm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprejk.cfr_renamed_9("]`{!ldntzo|d?rv{z;?")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprmtm sprmtm2 = this;
        sprrvm2.cfr_renamed_5004(sprmtm2.cfr_renamed_3);
        if (sprmtm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprhum[] cfr_renamed_626() {
        int n;
        sprhum[] sprhumArray = new sprhum[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.cfr_renamed_84()) {
            int n3 = n++;
            sprhumArray[n3] = sprhum.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprhumArray;
    }
}

