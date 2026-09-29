/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproqda;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrjm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtgm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryjm;

public class sprmfm
extends sprqqe {
    private sprktm cfr_renamed_152;
    private sprhgm cfr_renamed_112;
    private sprtgm cfr_renamed_119;
    private sprktm cfr_renamed_91;
    private sprrjm cfr_renamed_0;
    private sprszm cfr_renamed_1;
    private sprgbf cfr_renamed_2;
    private spryjm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmfm(sprszm sprszm2) {
        int n;
        int n2;
        sprmfm sprmfm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 6 || arg0.cfr_renamed_84() > 9) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sproqda.cfr_renamed_9("A{g:p\u007froft`\u007f#ij`f #")).append(arg0.cfr_renamed_84()).toString());
        }
        if (arg0.cfr_renamed_85(0) instanceof sprktm) {
            sprmfm2 = this;
            this.cfr_renamed_91 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
            n2 = 1;
        } else {
            sprmfm2 = this;
            this.cfr_renamed_91 = new sprktm(0L);
            n2 = 0;
        }
        sprmfm2.cfr_renamed_3 = spryjm.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        int n3 = n2;
        sprmfm sprmfm3 = this;
        void v3 = arg0;
        int n4 = n2;
        this.cfr_renamed_119 = sprtgm.cfr_renamed_23(arg0.cfr_renamed_85(n4 + 1));
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v3.cfr_renamed_85(n4 + 2));
        sprmfm3.cfr_renamed_152 = sprktm.cfr_renamed_23(v3.cfr_renamed_85(n2 + 3));
        sprmfm3.cfr_renamed_0 = sprrjm.cfr_renamed_23(arg0.cfr_renamed_85(n2 + 4));
        this.cfr_renamed_1 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(n3 + 5));
        int n5 = n = n3 + 6;
        while (n5 < arg0.cfr_renamed_84()) {
            sprco sprco2 = arg0.cfr_renamed_85(n);
            if (sprco2 instanceof sprgbf) {
                this.cfr_renamed_2 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (sprco2 instanceof sprszm || sprco2 instanceof sprhgm) {
                this.cfr_renamed_112 = sprhgm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            }
            n5 = ++n;
        }
    }

    public sprgbf cfr_renamed_105() {
        return this.cfr_renamed_2;
    }

    public sprtgm cfr_renamed_102() {
        return this.cfr_renamed_119;
    }

    public sprszm cfr_renamed_82() {
        return this.cfr_renamed_1;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_112;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(9);
        if (!this.cfr_renamed_91.cfr_renamed_7241(0)) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        }
        sprrvm sprrvm3 = sprrvm2;
        sprmfm sprmfm2 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprmfm sprmfm3 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprmfm3.cfr_renamed_119);
        sprrvm4.cfr_renamed_5004(sprmfm3.cfr_renamed_4);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_152);
        sprrvm3.cfr_renamed_5004(sprmfm2.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(sprmfm2.cfr_renamed_1);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_112 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_112);
        }
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    public static sprmfm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprmfm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprrjm cfr_renamed_108() {
        return this.cfr_renamed_0;
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_152;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public static sprmfm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmfm) {
            return (sprmfm)arg0;
        }
        if (arg0 != null) {
            return new sprmfm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spryjm cfr_renamed_93() {
        return this.cfr_renamed_3;
    }
}

