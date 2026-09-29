/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprcpm
extends sprqqe {
    public BigInteger cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(1L);
    public byte[] cfr_renamed_3;
    public sprdim cfr_renamed_4;

    public BigInteger cfr_renamed_1478() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_1477() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprcpm(sprdim sprdim2, byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprcpm sprcpm2 = this;
        this.cfr_renamed_4 = arg0;
        sprcpm2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg1);
        sprcpm2.cfr_renamed_1 = BigInteger.valueOf(n);
    }

    private /* synthetic */ sprcpm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sprdim.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_186());
        if (sprszm2.cfr_renamed_84() == 3) {
            this.cfr_renamed_1 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(2)).cfr_renamed_97();
            return;
        }
        this.cfr_renamed_1 = cfr_renamed_2;
    }

    public sprdim cfr_renamed_1472() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprcpm sprcpm2 = this;
        sprrvm2.cfr_renamed_5004(sprcpm2.cfr_renamed_4);
        sprrvm sprrvm3 = sprrvm2;
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        if (!sprcpm2.cfr_renamed_1.equals(cfr_renamed_2)) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }

    public static sprcpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcpm) {
            return (sprcpm)arg0;
        }
        if (arg0 != null) {
            return new sprcpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

