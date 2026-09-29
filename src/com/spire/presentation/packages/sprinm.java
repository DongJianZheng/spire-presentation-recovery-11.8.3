/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhmy;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprinm
extends sprqqe {
    public sproug cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public BigInteger cfr_renamed_1478() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprinm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sproug)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprktm)arg0.cfr_renamed_85(1);
    }

    public static sprinm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprinm) {
            return (sprinm)arg0;
        }
        if (arg0 != null) {
            return new sprinm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprinm(byte[] byArray, int n) {
        void arg1;
        void arg0;
        if (byArray.length != 8) {
            throw new IllegalArgumentException(sprhmy.cfr_renamed_9("J>U+\u00193\\1^+Q\u007fT*J+\u0019=\\\u007f\u0001"));
        }
        sprinm sprinm2 = this;
        sprinm2.cfr_renamed_3 = new sprfvg((byte[])arg0);
        sprinm sprinm3 = this;
        sprinm2.cfr_renamed_4 = new sprktm((long)arg1);
    }

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }
}

