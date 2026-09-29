/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtyo;
import com.spire.presentation.packages.sprujo;

@sprtea
public class sprkvo
extends sprtyo {
    public static sprkvo cfr_renamed_18689(sprujo arg0, long arg1) {
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        int n = arg0.cfr_renamed_13218();
        sprkvo sprkvo2 = new sprkvo();
        long[] lArray = new long[n];
        int[] nArray = new int[n];
        int n2 = 0;
        int n3 = n2;
        while (n3 < (n & 0xFFFF)) {
            int n4 = n2++;
            lArray[n4] = arg0.cfr_renamed_13220();
            nArray[n4] = arg0.cfr_renamed_13218();
            n3 = n2;
        }
        int n5 = n2 = 0;
        while (n5 < (n & 0xFFFF)) {
            sprgzo sprgzo2 = sprgzo.cfr_renamed_18689(arg0, arg1 + (long)(nArray[n2] & 0xFFFF));
            sprgzo2.cfr_renamed_18695(lArray[n2]);
            long l = lArray[n2];
            sprkvo2.cfr_renamed_12160(l, sprgzo2);
            n5 = ++n2;
        }
        return sprkvo2;
    }

    private /* synthetic */ sprkvo() {
    }

    public sprgzo cfr_renamed_18618(long arg0) {
        Object object = null;
        Object[] objectArray = new sprgzo[1];
        objectArray[0] = object;
        Object[] objectArray2 = objectArray;
        boolean bl = this.cfr_renamed_12146(arg0, objectArray2);
        object = objectArray2[0];
        if (bl) {
            return object;
        }
        return null;
    }
}

