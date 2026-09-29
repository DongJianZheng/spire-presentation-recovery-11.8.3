/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprurr;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprfrm
extends sprqqe {
    private sprigm cfr_renamed_2;
    private sprqtm cfr_renamed_3;
    private sprvhm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfrm(sprigm sprigm2, sprvhm sprvhm2) {
        void arg0;
        sprfrm sprfrm2 = this;
        sprfrm2.cfr_renamed_2 = arg0;
        sprfrm2.cfr_renamed_4 = sprvhm2;
    }

    public sprvhm cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = new sprrvm(2);
        if (this.cfr_renamed_2 != null) {
            sprrvm sprrvm4 = sprrvm3;
            sprrvm2 = sprrvm4;
            sprrvm4.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        } else {
            sprrvm sprrvm5 = sprrvm3;
            sprrvm2 = sprrvm5;
            sprrvm5.cfr_renamed_5004(this.cfr_renamed_3);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm3);
    }

    public sprqtm cfr_renamed_4382() {
        return this.cfr_renamed_3;
    }

    public sprigm cfr_renamed_4381() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfrm(sprqtm sprqtm2, sprvhm sprvhm2) {
        void arg0;
        sprfrm sprfrm2 = this;
        sprfrm2.cfr_renamed_3 = arg0;
        sprfrm2.cfr_renamed_4 = sprvhm2;
    }

    public static sprfrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfrm) {
            return (sprfrm)arg0;
        }
        if (arg0 != null) {
            return new sprfrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfrm(sprszm sprszm2) {
        void arg0;
        sprfrm sprfrm2;
        sprco sprco2 = sprszm2.cfr_renamed_85(0);
        if (sprco2 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(sprco2, 128);
            if (sprnvm2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprurr.cfr_renamed_9("ZUdU`La\u001bnN{SFUiT/On\\5\u001b")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            sprfrm2 = this;
            this.cfr_renamed_2 = sprigm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
        } else {
            sprfrm2 = this;
            this.cfr_renamed_3 = sprqtm.cfr_renamed_23(sprco2);
        }
        sprfrm2.cfr_renamed_4 = sprvhm.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }
}

