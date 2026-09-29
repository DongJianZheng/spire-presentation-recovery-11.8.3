/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sproqj;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrlm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class spraum
extends sprqqe {
    private sprrlm cfr_renamed_3;
    private spratm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraum(spratm spratm2, sprrlm sprrlm2) {
        void arg0;
        spraum spraum2 = this;
        spraum2.cfr_renamed_4 = arg0;
        spraum2.cfr_renamed_3 = sprrlm2;
    }

    public spraum(spratm arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraum(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sproqj.cfr_renamed_9("g%AdV!T1@*F!\u00057L>@~\u0005")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = spratm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprrlm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public spratm cfr_renamed_4675() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_119());
        if (null != this.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3.cfr_renamed_119());
        }
        return new sprcen(sprrvm2);
    }

    public static spraum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraum) {
            return (spraum)arg0;
        }
        if (arg0 != null) {
            return new spraum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrlm cfr_renamed_4674() {
        return this.cfr_renamed_3;
    }
}

