/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpvf;
import com.spire.presentation.packages.sprpwf;
import com.spire.presentation.packages.sprqeg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprxxf;

public class sprheg
implements sprii {
    private sprpvf cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprpvf)arg0;
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprheg sprheg2 = this;
        int n = sprheg2.cfr_renamed_4.cfr_renamed_6384().cfr_renamed_1155();
        int n2 = sprheg2.cfr_renamed_4.cfr_renamed_6384().cfr_renamed_1604();
        int n3 = sprheg2.cfr_renamed_4.cfr_renamed_6384().cfr_renamed_1438();
        byte[] byArray = new byte[32];
        sprheg2.cfr_renamed_4.cfr_renamed_1295().nextBytes(byArray);
        short[] sArray = new short[n];
        int n4 = n;
        sprqeg.cfr_renamed_6352(sArray, byArray, n4, n2);
        byte[] byArray2 = new byte[n4];
        sprqeg.cfr_renamed_6332(sprheg2.cfr_renamed_4.cfr_renamed_1295(), byArray2, n, n3);
        short[] sArray2 = new short[n];
        sprqeg.cfr_renamed_6344(sArray2, sArray, byArray2, n, n2);
        short[] sArray3 = new short[n];
        sprqeg.cfr_renamed_6373(sArray3, sArray2);
        byte[] byArray3 = new byte[sprheg2.cfr_renamed_4.cfr_renamed_6384().cfr_renamed_1252() - 32];
        sprqeg.cfr_renamed_6369(byArray3, sArray3, n, n2);
        sprpwf sprpwf2 = new sprpwf(this.cfr_renamed_4.cfr_renamed_6384(), byArray, byArray3);
        byte[] byArray4 = new byte[(n + 3) / 4];
        sprqeg.cfr_renamed_6351(byArray4, byArray2, n);
        byte[] byArray5 = new byte[32];
        sprheg2.cfr_renamed_4.cfr_renamed_1295().nextBytes(byArray5);
        byte[] byArray6 = new byte[1];
        byArray6[0] = 4;
        byte[] byArray7 = sprqeg.cfr_renamed_6366(byArray6, sprpwf2.cfr_renamed_91());
        sprxxf sprxxf2 = new sprxxf(this.cfr_renamed_4.cfr_renamed_6384(), byArray4, sprpwf2.cfr_renamed_91(), byArray5, sproze.cfr_renamed_533(byArray7, 0, byArray7.length / 2));
        return new sprsil(sprpwf2, sprxxf2);
    }

    public sprpvf cfr_renamed_2110() {
        return this.cfr_renamed_4;
    }
}

