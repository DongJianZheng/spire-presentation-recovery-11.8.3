/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdyf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhbg;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprmuf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqeg;
import com.spire.presentation.packages.sprsil;

public class sprzxf
implements sprii {
    private sprdyf cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        sprzxf sprzxf2 = this;
        int n = sprzxf2.cfr_renamed_4.cfr_renamed_6378().cfr_renamed_1155();
        int n2 = sprzxf2.cfr_renamed_4.cfr_renamed_6378().cfr_renamed_1604();
        int n3 = sprzxf2.cfr_renamed_4.cfr_renamed_6378().cfr_renamed_1438();
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        do {
            sprqeg.cfr_renamed_6365(this.cfr_renamed_4.cfr_renamed_1295(), byArray);
        } while (!sprqeg.cfr_renamed_6346(byArray, byArray2, n));
        byte[] byArray3 = new byte[n];
        sprzxf sprzxf3 = this;
        sprqeg.cfr_renamed_6332(sprzxf3.cfr_renamed_4.cfr_renamed_1295(), byArray3, n, n3);
        short[] sArray = new short[n];
        int n4 = n;
        sprqeg.cfr_renamed_6336(sArray, byArray3, n4, n2);
        short[] sArray2 = new short[n4];
        sprqeg.cfr_renamed_6344(sArray2, sArray, byArray, n, n2);
        byte[] byArray4 = new byte[sprzxf3.cfr_renamed_4.cfr_renamed_6378().cfr_renamed_1252()];
        sprqeg.cfr_renamed_6371(byArray4, sArray2, n, n2);
        sprhbg sprhbg2 = new sprhbg(this.cfr_renamed_4.cfr_renamed_6378(), byArray4);
        byte[] byArray5 = new byte[(n + 3) / 4];
        int n5 = n;
        sprqeg.cfr_renamed_6351(byArray5, byArray3, n5);
        byte[] byArray6 = new byte[(n5 + 3) / 4];
        int n6 = n;
        sprqeg.cfr_renamed_6351(byArray6, byArray2, n6);
        byte[] byArray7 = new byte[(n6 + 3) / 4];
        sprzxf3.cfr_renamed_4.cfr_renamed_1295().nextBytes(byArray7);
        byte[] byArray8 = new byte[1];
        byArray8[0] = 4;
        byte[] byArray9 = sprqeg.cfr_renamed_6366(byArray8, byArray4);
        sprmuf sprmuf2 = new sprmuf(this.cfr_renamed_4.cfr_renamed_6378(), byArray5, byArray6, byArray4, byArray7, sproze.cfr_renamed_533(byArray9, 0, byArray9.length / 2));
        return new sprsil(sprhbg2, sprmuf2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprdyf)arg0;
    }

    public sprdyf cfr_renamed_2110() {
        return this.cfr_renamed_4;
    }
}

