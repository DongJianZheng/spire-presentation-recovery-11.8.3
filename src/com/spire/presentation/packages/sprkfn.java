/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcrm;
import com.spire.presentation.packages.spremm;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprmsba;
import com.spire.presentation.packages.sprqfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprkfn
extends sprqqe {
    private final spremm cfr_renamed_1;
    private final sprkgn cfr_renamed_2;
    private final sprszm cfr_renamed_3;
    private final sprqfn cfr_renamed_4;

    public boolean cfr_renamed_11410() {
        return this.cfr_renamed_1 != null;
    }

    public spraen cfr_renamed_647() {
        if (null == this.cfr_renamed_2 || this.cfr_renamed_2 instanceof spraen) {
            return (spraen)this.cfr_renamed_2;
        }
        return new spraen(this.cfr_renamed_2.cfr_renamed_314());
    }

    /*
     * WARNING - void declaration
     */
    public sprkfn(sprqfn sprqfn2, sprszm sprszm2, sprkgn sprkgn2, spremm spremm2) {
        void arg2;
        void arg1;
        void arg0;
        sprkfn sprkfn2 = this;
        sprkfn sprkfn3 = this;
        sprkfn3.cfr_renamed_4 = arg0;
        sprkfn3.cfr_renamed_3 = arg1;
        sprkfn2.cfr_renamed_2 = arg2;
        sprkfn2.cfr_renamed_1 = spremm2;
    }

    public sprybn[] cfr_renamed_11404() {
        return sprcrm.cfr_renamed_11360(this.cfr_renamed_3);
    }

    public sprkgn cfr_renamed_11411() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprkfn sprkfn2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprkfn2.cfr_renamed_3);
        if (sprkfn2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        return new sprcen(sprrvm2);
    }

    public spremm cfr_renamed_11412() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkfn(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 2 || arg0.cfr_renamed_84() > 4) {
            throw new IllegalArgumentException(sprmsba.cfr_renamed_9("G\u0007M\u0006\\\u001bK\nZI]\f_\u001cK\u0007M\f\u000e\u001aG\u0013K"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprqfn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() > 2) {
            if (arg0.cfr_renamed_84() == 4) {
                sprkfn sprkfn2 = this;
                sprkfn2.cfr_renamed_2 = sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(2));
                sprkfn2.cfr_renamed_1 = spremm.cfr_renamed_23(arg0.cfr_renamed_85(3));
                return;
            }
            if (arg0.cfr_renamed_85(2) instanceof sprkgn) {
                sprkfn sprkfn3 = this;
                sprkfn3.cfr_renamed_2 = sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(2));
                sprkfn3.cfr_renamed_1 = null;
                return;
            }
            this.cfr_renamed_2 = null;
            this.cfr_renamed_1 = spremm.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        this.cfr_renamed_2 = null;
        this.cfr_renamed_1 = null;
    }

    public sprqfn cfr_renamed_11413() {
        return this.cfr_renamed_4;
    }

    public static sprkfn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkfn) {
            return (sprkfn)arg0;
        }
        if (arg0 != null) {
            return new sprkfn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

