/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprhqe
extends sprkra {
    private final sprnte cfr_renamed_3;
    private final sprnte cfr_renamed_4;

    public sprhqe(sprnte sprnte2) {
        sprhqe sprhqe2 = this;
        sprhqe2.cfr_renamed_3 = null;
        sprhqe2.cfr_renamed_4 = sprnte2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhqe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_85(0) instanceof spryte) {
            sprhqe sprhqe2 = this;
            sprhqe2.cfr_renamed_3 = sprnte.cfr_renamed_341(spryte.cfr_renamed_23(arg0.cfr_renamed_85(0)), true);
            sprhqe2.cfr_renamed_4 = sprnte.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_3 = null;
        this.cfr_renamed_4 = sprnte.cfr_renamed_23(arg0.cfr_renamed_85(0));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprnte cfr_renamed_3262() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprhqe(sprnte sprnte2, sprnte sprnte3) {
        void arg0;
        sprhqe sprhqe2 = this;
        sprhqe2.cfr_renamed_3 = arg0;
        sprhqe2.cfr_renamed_4 = sprnte3;
    }

    public sprnte cfr_renamed_3260() {
        return this.cfr_renamed_3;
    }

    public static sprhqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhqe) {
            return (sprhqe)arg0;
        }
        if (arg0 != null) {
            return new sprhqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

