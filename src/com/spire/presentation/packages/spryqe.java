/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsoe;
import com.spire.presentation.packages.sprvva;

public class spryqe
extends sprkra {
    private sprbne cfr_renamed_4;

    public static spryqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryqe) {
            return (spryqe)arg0;
        }
        if (arg0 != null) {
            return new spryqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsoe[] cfr_renamed_4844() {
        int n;
        sprsoe[] sprsoeArray = new sprsoe[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprsoeArray.length) {
            int n3 = n++;
            sprsoeArray[n3] = sprsoe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprsoeArray;
    }

    public spryqe(sprsoe[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ spryqe(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    public spryqe(sprsoe sprsoe2) {
        void arg0;
        spryqe spryqe2 = this;
        spryqe2.cfr_renamed_4 = new sprpse((spra)arg0);
    }
}

