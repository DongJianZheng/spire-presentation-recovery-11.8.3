/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.sprali;
import com.spire.presentation.packages.spraxk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprewk;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprzal;

public class sprmyk
extends sprewk {
    @Override
    public String cfr_renamed_1315() {
        return sprali.cfr_renamed_9("+{^\u0010\\");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprmyk sprmyk2;
        boolean bl2;
        void arg0;
        sprmyk sprmyk3 = this;
        sprmyk3.cfr_renamed_2 = arg0;
        sprmyk3.cfr_renamed_3 = (spraxk)sprbj2;
        sprmyk sprmyk4 = this;
        if (!sprmyk4.cfr_renamed_3.cfr_renamed_9208()) {
            bl2 = true;
            sprmyk2 = this;
        } else {
            bl2 = false;
            sprmyk2 = this;
        }
        sprmyk4.cfr_renamed_4.cfr_renamed_5535(bl2, sprmyk2.cfr_renamed_3.cfr_renamed_1521().cfr_renamed_9979());
        if (this.cfr_renamed_3.cfr_renamed_3339().length != 7) {
            throw new IllegalArgumentException(sprfiz.cfr_renamed_9("\u001a\u0012\u000b\u0004\u0005E\u001d\r\u0001\u0010\u0002\u0001N\u0007\u000bE[SN\u0007\u0007\u0011\u001d"));
        }
    }

    @Override
    public int cfr_renamed_10263(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        byte[] byArray;
        if (this.cfr_renamed_3.cfr_renamed_9210() > 256) {
            sprmyk sprmyk2 = this;
            byte[] byArray2 = sprmyk.cfr_renamed_10264(sprzal.cfr_renamed_10248(sprmyk2.cfr_renamed_4, sprmyk2.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), sprmyk.cfr_renamed_10265(arg0), arg1, arg2 / 2));
            byArray = byArray2;
        } else {
            byte[] byArray3;
            sprmyk sprmyk3 = this;
            byArray = byArray3 = sprzal.cfr_renamed_10250(sprmyk3.cfr_renamed_4, sprmyk3.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), arg0, arg1, arg2);
        }
        System.arraycopy(byArray, 0, arg3, arg4, arg2);
        return arg2;
    }

    @Override
    public int cfr_renamed_10266(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        byte[] byArray;
        if (this.cfr_renamed_3.cfr_renamed_9210() > 256) {
            sprmyk sprmyk2 = this;
            byte[] byArray2 = sprmyk.cfr_renamed_10264(sprzal.cfr_renamed_10257(sprmyk2.cfr_renamed_4, sprmyk2.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), sprmyk.cfr_renamed_10265(arg0), arg1, arg2 / 2));
            byArray = byArray2;
        } else {
            byte[] byArray3;
            sprmyk sprmyk3 = this;
            byArray = byArray3 = sprzal.cfr_renamed_10251(sprmyk3.cfr_renamed_4, sprmyk3.cfr_renamed_3.cfr_renamed_9209(), this.cfr_renamed_3.cfr_renamed_3339(), arg0, arg1, arg2);
        }
        System.arraycopy(byArray, 0, arg3, arg4, arg2);
        return arg2;
    }

    public sprmyk() {
        this(sprael.cfr_renamed_7529());
    }

    public sprmyk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        super(sprmr2);
        if (sprmr2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprali.cfr_renamed_9("_\fN\b\u001d\u000eT\u001dU\bOMS\bX\tNMI\u0002\u001d\u000fXM\f_\u0005M_\u0004I\u001e"));
        }
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.fpe.disable")) {
            throw new UnsupportedOperationException(sprfiz.cfr_renamed_9("#> N\u0001\u0007\u0016\u000f\u0007\u0002\u0000\n"));
        }
    }
}

