/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwje;

public class sprrfe
extends sprkra {
    public sprbne cfr_renamed_3;
    public sprbne cfr_renamed_4;

    public spriae[] cfr_renamed_4648() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        spriae[] spriaeArray = new spriae[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            spriaeArray[n3] = spriae.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return spriaeArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprrfe sprrfe2 = this;
        sprlre2.cfr_renamed_49(sprrfe2.cfr_renamed_3);
        if (sprrfe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public static sprrfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrfe) {
            return (sprrfe)arg0;
        }
        if (arg0 != null) {
            return new sprrfe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprrfe(sprwje sprwje2) {
        void arg0;
        sprrfe sprrfe2 = this;
        sprrfe2.cfr_renamed_3 = new sprpse((spra)arg0);
    }

    public sprwje[] cfr_renamed_626() {
        int n;
        sprwje[] sprwjeArray = new sprwje[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.cfr_renamed_84()) {
            int n3 = n++;
            sprwjeArray[n3] = sprwje.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprwjeArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrfe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("CBe\u0003rFpVdMbF!PhYd\u0019!")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }
}

