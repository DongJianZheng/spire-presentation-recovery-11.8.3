/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdaa;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprahm
extends sprqqe {
    public sprddm cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprahm(sprddm sprddm2, byte[] byArray) {
        void arg0;
        sprahm sprahm2 = this;
        sprahm2.cfr_renamed_3 = arg0;
        sprahm2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    public static sprahm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprahm) {
            return (sprahm)arg0;
        }
        if (arg0 != null) {
            return new sprahm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprahm(sprszm sprszm2) {
        if (sprszm2.cfr_renamed_84() == 2) {
            void arg0;
            sprahm sprahm2 = this;
            sprahm2.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            sprahm2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(sprrdaa.cfr_renamed_9("x.z>n%h.+#j8+<y$e,+%~&i.ykd-+.g.f.e?x"));
    }

    public byte[] cfr_renamed_595() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }
}

