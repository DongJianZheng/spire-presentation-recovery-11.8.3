/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruir;
import com.spire.presentation.packages.sprxgf;

public class sprzgm
extends sprqqe {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_2116() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_2117() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzgm(sprszm sprszm2) {
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(0)).cfr_renamed_5087();
        if (v0.cfr_renamed_85(1) instanceof sprktm) {
            this.cfr_renamed_1 = ((sprktm)arg0.cfr_renamed_85(1)).cfr_renamed_5087();
            return;
        }
        if (arg0.cfr_renamed_85(1) instanceof sprszm) {
            sprszm sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
            sprzgm sprzgm2 = this;
            sprszm sprszm4 = sprszm3;
            this.cfr_renamed_1 = sprktm.cfr_renamed_23(sprszm4.cfr_renamed_85(0)).cfr_renamed_5087();
            sprzgm2.cfr_renamed_2 = sprktm.cfr_renamed_23(sprszm4.cfr_renamed_85(1)).cfr_renamed_5087();
            sprzgm2.cfr_renamed_4 = sprktm.cfr_renamed_23(sprszm3.cfr_renamed_85(2)).cfr_renamed_5087();
            return;
        }
        throw new IllegalArgumentException(spruir.cfr_renamed_9("}&x!q024s6a!2!`6}6"));
    }

    public sprzgm(int arg0, int arg1) {
        this(arg0, arg1, 0, 0);
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzgm(int n, int n2, int n3, int n4) {
        void arg2;
        void arg1;
        void arg0;
        sprzgm sprzgm2 = this;
        sprzgm sprzgm3 = this;
        sprzgm3.cfr_renamed_3 = arg0;
        sprzgm3.cfr_renamed_1 = arg1;
        sprzgm2.cfr_renamed_2 = arg2;
        sprzgm2.cfr_renamed_4 = n4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        if (this.cfr_renamed_2 == 0) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        } else {
            sprrvm sprrvm3;
            sprrvm sprrvm4 = sprrvm3 = new sprrvm(3);
            sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
            sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_2));
            sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
            sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
        }
        return new sprcen(sprrvm2);
    }

    public static sprzgm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzgm) {
            return (sprzgm)arg0;
        }
        if (arg0 != null) {
            return new sprzgm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_2115() {
        return this.cfr_renamed_1;
    }
}

