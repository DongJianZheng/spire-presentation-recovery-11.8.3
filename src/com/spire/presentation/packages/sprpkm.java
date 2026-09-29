/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprneca;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprpkm
extends sprqqe {
    private final sprigm cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    public sprigm cfr_renamed_403() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprpkm(sprigm sprigm2, BigInteger bigInteger) {
        void arg0;
        sprpkm sprpkm2 = this;
        sprpkm2.cfr_renamed_3 = arg0;
        sprpkm2.cfr_renamed_4 = bigInteger;
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpkm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprneca.cfr_renamed_9("u\u0003\u007f\u0002n\u001fy\u000ehMo\bm\u0018y\u0003\u007f\b<\u001eu\u0017y"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprigm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_97();
    }

    public static sprpkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpkm) {
            return (sprpkm)arg0;
        }
        if (arg0 != null) {
            return new sprpkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

