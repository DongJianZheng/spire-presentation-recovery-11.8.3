/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvnn;
import com.spire.presentation.packages.sprvp;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryx;

@sprtea
public class spryvm {
    public static sprwbp cfr_renamed_12601(spryx arg0, double arg1) {
        sprwbp sprwbp2 = spresca.cfr_renamed_11777(arg0, sprwbp.class);
        if (sprwbp2 != null) {
            return new sprwbp((int)(arg1 * 255.0), sprwbp2.cfr_renamed_3353(), sprwbp2.cfr_renamed_1145(), sprwbp2.cfr_renamed_1997());
        }
        sprvnn sprvnn2 = spresca.cfr_renamed_11777(arg0, sprvnn.class);
        if (sprvnn2 != null) {
            return new sprwbp(sprvnn2.cfr_renamed_12602() & 0xFF, sprvnn2.cfr_renamed_3353() & 0xFF, sprvnn2.cfr_renamed_1145() & 0xFF, sprvnn2.cfr_renamed_1997() & 0xFF);
        }
        return new sprwbp(0, 0, 0);
    }

    public static int cfr_renamed_12603(int arg0) {
        int n = 0;
        if ((arg0 & 2) != 0) {
            n |= 2;
        }
        if ((arg0 & 1) != 0) {
            n |= 1;
        }
        return n;
    }

    public static sprqgp cfr_renamed_12604(sprvp arg0) {
        return new sprqgp(arg0.cfr_renamed_1778(), arg0.cfr_renamed_1997(), arg0.cfr_renamed_3369(), arg0.cfr_renamed_2112(), arg0.cfr_renamed_3688(), arg0.cfr_renamed_5958());
    }
}

