/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvzaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprpnm
extends sprqqe {
    private spridn cfr_renamed_3;
    private spridn cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpnm(spridn spridn2, spridn spridn3) {
        void arg0;
        sprpnm sprpnm2 = this;
        sprpnm2.cfr_renamed_3 = arg0;
        sprpnm2.cfr_renamed_4 = spridn3;
    }

    public static sprpnm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprpnm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public spridn cfr_renamed_633() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public spridn cfr_renamed_617() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprpnm(sprszm sprszm2) {
        switch (sprszm2.cfr_renamed_84()) {
            case 0: {
                return;
            }
            case 1: {
                void arg0;
                sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(0);
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_3 = spridn.cfr_renamed_5085(sprnvm2, false);
                        return;
                    }
                    case 1: {
                        this.cfr_renamed_4 = spridn.cfr_renamed_5085(sprnvm2, false);
                        return;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprvzaa.cfr_renamed_9("w{Q:A{R:\\t\u0015UGsRs[{AuGS[|Z \u0015")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            case 2: {
                void arg0;
                this.cfr_renamed_3 = spridn.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(0), false);
                this.cfr_renamed_4 = spridn.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), false);
                return;
            }
        }
        throw new IllegalArgumentException(sprmvo.cfr_renamed_9("`sFfFoNu@sfoIn\u000fu@n\u000fcFf"));
    }

    public static sprpnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpnm) {
            return (sprpnm)arg0;
        }
        if (arg0 != null) {
            return new sprpnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

