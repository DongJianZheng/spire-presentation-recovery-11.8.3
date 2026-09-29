/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprevc;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprvvm
extends sprqqe {
    private final sprsvm cfr_renamed_2;
    private final sprlem cfr_renamed_3;
    private final sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvvm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprevc.cfr_renamed_9("\u0003f\tg\u0018z\u000fk\u001e(\u0019m\u001b}\u000ff\tmJ{\u0003r\u000f"));
        }
        void v0 = arg0;
        this.cfr_renamed_2 = sprsvm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_4 = v0.cfr_renamed_85(2);
    }

    public sprsvm cfr_renamed_11405() {
        return this.cfr_renamed_2;
    }

    public sprco cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    public static sprvvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvvm) {
            return (sprvvm)arg0;
        }
        if (arg0 != null) {
            return new sprvvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvvm(sprsvm sprsvm2, sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        sprvvm sprvvm2 = this;
        this.cfr_renamed_2 = arg0;
        sprvvm2.cfr_renamed_3 = arg1;
        sprvvm2.cfr_renamed_4 = sprco2;
    }

    public sprlem cfr_renamed_4028() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprvvm sprvvm2 = this;
        sprrvm2.cfr_renamed_5004(sprvvm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprvvm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}

