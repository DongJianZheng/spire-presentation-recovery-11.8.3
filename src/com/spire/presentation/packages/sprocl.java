/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtcl;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprocl
extends sprtcl {
    private static final int cfr_renamed_4 = 64;

    @Override
    public sprhx cfr_renamed_461() {
        return new sprocl(this);
    }

    @Override
    public byte[] cfr_renamed_2426() {
        sprocl sprocl2 = this;
        byte[] byArray = new byte[sprocl2.cfr_renamed_3792() + 1];
        super.cfr_renamed_3793(byArray);
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_86.ordinal();
        return byArray;
    }

    public sprocl(byte[] arg0) {
        super(spriil.values()[arg0[arg0.length - 1]]);
        sprocl sprocl2 = this;
        sprocl2.cfr_renamed_3797(arg0);
        sprybl.cfr_renamed_9170(sprocl2.cfr_renamed_10476());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprocl sprocl2 = this;
        sprocl2.cfr_renamed_3120();
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_132, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_137, (byte[])arg0, (int)(arg1 + 16));
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 24));
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_102, (byte[])arg0, (int)(arg1 + 32));
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_107, (byte[])arg0, (int)(arg1 + 40));
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 48));
        sprpxe.cfr_renamed_450(sprocl2.cfr_renamed_79, (byte[])arg0, (int)(arg1 + 56));
        sprocl2.cfr_renamed_41();
        return 64;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprocl sprocl2 = (sprocl)arg0;
        this.cfr_renamed_10488(sprocl2);
    }

    public sprocl(spriil arg0) {
        sprocl sprocl2 = this;
        super(arg0);
        sprybl.cfr_renamed_9170(sprocl2.cfr_renamed_10476());
        sprocl2.cfr_renamed_41();
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-512";
    }

    @Override
    public int cfr_renamed_1218() {
        return 64;
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprocl sprocl2 = this;
        return sprhel.cfr_renamed_10472(sprocl2, 256, sprocl2.cfr_renamed_86);
    }

    public sprocl(sprocl arg0) {
        sprocl sprocl2 = this;
        super(arg0);
        sprybl.cfr_renamed_9170(sprocl2.cfr_renamed_10476());
    }

    public sprocl() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_41() {
        sprocl sprocl2 = this;
        sprocl sprocl3 = this;
        sprocl sprocl4 = this;
        sprocl sprocl5 = this;
        super.cfr_renamed_41();
        sprocl5.cfr_renamed_132 = 7640891576956012808L;
        sprocl5.cfr_renamed_152 = -4942790177534073029L;
        sprocl4.cfr_renamed_137 = 4354685564936845355L;
        sprocl4.cfr_renamed_1 = -6534734903238641935L;
        sprocl3.cfr_renamed_102 = 5840696475078001361L;
        sprocl3.cfr_renamed_107 = -7276294671716946913L;
        sprocl2.cfr_renamed_4 = (int)2270897969802886507L;
        sprocl2.cfr_renamed_79 = 6620516959819538809L;
    }
}

