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
import com.spire.presentation.packages.sprumn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class spronm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    public sprco cfr_renamed_4665() {
        return this.cfr_renamed_4;
    }

    public static spronm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spronm) {
            return (spronm)arg0;
        }
        if (arg0 != null) {
            return new spronm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public spronm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        spronm spronm2 = this;
        spronm2.cfr_renamed_3 = arg0;
        spronm2.cfr_renamed_4 = sprco2;
    }

    public sprlem cfr_renamed_4666() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ spronm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprumn.cfr_renamed_9("Ebc#tfvvbmdf'pnyb9'")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = (sprlem)arg0.cfr_renamed_85(0);
        try {
            this.cfr_renamed_4 = sprxgf.cfr_renamed_184(arg0.cfr_renamed_85(1).cfr_renamed_119().cfr_renamed_104("DER"));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalStateException();
        }
    }
}

