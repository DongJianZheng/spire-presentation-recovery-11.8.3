/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprauq;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxgf;

public class sprrhm
extends sprqqe {
    public static final sprlem cfr_renamed_93;
    public static final sprlem cfr_renamed_86;
    public static final sprlem cfr_renamed_152;
    public static final sprlem cfr_renamed_112;
    public static final sprlem cfr_renamed_119;
    private sprco cfr_renamed_91;
    private sprlem cfr_renamed_0;
    public static final sprlem cfr_renamed_1;
    public static final sprlem cfr_renamed_2;
    public static final sprlem cfr_renamed_3;
    public static final sprlem cfr_renamed_4;

    public sprlem cfr_renamed_4590() {
        return this.cfr_renamed_0;
    }

    public static sprrhm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrhm) {
            return (sprrhm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprrhm((sprszm)arg0);
        }
        throw new IllegalArgumentException(sprauq.cfr_renamed_9("\u0004u;z!r);\u001eV\u0004V\bX,k,y$w$o4"));
    }

    /*
     * WARNING - void declaration
     */
    public sprrhm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_0 = (sprlem)sprszm2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_91 = (sprxgf)arg0.cfr_renamed_85(1);
        }
    }

    static {
        cfr_renamed_1 = sprdl.cfr_renamed_88;
        cfr_renamed_4 = sprdl.cfr_renamed_1513;
        cfr_renamed_152 = sprdl.cfr_renamed_2855;
        cfr_renamed_86 = new sprlem("1.3.14.3.2.7");
        cfr_renamed_3 = sprdl.cfr_renamed_2797;
        cfr_renamed_112 = sprdl.cfr_renamed_1479;
        cfr_renamed_2 = sprwr.cfr_renamed_88;
        cfr_renamed_93 = sprwr.cfr_renamed_1223;
        cfr_renamed_119 = sprwr.cfr_renamed_724;
    }

    public sprco cfr_renamed_284() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrhm sprrhm2 = this;
        sprrvm2.cfr_renamed_5004(sprrhm2.cfr_renamed_0);
        if (sprrhm2.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrhm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprrhm sprrhm2 = this;
        sprrhm2.cfr_renamed_0 = arg0;
        sprrhm2.cfr_renamed_91 = sprco2;
    }
}

