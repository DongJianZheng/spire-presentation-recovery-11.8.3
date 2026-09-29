/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprphaa;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.sprwjl;

public class sprgxk
extends sprsrk {
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprmr cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sprbj arg1;
        this.cfr_renamed_1 = true;
        if (!(sprbj2 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprphaa.cfr_renamed_9("\u0007=\u00182\u0002:\ns\u001e2\u001c2\u00036\u001a6\u001cs\u001e2\u001d \u000b7"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        int n = this.cfr_renamed_91.length - byArray.length;
        sproze.cfr_renamed_492(this.cfr_renamed_91, (byte)0);
        System.arraycopy(byArray, 0, this.cfr_renamed_91, n, byArray.length);
        arg1 = sprkpk2.cfr_renamed_284();
        if (arg1 != null) {
            this.cfr_renamed_3.cfr_renamed_5535(true, arg1);
        }
        this.cfr_renamed_41();
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(sprqzo.cfr_renamed_9("d\u001b\b\u0004\u0019")).toString();
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg0.length - arg1 < this.cfr_renamed_1195()) {
            throw new sprddl(sprphaa.cfr_renamed_9("\u0007=\u001e&\u001as\f&\b5\u000b!N'\u0001<N \u0006<\u001c'"));
        }
        if (arg2.length - arg3 < this.cfr_renamed_1195()) {
            throw new sprwjl(sprqzo.cfr_renamed_9("$%? >$k2>6-59p??$p88$\"?"));
        }
        sprgxk sprgxk2 = this;
        sprgxk2.cfr_renamed_505(arg0, arg1, sprgxk2.cfr_renamed_1195(), arg2, arg3);
        return this.cfr_renamed_1195();
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_3.cfr_renamed_1195();
    }

    private /* synthetic */ void cfr_renamed_10006() {
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_1) {
            sprgxk sprgxk2 = this;
            sprgxk2.cfr_renamed_3.cfr_renamed_3064(sprgxk2.cfr_renamed_91, 0, this.cfr_renamed_4, 0);
        }
        this.cfr_renamed_3.cfr_renamed_41();
        this.cfr_renamed_0 = 0;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_0 == 0) {
            sprgxk sprgxk2 = this;
            sprgxk2.cfr_renamed_10008(0);
            sprgxk2.cfr_renamed_10006();
            sprgxk2.cfr_renamed_3.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            return (byte)(sprgxk2.cfr_renamed_2[this.cfr_renamed_0++] ^ arg0);
        }
        byte by = (byte)(this.cfr_renamed_2[this.cfr_renamed_0++] ^ arg0);
        sprgxk sprgxk3 = this;
        if (sprgxk3.cfr_renamed_0 == sprgxk3.cfr_renamed_4.length) {
            this.cfr_renamed_0 = 0;
        }
        return by;
    }

    /*
     * WARNING - void declaration
     */
    public sprgxk(sprmr sprmr2) {
        void arg0;
        sprgxk sprgxk2 = this;
        void v1 = arg0;
        super((sprmr)arg0);
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_91 = new byte[v1.cfr_renamed_1195()];
        sprgxk2.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
        sprgxk2.cfr_renamed_2 = new byte[sprmr2.cfr_renamed_1195()];
    }

    private /* synthetic */ void cfr_renamed_10008(int arg0) {
        int n = arg0;
        while (n < this.cfr_renamed_4.length) {
            int n2 = n++;
            this.cfr_renamed_4[n2] = (byte)(this.cfr_renamed_4[n2] + 1);
            if (this.cfr_renamed_4[n2] == 0) continue;
            return;
        }
    }
}

