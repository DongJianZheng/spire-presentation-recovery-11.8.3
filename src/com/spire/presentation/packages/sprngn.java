/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjy;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkwm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.math.BigInteger;

public class sprngn
extends sprqqe {
    private final sprddm cfr_renamed_1;
    private final sprkwm cfr_renamed_2;
    private static final sprktm cfr_renamed_3 = new sprktm(0L);
    private final sprgbf cfr_renamed_4;

    public sprxgf cfr_renamed_1227() throws IOException {
        return sprxgf.cfr_renamed_184(this.cfr_renamed_321().cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprngn(sprnbm sprnbm2, sprddm sprddm2, sprgbf sprgbf2, spridn spridn2, sprddm sprddm3, sprgbf sprgbf3) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprngn sprngn2 = this;
        sprngn sprngn3 = this;
        sprngn3.cfr_renamed_2 = new sprkwm((sprnbm)arg0, (sprddm)arg1, (sprgbf)arg2, (spridn)arg3, null);
        sprngn2.cfr_renamed_1 = arg4;
        sprngn2.cfr_renamed_4 = sprgbf3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprngn sprngn2 = this;
        sprrvm2.cfr_renamed_5004(sprngn2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprngn2.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprnbm cfr_renamed_1485() {
        return sprkwm.cfr_renamed_11418(this.cfr_renamed_2);
    }

    public BigInteger cfr_renamed_3() {
        return sprkwm.cfr_renamed_11419(this.cfr_renamed_2).cfr_renamed_97();
    }

    public static /* synthetic */ sprktm cfr_renamed_11420() {
        return cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprngn(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprbjy.cfr_renamed_9("$T.U?H(Y9\u001a>_<O(T._mI$@("));
        }
        void v0 = arg0;
        this.cfr_renamed_2 = new sprkwm(sprszm.cfr_renamed_23(arg0.cfr_renamed_85(0)), null);
        this.cfr_renamed_1 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprgbf.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public sprgbf cfr_renamed_321() {
        return sprgbf.cfr_renamed_23(sprkwm.cfr_renamed_11421(this.cfr_renamed_2).cfr_renamed_85(1));
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_1;
    }

    public static sprngn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprngn) {
            return (sprngn)arg0;
        }
        if (arg0 != null) {
            return new sprngn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    public sprddm cfr_renamed_11422() {
        return sprddm.cfr_renamed_23(sprkwm.cfr_renamed_11421(this.cfr_renamed_2).cfr_renamed_85(0));
    }

    public spridn cfr_renamed_82() {
        return sprkwm.cfr_renamed_11423(this.cfr_renamed_2);
    }
}

