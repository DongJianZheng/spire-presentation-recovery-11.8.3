/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprvkm
extends sprqqe {
    public sproug cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public int cfr_renamed_4644() {
        return this.cfr_renamed_4.cfr_renamed_5023();
    }

    public sproug cfr_renamed_4645() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvkm(int n, sproug sproug2) {
        void arg0;
        sprvkm sprvkm2 = this;
        this.cfr_renamed_4 = new sprktm((long)arg0);
        this.cfr_renamed_3 = sproug2;
    }

    private /* synthetic */ sprvkm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sproug.cfr_renamed_23(enumeration.nextElement());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprvkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvkm) {
            return (sprvkm)arg0;
        }
        if (arg0 != null) {
            return new sprvkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

