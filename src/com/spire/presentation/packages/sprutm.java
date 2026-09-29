/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprimz;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprutm
extends sprqqe {
    private sprrcm cfr_renamed_3;
    private sprrcm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public static sprutm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprutm) {
            return (sprutm)arg0;
        }
        if (arg0 != null) {
            return new sprutm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprutm(sprrcm sprrcm2, sprrcm sprrcm3) {
        void arg0;
        void arg1;
        if (sprrcm2 == null && arg1 == null) {
            throw new IllegalArgumentException(sprimz.cfr_renamed_9("gn&vc{un&uh\u007f&u`:hurXc|ihc5hur[`nch&wsir:hur:d\u007f&tsvj4"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sprrcm cfr_renamed_0() {
        return this.cfr_renamed_4;
    }

    public sprrcm cfr_renamed_86() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprutm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = (sprnvm)enumeration.nextElement();
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_4 = sprrcm.cfr_renamed_5085(sprnvm2, true);
                continue;
            }
            this.cfr_renamed_3 = sprrcm.cfr_renamed_5085(sprnvm2, true);
        }
    }
}

