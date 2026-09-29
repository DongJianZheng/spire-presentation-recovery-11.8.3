/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtgba;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprejm
extends sprqqe {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public static sprejm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprejm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_3;
    }

    public static sprejm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprejm) {
            return (sprejm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprejm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprudz.cfr_renamed_9("DI{FaNi\u0007_TlwxEaNnlh^^S\u007fRnSxUh\u001d-")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprejm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtgba.cfr_renamed_9("~ XaO$M4Y/_$\u001c2U;Y{\u001c")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprejm sprejm2 = this;
        sprejm2.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
        sprejm2.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
    }

    /*
     * WARNING - void declaration
     */
    public sprejm(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprejm sprejm2 = this;
        sprejm2.cfr_renamed_3 = arg0;
        sprejm2.cfr_renamed_4 = bigInteger2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2295()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2296()));
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_4;
    }
}

