/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqeg;
import com.spire.presentation.packages.sprxxf;

public class sprwdg
implements sproh {
    private final sprxxf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprhvf sprhvf2 = this.cfr_renamed_4.cfr_renamed_284();
        int n = sprhvf2.cfr_renamed_1155();
        int n2 = sprhvf2.cfr_renamed_1604();
        int n3 = sprhvf2.cfr_renamed_1438();
        int n4 = sprhvf2.cfr_renamed_6376();
        int n5 = sprhvf2.cfr_renamed_6381();
        int n6 = sprhvf2.cfr_renamed_6382();
        int n7 = sprhvf2.cfr_renamed_6380();
        int n8 = sprhvf2.cfr_renamed_6383();
        byte[] byArray = new byte[n];
        sprqeg.cfr_renamed_6349(byArray, this.cfr_renamed_4.cfr_renamed_91(), n);
        byte[] byArray2 = new byte[n4];
        System.arraycopy(arg0, 0, byArray2, 0, n4);
        short[] sArray = new short[n];
        sprqeg.cfr_renamed_6347(sArray, byArray2, n, n2);
        byte[] byArray3 = new byte[128];
        System.arraycopy(arg0, n4, byArray3, 0, byArray3.length);
        byte[] byArray4 = new byte[256];
        sprqeg.cfr_renamed_6340(byArray4, byArray3);
        short[] sArray2 = new short[n];
        sprqeg.cfr_renamed_6344(sArray2, sArray, byArray, n, n2);
        byte[] byArray5 = new byte[256];
        sprqeg.cfr_renamed_6364(byArray5, sArray2, byArray4, n2, n3, n7, n8);
        byte[] byArray6 = new byte[32];
        sprqeg.cfr_renamed_6362(byArray6, byArray5);
        byte[] byArray7 = new byte[sprhvf2.cfr_renamed_1252() - 32];
        System.arraycopy(this.cfr_renamed_4.cfr_renamed_3382(), 32, byArray7, 0, byArray7.length);
        short[] sArray3 = new short[n];
        sprqeg.cfr_renamed_6347(sArray3, byArray7, n, n2);
        byte[] byArray8 = new byte[32];
        System.arraycopy(this.cfr_renamed_4.cfr_renamed_3382(), 0, byArray8, 0, byArray8.length);
        short[] sArray4 = new short[n];
        sprqeg.cfr_renamed_6352(sArray4, byArray8, n, n2);
        byte[] byArray9 = new byte[1];
        byArray9[0] = 5;
        byte[] byArray10 = sprqeg.cfr_renamed_6366(byArray9, byArray6);
        byte[] byArray11 = sproze.cfr_renamed_533(byArray10, 0, byArray10.length / 2);
        int[] nArray = new int[n];
        sprqeg.cfr_renamed_6341(nArray, byArray11);
        byte[] byArray12 = new byte[n];
        int n9 = n;
        sprqeg.cfr_renamed_6334(byArray12, nArray, n9, n3);
        short[] sArray5 = new short[n9];
        sprqeg.cfr_renamed_6344(sArray5, sArray4, byArray12, n, n2);
        short[] sArray6 = new short[n];
        sprqeg.cfr_renamed_6373(sArray6, sArray5);
        sprqeg.cfr_renamed_6369(new byte[n4], sArray6, n, n2);
        short[] sArray7 = new short[n];
        sprqeg.cfr_renamed_6344(sArray7, sArray3, byArray12, n, n2);
        sprqeg.cfr_renamed_6367(new byte[256], sArray7, byArray5, n2, n5, n6);
        sprqeg.cfr_renamed_6370(new byte[128], byArray4);
        byte[] byArray13 = new byte[byArray6.length + this.cfr_renamed_4.cfr_renamed_2690().length];
        System.arraycopy(byArray6, 0, byArray13, 0, byArray6.length);
        System.arraycopy(this.cfr_renamed_4.cfr_renamed_2690(), 0, byArray13, byArray6.length, this.cfr_renamed_4.cfr_renamed_2690().length);
        byte[] byArray14 = new byte[1];
        byArray14[0] = 2;
        byte[] byArray15 = sprqeg.cfr_renamed_6366(byArray14, byArray13);
        byte[] byArray16 = new byte[byArray2.length + byArray3.length + byArray15.length / 2];
        System.arraycopy(byArray2, 0, byArray16, 0, byArray2.length);
        System.arraycopy(byArray3, 0, byArray16, byArray2.length, byArray3.length);
        System.arraycopy(byArray15, 0, byArray16, byArray2.length + byArray3.length, byArray15.length / 2);
        int n10 = sproze.cfr_renamed_92(arg0, byArray16) ? 0 : -1;
        sprqeg.cfr_renamed_6356(byArray6, this.cfr_renamed_4.cfr_renamed_5955(), n10);
        byte[] byArray17 = new byte[byArray6.length + byArray16.length];
        System.arraycopy(byArray6, 0, byArray17, 0, byArray6.length);
        System.arraycopy(byArray16, 0, byArray17, byArray6.length, byArray16.length);
        byte[] byArray18 = new byte[1];
        byArray18[0] = 1;
        return sproze.cfr_renamed_533(sprqeg.cfr_renamed_6366(byArray18, byArray17), 0, sprhvf2.cfr_renamed_6092() / 8);
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_6376() + 128 + 32;
    }

    public sprwdg(sprxxf sprxxf2) {
        this.cfr_renamed_4 = sprxxf2;
    }
}

