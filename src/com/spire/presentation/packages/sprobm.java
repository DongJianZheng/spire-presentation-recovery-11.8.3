/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spreyc;
import com.spire.presentation.packages.sprgfm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprobm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprobm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spreyc.cfr_renamed_9("A\\g\u001dpXrHfS`X#NjGf\u0007#")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = v0.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprobm(String string) {
        void arg0;
        this.cfr_renamed_4 = sprgfm.cfr_renamed_3;
        sprobm sprobm2 = this;
        sprobm2.cfr_renamed_3 = new sprnrm((String)arg0);
    }

    public sprlem cfr_renamed_4501() {
        return this.cfr_renamed_4;
    }

    public sprco cfr_renamed_4502() {
        return this.cfr_renamed_3;
    }

    public static sprobm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprobm) {
            return (sprobm)arg0;
        }
        if (arg0 != null) {
            return new sprobm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
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
    public sprobm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprobm sprobm2 = this;
        sprobm2.cfr_renamed_4 = arg0;
        sprobm2.cfr_renamed_3 = sprco2;
    }
}

