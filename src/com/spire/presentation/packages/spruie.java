/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprieba;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruce;
import com.spire.presentation.packages.sprvva;

public class spruie
extends sprkra {
    private sprpee cfr_renamed_3;
    private spruce cfr_renamed_4;

    public sprpee cfr_renamed_4473() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spruie(spruce spruce2, sprpee sprpee2) {
        void arg0;
        spruie spruie2 = this;
        spruie2.cfr_renamed_4 = arg0;
        spruie2.cfr_renamed_3 = sprpee2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruie(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() == 2) {
            spruie spruie2 = this;
            spruie2.cfr_renamed_4 = spruce.cfr_renamed_23(arg0.cfr_renamed_85(0));
            spruie2.cfr_renamed_3 = sprpee.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        if (arg0.cfr_renamed_84() == 1) {
            if (arg0.cfr_renamed_85(0).cfr_renamed_119() instanceof sprbne) {
                this.cfr_renamed_4 = spruce.cfr_renamed_23(arg0.cfr_renamed_85(0));
                return;
            }
            this.cfr_renamed_3 = sprpee.cfr_renamed_23(arg0.cfr_renamed_85(0));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprieba.cfr_renamed_9("TSr\u0012eWgGs\\uW6A\u007fHs\b6")).append(arg0.cfr_renamed_84()).toString());
    }

    public spruce cfr_renamed_4474() {
        return this.cfr_renamed_4;
    }

    public spruie(spruce arg0, String arg1) {
        this(arg0, new sprpee(arg1));
    }

    public static spruie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruie) {
            return (spruie)arg0;
        }
        if (arg0 != null) {
            return new spruie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }
}

