/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprqsia;
import com.spire.presentation.packages.sprxgi;

public class sprcaf
implements sprbj {
    private int[] cfr_renamed_3;
    private final int[] cfr_renamed_4;

    public int[] cfr_renamed_1139() {
        return this.cfr_renamed_3;
    }

    public sprcaf(int[] nArray) {
        int[] nArray2 = new int[5];
        nArray2[0] = 6;
        nArray2[1] = 12;
        nArray2[2] = 17;
        nArray2[3] = 22;
        nArray2[4] = 33;
        this.cfr_renamed_4 = nArray2;
        this.cfr_renamed_3 = nArray;
        this.cfr_renamed_1142();
    }

    public sprcaf() {
        sprcaf sprcaf2 = this;
        sprcaf sprcaf3 = this;
        int[] nArray = new int[5];
        nArray[0] = 6;
        nArray[1] = 12;
        nArray[2] = 17;
        nArray[3] = 22;
        nArray[4] = 33;
        sprcaf2.cfr_renamed_4 = nArray;
        sprcaf2.cfr_renamed_3 = sprcaf3.cfr_renamed_4;
    }

    public int cfr_renamed_1130() {
        sprcaf sprcaf2 = this;
        return sprcaf2.cfr_renamed_3[sprcaf2.cfr_renamed_3.length - 1] - this.cfr_renamed_3[0];
    }

    private /* synthetic */ void cfr_renamed_1142() {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalArgumentException(sprxgi.cfr_renamed_9("VF\u0018EYP][K\t\\L^@VL\\\u0007"));
        }
        if (this.cfr_renamed_3.length > 1) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_3.length - 1) {
                if (this.cfr_renamed_3[n] >= this.cfr_renamed_3[n + 1]) {
                    throw new IllegalArgumentException(sprqsia.cfr_renamed_9("#d<buW4LuK:\u001f7ZuL8^9S0MuK=^;\u001f#d<\u0014db"));
                }
                n2 = ++n;
            }
        } else {
            throw new IllegalArgumentException(sprxgi.cfr_renamed_9("jHQGZFO\tVL]MK\tY]\u0018E]HK]\u0018\u0018\u0018EYP][\u0014\tK\\[A\u0018]PHL\tN\u0018\u0018\u0015\u0018_\n\u0007"));
        }
    }

    public int cfr_renamed_1140() {
        return this.cfr_renamed_3.length - 1;
    }
}

