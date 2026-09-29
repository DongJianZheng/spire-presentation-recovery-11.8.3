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
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprzcn
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzcn(sprszm sprszm2) {
        void arg0;
        sprzcn sprzcn2 = this;
        sprzcn2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprzcn2.cfr_renamed_3 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    public static sprzcn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzcn) {
            return (sprzcn)arg0;
        }
        if (arg0 != null) {
            return new sprzcn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_4178() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzcn(sprddm sprddm2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_4 = sprddm2;
        sprzcn sprzcn2 = this;
        this.cfr_renamed_3 = new sprfvg(sproze.cfr_renamed_158((byte[])arg1));
    }

    public sprddm cfr_renamed_1445() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }
}

