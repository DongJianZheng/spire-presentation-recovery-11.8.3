/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkyf;
import com.spire.presentation.packages.sprptf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwfl;

public class sprvtf {
    public static void cfr_renamed_6046(byte[] arg0, int arg1, long arg2, byte[] arg3, int arg4) {
        sprwfl sprwfl2;
        byte[] byArray = new byte[8];
        sprwfl sprwfl3 = sprwfl2 = new sprwfl(12);
        sprwfl3.cfr_renamed_5535(true, new sprkpk(new sprtpk(arg3, arg4, 32), byArray));
        sprwfl3.cfr_renamed_505(arg0, arg1, (int)arg2, arg0, arg1);
    }

    public static void cfr_renamed_6056(sprptf arg0, byte[] arg1, int arg2, byte[] arg3, sprkyf arg4) {
        int n;
        byte[] byArray = new byte[40];
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = n++;
            byArray[n3] = arg3[n3];
            n2 = n;
        }
        long l = arg4.cfr_renamed_2;
        l |= arg4.cfr_renamed_3 << 4;
        sprpxe.cfr_renamed_444(l |= arg4.cfr_renamed_4 << 59, byArray, 32);
        arg0.cfr_renamed_6064(arg1, arg2, byArray, byArray.length);
    }
}

