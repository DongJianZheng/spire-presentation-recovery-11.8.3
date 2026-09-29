/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprood;
import java.io.IOException;

public class sprlpd {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_4239(sprdce arg0) {
        sprood sprood2 = new sprood();
        byte[] byArray = new byte[sprood2.cfr_renamed_1218()];
        byte[] byArray2 = new byte[]{};
        try {
            byArray2 = arg0.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return new byte[0];
        }
        sprood2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprood2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

