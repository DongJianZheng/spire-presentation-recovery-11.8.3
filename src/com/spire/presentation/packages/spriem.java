/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class spriem
extends sprqqe {
    private sproug cfr_renamed_3;
    private sprlem cfr_renamed_4;

    private /* synthetic */ spriem(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = (sprlem)enumeration.nextElement();
        this.cfr_renamed_3 = (sproug)enumeration.nextElement();
    }

    public sprlem cfr_renamed_593() {
        return this.cfr_renamed_4;
    }

    public static spriem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriem) {
            return (spriem)arg0;
        }
        if (arg0 != null) {
            return new spriem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_3374() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public spriem(sprlem sprlem2, sproug sproug2) {
        void arg0;
        spriem spriem2 = this;
        spriem2.cfr_renamed_4 = arg0;
        spriem2.cfr_renamed_3 = sproug2;
    }
}

