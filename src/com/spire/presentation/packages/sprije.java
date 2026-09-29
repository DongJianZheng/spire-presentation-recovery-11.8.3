/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhkaa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprije
extends sprkra {
    private boolean cfr_renamed_2;
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public static sprije cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprije.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprije cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprije) {
            return (sprije)arg0;
        }
        if (arg0 instanceof sprtzd) {
            return new sprije((sprtzd)arg0);
        }
        if (arg0 instanceof String) {
            return new sprije((String)arg0);
        }
        return new sprije(sprbne.cfr_renamed_23(arg0));
    }

    public sprije(sprtzd sprtzd2) {
        sprije sprije2 = this;
        sprije2.cfr_renamed_2 = false;
        sprije2.cfr_renamed_4 = sprtzd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprije(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprije sprije2 = this;
        sprije sprije3 = this;
        sprije3.cfr_renamed_2 = false;
        sprije3.cfr_renamed_2 = true;
        sprije2.cfr_renamed_4 = arg0;
        sprije2.cfr_renamed_3 = spra2;
    }

    public sprtzd cfr_renamed_90() {
        return this.cfr_renamed_4;
    }

    public spra cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    public sprtzd cfr_renamed_593() {
        return new sprtzd(this.cfr_renamed_4.cfr_renamed_19());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprije sprije2 = this;
        sprlre2.cfr_renamed_49(sprije2.cfr_renamed_4);
        if (sprije2.cfr_renamed_2) {
            if (this.cfr_renamed_3 != null) {
                sprlre2.cfr_renamed_49(this.cfr_renamed_3);
            } else {
                sprlre2.cfr_renamed_49(sprume.cfr_renamed_3);
            }
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprije(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_2 = false;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhkaa.cfr_renamed_9("J\u0013lR{\u0017y\u0007m\u001ck\u0017(\u0001a\bmH(")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() == 2) {
            sprije sprije2 = this;
            sprije2.cfr_renamed_2 = true;
            sprije2.cfr_renamed_3 = arg0.cfr_renamed_85(1);
            return;
        }
        this.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprije(String string) {
        void arg0;
        this.cfr_renamed_2 = false;
        sprije sprije2 = this;
        this.cfr_renamed_4 = new sprtzd((String)arg0);
    }
}

