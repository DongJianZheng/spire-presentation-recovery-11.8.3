/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcmf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsxm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprecn
extends sprqqe {
    private final sprszm cfr_renamed_4;

    public sprsxm[] cfr_renamed_11404() {
        int n;
        sprsxm[] sprsxmArray = new sprsxm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprsxmArray[n3] = sprsxm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprsxmArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprecn(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 1) {
            throw new IllegalArgumentException(sprcmf.cfr_renamed_9("zSpRaOv^g\u001d`XbHvSpX3NzGv"));
        }
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(0));
    }

    public static sprecn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprecn) {
            return (sprecn)arg0;
        }
        if (arg0 != null) {
            return new sprecn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprecn(sprsxm sprsxm2) {
        void arg0;
        sprecn sprecn2 = this;
        sprecn2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprecn(sprsxm[] sprsxmArray) {
        void arg0;
        sprecn sprecn2 = this;
        sprecn2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }
}

