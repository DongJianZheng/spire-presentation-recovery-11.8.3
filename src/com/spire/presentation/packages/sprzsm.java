/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrio;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprzsm
extends sprqqe {
    private final sprco cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    private /* synthetic */ sprzsm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = arg0.cfr_renamed_85(1);
            return;
        }
        this.cfr_renamed_3 = null;
    }

    public static sprzsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzsm) {
            return (sprzsm)arg0;
        }
        if (arg0 != null) {
            return new sprzsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlem cfr_renamed_4887() {
        return this.cfr_renamed_4;
    }

    public sprco cfr_renamed_4886() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzsm(sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        if (sprlem2 == null) {
            throw new NullPointerException(sprrio.cfr_renamed_9("f*/%.\u001783$da  -/,5c#&a-4/-"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sprzsm(sprlem arg0) {
        this(arg0, null);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprzsm sprzsm2 = this;
        sprrvm2.cfr_renamed_5004(sprzsm2.cfr_renamed_4);
        if (sprzsm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }
}

