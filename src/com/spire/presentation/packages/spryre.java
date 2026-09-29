/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzle;

public class spryre
extends sprkra {
    private sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static spryre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryre) {
            return (spryre)arg0;
        }
        if (arg0 != null) {
            return new spryre(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ spryre(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    public spryre(sprzle[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    public sprzle[] cfr_renamed_4860() {
        int n;
        sprzle[] sprzleArray = new sprzle[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprzleArray.length) {
            int n3 = n++;
            sprzleArray[n3] = sprzle.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprzleArray;
    }

    /*
     * WARNING - void declaration
     */
    public spryre(sprzle sprzle2) {
        void arg0;
        spryre spryre2 = this;
        spryre2.cfr_renamed_4 = new sprpse((spra)arg0);
    }
}

