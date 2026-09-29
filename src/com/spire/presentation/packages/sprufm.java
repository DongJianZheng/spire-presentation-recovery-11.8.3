/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruoo;
import com.spire.presentation.packages.sprxgf;

public class sprufm
extends sprqqe {
    public sprlem cfr_renamed_1;
    public sprigm cfr_renamed_2;
    public static final sprlem cfr_renamed_3 = new sprlem(spruoo.cfr_renamed_9("\u0017(\u0015(\u0010(\u0017(\u0013(\u0013(\u0011(\u0012>\b4"));
    public static final sprlem cfr_renamed_4 = new sprlem(spridc.cfr_renamed_9("x\u0004z\u0004\u007f\u0004x\u0004|\u0004|\u0004~\u0004}\u0012g\u001b"));

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public String toString() {
        return new StringBuilder().insert(0, spruoo.cfr_renamed_9("GEeCuUBCuEtOvRoIh\u001c&ioB.")).append(this.cfr_renamed_1.cfr_renamed_19()).append(")").toString();
    }

    public sprigm cfr_renamed_311() {
        return this.cfr_renamed_2;
    }

    public sprlem cfr_renamed_310() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprufm(sprszm sprszm2) {
        void arg0;
        sprufm sprufm2 = this;
        sprufm2.cfr_renamed_1 = null;
        sprufm2.cfr_renamed_2 = null;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spridc.cfr_renamed_9(">X&D.\n'_$H,XiE/\n,F,G,D=YiC'\n:O8_,D*O"));
        }
        void v1 = arg0;
        this.cfr_renamed_1 = sprlem.cfr_renamed_23(v1.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprigm.cfr_renamed_23(v1.cfr_renamed_85(1));
    }

    public static sprufm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprufm) {
            return (sprufm)arg0;
        }
        if (arg0 != null) {
            return new sprufm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprufm(sprlem sprlem2, sprigm sprigm2) {
        void arg0;
        sprufm sprufm2 = this;
        sprufm sprufm3 = this;
        sprufm3.cfr_renamed_1 = null;
        sprufm3.cfr_renamed_2 = null;
        sprufm2.cfr_renamed_1 = arg0;
        sprufm2.cfr_renamed_2 = sprigm2;
    }
}

