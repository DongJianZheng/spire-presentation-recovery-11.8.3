/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spriem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprtam
extends sprqqe {
    private sproug cfr_renamed_2;
    private sproug cfr_renamed_3;
    private spriem cfr_renamed_4;

    public static sprtam cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtam) {
            return (sprtam)arg0;
        }
        if (arg0 != null) {
            return new sprtam(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_4441() {
        return this.cfr_renamed_2;
    }

    public sproug cfr_renamed_4439() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprtam(spriem spriem2, sproug sproug2, sproug sproug3) {
        void arg1;
        void arg0;
        sprtam sprtam2 = this;
        this.cfr_renamed_4 = arg0;
        sprtam2.cfr_renamed_3 = arg1;
        sprtam2.cfr_renamed_2 = sproug3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprtam sprtam2 = this;
        sprrvm2.cfr_renamed_5004(sprtam2.cfr_renamed_4);
        if (sprtam2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(new sprycn(2, this.cfr_renamed_2));
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprtam(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = spriem.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = (sprnvm)enumeration.nextElement();
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = (sproug)sprnvm2.cfr_renamed_8225();
                continue;
            }
            if (sprnvm2.cfr_renamed_312() != 2) continue;
            this.cfr_renamed_2 = (sproug)sprnvm2.cfr_renamed_8225();
        }
    }

    public spriem cfr_renamed_4440() {
        return this.cfr_renamed_4;
    }
}

