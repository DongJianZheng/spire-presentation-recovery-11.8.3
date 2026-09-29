/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruin;
import com.spire.presentation.packages.sprxgf;

public class sprujm
extends sprqqe {
    private spridn cfr_renamed_3;
    private sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprujm(sprlem sprlem2, spridn spridn2) {
        void arg0;
        sprujm sprujm2 = this;
        sprujm2.cfr_renamed_4 = arg0;
        sprujm2.cfr_renamed_3 = spridn2;
    }

    public sprlem cfr_renamed_204() {
        return new sprlem(this.cfr_renamed_4.cfr_renamed_19());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprujm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruin.cfr_renamed_9("'y\u00018\u0016}\u0014m\u0000v\u0006}Ek\fb\u0000\"E")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = spridn.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprujm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprujm) {
            return (sprujm)arg0;
        }
        if (arg0 != null) {
            return new sprujm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco[] cfr_renamed_4528() {
        return this.cfr_renamed_3.cfr_renamed_4529();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public spridn cfr_renamed_206() {
        return this.cfr_renamed_3;
    }
}

