/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprsdm
extends sprqqe {
    public sprhmm cfr_renamed_3;
    public sprlvm cfr_renamed_4;

    public sprhmm cfr_renamed_648() {
        return this.cfr_renamed_3;
    }

    public static sprsdm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsdm) {
            return (sprsdm)arg0;
        }
        if (arg0 != null) {
            return new sprsdm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprsdm sprsdm2 = this;
        sprrvm2.cfr_renamed_5004(sprsdm2.cfr_renamed_3);
        if (sprsdm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprsdm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_3 = sprhmm.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_4 = sprlvm.cfr_renamed_23(enumeration.nextElement());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprsdm(sprhmm sprhmm2, sprlvm sprlvm2) {
        void arg0;
        sprsdm sprsdm2 = this;
        sprsdm2.cfr_renamed_3 = arg0;
        sprsdm2.cfr_renamed_4 = sprlvm2;
    }

    public sprlvm cfr_renamed_652() {
        return this.cfr_renamed_4;
    }
}

