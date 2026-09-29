/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.spraxk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprewk;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprppr;
import com.spire.presentation.packages.sprwdga;
import com.spire.presentation.packages.sprzal;

public class sprqqk
extends sprewk {
    public sprqqk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        super(sprmr2);
        if (sprmr2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprwdga.cfr_renamed_9(",C=GnA'R&G<\u0002 G+F=\u0002:Mn@+\u0002\u007f\u0010v\u0002,K:Q"));
        }
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.fpe.disable") || sprjcf.cfr_renamed_5159("com.spire.psmodel.security.fpe.disable_ff1")) {
            throw new UnsupportedOperationException(sprppr.cfr_renamed_9("1!FG\u0012\t\u0014\u0015\u000e\u0017\u0003\u000e\u0018\tW\u0003\u001e\u0014\u0016\u0005\u001b\u0002\u0013"));
        }
    }

    @Override
    public int cfr_renamed_10266(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        byte[] byArray;
        if (this.cfr_renamed_3.cfr_renamed_9210() > 256) {
            sprqqk sprqqk2 = this;
            byte[] byArray2 = sprqqk.cfr_renamed_10264(sprzal.cfr_renamed_10246(sprqqk2.cfr_renamed_4, sprqqk2.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), sprqqk.cfr_renamed_10265(arg0), arg1, arg2 / 2));
            byArray = byArray2;
        } else {
            byte[] byArray3;
            sprqqk sprqqk3 = this;
            byArray = byArray3 = sprzal.cfr_renamed_10238(sprqqk3.cfr_renamed_4, sprqqk3.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), arg0, arg1, arg2);
        }
        System.arraycopy(byArray, 0, arg3, arg4, arg2);
        return arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprqqk sprqqk2;
        boolean bl2;
        void arg0;
        sprqqk sprqqk3 = this;
        sprqqk3.cfr_renamed_2 = arg0;
        sprqqk3.cfr_renamed_3 = (spraxk)sprbj2;
        sprqqk sprqqk4 = this;
        if (!sprqqk4.cfr_renamed_3.cfr_renamed_9208()) {
            bl2 = true;
            sprqqk2 = this;
        } else {
            bl2 = false;
            sprqqk2 = this;
        }
        sprqqk4.cfr_renamed_4.cfr_renamed_5535(bl2, sprqqk2.cfr_renamed_3.cfr_renamed_1521());
    }

    @Override
    public int cfr_renamed_10263(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        byte[] byArray;
        if (this.cfr_renamed_3.cfr_renamed_9210() > 256) {
            sprqqk sprqqk2 = this;
            byte[] byArray2 = sprqqk.cfr_renamed_10264(sprzal.cfr_renamed_10262(sprqqk2.cfr_renamed_4, sprqqk2.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), sprqqk.cfr_renamed_10265(arg0), arg1, arg2 / 2));
            byArray = byArray2;
        } else {
            byte[] byArray3;
            sprqqk sprqqk3 = this;
            byArray = byArray3 = sprzal.cfr_renamed_10226(sprqqk3.cfr_renamed_4, sprqqk3.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), arg0, arg1, arg2);
        }
        System.arraycopy(byArray, 0, arg3, arg4, arg2);
        return arg2;
    }

    public sprqqk() {
        this(sprael.cfr_renamed_7529());
    }

    @Override
    public String cfr_renamed_1315() {
        return sprwdga.cfr_renamed_9("d\b\u0013");
    }
}

