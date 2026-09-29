/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprefm
extends sprqqe {
    public sprlem cfr_renamed_119;
    public sprddm cfr_renamed_91;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 2;
    public sprgbf cfr_renamed_3;
    public sprqvg cfr_renamed_4;

    public sprgbf cfr_renamed_412() {
        return this.cfr_renamed_3;
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprefm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() > 4 || arg0.cfr_renamed_84() < 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdsh.cfr_renamed_9("a GaP$R4F/@$\u00032J;F{\u0003")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprqvg.cfr_renamed_23(arg0.cfr_renamed_85(0));
        int n = 0;
        if (arg0.cfr_renamed_84() == 4) {
            ++n;
            this.cfr_renamed_119 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
        void v0 = arg0;
        this.cfr_renamed_91 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1 + n));
        this.cfr_renamed_3 = sprgbf.cfr_renamed_23(v0.cfr_renamed_85(2 + n));
    }

    public sprqvg cfr_renamed_411() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprefm(int n, sprlem sprlem2, sprddm sprddm2, byte[] byArray) {
        void arg3;
        void arg2;
        void arg0;
        sprefm sprefm2 = this;
        sprefm2.cfr_renamed_4 = new sprqvg((int)arg0);
        if (n == 2) {
            void arg1;
            this.cfr_renamed_119 = arg1;
        }
        sprefm sprefm3 = this;
        sprefm3.cfr_renamed_91 = arg2;
        sprefm3.cfr_renamed_3 = new sprdye((byte[])arg3);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprefm sprefm2 = this;
        sprrvm2.cfr_renamed_5004(sprefm2.cfr_renamed_4);
        if (sprefm2.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_119);
        }
        sprrvm sprrvm3 = sprrvm2;
        sprefm sprefm3 = this;
        sprrvm3.cfr_renamed_5004(sprefm3.cfr_renamed_91);
        sprrvm3.cfr_renamed_5004(sprefm3.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprefm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprefm) {
            return (sprefm)arg0;
        }
        if (arg0 != null) {
            return new sprefm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprefm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprefm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprlem cfr_renamed_415() {
        return this.cfr_renamed_119;
    }
}

