/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.sprxgf;

public class sprqim
extends sprqqe {
    private sprszm cfr_renamed_4;

    private /* synthetic */ sprqim(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqim(spruem[] spruemArray) {
        void arg0;
        sprqim sprqim2 = this;
        sprqim2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    public static sprqim cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprqim.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public spruem[] cfr_renamed_82() {
        int n;
        spruem[] spruemArray = new spruem[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spruemArray.length) {
            int n3 = n++;
            spruemArray[n3] = spruem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return spruemArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprqim cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqim) {
            return (sprqim)arg0;
        }
        if (arg0 != null) {
            return new sprqim(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

