/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.sprvva;

public class sprvoe
extends sprkra {
    private sprooe[] cfr_renamed_2;
    private sprooe[] cfr_renamed_3;
    private sprtse[] cfr_renamed_4;

    public sprvoe(sprooe arg0, sprooe arg1) {
        this(arg0, arg1, null);
    }

    public static sprvoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvoe) {
            return (sprvoe)arg0;
        }
        if (arg0 != null) {
            return new sprvoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprooe cfr_renamed_4857(int arg0) {
        return this.cfr_renamed_2[arg0];
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.length) {
            sprlre sprlre3 = new sprlre();
            sprvoe sprvoe2 = this;
            sprlre3.cfr_renamed_49(this.cfr_renamed_3[n]);
            sprlre3.cfr_renamed_49(sprvoe2.cfr_renamed_2[n]);
            if (sprvoe2.cfr_renamed_4[n] != null) {
                sprlre3.cfr_renamed_49(this.cfr_renamed_4[n]);
            }
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
            n2 = ++n;
        }
        return new sprpse(sprlre2);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.length;
    }

    public sprtse cfr_renamed_4858(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    public sprooe cfr_renamed_4859(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvoe(sprbne sprbne2) {
        int n;
        void arg0;
        this.cfr_renamed_3 = new sprooe[sprbne2.cfr_renamed_84()];
        this.cfr_renamed_2 = new sprooe[arg0.cfr_renamed_84()];
        this.cfr_renamed_4 = new sprtse[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprbne sprbne3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(n));
            sprvoe sprvoe2 = this;
            sprvoe2.cfr_renamed_3[n] = sprooe.cfr_renamed_23(sprbne3.cfr_renamed_85(0));
            sprbne sprbne4 = sprbne3;
            sprvoe2.cfr_renamed_2[n] = sprooe.cfr_renamed_23(sprbne4.cfr_renamed_85(1));
            if (sprbne4.cfr_renamed_84() > 2) {
                this.cfr_renamed_4[n] = sprtse.cfr_renamed_23(sprbne3.cfr_renamed_85(2));
            }
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprvoe(sprooe sprooe2, sprooe sprooe3, sprtse sprtse2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3 = new sprooe[1];
        this.cfr_renamed_2 = new sprooe[1];
        this.cfr_renamed_4 = new sprtse[1];
        sprvoe sprvoe2 = this;
        sprvoe2.cfr_renamed_3[0] = arg0;
        sprvoe2.cfr_renamed_2[0] = arg1;
        sprvoe2.cfr_renamed_4[0] = arg2;
    }
}

