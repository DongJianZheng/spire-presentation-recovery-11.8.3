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

public class sprmdl
extends sprtcl {
    private static final int cfr_renamed_4 = 48;

    @Override
    public String cfr_renamed_1315() {
        return "SHA-384";
    }

    public sprmdl(byte[] arg0) {
        super(spriil.values()[arg0[arg0.length - 1]]);
        sprmdl sprmdl2 = this;
        sprmdl2.cfr_renamed_3797(arg0);
        sprybl.cfr_renamed_9170(sprmdl2.cfr_renamed_10476());
    }

    public sprmdl(sprmdl arg0) {
        sprmdl sprmdl2 = this;
        super(arg0);
        sprybl.cfr_renamed_9170(sprmdl2.cfr_renamed_10476());
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprmdl(this);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprmdl sprmdl2 = (sprmdl)arg0;
        super.cfr_renamed_10488(sprmdl2);
    }

    public sprmdl(spriil arg0) {
        sprmdl sprmdl2 = this;
        super(arg0);
        sprybl.cfr_renamed_9170(sprmdl2.cfr_renamed_10476());
        sprmdl2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_41() {
        sprmdl sprmdl2 = this;
        sprmdl sprmdl3 = this;
        sprmdl sprmdl4 = this;
        sprmdl sprmdl5 = this;
        super.cfr_renamed_41();
        sprmdl5.cfr_renamed_132 = -3766243637369397544L;
        sprmdl5.cfr_renamed_152 = 7105036623409894663L;
        sprmdl4.cfr_renamed_137 = -7973340178411365097L;
        sprmdl4.cfr_renamed_1 = 1526699215303891257L;
        sprmdl3.cfr_renamed_102 = 7436329637833083697L;
        sprmdl3.cfr_renamed_107 = -8163818279084223215L;
        sprmdl2.cfr_renamed_4 = (int)-2662702644619276377L;
        sprmdl2.cfr_renamed_79 = 5167115440072839076L;
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprmdl sprmdl2 = this;
        return sprhel.cfr_renamed_10472(sprmdl2, 256, sprmdl2.cfr_renamed_86);
    }

    public sprmdl() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_1218() {
        return 48;
    }

    @Override
    public byte[] cfr_renamed_2426() {
        sprmdl sprmdl2 = this;
        byte[] byArray = new byte[sprmdl2.cfr_renamed_3792() + 1];
        super.cfr_renamed_3793(byArray);
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_86.ordinal();
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprmdl sprmdl2 = this;
        sprmdl2.cfr_renamed_3120();
        sprpxe.cfr_renamed_450(sprmdl2.cfr_renamed_132, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_450(sprmdl2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_450(sprmdl2.cfr_renamed_137, (byte[])arg0, (int)(arg1 + 16));
        sprpxe.cfr_renamed_450(sprmdl2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 24));
        sprpxe.cfr_renamed_450(sprmdl2.cfr_renamed_102, (byte[])arg0, (int)(arg1 + 32));
        sprpxe.cfr_renamed_450(sprmdl2.cfr_renamed_107, (byte[])arg0, (int)(arg1 + 40));
        sprmdl2.cfr_renamed_41();
        return 48;
    }
}

