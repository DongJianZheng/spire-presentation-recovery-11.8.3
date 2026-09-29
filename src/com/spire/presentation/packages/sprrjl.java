/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprov;
import com.spire.presentation.packages.sprril;
import com.spire.presentation.packages.sprsfk;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzgl;
import com.spire.presentation.packages.sprzkaa;
import java.math.BigInteger;

public class sprrjl
implements spruy {
    private sprov cfr_renamed_2;
    private int cfr_renamed_3 = 0;
    private spryye cfr_renamed_4;

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprrjl sprrjl2;
        if (arg0 instanceof spruek) {
            sprrjl sprrjl3 = this;
            sprrjl3.cfr_renamed_3 = 32;
            sprrjl2 = this;
            sprrjl3.cfr_renamed_2 = new sprzgl();
        } else if (arg0 instanceof sprsfk) {
            sprrjl2 = this;
            this.cfr_renamed_3 = 56;
            this.cfr_renamed_2 = new sprril();
        } else {
            throw new IllegalArgumentException(sprzkaa.cfr_renamed_9("c%q`a3(.m)|(m2(\u0018:u=q1`f/z`Pt<x"));
        }
        sprrjl2.cfr_renamed_4 = (spryye)arg0;
        this.cfr_renamed_2.cfr_renamed_5692(arg0);
    }

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        sprrjl sprrjl2 = this;
        byte[] byArray = new byte[sprrjl2.cfr_renamed_3];
        sprrjl2.cfr_renamed_2.cfr_renamed_8006(arg0, byArray, 0);
        return new BigInteger(1, byArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return this.cfr_renamed_3;
    }
}

