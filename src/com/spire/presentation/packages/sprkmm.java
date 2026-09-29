/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprkmm
extends sprqqe {
    private final sprlvm cfr_renamed_3;
    private final sprlvm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkmm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            sprkmm sprkmm2 = this;
            sprkmm2.cfr_renamed_4 = sprlvm.cfr_renamed_5085(sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(0)), true);
            sprkmm2.cfr_renamed_3 = sprlvm.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_4 = null;
        this.cfr_renamed_3 = sprlvm.cfr_renamed_23(arg0.cfr_renamed_85(0));
    }

    public sprkmm(sprlvm sprlvm2) {
        sprkmm sprkmm2 = this;
        sprkmm2.cfr_renamed_4 = null;
        sprkmm2.cfr_renamed_3 = sprlvm2;
    }

    public sprlvm cfr_renamed_3262() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprkmm(sprlvm sprlvm2, sprlvm sprlvm3) {
        void arg0;
        sprkmm sprkmm2 = this;
        sprkmm2.cfr_renamed_4 = arg0;
        sprkmm2.cfr_renamed_3 = sprlvm3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprlvm cfr_renamed_3260() {
        return this.cfr_renamed_4;
    }

    public static sprkmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkmm) {
            return (sprkmm)arg0;
        }
        if (arg0 != null) {
            return new sprkmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

