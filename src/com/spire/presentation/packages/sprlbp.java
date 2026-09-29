/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcp;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprzhp;

@sprtea
public class sprlbp {
    private sprzhp cfr_renamed_3;
    private sprbcp[] cfr_renamed_4;

    public sprzhp cfr_renamed_18871() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_18948(sprzhp arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public static sprlbp cfr_renamed_18689(sprujo arg0, long arg1) {
        int n;
        sprlbp sprlbp2 = new sprlbp();
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        sprujo sprujo2 = arg0;
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        int[] nArray = sprrzo.cfr_renamed_18661(sprujo2, n3 & 0xFFFF);
        sprlbp2.cfr_renamed_18948(sprzhp.cfr_renamed_18689(arg0, arg1 + (long)(n2 & 0xFFFF)));
        sprlbp2.cfr_renamed_4 = new sprbcp[n3];
        int n4 = n = 0;
        while (n4 < (n3 & 0xFFFF)) {
            arg0.cfr_renamed_14060().cfr_renamed_11547(arg1 + (long)(nArray[n] & 0xFFFF), 0);
            int n5 = arg0.cfr_renamed_13218();
            sprlbp2.cfr_renamed_4[n] = new sprbcp();
            sprbcp sprbcp2 = sprlbp2.cfr_renamed_4[n];
            sprbcp2.cfr_renamed_4 = sprrzo.cfr_renamed_18661(arg0, n5 & 0xFFFF);
            n4 = ++n;
        }
        return sprlbp2;
    }
}

