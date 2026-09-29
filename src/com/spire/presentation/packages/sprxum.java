/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprxum
extends sprqqe {
    private sprlem cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public static sprxum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprxum.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprxum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxum) {
            return (sprxum)arg0;
        }
        if (arg0 != null) {
            return new sprxum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprxum sprxum2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprxum2.cfr_renamed_3);
        if (sprxum2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprlem cfr_renamed_2106() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxum(sprlem sprlem2, sprlem sprlem3, sprlem sprlem4) {
        void arg1;
        void arg0;
        sprxum sprxum2 = this;
        this.cfr_renamed_2 = arg0;
        sprxum2.cfr_renamed_3 = arg1;
        sprxum2.cfr_renamed_4 = sprlem4;
    }

    public sprlem cfr_renamed_2105() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxum(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_2 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_3 = (sprlem)arg0.cfr_renamed_85(1);
        if (arg0.cfr_renamed_84() > 2) {
            this.cfr_renamed_4 = (sprlem)arg0.cfr_renamed_85(2);
        }
    }

    public sprlem cfr_renamed_2107() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprxum(sprlem sprlem2, sprlem sprlem3) {
        void arg1;
        void arg0;
        sprxum sprxum2 = this;
        this.cfr_renamed_2 = arg0;
        sprxum2.cfr_renamed_3 = arg1;
        sprxum2.cfr_renamed_4 = null;
    }
}

