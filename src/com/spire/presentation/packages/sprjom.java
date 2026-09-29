/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprgnm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwmm;
import com.spire.presentation.packages.sprxgf;

public class sprjom
extends sprqqe {
    private sprlem cfr_renamed_2;
    private sprwmm cfr_renamed_3;
    private sprgnm cfr_renamed_4;

    public sprgnm cfr_renamed_4662() {
        return this.cfr_renamed_4;
    }

    public static sprjom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjom) {
            return (sprjom)arg0;
        }
        if (arg0 != null) {
            return new sprjom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprwmm cfr_renamed_4660() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprjom sprjom2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprjom2.cfr_renamed_4);
        if (sprjom2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjom(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpfm.cfr_renamed_9("\u001ez8;/~-n9u?~|h5a9!|")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_2 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprgnm.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_3 = sprwmm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public sprlem cfr_renamed_4661() {
        return new sprlem(this.cfr_renamed_2.cfr_renamed_19());
    }

    public sprjom(sprlem arg0, sprgnm arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprjom(sprlem sprlem2, sprgnm sprgnm2, sprwmm sprwmm2) {
        void arg1;
        void arg0;
        sprjom sprjom2 = this;
        this.cfr_renamed_2 = arg0;
        sprjom2.cfr_renamed_4 = arg1;
        sprjom2.cfr_renamed_3 = sprwmm2;
    }
}

