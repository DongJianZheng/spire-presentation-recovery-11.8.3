/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprskm
extends sprqqe {
    private final sprco cfr_renamed_2;
    private final sprybn cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    public sprybn cfr_renamed_11361() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprskm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprfvca.cfr_renamed_9("D<N=_ H1Yr^7\\'H<N7\r!D(H"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprybn.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_2 = v0.cfr_renamed_85(2);
    }

    public static sprskm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprskm) {
            return (sprskm)arg0;
        }
        if (arg0 != null) {
            return new sprskm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprskm sprskm2 = this;
        sprrvm2.cfr_renamed_5004(sprskm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprskm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public static sprskm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprskm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprlem cfr_renamed_11388() {
        return this.cfr_renamed_4;
    }

    public sprco cfr_renamed_11389() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprskm(sprybn sprybn2, sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        sprskm sprskm2 = this;
        this.cfr_renamed_3 = arg0;
        sprskm2.cfr_renamed_4 = arg1;
        sprskm2.cfr_renamed_2 = sprco2;
    }
}

