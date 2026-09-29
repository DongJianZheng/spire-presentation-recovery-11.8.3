/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkum;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprnlm
extends sprqqe {
    private sproug cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private sprkum cfr_renamed_2;
    private sprszm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnlm(sprkum sprkum2, sproug sproug2, sprddm sprddm2, sprszm sprszm2) {
        void arg2;
        void arg1;
        void arg0;
        sprnlm sprnlm2 = this;
        sprnlm sprnlm3 = this;
        sprnlm sprnlm4 = this;
        sprnlm4.cfr_renamed_4 = new sprktm(3L);
        sprnlm3.cfr_renamed_2 = arg0;
        sprnlm3.cfr_renamed_0 = arg1;
        sprnlm2.cfr_renamed_1 = arg2;
        sprnlm2.cfr_renamed_3 = sprszm2;
    }

    public sprddm cfr_renamed_4000() {
        return this.cfr_renamed_1;
    }

    public sprkum cfr_renamed_4031() {
        return this.cfr_renamed_2;
    }

    public static sprnlm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprnlm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprszm cfr_renamed_4027() {
        return this.cfr_renamed_3;
    }

    public static sprnlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnlm) {
            return (sprnlm)arg0;
        }
        if (arg0 != null) {
            return new sprnlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_4032() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnlm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        this.cfr_renamed_4 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(++n);
        this.cfr_renamed_2 = sprkum.cfr_renamed_5085(sprnvm2, true);
        if (arg0.cfr_renamed_85(++n) instanceof sprnvm) {
            sprnvm sprnvm3 = (sprnvm)arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_0 = sproug.cfr_renamed_5085(sprnvm3, true);
        }
        sprnlm sprnlm2 = this;
        void v3 = arg0;
        sprnlm2.cfr_renamed_1 = sprddm.cfr_renamed_23(v3.cfr_renamed_85(n));
        sprnlm2.cfr_renamed_3 = (sprszm)v3.cfr_renamed_85(++n);
        ++n;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprnlm sprnlm2 = this;
        sprrvm2.cfr_renamed_5004(sprnlm2.cfr_renamed_4);
        sprrvm sprrvm3 = sprrvm2;
        sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_2));
        if (sprnlm2.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_0));
        }
        sprrvm sprrvm4 = sprrvm2;
        sprnlm sprnlm3 = this;
        sprrvm4.cfr_renamed_5004(sprnlm3.cfr_renamed_1);
        sprrvm4.cfr_renamed_5004(sprnlm3.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }
}

