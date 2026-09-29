/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxmm;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprypm;
import java.util.Enumeration;

public class sprium
extends sprqqe {
    private sprxmm cfr_renamed_119;
    private sproug cfr_renamed_91;
    private spridn cfr_renamed_0;
    private spridn cfr_renamed_1;
    private sprddm cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public spridn cfr_renamed_3973() {
        return this.cfr_renamed_1;
    }

    public sprxmm cfr_renamed_634() {
        return this.cfr_renamed_119;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprium(sprxmm sprxmm2, sprddm sprddm2, spridn spridn2, sprddm sprddm3, sproug sproug2, spridn spridn3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprium sprium2;
        if (sprxmm2.cfr_renamed_3972()) {
            sprium2 = this;
            this.cfr_renamed_4 = new sprktm(3L);
        } else {
            sprium2 = this;
            this.cfr_renamed_4 = new sprktm(1L);
        }
        sprium2.cfr_renamed_119 = arg0;
        sprium sprium3 = this;
        sprium sprium4 = this;
        this.cfr_renamed_3 = arg1;
        sprium4.cfr_renamed_0 = arg2;
        sprium4.cfr_renamed_2 = arg3;
        sprium3.cfr_renamed_91 = arg4;
        sprium3.cfr_renamed_1 = arg5;
    }

    public sprddm cfr_renamed_3970() {
        return this.cfr_renamed_2;
    }

    public spridn cfr_renamed_3969() {
        return this.cfr_renamed_0;
    }

    public sproug cfr_renamed_3971() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ sprium(sprszm sprszm2) {
        sprium sprium2;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = (sprktm)enumeration.nextElement();
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_119 = sprxmm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration2.nextElement());
        Object e = enumeration2.nextElement();
        if (e instanceof sprnvm) {
            this.cfr_renamed_0 = spridn.cfr_renamed_5085((sprnvm)e, false);
            sprium2 = this;
            this.cfr_renamed_2 = sprddm.cfr_renamed_23(enumeration.nextElement());
        } else {
            sprium2 = this;
            sprium sprium3 = this;
            sprium3.cfr_renamed_0 = null;
            sprium3.cfr_renamed_2 = sprddm.cfr_renamed_23(e);
        }
        sprium2.cfr_renamed_91 = sprfvg.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_1 = spridn.cfr_renamed_5085((sprnvm)enumeration.nextElement(), false);
            return;
        }
        this.cfr_renamed_1 = null;
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprium(sprxmm sprxmm2, sprddm sprddm2, sprypm sprypm2, sprddm sprddm3, sproug sproug2, sprypm sprypm3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprium sprium2;
        if (sprxmm2.cfr_renamed_3972()) {
            sprium2 = this;
            this.cfr_renamed_4 = new sprktm(3L);
        } else {
            sprium2 = this;
            this.cfr_renamed_4 = new sprktm(1L);
        }
        sprium2.cfr_renamed_119 = arg0;
        sprium sprium3 = this;
        sprium sprium4 = this;
        this.cfr_renamed_3 = arg1;
        sprium4.cfr_renamed_0 = spridn.cfr_renamed_23(arg2);
        sprium4.cfr_renamed_2 = arg3;
        sprium3.cfr_renamed_91 = arg4;
        sprium3.cfr_renamed_1 = spridn.cfr_renamed_23(arg5);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(7);
        sprium sprium2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_119);
        sprrvm2.cfr_renamed_5004(sprium2.cfr_renamed_3);
        if (sprium2.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_0));
        }
        sprrvm sprrvm4 = sprrvm2;
        sprium sprium3 = this;
        sprrvm4.cfr_renamed_5004(sprium3.cfr_renamed_2);
        sprrvm4.cfr_renamed_5004(sprium3.cfr_renamed_91);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }

    public static sprium cfr_renamed_23(Object arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprium) {
            return (sprium)arg0;
        }
        if (arg0 != null) {
            return new sprium(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

