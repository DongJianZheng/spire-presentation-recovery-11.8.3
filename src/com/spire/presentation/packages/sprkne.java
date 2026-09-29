/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkse;
import com.spire.presentation.packages.sprliy;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprkne
extends sprkra {
    private sprxue cfr_renamed_2;
    private sprkse cfr_renamed_3;
    private sprrpe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkne(byte[] byArray, sprrpe sprrpe2, sprkse sprkse2) {
        void arg1;
        void arg0;
        sprkne sprkne2 = this;
        sprkne sprkne3 = this;
        sprkne3.cfr_renamed_2 = new sprlqe((byte[])arg0);
        sprkne2.cfr_renamed_4 = arg1;
        sprkne2.cfr_renamed_3 = sprkse2;
    }

    public sprxue cfr_renamed_327() {
        return this.cfr_renamed_2;
    }

    public sprrpe cfr_renamed_110() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprkne sprkne2 = this;
        sprlre2.cfr_renamed_49(sprkne2.cfr_renamed_2);
        if (sprkne2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    public static sprkne cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprkne.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprkne cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprkne) {
            return (sprkne)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprkne((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlyy.cfr_renamed_9("@'\u007f(e miB\fB\u0000m,g=`/`,{s)")).append(arg0.getClass().getName()).toString());
    }

    public sprkse cfr_renamed_4836() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkne(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_2 = (sprxue)sprbne2.cfr_renamed_85(0);
        switch (arg0.cfr_renamed_84()) {
            case 1: {
                return;
            }
            case 2: {
                if (arg0.cfr_renamed_85(1) instanceof sprrpe) {
                    this.cfr_renamed_4 = (sprrpe)arg0.cfr_renamed_85(1);
                    return;
                }
                this.cfr_renamed_3 = sprkse.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            case 3: {
                this.cfr_renamed_4 = (sprrpe)arg0.cfr_renamed_85(1);
                this.cfr_renamed_3 = sprkse.cfr_renamed_23(arg0.cfr_renamed_85(2));
                return;
            }
        }
        throw new IllegalArgumentException(sprliy.cfr_renamed_9("j\u0003U\fO\u0004GMh(h$G\bM\u0019J\u000bJ\bQ"));
    }
}

