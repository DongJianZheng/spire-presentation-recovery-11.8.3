/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;

public class spreae
extends sprkra {
    private sprcae cfr_renamed_2;
    private sprdce cfr_renamed_3;
    private sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spreae(sprbne sprbne2) {
        void arg0;
        spreae spreae2 = this;
        this.cfr_renamed_4 = arg0;
        spreae2.cfr_renamed_3 = sprdce.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(0));
        spreae2.cfr_renamed_2 = sprcae.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
    }

    public static spreae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreae) {
            return (spreae)arg0;
        }
        if (arg0 != null) {
            return new spreae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprcae cfr_renamed_2366() {
        return this.cfr_renamed_2;
    }

    public sprdce cfr_renamed_1489() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

