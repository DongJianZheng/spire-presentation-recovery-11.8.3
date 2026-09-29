/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbie;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprvva;

public class sprcee
extends sprkra {
    public sprbne cfr_renamed_3;
    public sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprcee sprcee2 = this;
        sprlre2.cfr_renamed_49(sprcee2.cfr_renamed_4);
        if (sprcee2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    public sprcee(sprbie[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    public static sprcee cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprcee) {
            return (sprcee)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprcee((sprbne)arg0);
        }
        return null;
    }

    public sprcee(sprbie[] arg0, spriae[] arg1) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
        if (arg1 != null) {
            sprlre2 = new sprlre();
            int n3 = n = 0;
            while (n3 < arg1.length) {
                sprlre2.cfr_renamed_49(arg1[n++]);
                n3 = n;
            }
            this.cfr_renamed_3 = new sprpse(sprlre2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcee(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrrd.cfr_renamed_9("\b\".c9&;6/-)&j0#9/yj")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprcee(sprbie sprbie2) {
        void arg0;
        sprcee sprcee2 = this;
        sprcee2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

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

    public sprbie[] cfr_renamed_626() {
        int n;
        sprbie[] sprbieArray = new sprbie[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprbieArray[n3] = sprbie.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprbieArray;
    }
}

