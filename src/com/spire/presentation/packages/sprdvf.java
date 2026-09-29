/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmuf;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqeg;
import com.spire.presentation.packages.spryeg;

public class sprdvf
implements sproh {
    private final sprmuf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        spryeg spryeg2 = this.cfr_renamed_4.cfr_renamed_284();
        int n = spryeg2.cfr_renamed_1155();
        int n2 = spryeg2.cfr_renamed_1604();
        int n3 = spryeg2.cfr_renamed_1438();
        int n4 = spryeg2.cfr_renamed_6376();
        byte[] byArray = new byte[n];
        int n5 = n;
        sprqeg.cfr_renamed_6349(byArray, this.cfr_renamed_4.cfr_renamed_5958(), n5);
        byte[] byArray2 = new byte[n5];
        int n6 = n;
        sprqeg.cfr_renamed_6349(byArray2, this.cfr_renamed_4.cfr_renamed_5959(), n6);
        short[] sArray = new short[n6];
        int n7 = n;
        sprqeg.cfr_renamed_6347(sArray, arg0, n7, n2);
        short[] sArray2 = new short[n7];
        sprqeg.cfr_renamed_6344(sArray2, sArray, byArray, n, n2);
        short[] sArray3 = new short[n];
        sprqeg.cfr_renamed_6372(sArray3, sArray2, 3, n2);
        byte[] byArray3 = new byte[n];
        sprqeg.cfr_renamed_6368(byArray3, sArray3);
        byte[] byArray4 = new byte[n];
        sprqeg.cfr_renamed_6354(byArray4, byArray3, byArray2, n);
        byte[] byArray5 = new byte[n];
        int n8 = n;
        sprqeg.cfr_renamed_6330(byArray5, byArray4, n8, n3);
        byte[] byArray6 = new byte[(n8 + 3) / 4];
        int n9 = n;
        sprqeg.cfr_renamed_6351(byArray6, byArray5, n9);
        short[] sArray4 = new short[n9];
        int n10 = n;
        sprqeg.cfr_renamed_6360(sArray4, this.cfr_renamed_4.cfr_renamed_3382(), n10, n2);
        short[] sArray5 = new short[n10];
        sprqeg.cfr_renamed_6344(sArray5, sArray4, byArray5, n, n2);
        short[] sArray6 = new short[n];
        sprqeg.cfr_renamed_6373(sArray6, sArray5);
        byte[] byArray7 = new byte[n4];
        sprqeg.cfr_renamed_6369(byArray7, sArray6, n, n2);
        byte[] byArray8 = new byte[1];
        byArray8[0] = 3;
        byte[] byArray9 = sprqeg.cfr_renamed_6366(byArray8, byArray6);
        byte[] byArray10 = new byte[byArray9.length / 2 + this.cfr_renamed_4.cfr_renamed_2690().length];
        System.arraycopy(byArray9, 0, byArray10, 0, byArray9.length / 2);
        System.arraycopy(this.cfr_renamed_4.cfr_renamed_2690(), 0, byArray10, byArray9.length / 2, this.cfr_renamed_4.cfr_renamed_2690().length);
        byte[] byArray11 = new byte[1];
        byArray11[0] = 2;
        byte[] byArray12 = sprqeg.cfr_renamed_6366(byArray11, byArray10);
        byte[] byArray13 = new byte[byArray7.length + byArray12.length / 2];
        System.arraycopy(byArray7, 0, byArray13, 0, byArray7.length);
        System.arraycopy(byArray12, 0, byArray13, byArray7.length, byArray12.length / 2);
        int n11 = sproze.cfr_renamed_92(arg0, byArray13) ? 0 : -1;
        sprqeg.cfr_renamed_6356(byArray6, this.cfr_renamed_4.cfr_renamed_5955(), n11);
        byte[] byArray14 = new byte[1];
        byArray14[0] = 3;
        byte[] byArray15 = sprqeg.cfr_renamed_6366(byArray14, byArray6);
        byte[] byArray16 = new byte[byArray15.length / 2 + byArray13.length];
        System.arraycopy(byArray15, 0, byArray16, 0, byArray15.length / 2);
        System.arraycopy(byArray13, 0, byArray16, byArray15.length / 2, byArray13.length);
        byte[] byArray17 = new byte[1];
        byArray17[0] = (byte)(n11 + 1);
        return sproze.cfr_renamed_533(sprqeg.cfr_renamed_6366(byArray17, byArray16), 0, spryeg2.cfr_renamed_6092() / 8);
    }

    public sprdvf(sprmuf sprmuf2) {
        this.cfr_renamed_4 = sprmuf2;
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_6376() + 32;
    }
}

