/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprmzl
extends sprqqe {
    private sproug cfr_renamed_1;
    private sprupm cfr_renamed_2;
    private sprcem cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public sproug cfr_renamed_4500() {
        return this.cfr_renamed_1;
    }

    public static sprmzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmzl) {
            return (sprmzl)arg0;
        }
        if (arg0 != null) {
            return new sprmzl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmzl(sprcem sprcem2, sprddm sprddm2, sproug sproug2, sprupm sprupm2) {
        void arg2;
        void arg1;
        void arg0;
        sprmzl sprmzl2 = this;
        sprmzl sprmzl3 = this;
        sprmzl3.cfr_renamed_3 = arg0;
        sprmzl3.cfr_renamed_4 = arg1;
        sprmzl2.cfr_renamed_1 = arg2;
        sprmzl2.cfr_renamed_2 = sprupm2;
    }

    public sprcem cfr_renamed_4499() {
        return this.cfr_renamed_3;
    }

    public sprupm cfr_renamed_11138() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmzl(sprcem sprcem2, sprddm sprddm2, sproug sproug2) {
        void arg2;
        void arg1;
        void arg0;
        sprmzl sprmzl2 = this;
        sprmzl sprmzl3 = this;
        sprmzl3.cfr_renamed_3 = arg0;
        sprmzl3.cfr_renamed_4 = arg1;
        sprmzl2.cfr_renamed_1 = arg2;
        sprmzl2.cfr_renamed_2 = null;
    }

    private /* synthetic */ sprmzl(sprszm arg0) {
        sprmzl sprmzl2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprmzl2.cfr_renamed_3 = sprcem.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(enumeration.nextElement());
        sprmzl2.cfr_renamed_1 = sproug.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_2 = sprupm.cfr_renamed_23(enumeration.nextElement());
        }
    }

    public sprnrm cfr_renamed_4498() {
        if (null == this.cfr_renamed_2 || this.cfr_renamed_2 instanceof sprnrm) {
            return (sprnrm)this.cfr_renamed_2;
        }
        return new sprnrm(this.cfr_renamed_2.cfr_renamed_314(), false);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprmzl sprmzl2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprmzl2.cfr_renamed_1);
        if (sprmzl2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_4;
    }
}

