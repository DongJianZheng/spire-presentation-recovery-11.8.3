/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxcca;
import com.spire.presentation.packages.sprxgf;

public class sprerm
extends sprqqe {
    public sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprerm(sprszm sprszm2) {
        void arg0;
        if (!((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_7241(0)) {
            throw new IllegalArgumentException(sprxcca.cfr_renamed_9("Z=X-L6J=\t6F,\t.L*Z1F6\th"));
        }
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }

    public sprddm cfr_renamed_1445() {
        return sprddm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(1));
    }

    public sprerm(sprlem arg0, sprddm arg1, sprco arg2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1.cfr_renamed_119());
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprkdn(0 != 0, 0, arg2));
        this.cfr_renamed_4 = new sprqcn(sprrvm2);
    }

    public static sprerm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprerm) {
            return (sprerm)arg0;
        }
        if (arg0 != null) {
            return new sprerm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_480() {
        if (this.cfr_renamed_4.cfr_renamed_84() == 3) {
            return sproug.cfr_renamed_5085(sprnvm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(2)), false);
        }
        return null;
    }

    public sprlem cfr_renamed_696() {
        return sprlem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(0));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprktm(0L));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprqcn(sprrvm2);
    }
}

