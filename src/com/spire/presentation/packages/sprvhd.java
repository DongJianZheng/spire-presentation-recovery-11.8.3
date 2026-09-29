/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekd;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public class sprvhd
extends sprekd {
    private static final int cfr_renamed_4 = 64;

    @Override
    public sprrj cfr_renamed_461() {
        return new sprvhd(this);
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-512";
    }

    public sprvhd(byte[] byArray) {
        sprvhd sprvhd2 = this;
        sprvhd2.cfr_renamed_3797(byArray);
    }

    public sprvhd(sprvhd arg0) {
        super(arg0);
    }

    @Override
    public byte[] cfr_renamed_2426() {
        sprvhd sprvhd2 = this;
        byte[] byArray = new byte[sprvhd2.cfr_renamed_3792()];
        super.cfr_renamed_3793(byArray);
        return byArray;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprvhd sprvhd2 = (sprvhd)arg0;
        this.cfr_renamed_3796(sprvhd2);
    }

    public sprvhd() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprvhd sprvhd2 = this;
        sprvhd2.cfr_renamed_3120();
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_107, (byte[])arg0, (int)arg1);
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_93, (byte[])arg0, (int)(arg1 + 8));
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 16));
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_132, (byte[])arg0, (int)(arg1 + 24));
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_112, (byte[])arg0, (int)(arg1 + 32));
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 40));
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_137, (byte[])arg0, (int)(arg1 + 48));
        sprtsa.cfr_renamed_450(sprvhd2.cfr_renamed_79, (byte[])arg0, (int)(arg1 + 56));
        sprvhd2.cfr_renamed_41();
        return 64;
    }

    @Override
    public void cfr_renamed_41() {
        sprvhd sprvhd2 = this;
        sprvhd sprvhd3 = this;
        sprvhd sprvhd4 = this;
        sprvhd sprvhd5 = this;
        super.cfr_renamed_41();
        sprvhd5.cfr_renamed_107 = 7640891576956012808L;
        sprvhd5.cfr_renamed_93 = -4942790177534073029L;
        sprvhd4.cfr_renamed_2 = 4354685564936845355L;
        sprvhd4.cfr_renamed_132 = -6534734903238641935L;
        sprvhd3.cfr_renamed_112 = 5840696475078001361L;
        sprvhd3.cfr_renamed_119 = -7276294671716946913L;
        sprvhd2.cfr_renamed_137 = 2270897969802886507L;
        sprvhd2.cfr_renamed_79 = 6620516959819538809L;
    }

    @Override
    public int cfr_renamed_1218() {
        return 64;
    }
}

