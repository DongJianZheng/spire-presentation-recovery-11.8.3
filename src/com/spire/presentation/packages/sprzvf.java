/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhbg;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqeg;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryeg;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprzvf
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    public sprzvf(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprhbg sprhbg2 = (sprhbg)arg0;
        spryeg spryeg2 = sprhbg2.cfr_renamed_284();
        int n = spryeg2.cfr_renamed_1155();
        int n2 = spryeg2.cfr_renamed_1604();
        int n3 = spryeg2.cfr_renamed_1438();
        int n4 = spryeg2.cfr_renamed_6376();
        byte[] byArray = new byte[1];
        byArray[0] = 4;
        byte[] byArray2 = sprqeg.cfr_renamed_6366(byArray, sprhbg2.cfr_renamed_91());
        byte[] byArray3 = new byte[n];
        int n5 = n;
        sprqeg.cfr_renamed_6332(this.cfr_renamed_4, byArray3, n5, n3);
        byte[] byArray4 = new byte[(n5 + 3) / 4];
        int n6 = n;
        sprqeg.cfr_renamed_6351(byArray4, byArray3, n6);
        short[] sArray = new short[n6];
        int n7 = n;
        sprqeg.cfr_renamed_6360(sArray, sprhbg2.cfr_renamed_6374(), n7, n2);
        short[] sArray2 = new short[n7];
        sprqeg.cfr_renamed_6344(sArray2, sArray, byArray3, n, n2);
        short[] sArray3 = new short[n];
        sprqeg.cfr_renamed_6373(sArray3, sArray2);
        byte[] byArray5 = new byte[n4];
        sprqeg.cfr_renamed_6369(byArray5, sArray3, n, n2);
        byte[] byArray6 = new byte[1];
        byArray6[0] = 3;
        byte[] byArray7 = sprqeg.cfr_renamed_6366(byArray6, byArray4);
        byte[] byArray8 = new byte[byArray7.length / 2 + byArray2.length / 2];
        System.arraycopy(byArray7, 0, byArray8, 0, byArray7.length / 2);
        System.arraycopy(byArray2, 0, byArray8, byArray7.length / 2, byArray2.length / 2);
        byte[] byArray9 = new byte[1];
        byArray9[0] = 2;
        byte[] byArray10 = sprqeg.cfr_renamed_6366(byArray9, byArray8);
        byte[] byArray11 = new byte[byArray5.length + byArray10.length / 2];
        System.arraycopy(byArray5, 0, byArray11, 0, byArray5.length);
        System.arraycopy(byArray10, 0, byArray11, byArray5.length, byArray10.length / 2);
        byte[] byArray12 = new byte[1];
        byArray12[0] = 3;
        byte[] byArray13 = sprqeg.cfr_renamed_6366(byArray12, byArray4);
        byte[] byArray14 = new byte[byArray13.length / 2 + byArray11.length];
        System.arraycopy(byArray13, 0, byArray14, 0, byArray13.length / 2);
        System.arraycopy(byArray11, 0, byArray14, byArray13.length / 2, byArray11.length);
        byte[] byArray15 = new byte[1];
        byArray15[0] = 1;
        byte[] byArray16 = sproze.cfr_renamed_533(sprqeg.cfr_renamed_6366(byArray15, byArray14), 0, spryeg2.cfr_renamed_6092() / 8);
        return new sprkjf(byArray16, byArray11);
    }
}

