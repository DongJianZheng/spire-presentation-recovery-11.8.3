/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekd;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public class sproed
extends sprekd {
    private static final int cfr_renamed_4 = 48;

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sproed sproed2 = (sproed)arg0;
        super.cfr_renamed_3796(sproed2);
    }

    public sproed(sproed arg0) {
        super(arg0);
    }

    public sproed() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sproed sproed2 = this;
        sproed2.cfr_renamed_3120();
        sprtsa.cfr_renamed_450(sproed2.cfr_renamed_107, (byte[])arg0, (int)arg1);
        sprtsa.cfr_renamed_450(sproed2.cfr_renamed_93, (byte[])arg0, (int)(arg1 + 8));
        sprtsa.cfr_renamed_450(sproed2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 16));
        sprtsa.cfr_renamed_450(sproed2.cfr_renamed_132, (byte[])arg0, (int)(arg1 + 24));
        sprtsa.cfr_renamed_450(sproed2.cfr_renamed_112, (byte[])arg0, (int)(arg1 + 32));
        sprtsa.cfr_renamed_450(sproed2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 40));
        sproed2.cfr_renamed_41();
        return 48;
    }

    @Override
    public void cfr_renamed_41() {
        sproed sproed2 = this;
        sproed sproed3 = this;
        sproed sproed4 = this;
        sproed sproed5 = this;
        super.cfr_renamed_41();
        sproed5.cfr_renamed_107 = -3766243637369397544L;
        sproed5.cfr_renamed_93 = 7105036623409894663L;
        sproed4.cfr_renamed_2 = -7973340178411365097L;
        sproed4.cfr_renamed_132 = 1526699215303891257L;
        sproed3.cfr_renamed_112 = 7436329637833083697L;
        sproed3.cfr_renamed_119 = -8163818279084223215L;
        sproed2.cfr_renamed_137 = -2662702644619276377L;
        sproed2.cfr_renamed_79 = 5167115440072839076L;
    }

    @Override
    public int cfr_renamed_1218() {
        return 48;
    }

    @Override
    public byte[] cfr_renamed_2426() {
        sproed sproed2 = this;
        byte[] byArray = new byte[sproed2.cfr_renamed_3792()];
        super.cfr_renamed_3793(byArray);
        return byArray;
    }

    public sproed(byte[] byArray) {
        sproed sproed2 = this;
        sproed2.cfr_renamed_3797(byArray);
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-384";
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sproed(this);
    }
}

