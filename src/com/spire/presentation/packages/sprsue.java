/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdte;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.spryym;

public class sprsue
extends sprkra {
    private sprbne cfr_renamed_3;
    private sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsue(sprbne sprbne2) {
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_84() > 1) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_4 = sprbne.cfr_renamed_341(spryte2, true);
        }
        this.cfr_renamed_3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(n));
    }

    public static sprsue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsue) {
            return (sprsue)arg0;
        }
        if (arg0 != null) {
            return new sprsue(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtne[] cfr_renamed_4896() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprtne[] sprtneArray = new sprtne[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprtneArray.length) {
            int n3 = n++;
            sprtneArray[n3] = sprtne.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprtneArray;
    }

    public sprdte[] cfr_renamed_3262() {
        int n;
        sprdte[] sprdteArray = new sprdte[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprdteArray.length) {
            int n3 = n++;
            sprdteArray[n3] = sprdte.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprdteArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_4));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprsue(sprtne[] sprtneArray, sprdte[] sprdteArray) {
        void arg1;
        int n;
        sprlre sprlre2;
        void arg0;
        if (sprdteArray == null) {
            throw new IllegalArgumentException(spryym.cfr_renamed_9("Ru\u0010t\u0005h\u001bt\u0010 Ud\u0014i\u001bh\u0001'\u0017bUi\u0000k\u0019"));
        }
        if (arg0 != null) {
            sprlre2 = new sprlre();
            int n2 = n = 0;
            while (n2 < ((void)arg0).length) {
                sprlre2.cfr_renamed_49((spra)arg0[n++]);
                n2 = n;
            }
            this.cfr_renamed_4 = new sprpse(sprlre2);
        }
        sprlre2 = new sprlre();
        int n3 = n = 0;
        while (n3 < ((void)arg1).length) {
            sprlre2.cfr_renamed_49((spra)arg1[n++]);
            n3 = n;
        }
        this.cfr_renamed_3 = new sprpse(sprlre2);
    }
}

