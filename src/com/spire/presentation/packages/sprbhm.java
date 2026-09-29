/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprkgka;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class sprbhm
extends sprqqe {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public static sprbhm cfr_renamed_5322(sprhgm arg0) {
        return sprbhm.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_82));
    }

    public static sprbhm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbhm) {
            return (sprbhm)arg0;
        }
        if (arg0 != null) {
            return new sprbhm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbhm(sprszm sprszm2) {
        void arg0;
        int n;
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = sprktm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_97();
            } else if (sprnvm2.cfr_renamed_312() == 1) {
                this.cfr_renamed_4 = sprktm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_97();
            } else {
                throw new IllegalArgumentException(sprkgka.cfr_renamed_9("'\u001b\u0019\u001b\u001d\u0002\u001cU\u0006\u0014\u0015U\u0017\u001b\u0011\u001a\u0007\u001b\u0006\u0010\u0000\u0010\u0016["));
            }
            n2 = ++n;
        }
    }

    public BigInteger cfr_renamed_4259() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_4258() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbhm(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprbhm sprbhm2 = this;
        sprbhm2.cfr_renamed_3 = arg0;
        sprbhm2.cfr_renamed_4 = bigInteger2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprktm(this.cfr_renamed_3)));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)new sprktm(this.cfr_renamed_4)));
        }
        return new sprcen(sprrvm2);
    }
}

