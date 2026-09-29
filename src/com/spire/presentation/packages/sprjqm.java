/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvca;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryqm;

public class sprjqm
extends sprqqe {
    public sprszm cfr_renamed_3;
    public sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprjqm sprjqm2 = this;
        sprrvm2.cfr_renamed_5004(sprjqm2.cfr_renamed_4);
        if (sprjqm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjqm(spryqm[] spryqmArray, sprdcm[] sprdcmArray) {
        void arg0;
        sprjqm sprjqm2 = this;
        sprjqm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
        if (sprdcmArray != null) {
            void arg1;
            this.cfr_renamed_3 = new sprcen((sprco[])arg1);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjqm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbvca.cfr_renamed_9("\u0003Q%\u00102U0E$^\"UaC(J$\na")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprjqm(spryqm[] spryqmArray) {
        void arg0;
        sprjqm sprjqm2 = this;
        sprjqm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    public static sprjqm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprjqm) {
            return (sprjqm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprjqm((sprszm)arg0);
        }
        return null;
    }

    public spryqm[] cfr_renamed_626() {
        int n;
        spryqm[] spryqmArray = new spryqm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            spryqmArray[n3] = spryqm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return spryqmArray;
    }

    public sprdcm[] cfr_renamed_4648() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprdcm[] sprdcmArray = new sprdcm[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.cfr_renamed_84()) {
            int n3 = n++;
            sprdcmArray[n3] = sprdcm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprdcmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprjqm(spryqm spryqm2) {
        void arg0;
        sprjqm sprjqm2 = this;
        sprjqm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }
}

