/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxsm;
import com.spire.presentation.packages.sprycn;

public class sprzmm
extends sprqqe {
    private sprszm cfr_renamed_1;
    private sprdye cfr_renamed_2;
    private sprxsm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public static sprzmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzmm) {
            return (sprzmm)arg0;
        }
        if (arg0 != null) {
            return new sprzmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprszm cfr_renamed_626() {
        return this.cfr_renamed_1;
    }

    public sprdye cfr_renamed_79() {
        return this.cfr_renamed_2;
    }

    public sprxsm cfr_renamed_4315() {
        return this.cfr_renamed_3;
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzmm(sprxsm sprxsm2, sprddm sprddm2, sprdye sprdye2, sprszm sprszm2) {
        void arg2;
        void arg1;
        void arg0;
        sprzmm sprzmm2 = this;
        sprzmm sprzmm3 = this;
        sprzmm3.cfr_renamed_3 = arg0;
        sprzmm3.cfr_renamed_4 = arg1;
        sprzmm2.cfr_renamed_2 = arg2;
        sprzmm2.cfr_renamed_1 = sprszm2;
    }

    public static sprzmm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprzmm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzmm(sprszm sprszm2) {
        void arg0;
        sprzmm sprzmm2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = sprxsm.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprzmm2.cfr_renamed_4 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprzmm2.cfr_renamed_2 = (sprdye)sprszm2.cfr_renamed_85(2);
        if (arg0.cfr_renamed_84() > 3) {
            this.cfr_renamed_1 = sprszm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(3), true);
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprzmm sprzmm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprzmm2.cfr_renamed_2);
        if (sprzmm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }
}

