/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprggg
extends sprqqe {
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_5769() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_1411() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(0L));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public static sprggg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprggg) {
            return (sprggg)arg0;
        }
        if (arg0 != null) {
            return new sprggg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprggg(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprggg sprggg2 = this;
        sprggg2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
        sprggg2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprggg(sprszm sprszm2) {
        void arg0;
        if (!sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_7241(0)) {
            throw new IllegalArgumentException(spravo.cfr_renamed_9("4'*'.>/i7,3:(&/i./a:$84,/*$"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_186());
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(v0.cfr_renamed_85(2)).cfr_renamed_186());
    }
}

