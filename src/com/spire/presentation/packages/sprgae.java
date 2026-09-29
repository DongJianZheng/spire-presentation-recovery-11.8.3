/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmdf;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryxaa;

public class sprgae
extends sprkra {
    private sprije cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public static sprgae cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgae) {
            return (sprgae)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprgae((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spryxaa.cfr_renamed_9("T)Q Z$QeR'W ^1\u001d,SeZ I\fS6I$S&X\u007f\u001d")).append(arg0.getClass().getName()).toString());
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgae(sprije sprije2, byte[] byArray) {
        void arg1;
        void arg0;
        sprgae sprgae2 = this;
        sprgae2.cfr_renamed_3 = arg0;
        sprgae2.cfr_renamed_4 = new byte[byArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_4));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgae(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmdf.cfr_renamed_9("\fI*\b=M?]+F-Mn['R+\u0012n")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprije.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprlqe.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_186();
    }

    public byte[] cfr_renamed_4637() {
        return this.cfr_renamed_4;
    }
}

