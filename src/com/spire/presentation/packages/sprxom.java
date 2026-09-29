/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxfaa;
import com.spire.presentation.packages.sprxgf;

public class sprxom
extends sprqqe {
    private sprpfn cfr_renamed_3;
    private sprpfn cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public String cfr_renamed_4639() {
        return this.cfr_renamed_3.cfr_renamed_314();
    }

    public String cfr_renamed_4640() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprxom(String string, String string2) {
        void arg1;
        void arg0;
        sprxom sprxom2 = this;
        this.cfr_renamed_3 = new sprldn((String)arg0);
        sprxom2.cfr_renamed_4 = new sprldn((String)arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxom(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprxfaa.cfr_renamed_9("\\d^tJoLd\u000fv]nAf\u000frF{J!In]!cE|WJs\\h@ofoIn"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprpfn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprpfn.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprxom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxom) {
            return (sprxom)arg0;
        }
        if (arg0 != null) {
            return new sprxom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

