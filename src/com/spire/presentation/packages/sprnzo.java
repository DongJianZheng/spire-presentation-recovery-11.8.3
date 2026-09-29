/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public class sprnzo {
    private int cfr_renamed_3;
    private long[] cfr_renamed_4;

    public static sprnzo cfr_renamed_18689(sprujo arg0, long arg1) {
        int n;
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        sprnzo sprnzo2 = new sprnzo();
        sprujo sprujo2 = arg0;
        new sprnzo().cfr_renamed_3 = sprujo2.cfr_renamed_13218();
        int n2 = sprujo2.cfr_renamed_13218();
        sprnzo2.cfr_renamed_4 = new long[n2];
        long[] lArray = sprnzo2.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            lArray[n++] = arg0.cfr_renamed_13220();
            n3 = n;
        }
        return sprnzo2;
    }
}

