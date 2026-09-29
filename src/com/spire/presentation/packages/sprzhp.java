/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprocp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprzfp;

@sprtea
public abstract class sprzhp {
    /*
     * Enabled aggressive block sorting
     */
    public static sprzhp cfr_renamed_18689(sprujo arg0, long arg1) {
        sprujo sprujo2 = arg0;
        sprujo2.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        switch (sprujo2.cfr_renamed_13218()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 1: {
                return sprzfp.cfr_renamed_18882(arg0);
            }
            case 2: 
        }
        return sprocp.cfr_renamed_18882(arg0);
    }

    public static sprzhp[] cfr_renamed_18922(long arg0, int[] arg1, sprujo arg2) {
        int n;
        sprzhp[] sprzhpArray = new sprzhp[arg1.length];
        int n2 = n = 0;
        while (n2 < sprzhpArray.length) {
            int n3 = n;
            sprzhp sprzhp2 = sprzhp.cfr_renamed_18689(arg2, arg0 + (long)(arg1[n] & 0xFFFF));
            sprzhpArray[n3] = sprzhp2;
            n2 = ++n;
        }
        return sprzhpArray;
    }

    public abstract int cfr_renamed_18872(int var1);

    public abstract Iterable cfr_renamed_18766();
}

