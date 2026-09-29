/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprbdn;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkxm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Date;

public class spraym
extends sprqqe {
    private final sprbdn cfr_renamed_91;
    private final BigInteger cfr_renamed_0;
    private final sprjfn cfr_renamed_1;
    private final String cfr_renamed_2;
    private final sprjfn cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        spraym spraym2 = this;
        sprrvm sprrvm3 = sprrvm2;
        spraym spraym3 = this;
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_0));
        sprrvm2.cfr_renamed_5004(spraym3.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(spraym3.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(spraym2.cfr_renamed_91);
        if (spraym2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new spraen(this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }

    public sprjfn cfr_renamed_9310() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraym(sprszm sprszm2) {
        void arg0;
        spraym spraym2 = this;
        void v1 = arg0;
        spraym spraym3 = this;
        void v3 = arg0;
        this.cfr_renamed_0 = sprktm.cfr_renamed_23(v3.cfr_renamed_85(0)).cfr_renamed_97();
        spraym3.cfr_renamed_4 = sprddm.cfr_renamed_23(v3.cfr_renamed_85(1));
        spraym3.cfr_renamed_1 = sprjfn.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_3 = sprjfn.cfr_renamed_23(v1.cfr_renamed_85(3));
        spraym2.cfr_renamed_91 = sprbdn.cfr_renamed_23(v1.cfr_renamed_85(4));
        spraym2.cfr_renamed_2 = sprszm2.cfr_renamed_84() == 6 ? sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(5)).cfr_renamed_314() : null;
    }

    /*
     * WARNING - void declaration
     */
    public spraym(sprddm sprddm2, Date date, Date date2, sprbdn sprbdn2, String string) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spraym spraym2 = this;
        spraym spraym3 = this;
        spraym3.cfr_renamed_0 = BigInteger.valueOf(1L);
        spraym3.cfr_renamed_4 = arg0;
        spraym spraym4 = this;
        spraym3.cfr_renamed_1 = new sprkxm((Date)arg1);
        spraym4.cfr_renamed_3 = new sprkxm((Date)arg2);
        spraym2.cfr_renamed_91 = arg3;
        spraym2.cfr_renamed_2 = string;
    }

    public sprbdn cfr_renamed_9312() {
        return this.cfr_renamed_91;
    }

    public static spraym cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraym) {
            return (spraym)arg0;
        }
        if (arg0 != null) {
            return new spraym(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_9311() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_3() {
        return this.cfr_renamed_0;
    }

    public String cfr_renamed_11363() {
        return this.cfr_renamed_2;
    }

    public sprjfn cfr_renamed_9300() {
        return this.cfr_renamed_3;
    }
}

