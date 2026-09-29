/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlee;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmvz;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprbke
extends sprkra {
    public sprbne cfr_renamed_3;
    public sprbne cfr_renamed_4;

    public spriae[] cfr_renamed_4648() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        spriae[] spriaeArray = new spriae[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.cfr_renamed_84()) {
            int n3 = n++;
            spriaeArray[n3] = spriae.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return spriaeArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbke(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmvz.cfr_renamed_9("f @aW$U4A/G$\u00042M;A{\u0004")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprlee[] cfr_renamed_626() {
        int n;
        sprlee[] sprleeArray = new sprlee[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprleeArray[n3] = sprlee.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprleeArray;
    }

    public static sprbke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbke) {
            return (sprbke)arg0;
        }
        if (arg0 != null) {
            return new sprbke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprbke sprbke2 = this;
        sprlre2.cfr_renamed_49(sprbke2.cfr_renamed_4);
        if (sprbke2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprbke(sprlee sprlee2) {
        void arg0;
        sprbke sprbke2 = this;
        sprbke2.cfr_renamed_4 = new sprpse((spra)arg0);
    }
}

