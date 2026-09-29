/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprefg;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprtzd;

public class sproya {
    public static sprije cfr_renamed_1578(sprnld arg0) {
        sprtzd sprtzd2;
        int n = arg0.cfr_renamed_1521().length * 8;
        if (n == 128) {
            sprtzd2 = sprdg.cfr_renamed_185;
        } else if (n == 192) {
            sprtzd2 = sprdg.cfr_renamed_3;
        } else if (n == 256) {
            sprtzd2 = sprdg.cfr_renamed_91;
        } else {
            throw new IllegalArgumentException(sprefg.cfr_renamed_9("DoAfJbA#FfTpDyH#Dm\rBhP"));
        }
        return new sprije(sprtzd2);
    }
}

