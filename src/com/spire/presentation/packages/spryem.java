/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class spryem
extends sprqqe {
    private sprjfn cfr_renamed_3;
    private sprjfn cfr_renamed_4;

    public sprjfn cfr_renamed_86() {
        return this.cfr_renamed_4;
    }

    public static spryem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryem) {
            return (spryem)arg0;
        }
        if (arg0 != null) {
            return new spryem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjfn cfr_renamed_0() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ spryem(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = (sprnvm)enumeration.nextElement();
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = sprjfn.cfr_renamed_5085(sprnvm2, false);
                continue;
            }
            if (sprnvm2.cfr_renamed_312() != 1) continue;
            this.cfr_renamed_4 = sprjfn.cfr_renamed_5085(sprnvm2, false);
        }
    }
}

