/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprvvja;
import com.spire.presentation.packages.sprzhp;
import java.util.Collections;

@sprtea
public class sprocp
extends sprzhp {
    @sprtea
    public int[] cfr_renamed_2;
    @sprtea
    public int[] cfr_renamed_3;
    @sprtea
    public int[] cfr_renamed_4;

    public static sprocp cfr_renamed_18882(sprujo arg0) {
        int n;
        int n2 = arg0.cfr_renamed_13218();
        int[] nArray = new int[n2];
        int[] nArray2 = new int[n2];
        int[] nArray3 = new int[n2];
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            int n4 = n;
            nArray[n] = arg0.cfr_renamed_13218();
            nArray2[n4] = arg0.cfr_renamed_13218();
            nArray3[n4] = arg0.cfr_renamed_13218();
            n3 = ++n;
        }
        sprocp sprocp2 = new sprocp();
        sprocp2.cfr_renamed_4 = nArray;
        sprocp2.cfr_renamed_2 = nArray2;
        sprocp2.cfr_renamed_3 = nArray3;
        return sprocp2;
    }

    @Override
    public int cfr_renamed_18872(int arg0) {
        int n = sprvvja.cfr_renamed_18923(sprvvja.cfr_renamed_11609(this.cfr_renamed_2), arg0);
        int n2 = n = n < 0 ? ~n : n;
        if (n >= this.cfr_renamed_18924() || (arg0 & 0xFFFF) < (this.cfr_renamed_4[n] & 0xFFFF)) {
            return -1;
        }
        return (this.cfr_renamed_3[n] & 0xFFFF) + (arg0 & 0xFFFF) - (this.cfr_renamed_4[n] & 0xFFFF);
    }

    private /* synthetic */ int cfr_renamed_18924() {
        return this.cfr_renamed_4.length;
    }

    @Override
    public Iterable cfr_renamed_18766() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_18924()) {
            int n3 = this.cfr_renamed_4[n];
            if ((n3 & 0xFFFF) <= (this.cfr_renamed_2[n] & 0xFFFF)) {
                return Collections.singleton(n3);
            }
            n2 = ++n;
        }
        return null;
    }
}

