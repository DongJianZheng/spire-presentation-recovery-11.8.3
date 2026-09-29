/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfom;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprlum
extends sprqqe {
    private final sprfom cfr_renamed_3;
    private final sprszm cfr_renamed_4;

    public sprddm cfr_renamed_89() {
        return sprddm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(1));
    }

    public static sprlum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlum) {
            return (sprlum)arg0;
        }
        if (arg0 != null) {
            return new sprlum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprgbf cfr_renamed_79() {
        return sprgbf.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(2));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlum(sprszm sprszm2) {
        void arg0;
        sprlum sprlum2 = this;
        sprlum2.cfr_renamed_4 = arg0;
        sprlum2.cfr_renamed_3 = sprfom.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
    }

    public sprfom cfr_renamed_1622() {
        return this.cfr_renamed_3;
    }
}

