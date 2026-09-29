/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcxe;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprubs;
import com.spire.presentation.packages.sprxgf;

public class sprzom
extends sprqqe {
    private sprddm cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public static sprzom cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprzom) {
            return (sprzom)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprzom((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcxe.cfr_renamed_9("\u0014_\u0011V\u001aR\u0011\u0013\u0012Q\u0017V\u001eG]Z\u0013\u0013\u001aV\tz\u0013@\tR\u0013P\u0018\t]")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprzom(sprddm sprddm2, byte[] byArray) {
        void arg1;
        void arg0;
        sprzom sprzom2 = this;
        sprzom2.cfr_renamed_3 = arg0;
        sprzom2.cfr_renamed_4 = new byte[byArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    public byte[] cfr_renamed_4637() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzom(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprubs.cfr_renamed_9("n\u0013HR_\u0017]\u0007I\u001cO\u0017\f\u0001E\bIH\f")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprfvg.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_186();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_3;
    }
}

