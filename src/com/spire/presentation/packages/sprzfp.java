/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprvvja;
import com.spire.presentation.packages.sprzhp;

@sprtea
public class sprzfp
extends sprzhp {
    @sprtea
    public int[] cfr_renamed_4;

    public static sprzfp cfr_renamed_18882(sprujo arg0) {
        sprujo sprujo2 = arg0;
        int[] nArray = sprrzo.cfr_renamed_18661(sprujo2, sprujo2.cfr_renamed_13218() & 0xFFFF);
        new sprzfp().cfr_renamed_4 = nArray;
        return new sprzfp();
    }

    @Override
    public Iterable cfr_renamed_18766() {
        return sprvvja.cfr_renamed_11609(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_18872(int arg0) {
        int n = sprvvja.cfr_renamed_18923(sprvvja.cfr_renamed_11609(this.cfr_renamed_4), arg0);
        if (n < 0) {
            return -1;
        }
        return n;
    }
}

