/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class spruoe
extends sprkra {
    private sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static spruoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruoe) {
            return (spruoe)arg0;
        }
        if (arg0 != null) {
            return new spruoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ spruoe(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    public sprooe[][] cfr_renamed_4855() {
        int n;
        sprooe[][] sprooeArray = new sprooe[this.cfr_renamed_4.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 != sprooeArray.length) {
            int n3 = n++;
            sprooeArray[n3] = spruoe.cfr_renamed_4856((sprbne)this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprooeArray;
    }

    private static /* synthetic */ sprooe[] cfr_renamed_4856(sprbne arg0) {
        int n;
        sprooe[] sprooeArray = new sprooe[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprooeArray.length) {
            int n3 = n++;
            sprooeArray[n3] = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprooeArray;
    }

    /*
     * WARNING - void declaration
     */
    public spruoe(sprooe sprooe2) {
        this(new sprpse(new sprpse((spra)arg0)));
        void arg0;
    }
}

