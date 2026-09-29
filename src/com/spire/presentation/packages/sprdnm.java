/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdxn;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxfm;
import com.spire.presentation.packages.sprxgf;

public class sprdnm
extends sprqqe {
    private final sprnbm cfr_renamed_1;
    private sprigm cfr_renamed_2;
    private sprjfn cfr_renamed_3;
    private sprxfm cfr_renamed_4;

    public sprxfm cfr_renamed_2204() {
        return this.cfr_renamed_4;
    }

    public sprnbm cfr_renamed_403() {
        return this.cfr_renamed_1;
    }

    public static sprdnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdnm) {
            return (sprdnm)arg0;
        }
        if (arg0 != null) {
            return new sprdnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprdnm sprdnm2 = this;
        sprrvm2.cfr_renamed_5004(sprdnm2.cfr_renamed_1);
        if (sprdnm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprigm cfr_renamed_11397() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdnm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 4) {
            throw new IllegalArgumentException(sprdxn.cfr_renamed_9(" N*O;R,C=\u0000:E8U,N*EiS Z,"));
        }
        this.cfr_renamed_1 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        int n = 1;
        if (arg0.cfr_renamed_84() > n && arg0.cfr_renamed_85(n).cfr_renamed_119() instanceof sprnvm) {
            this.cfr_renamed_2 = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_84() > n && arg0.cfr_renamed_85(n).cfr_renamed_119() instanceof sprjfn) {
            this.cfr_renamed_3 = sprjfn.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_84() > n && arg0.cfr_renamed_85(n).cfr_renamed_119() instanceof sprgbf) {
            sprdnm sprdnm2 = this;
            sprdnm2.cfr_renamed_4 = new sprxfm(sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(n)));
        }
    }

    public sprjfn cfr_renamed_2147() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdnm(sprnbm sprnbm2, sprigm sprigm2, sprjfn sprjfn2, sprxfm sprxfm2) {
        void arg2;
        void arg1;
        void arg0;
        sprdnm sprdnm2 = this;
        sprdnm sprdnm3 = this;
        sprdnm3.cfr_renamed_1 = arg0;
        sprdnm3.cfr_renamed_2 = arg1;
        sprdnm2.cfr_renamed_3 = arg2;
        sprdnm2.cfr_renamed_4 = sprxfm2;
    }
}

