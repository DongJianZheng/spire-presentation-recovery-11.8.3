/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprjjea;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprsrk;

public class sprbwk
extends sprsrk {
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private final int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private final sprmr cfr_renamed_4;

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprbwk(sprmr sprmr2, int n) {
        super((sprmr)arg0);
        void arg1;
        void arg0;
        if (n > arg0.cfr_renamed_1195() * 8 || arg1 < 8 || arg1 % 8 != false) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjjea.cfr_renamed_9("~\u0017\f")).append((int)arg1).append(sprsez.cfr_renamed_9("L\b\u0003\u0012L\u0015\u0019\u0016\u001c\t\u001e\u0012\t\u0002")).toString());
        }
        sprbwk sprbwk2 = this;
        void v1 = arg0;
        sprbwk sprbwk3 = this;
        this.cfr_renamed_4 = arg0;
        sprbwk3.cfr_renamed_1 = arg1 / 8;
        sprbwk3.cfr_renamed_0 = new byte[arg0.cfr_renamed_1195()];
        sprbwk2.cfr_renamed_2 = new byte[v1.cfr_renamed_1195()];
        sprbwk2.cfr_renamed_91 = new byte[v1.cfr_renamed_1195()];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprbwk sprbwk2 = this;
        sprbwk2.cfr_renamed_505(byArray, (int)arg1, sprbwk2.cfr_renamed_1, (byte[])arg2, (int)arg3);
        return sprbwk2.cfr_renamed_1;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_3 == 0) {
            sprbwk sprbwk2 = this;
            sprbwk2.cfr_renamed_4.cfr_renamed_3064(sprbwk2.cfr_renamed_2, 0, this.cfr_renamed_91, 0);
        }
        byte by = (byte)(this.cfr_renamed_91[this.cfr_renamed_3++] ^ arg0);
        sprbwk sprbwk3 = this;
        if (sprbwk3.cfr_renamed_3 == sprbwk3.cfr_renamed_1) {
            this.cfr_renamed_3 = 0;
            sprbwk sprbwk4 = this;
            System.arraycopy(this.cfr_renamed_2, sprbwk4.cfr_renamed_1, sprbwk4.cfr_renamed_2, 0, this.cfr_renamed_2.length - this.cfr_renamed_1);
            sprbwk sprbwk5 = this;
            System.arraycopy(this.cfr_renamed_91, 0, sprbwk5.cfr_renamed_2, sprbwk5.cfr_renamed_2.length - this.cfr_renamed_1, this.cfr_renamed_1);
        }
        return by;
    }

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_2, 0, this.cfr_renamed_0.length);
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_0.length) {
                int n;
                sprbwk sprbwk2 = this;
                System.arraycopy(byArray, 0, sprbwk2.cfr_renamed_0, sprbwk2.cfr_renamed_0.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_0.length - byArray.length) {
                    this.cfr_renamed_0[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
            }
            this.cfr_renamed_41();
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_4.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
                return;
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_4.cfr_renamed_5535(true, arg1);
            }
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_1315()).append(sprjjea.cfr_renamed_9("~\u0001\u0017\f")).append(this.cfr_renamed_1 * 8).toString();
    }
}

