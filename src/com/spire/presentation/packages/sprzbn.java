/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprmhba;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprzbn
extends sprqqe {
    private final sprigm cfr_renamed_1;
    private final sprdim cfr_renamed_2;
    private spraem cfr_renamed_3;
    private sprnbm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprzbn(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_2 = sprdim.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprigm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        if (sprszm2.cfr_renamed_84() > 2) {
            int n;
            int n2 = n = 2;
            while (n2 != arg0.cfr_renamed_84()) {
                sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_4 = sprnbm.cfr_renamed_5085(sprnvm2, false);
                        break;
                    }
                    case 1: {
                        this.cfr_renamed_3 = spraem.cfr_renamed_5085(sprnvm2, false);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(sprmhba.cfr_renamed_9("p+n+j2keq$bel+%1d\"b aec,`)a"));
                    }
                }
                n2 = ++n;
            }
        }
    }

    public sprigm cfr_renamed_11430() {
        return this.cfr_renamed_1;
    }

    public sprnbm cfr_renamed_11431() {
        return this.cfr_renamed_4;
    }

    public sprdim cfr_renamed_580() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprzbn sprzbn2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprzbn2.cfr_renamed_1);
        if (sprzbn2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public sprzbn(sprdim arg0, sprigm arg1) {
        this(arg0, arg1, null, null);
    }

    public static sprzbn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzbn) {
            return (sprzbn)arg0;
        }
        if (arg0 != null) {
            return new sprzbn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spraem cfr_renamed_9786() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzbn(sprdim sprdim2, sprigm sprigm2, sprnbm sprnbm2, spraem spraem2) {
        void arg2;
        void arg1;
        void arg0;
        sprzbn sprzbn2 = this;
        sprzbn sprzbn3 = this;
        sprzbn3.cfr_renamed_2 = arg0;
        sprzbn3.cfr_renamed_1 = arg1;
        sprzbn2.cfr_renamed_4 = arg2;
        sprzbn2.cfr_renamed_3 = spraem2;
    }
}

