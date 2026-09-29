/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdnn;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprmvr;
import com.spire.presentation.packages.sprnhn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwto;
import com.spire.presentation.packages.spryjn;

public class sprrjn
extends sprdnn {
    private sprwto cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_14404(spryjn arg0) {
        spryjn spryjn2 = arg0;
        super.cfr_renamed_14404(spryjn2);
        int[] nArray = new int[1];
        nArray[0] = this.cfr_renamed_4.cfr_renamed_14155();
        spryjn2.cfr_renamed_14075(sprnhn.cfr_renamed_9("2htAx"), nArray);
        spryjn2.cfr_renamed_14094(sprmvr.cfr_renamed_9("9!\u007f\u0017e3s\u0011E\u0002{\u0013z\u0006"), this.cfr_renamed_4.cfr_renamed_14156());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrjn(sprgdo sprgdo2, sprwto sprwto2) {
        super((sprgdo)arg0, arg1.cfr_renamed_14169(), arg1.cfr_renamed_14170(), arg1.cfr_renamed_14153(), arg1.cfr_renamed_14154());
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprwto2;
    }

    @Override
    public void cfr_renamed_14407() {
        this.cfr_renamed_4.cfr_renamed_14157(this.cfr_renamed_13380());
    }

    @sprtea
    public static sprrjn cfr_renamed_14751(sprgdo arg0, sprgdp arg1) {
        return new sprrjn(arg0, sprwto.cfr_renamed_14150(arg1));
    }

    @Override
    public int cfr_renamed_14752() {
        return 0;
    }
}

