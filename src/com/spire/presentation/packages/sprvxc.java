/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpmd;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprrcd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprxf;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.OutputStream;

public class sprvxc {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_2890(sprsc arg0, sprmtc arg1, byte[] arg2) {
        int n;
        boolean bl;
        sprsc sprsc2 = arg0;
        sprpxc sprpxc2 = sprsc2.cfr_renamed_2824();
        boolean bl2 = false;
        byte[] byArray = new byte[48];
        sprsc2.cfr_renamed_2794().nextBytes(byArray);
        byte[] byArray2 = sprzra.cfr_renamed_158(byArray);
        try {
            sprpmd sprpmd2;
            sprpmd sprpmd3 = sprpmd2 = new sprpmd((sprh)new sprrcd(), byArray);
            sprpmd3.cfr_renamed_1217(false, new spraed(arg1, arg0.cfr_renamed_2794()));
            byArray2 = sprpmd3.cfr_renamed_1337(arg2, 0, arg2.length);
            bl = bl2;
        }
        catch (Exception exception) {
            bl = bl2;
        }
        if (bl && sprpxc2.cfr_renamed_2742(sprpxc.cfr_renamed_91)) {
            return byArray2;
        }
        int n2 = sprpxc2.cfr_renamed_2703() ^ byArray2[0] & 0xFF | sprpxc2.cfr_renamed_2704() ^ byArray2[1] & 0xFF;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        int n3 = ~((n2 & 1) - 1);
        int n4 = n = 0;
        while (n4 < 48) {
            byArray2[++n] = (byte)(byArray2[n] & ~n3 | byArray[n] & n3);
            n4 = n;
        }
        return byArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_2891(sprsc arg0, sprmtc arg1, OutputStream arg2) throws IOException {
        byte[] byArray = new byte[48];
        sprsc sprsc2 = arg0;
        sprsc2.cfr_renamed_2794().nextBytes(byArray);
        sprzsc.cfr_renamed_2702(sprsc2.cfr_renamed_2824(), byArray, 0);
        sprpmd sprpmd2 = new sprpmd(new sprrcd());
        sprpmd2.cfr_renamed_1217(true, new spraed(arg1, arg0.cfr_renamed_2794()));
        try {
            byte[] byArray2 = sprpmd2.cfr_renamed_1337(byArray, 0, byArray.length);
            if (sprzsc.cfr_renamed_2665(arg0)) {
                arg2.write(byArray2);
                return byArray;
            }
            sprzsc.cfr_renamed_2624(byArray2, arg2);
            return byArray;
        }
        catch (sprpjd sprpjd2) {
            throw new spryad(80);
        }
    }

    public static byte[] cfr_renamed_2591(sprsc arg0, sprxf arg1, byte[] arg2) throws IOException {
        return arg1.cfr_renamed_2892(arg2);
    }
}

