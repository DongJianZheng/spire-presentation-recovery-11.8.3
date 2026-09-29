/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprafn
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprafn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprafn) {
            return (sprafn)arg0;
        }
        if (arg0 != null) {
            return new sprafn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_9287() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprafn(sprlem sprlem2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_4 = sprlem2;
        sprafn sprafn2 = this;
        this.cfr_renamed_3 = new sprfvg(sproze.cfr_renamed_158((byte[])arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprafn(sprszm sprszm2) {
        void arg0;
        sprafn sprafn2 = this;
        sprafn2.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprafn2.cfr_renamed_3 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    public sprlem cfr_renamed_2373() {
        return this.cfr_renamed_4;
    }
}

