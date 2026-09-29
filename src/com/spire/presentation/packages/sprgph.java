/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazaa;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprqqh;

public class sprgph
extends sprqqh {
    private final spreuh[] cfr_renamed_4;

    @Override
    public spreuh cfr_renamed_8701(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    private static /* synthetic */ spreuh[] cfr_renamed_8702(spreuh[] arg0, int arg1, int arg2) {
        int n;
        spreuh[] spreuhArray = new spreuh[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n++;
            spreuhArray[n3] = arg0[arg1 + n3];
            n2 = n;
        }
        return spreuhArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprgph(spreuh[] spreuhArray, int n, int n2) {
        void arg2;
        void arg1;
        this.cfr_renamed_4 = sprgph.cfr_renamed_8702(spreuhArray, (int)arg1, (int)arg2);
    }

    @Override
    public int cfr_renamed_2773() {
        return this.cfr_renamed_4.length;
    }

    @Override
    public spreuh cfr_renamed_4272(int arg0) {
        throw new UnsupportedOperationException(sprazaa.cfr_renamed_9("\u0010==!'3=&~&:?6r?=<9&\"s<<&s!&\"#=!&66"));
    }
}

