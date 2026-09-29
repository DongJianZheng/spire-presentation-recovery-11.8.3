/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfrm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprghb;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spraqm
extends sprqqe {
    private sprfrm cfr_renamed_2;
    private sprgbf cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public static spraqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraqm) {
            return (spraqm)arg0;
        }
        if (arg0 != null) {
            return new spraqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_615() {
        return this.cfr_renamed_4;
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    public static spraqm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spraqm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprfrm cfr_renamed_4380() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        }
        sprrvm sprrvm3 = sprrvm2;
        spraqm spraqm2 = this;
        sprrvm3.cfr_renamed_5004(spraqm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(spraqm2.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraqm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0.cfr_renamed_85(n), 128);
            ++n;
            sprnvm sprnvm3 = sprnvm2;
            if (sprnvm2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprghb.cfr_renamed_9("V\u001dh\u001dl\u0004mSS<S<P\u001ad\u001dj\u001dd8f\nJ\u001ds\u0006wSw\u0012dI#")).append(sprnvm3.cfr_renamed_312()).toString());
            }
            this.cfr_renamed_2 = sprfrm.cfr_renamed_23(sprnvm3.cfr_renamed_10766(false, 16));
        }
        spraqm spraqm2 = this;
        void v2 = arg0;
        spraqm2.cfr_renamed_4 = sprddm.cfr_renamed_23(v2.cfr_renamed_85(n));
        spraqm2.cfr_renamed_3 = sprgbf.cfr_renamed_23(v2.cfr_renamed_85(++n));
    }

    /*
     * WARNING - void declaration
     */
    public spraqm(sprfrm sprfrm2, sprddm sprddm2, sprgbf sprgbf2) {
        void arg1;
        void arg0;
        spraqm spraqm2 = this;
        this.cfr_renamed_2 = arg0;
        spraqm2.cfr_renamed_4 = arg1;
        spraqm2.cfr_renamed_3 = sprgbf2;
    }
}

