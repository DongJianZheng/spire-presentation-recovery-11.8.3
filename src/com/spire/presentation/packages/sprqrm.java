/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprqrm
extends sprqqe {
    public sproug cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public static sprqrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqrm) {
            return (sprqrm)arg0;
        }
        if (arg0 != null) {
            return new sprqrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprqrm(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprqrm sprqrm2 = this;
        this.cfr_renamed_3 = new sprfvg((byte[])arg0);
        sprqrm2.cfr_renamed_4 = new sprktm((long)arg1);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    public BigInteger cfr_renamed_1490() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqrm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sproug)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }
}

