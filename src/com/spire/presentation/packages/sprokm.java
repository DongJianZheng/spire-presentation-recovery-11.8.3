/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprokm
extends sprqqe {
    private final sproug cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private final sproug cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprokm sprokm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprokm2.cfr_renamed_11322(sprrvm3, this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprokm2.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_4336() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_11322(sprrvm arg0, sprco arg1) {
        if (arg1 != null) {
            arg0.cfr_renamed_5004(arg1);
        }
    }

    public byte[] cfr_renamed_4894() {
        return this.cfr_renamed_2.cfr_renamed_186();
    }

    public sprokm(byte[] arg0, byte[] arg1) {
        this(null, arg0, arg1);
    }

    public byte[] cfr_renamed_2366() {
        return this.cfr_renamed_4.cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprokm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_84() == 3) {
            this.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        sprokm sprokm2 = this;
        void v1 = arg0;
        sprokm2.cfr_renamed_2 = sproug.cfr_renamed_23(v1.cfr_renamed_85(n));
        sprokm2.cfr_renamed_4 = sproug.cfr_renamed_23(v1.cfr_renamed_85(++n));
    }

    public static sprokm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprokm) {
            return (sprokm)arg0;
        }
        if (arg0 != null) {
            return new sprokm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprokm(sprddm sprddm2, byte[] byArray, byte[] byArray2) {
        void arg2;
        void arg1;
        this.cfr_renamed_3 = sprddm2;
        sprokm sprokm2 = this;
        this.cfr_renamed_2 = new sprfvg((byte[])arg1);
        sprokm2.cfr_renamed_4 = new sprfvg((byte[])arg2);
    }
}

