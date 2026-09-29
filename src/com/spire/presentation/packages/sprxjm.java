/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmem;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprxgf;

public class sprxjm
extends sprqqe {
    private spridn cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxjm(sprmem sprmem2) {
        void arg0;
        sprxjm sprxjm2 = this;
        sprxjm2.cfr_renamed_4 = new sprocn((sprco)arg0);
    }

    public boolean cfr_renamed_4539() {
        return this.cfr_renamed_4.cfr_renamed_84() > 1;
    }

    public sprxjm(sprlem sprlem2, sprco sprco2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(sprlem2);
        sprrvm3.cfr_renamed_5004(sprco2);
        sprxjm sprxjm2 = this;
        sprxjm2.cfr_renamed_4 = new sprocn(new sprcen(sprrvm2));
    }

    public boolean cfr_renamed_11167(sprlem arg0) {
        int n;
        int n2 = this.cfr_renamed_4.cfr_renamed_84();
        int n3 = n = 0;
        while (n3 < n2) {
            if (sprmem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n)).cfr_renamed_324().cfr_renamed_5078(arg0)) {
                return true;
            }
            n3 = ++n;
        }
        return false;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    public int cfr_renamed_11166(sprlem[] arg0, int arg1) {
        int n;
        int n2 = this.cfr_renamed_4.cfr_renamed_84();
        int n3 = n = 0;
        while (n3 < n2) {
            sprmem sprmem2 = sprmem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n));
            int n4 = arg1 + n;
            arg0[n4] = sprmem2.cfr_renamed_324();
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxjm(sprmem[] sprmemArray) {
        void arg0;
        sprxjm sprxjm2 = this;
        sprxjm2.cfr_renamed_4 = new sprocn((sprco[])arg0);
    }

    public sprmem[] cfr_renamed_4540() {
        int n;
        sprmem[] sprmemArray = new sprmem[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprmemArray.length) {
            int n3 = n++;
            sprmemArray[n3] = sprmem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprmemArray;
    }

    public sprmem cfr_renamed_4541() {
        if (this.cfr_renamed_4.cfr_renamed_84() == 0) {
            return null;
        }
        return sprmem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(0));
    }

    public static sprxjm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxjm) {
            return (sprxjm)arg0;
        }
        if (arg0 != null) {
            return new sprxjm(spridn.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprxjm(spridn spridn2) {
        this.cfr_renamed_4 = spridn2;
    }
}

