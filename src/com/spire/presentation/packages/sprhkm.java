/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtmn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprywj;

public class sprhkm
extends sprqqe {
    private sprddm cfr_renamed_91;
    private sprddm cfr_renamed_0;
    private sprgbf cfr_renamed_1;
    private sprgbf cfr_renamed_2;
    private sproug cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public static sprhkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhkm) {
            return (sprhkm)arg0;
        }
        if (arg0 != null) {
            return new sprhkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprhkm(sprszm sprszm2) {
        sprszm sprszm3 = sprszm2;
        int n = 0;
        while (true) {
            void arg0;
            if (!(sprszm3.cfr_renamed_85(n) instanceof sprnvm)) {
                this.cfr_renamed_1 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(n));
                return;
            }
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_4 = sprddm.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_91 = sprddm.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_2 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 3: {
                    this.cfr_renamed_0 = sprddm.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 4: {
                    this.cfr_renamed_3 = sproug.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprywj.cfr_renamed_9("?r\u0001r\u0005k\u0004<\u001e}\r<\u000fr\ts\u001fr\u001ey\u0018y\u000e&J")).append(sprnvm2.cfr_renamed_312()).toString());
                }
            }
            ++n;
            sprszm3 = arg0;
        }
    }

    public sprgbf cfr_renamed_4360() {
        return this.cfr_renamed_2;
    }

    public sprgbf cfr_renamed_4361() {
        return this.cfr_renamed_1;
    }

    public sproug cfr_renamed_4357() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_11316(sprrvm arg0, int arg1, sprco arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_5004(new sprycn(false, arg1, arg2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhkm(sprddm sprddm2, sprddm sprddm3, sprgbf sprgbf2, sprddm sprddm4, sproug sproug2, sprgbf sprgbf3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        if (sprgbf3 == null) {
            throw new IllegalArgumentException(sprtmn.cfr_renamed_9("ma$g\u001ce&q/#jg+j$k>$(ajj?h&"));
        }
        sprhkm sprhkm2 = this;
        sprhkm sprhkm3 = this;
        this.cfr_renamed_4 = arg0;
        sprhkm3.cfr_renamed_91 = arg1;
        sprhkm3.cfr_renamed_2 = arg2;
        sprhkm2.cfr_renamed_0 = arg3;
        sprhkm2.cfr_renamed_3 = arg4;
        this.cfr_renamed_1 = arg5;
    }

    public sprddm cfr_renamed_4358() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprhkm sprhkm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprhkm sprhkm3 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprhkm sprhkm4 = this;
        sprhkm4.cfr_renamed_11316(sprrvm2, 0, sprhkm4.cfr_renamed_4);
        this.cfr_renamed_11316(sprrvm4, 1, this.cfr_renamed_91);
        sprhkm3.cfr_renamed_11316(sprrvm4, 2, this.cfr_renamed_2);
        sprhkm3.cfr_renamed_11316(sprrvm2, 3, this.cfr_renamed_0);
        sprhkm2.cfr_renamed_11316(sprrvm3, 4, this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprhkm2.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_4356() {
        return this.cfr_renamed_4;
    }

    public sprddm cfr_renamed_4359() {
        return this.cfr_renamed_91;
    }
}

