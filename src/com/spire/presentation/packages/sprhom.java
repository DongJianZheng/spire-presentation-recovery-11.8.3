/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruqm;
import com.spire.presentation.packages.sprxgf;

public class sprhom
extends sprqqe {
    private final sprktm[] cfr_renamed_2;
    private final spruqm[] cfr_renamed_3;
    private final sprktm[] cfr_renamed_4;

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.length;
    }

    public static sprhom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhom) {
            return (sprhom)arg0;
        }
        if (arg0 != null) {
            return new sprhom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_4859(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    public sprhom(sprktm arg0, sprktm arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_4.length);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            sprrvm sprrvm3 = new sprrvm(3);
            sprhom sprhom2 = this;
            sprrvm3.cfr_renamed_5004(this.cfr_renamed_4[n]);
            sprrvm3.cfr_renamed_5004(sprhom2.cfr_renamed_2[n]);
            if (sprhom2.cfr_renamed_3[n] != null) {
                sprrvm3.cfr_renamed_5004(this.cfr_renamed_3[n]);
            }
            sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
            n2 = ++n;
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhom(sprszm sprszm2) {
        int n;
        void arg0;
        this.cfr_renamed_4 = new sprktm[sprszm2.cfr_renamed_84()];
        this.cfr_renamed_2 = new sprktm[arg0.cfr_renamed_84()];
        this.cfr_renamed_3 = new spruqm[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprszm sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            sprhom sprhom2 = this;
            sprhom2.cfr_renamed_4[n] = sprktm.cfr_renamed_23(sprszm3.cfr_renamed_85(0));
            sprszm sprszm4 = sprszm3;
            sprhom2.cfr_renamed_2[n] = sprktm.cfr_renamed_23(sprszm4.cfr_renamed_85(1));
            if (sprszm4.cfr_renamed_84() > 2) {
                this.cfr_renamed_3[n] = spruqm.cfr_renamed_23(sprszm3.cfr_renamed_85(2));
            }
            n2 = ++n;
        }
    }

    public spruqm cfr_renamed_4858(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    /*
     * WARNING - void declaration
     */
    public sprhom(sprktm sprktm2, sprktm sprktm3, spruqm spruqm2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = new sprktm[1];
        this.cfr_renamed_2 = new sprktm[1];
        this.cfr_renamed_3 = new spruqm[1];
        sprhom sprhom2 = this;
        sprhom2.cfr_renamed_4[0] = arg0;
        sprhom2.cfr_renamed_2[0] = arg1;
        sprhom2.cfr_renamed_3[0] = arg2;
    }

    public sprktm cfr_renamed_4857(int arg0) {
        return this.cfr_renamed_2[arg0];
    }
}

