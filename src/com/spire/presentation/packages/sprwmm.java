/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdmm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprwmm
extends sprqqe {
    public sprszm cfr_renamed_4;

    public static sprwmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwmm) {
            return (sprwmm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprwmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprwmm(sprdmm[] sprdmmArray) {
        void arg0;
        sprwmm sprwmm2 = this;
        sprwmm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    private /* synthetic */ sprwmm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    public sprdmm cfr_renamed_4652(int arg0) {
        return sprdmm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(arg0));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

