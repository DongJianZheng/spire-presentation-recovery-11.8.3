/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprqlm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqlm(String string, sprco sprco2) {
        this(new sprlem((String)arg0), (sprco)arg1);
        void arg1;
        void arg0;
    }

    public static sprqlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqlm) {
            return (sprqlm)arg0;
        }
        if (arg0 != null) {
            return new sprqlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqlm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_3 = arg0.cfr_renamed_85(1);
    }

    public sprlem cfr_renamed_324() {
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

    /*
     * WARNING - void declaration
     */
    public sprqlm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprqlm sprqlm2 = this;
        sprqlm2.cfr_renamed_4 = arg0;
        sprqlm2.cfr_renamed_3 = sprco2;
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_3;
    }
}

