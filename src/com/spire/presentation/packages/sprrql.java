/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdvl;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;

public class sprrql {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_10886(sprvhm arg0) {
        sprdvl sprdvl2 = new sprdvl();
        byte[] byArray = new byte[sprdvl2.cfr_renamed_1218()];
        byte[] byArray2 = new byte[]{};
        try {
            byArray2 = arg0.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return new byte[0];
        }
        sprdvl2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprdvl2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

