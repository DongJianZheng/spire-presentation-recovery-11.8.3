/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqy;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprfvm
extends sprqqe {
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprfvm(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg0;
        sprfvm sprfvm2 = this;
        sprfvm2.cfr_renamed_3 = arg0;
        sprfvm2.cfr_renamed_4 = bigInteger2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2295()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2296()));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfvm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spraqy.cfr_renamed_9("\u0011X7\u0019 \\\"L6W0\\sJ:C6\u0003s")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprfvm sprfvm2 = this;
        sprfvm2.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
        sprfvm2.cfr_renamed_4 = sprktm.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_162();
    }

    public static sprfvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfvm) {
            return (sprfvm)arg0;
        }
        if (arg0 != null) {
            return new sprfvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_4;
    }

    public static sprfvm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprfvm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

