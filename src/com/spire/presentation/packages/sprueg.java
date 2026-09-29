/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwf;
import com.spire.presentation.packages.sprqeg;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprueg
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprpwf sprpwf2 = (sprpwf)arg0;
        sprhvf sprhvf2 = sprpwf2.cfr_renamed_284();
        int n = sprhvf2.cfr_renamed_1155();
        int n2 = sprhvf2.cfr_renamed_1604();
        int n3 = sprhvf2.cfr_renamed_1438();
        int n4 = sprhvf2.cfr_renamed_6376();
        int n5 = sprhvf2.cfr_renamed_6381();
        int n6 = sprhvf2.cfr_renamed_6382();
        byte[] byArray = new byte[1];
        byArray[0] = 4;
        byte[] byArray2 = sprqeg.cfr_renamed_6366(byArray, sprpwf2.cfr_renamed_91());
        byte[] byArray3 = new byte[256];
        sprqeg.cfr_renamed_6361(this.cfr_renamed_4, byArray3);
        byte[] byArray4 = new byte[32];
        sprqeg.cfr_renamed_6362(byArray4, byArray3);
        short[] sArray = new short[n];
        int n7 = n;
        sprqeg.cfr_renamed_6347(sArray, sprpwf2.cfr_renamed_6379(), n7, n2);
        short[] sArray2 = new short[n7];
        sprqeg.cfr_renamed_6352(sArray2, sprpwf2.cfr_renamed_2113(), n, n2);
        byte[] byArray5 = new byte[1];
        byArray5[0] = 5;
        byte[] byArray6 = sprqeg.cfr_renamed_6366(byArray5, byArray4);
        byte[] byArray7 = sproze.cfr_renamed_533(byArray6, 0, byArray6.length / 2);
        int[] nArray = new int[n];
        sprqeg.cfr_renamed_6341(nArray, byArray7);
        byte[] byArray8 = new byte[n];
        int n8 = n;
        sprqeg.cfr_renamed_6334(byArray8, nArray, n8, n3);
        short[] sArray3 = new short[n8];
        sprqeg.cfr_renamed_6344(sArray3, sArray2, byArray8, n, n2);
        short[] sArray4 = new short[n];
        sprqeg.cfr_renamed_6373(sArray4, sArray3);
        byte[] byArray9 = new byte[n4];
        int n9 = n;
        sprqeg.cfr_renamed_6369(byArray9, sArray4, n9, n2);
        short[] sArray5 = new short[n9];
        sprqeg.cfr_renamed_6344(sArray5, sArray, byArray8, n, n2);
        byte[] byArray10 = new byte[256];
        sprqeg.cfr_renamed_6367(byArray10, sArray5, byArray3, n2, n5, n6);
        byte[] byArray11 = new byte[128];
        sprqeg.cfr_renamed_6370(byArray11, byArray10);
        byte[] byArray12 = new byte[byArray4.length + byArray2.length / 2];
        System.arraycopy(byArray4, 0, byArray12, 0, byArray4.length);
        System.arraycopy(byArray2, 0, byArray12, byArray4.length, byArray2.length / 2);
        byte[] byArray13 = new byte[1];
        byArray13[0] = 2;
        byte[] byArray14 = sprqeg.cfr_renamed_6366(byArray13, byArray12);
        byte[] byArray15 = new byte[byArray9.length + byArray11.length + byArray14.length / 2];
        System.arraycopy(byArray9, 0, byArray15, 0, byArray9.length);
        System.arraycopy(byArray11, 0, byArray15, byArray9.length, byArray11.length);
        System.arraycopy(byArray14, 0, byArray15, byArray9.length + byArray11.length, byArray14.length / 2);
        byte[] byArray16 = new byte[byArray4.length + byArray15.length];
        System.arraycopy(byArray4, 0, byArray16, 0, byArray4.length);
        System.arraycopy(byArray15, 0, byArray16, byArray4.length, byArray15.length);
        byte[] byArray17 = new byte[1];
        byArray17[0] = 1;
        byte[] byArray18 = sproze.cfr_renamed_533(sprqeg.cfr_renamed_6366(byArray17, byArray16), 0, sprhvf2.cfr_renamed_6092() / 8);
        return new sprkjf(byArray18, byArray15);
    }

    public sprueg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }
}

