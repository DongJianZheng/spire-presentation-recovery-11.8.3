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

public class sprfkm
extends sprqqe {
    public sproug cfr_renamed_3;
    public sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfkm(byte[] byArray) {
        void arg0;
        this.cfr_renamed_4 = null;
        sprfkm sprfkm2 = this;
        this.cfr_renamed_3 = new sprfvg((byte[])arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprfkm(int n, byte[] byArray) {
        void arg1;
        void arg0;
        sprfkm sprfkm2 = this;
        this.cfr_renamed_4 = new sprktm((long)arg0);
        sprfkm2.cfr_renamed_3 = new sprfvg((byte[])arg1);
    }

    public BigInteger cfr_renamed_4211() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public static sprfkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfkm) {
            return (sprfkm)arg0;
        }
        if (arg0 != null) {
            return new sprfkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfkm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() == 1) {
            sprfkm sprfkm2 = this;
            sprfkm2.cfr_renamed_4 = null;
            sprfkm2.cfr_renamed_3 = (sproug)arg0.cfr_renamed_85(0);
            return;
        }
        this.cfr_renamed_4 = (sprktm)arg0.cfr_renamed_85(0);
        this.cfr_renamed_3 = (sproug)arg0.cfr_renamed_85(1);
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }
}

