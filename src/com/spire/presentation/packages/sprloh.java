/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravh;
import com.spire.presentation.packages.sprcph;
import com.spire.presentation.packages.sprcxh;
import com.spire.presentation.packages.sprdrh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprmoh;
import com.spire.presentation.packages.sprnph;
import com.spire.presentation.packages.sprqsh;
import java.math.BigInteger;

public class sprloh
extends sprcph {
    public static final String cfr_renamed_4 = "bc_wtnaf";

    private /* synthetic */ sprdrh cfr_renamed_8625(sprdrh arg0, sprmoh arg1, byte arg2, byte arg3) {
        sprmoh[] sprmohArray = arg2 == 0 ? spravh.cfr_renamed_119 : spravh.cfr_renamed_3;
        BigInteger bigInteger = spravh.cfr_renamed_1785(arg3, 4);
        byte[] byArray = spravh.cfr_renamed_8626(arg3, arg1, 4, bigInteger.intValue(), sprmohArray);
        return sprloh.cfr_renamed_8627(arg0, byArray);
    }

    private static /* synthetic */ sprdrh cfr_renamed_8627(sprdrh arg0, byte[] arg1) {
        int n;
        int n2;
        sprqsh sprqsh2;
        sprqsh sprqsh3 = sprqsh2 = (sprqsh)arg0.cfr_renamed_1769();
        byte by = sprqsh3.cfr_renamed_1778().cfr_renamed_1779().byteValue();
        sprdrh[] sprdrhArray = ((sprnph)sprqsh3.cfr_renamed_8628(arg0, cfr_renamed_4, new sprcxh(arg0, by))).cfr_renamed_1777();
        sprdrh[] sprdrhArray2 = new sprdrh[sprdrhArray.length];
        int n3 = n2 = 0;
        while (n3 < sprdrhArray.length) {
            int n4 = n2++;
            sprdrhArray2[n4] = (sprdrh)sprdrhArray[n4].cfr_renamed_1773();
            n3 = n2;
        }
        sprdrh sprdrh2 = (sprdrh)arg0.cfr_renamed_1769().cfr_renamed_1770();
        int n5 = 0;
        int n6 = n = arg1.length - 1;
        while (n6 >= 0) {
            ++n5;
            byte by2 = arg1[n];
            if (by2 != 0) {
                sprdrh2 = sprdrh2.cfr_renamed_8629(n5);
                n5 = 0;
                sprdrh sprdrh3 = by2 > 0 ? sprdrhArray[by2 >>> 1] : sprdrhArray2[-by2 >>> 1];
                sprdrh2 = (sprdrh)sprdrh2.cfr_renamed_8630(sprdrh3);
            }
            n6 = --n;
        }
        if (n5 > 0) {
            sprdrh2 = sprdrh2.cfr_renamed_8629(n5);
        }
        return sprdrh2;
    }

    @Override
    public spreuh cfr_renamed_8631(spreuh arg0, BigInteger arg1) {
        sprqsh sprqsh2;
        if (!(arg0 instanceof sprdrh)) {
            throw new IllegalArgumentException(sprhnn.cfr_renamed_9("S\rp\u001a<&_3s\nr\u00172\"~\u0010h\u0011}\u0000h%.\u000e<\u0000}\r<\u0001yCi\u0010y\u0007<\nrCK7}\u0016R\u0002z.i\u000fh\nl\u000fu\u0006n"));
        }
        sprdrh sprdrh2 = (sprdrh)arg0;
        sprqsh sprqsh3 = sprqsh2 = (sprqsh)sprdrh2.cfr_renamed_1769();
        byte by = sprqsh3.cfr_renamed_1778().cfr_renamed_1779().byteValue();
        byte by2 = spravh.cfr_renamed_8632(by);
        sprmoh sprmoh2 = spravh.cfr_renamed_8633(sprqsh3, arg1, by, by2, (byte)10);
        return this.cfr_renamed_8625(sprdrh2, sprmoh2, by, by2);
    }
}

