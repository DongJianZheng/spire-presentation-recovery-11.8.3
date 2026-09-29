/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxno;

public class sprnum
extends sprqqe {
    private sprddm cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnum(sprlem sprlem2, sprddm sprddm2, sproug sproug2) {
        void arg1;
        void arg0;
        sprnum sprnum2 = this;
        this.cfr_renamed_3 = arg0;
        sprnum2.cfr_renamed_2 = arg1;
        sprnum2.cfr_renamed_4 = sproug2;
    }

    public sprddm cfr_renamed_4173() {
        return this.cfr_renamed_2;
    }

    public static sprnum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnum) {
            return (sprnum)arg0;
        }
        if (arg0 != null) {
            return new sprnum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_4178() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnum(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 2) {
            throw new IllegalArgumentException(sprxno.cfr_renamed_9("z\u0013[\u000fM\u0000Z\u0004JA}\u0004_\u0014K\u000fM\u0004\u000e'A\u0014@\u0005"));
        }
        this.cfr_renamed_3 = (sprlem)arg0.cfr_renamed_85(0);
        void v0 = arg0;
        this.cfr_renamed_2 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (v0.cfr_renamed_84() > 2) {
            this.cfr_renamed_4 = sproug.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(2), false);
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprnum sprnum2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprnum2.cfr_renamed_2);
        if (sprnum2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprkdn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprqcn(sprrvm2);
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_3;
    }
}

