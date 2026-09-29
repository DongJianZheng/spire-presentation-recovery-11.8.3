/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnkea;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.spryez;
import com.spire.presentation.packages.spryrk;

public class sprvyk
extends sprsrk {
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private sprmr cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(sprnkea.cfr_renamed_9("+=B0")).toString();
    }

    private /* synthetic */ void cfr_renamed_10082() {
        sprvyk sprvyk2 = this;
        sprvyk2.cfr_renamed_4 = new byte[sprvyk2.cfr_renamed_119];
        sprvyk2.cfr_renamed_0 = new byte[sprvyk2.cfr_renamed_119];
    }

    public sprvyk(sprmr arg0) {
        sprvyk sprvyk2 = this;
        super(arg0);
        this.cfr_renamed_1 = false;
        this.cfr_renamed_2 = arg0.cfr_renamed_1195();
        sprvyk2.cfr_renamed_3 = arg0;
        sprvyk2.cfr_renamed_91 = new byte[this.cfr_renamed_2];
    }

    private /* synthetic */ void cfr_renamed_10083() {
        sprvyk sprvyk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10032(sprvyk2.cfr_renamed_4, sprvyk2.cfr_renamed_119 - this.cfr_renamed_2);
        System.arraycopy(byArray, 0, this.cfr_renamed_4, 0, byArray.length);
        System.arraycopy(this.cfr_renamed_91, 0, this.cfr_renamed_4, byArray.length, this.cfr_renamed_119 - byArray.length);
    }

    private /* synthetic */ void cfr_renamed_10084() {
        this.cfr_renamed_119 = 2 * this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_10085() {
        sprvyk sprvyk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10033(this.cfr_renamed_4, sprvyk2.cfr_renamed_2);
        sprvyk2.cfr_renamed_3.cfr_renamed_3064(byArray, 0, this.cfr_renamed_91, 0);
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_1) {
            System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_4, 0, this.cfr_renamed_0.length);
            sprvyk sprvyk2 = this;
            sproze.cfr_renamed_3408(sprvyk2.cfr_renamed_91);
            sprvyk2.cfr_renamed_112 = 0;
            sprvyk2.cfr_renamed_3.cfr_renamed_41();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprvyk sprvyk2 = this;
        sprvyk2.cfr_renamed_505(byArray, (int)arg1, sprvyk2.cfr_renamed_2, (byte[])arg2, (int)arg3);
        return sprvyk2.cfr_renamed_2;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_112 == 0) {
            this.cfr_renamed_10085();
        }
        sprvyk sprvyk2 = this;
        sprvyk sprvyk3 = this;
        byte by = (byte)(sprvyk2.cfr_renamed_91[sprvyk3.cfr_renamed_112] ^ arg0);
        ++sprvyk3.cfr_renamed_112;
        if (sprvyk2.cfr_renamed_112 == this.cfr_renamed_1195()) {
            this.cfr_renamed_112 = 0;
            this.cfr_renamed_10083();
        }
        return by;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_2) {
                throw new IllegalArgumentException(spryez.cfr_renamed_9("D\\f\\yX`Xf\u001dy\u001dyHgI4_xRwVGTnX4\u0001)\u001dy"));
            }
            this.cfr_renamed_119 = byArray.length;
            sprvyk sprvyk2 = this;
            sprvyk2.cfr_renamed_10082();
            sprvyk2.cfr_renamed_0 = sproze.cfr_renamed_158(byArray);
            System.arraycopy(sprvyk2.cfr_renamed_0, 0, this.cfr_renamed_4, 0, this.cfr_renamed_0.length);
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_3.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
            }
        } else {
            sprvyk sprvyk3 = this;
            sprvyk3.cfr_renamed_10084();
            sprvyk3.cfr_renamed_10082();
            System.arraycopy(sprvyk3.cfr_renamed_0, 0, this.cfr_renamed_4, 0, this.cfr_renamed_0.length);
            if (arg1 != null) {
                this.cfr_renamed_3.cfr_renamed_5535(true, arg1);
            }
        }
        this.cfr_renamed_1 = true;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_2;
    }
}

