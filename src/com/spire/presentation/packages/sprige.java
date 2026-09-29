/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprige
extends sprkra {
    private sprbne cfr_renamed_119;
    private sprooe cfr_renamed_91;
    private static final sprooe cfr_renamed_0 = new sprooe(0L);
    private boolean cfr_renamed_1;
    private sprszd cfr_renamed_2;
    private sprrpe cfr_renamed_3;
    private sprkae cfr_renamed_4;

    public sprbne cfr_renamed_4280() {
        return this.cfr_renamed_119;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public sprszd cfr_renamed_4278() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_1 || !this.cfr_renamed_91.equals(cfr_renamed_0)) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_91));
        }
        sprlre sprlre3 = sprlre2;
        sprige sprige2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprige2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(sprige2.cfr_renamed_119);
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    public sprrpe cfr_renamed_4279() {
        return this.cfr_renamed_3;
    }

    public static sprige cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprige.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprige cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprige) {
            return (sprige)arg0;
        }
        if (arg0 != null) {
            return new sprige(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprkae cfr_renamed_4277() {
        return this.cfr_renamed_4;
    }

    public sprige(sprkae arg0, sprrpe arg1, sprbne arg2, sprude arg3) {
        this(cfr_renamed_0, arg0, sprrpe.cfr_renamed_23(arg1), arg2, sprszd.cfr_renamed_23(arg3));
    }

    public sprige(sprkae arg0, sprrpe arg1, sprbne arg2, sprszd arg3) {
        this(cfr_renamed_0, arg0, arg1, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public sprige(sprooe sprooe2, sprkae sprkae2, sprrpe sprrpe2, sprbne sprbne2, sprszd sprszd2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprige sprige2 = this;
        sprige sprige3 = this;
        this.cfr_renamed_91 = arg0;
        sprige3.cfr_renamed_4 = arg1;
        sprige3.cfr_renamed_3 = arg2;
        sprige2.cfr_renamed_119 = arg3;
        sprige2.cfr_renamed_2 = sprszd2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprige(sprbne sprbne2) {
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_85(0) instanceof spryte) {
            if (((spryte)arg0.cfr_renamed_85(0)).cfr_renamed_312() == 0) {
                sprige sprige2 = this;
                sprige2.cfr_renamed_1 = true;
                ++n;
                sprige2.cfr_renamed_91 = sprooe.cfr_renamed_341((spryte)arg0.cfr_renamed_85(0), true);
            } else {
                this.cfr_renamed_91 = cfr_renamed_0;
            }
        } else {
            this.cfr_renamed_91 = cfr_renamed_0;
        }
        sprige sprige3 = this;
        void v2 = arg0;
        this.cfr_renamed_4 = sprkae.cfr_renamed_23(arg0.cfr_renamed_85(n));
        sprige3.cfr_renamed_3 = sprrpe.cfr_renamed_23(v2.cfr_renamed_85(++n));
        sprige3.cfr_renamed_119 = (sprbne)v2.cfr_renamed_85(++n);
        if (arg0.cfr_renamed_84() > ++n) {
            this.cfr_renamed_2 = sprszd.cfr_renamed_341((spryte)arg0.cfr_renamed_85(n), true);
        }
    }
}

