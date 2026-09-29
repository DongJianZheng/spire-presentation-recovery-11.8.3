/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqzx;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprulm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public sprco cfr_renamed_4668() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprulm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqzx.cfr_renamed_9("7\r\u0011L\u0006\t\u0004\u0019\u0010\u0002\u0016\tU\u001f\u001c\u0016\u0010VU")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = new sprlem(((sprlem)arg0.cfr_renamed_85(0)).cfr_renamed_19());
        try {
            this.cfr_renamed_3 = sprxgf.cfr_renamed_184(arg0.cfr_renamed_85(1).cfr_renamed_119().cfr_renamed_104("DER"));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalStateException();
        }
    }

    public static sprulm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprulm) {
            return (sprulm)arg0;
        }
        if (arg0 != null) {
            return new sprulm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlem cfr_renamed_4667() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprulm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprulm sprulm2 = this;
        sprulm2.cfr_renamed_4 = arg0;
        sprulm2.cfr_renamed_3 = sprco2;
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

