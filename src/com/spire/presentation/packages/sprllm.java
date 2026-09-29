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
import java.util.Enumeration;

public class sprllm
extends sprqqe {
    private sprddm cfr_renamed_3;
    private sproug cfr_renamed_4;

    public static sprllm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprllm) {
            return (sprllm)arg0;
        }
        if (arg0 != null) {
            return new sprllm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprllm(sprddm sprddm2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_3 = sprddm2;
        sprllm sprllm2 = this;
        this.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg1));
    }

    public byte[] cfr_renamed_1446() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
    }

    public sprddm cfr_renamed_1445() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprllm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_4 = sproug.cfr_renamed_23(enumeration.nextElement());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

