/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprrlm
extends sprqqe {
    private sprnbm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprgen cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrlm(sprnbm sprnbm2, sprgen sprgen2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprrlm sprrlm2 = this;
        sprrlm2.cfr_renamed_2 = arg0;
        sprrlm2.cfr_renamed_4 = arg1;
        if (null != arg2) {
            sprrlm sprrlm3 = this;
            sprrlm3.cfr_renamed_3 = new sprktm((BigInteger)arg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrlm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 2 || arg0.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException();
        }
        void v0 = arg0;
        this.cfr_renamed_2 = sprnbm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprgen.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() > 2) {
            this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public sprrlm(sprnbm arg0, sprgen arg1) {
        this(arg0, arg1, null);
    }

    public BigInteger cfr_renamed_4681() {
        if (null == this.cfr_renamed_3) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2.cfr_renamed_119());
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        if (null != this.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    public sprnbm cfr_renamed_4680() {
        return this.cfr_renamed_2;
    }

    public sprgen cfr_renamed_4679() {
        return this.cfr_renamed_4;
    }

    public static sprrlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrlm) {
            return (sprrlm)arg0;
        }
        if (arg0 != null) {
            return new sprrlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

