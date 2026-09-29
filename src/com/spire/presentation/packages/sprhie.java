/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.spride;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprhie
extends sprkra {
    public spride cfr_renamed_91;
    public sprtzd cfr_renamed_0;
    public sprszd cfr_renamed_1;
    public sprooe cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public sprnpe cfr_renamed_4;

    public sprnpe cfr_renamed_609() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhie(sprbne sprbne2) {
        int n;
        void arg0;
        sprhie sprhie2 = this;
        void v1 = arg0;
        int n2 = v1.cfr_renamed_84();
        int n3 = 0;
        sprhie2.cfr_renamed_3 = sprooe.cfr_renamed_23(v1.cfr_renamed_85(0));
        int n4 = ++n3;
        sprhie2.cfr_renamed_91 = spride.cfr_renamed_23(sprbne2.cfr_renamed_85(n4));
        int n5 = n = ++n3;
        while (n5 < n2) {
            spryte spryte2;
            if (arg0.cfr_renamed_85(n) instanceof sprtzd) {
                this.cfr_renamed_0 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (arg0.cfr_renamed_85(n) instanceof sprooe) {
                this.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (arg0.cfr_renamed_85(n) instanceof sprnpe) {
                this.cfr_renamed_4 = sprnpe.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (arg0.cfr_renamed_85(n) instanceof spryte && (spryte2 = (spryte)arg0.cfr_renamed_85(n)).cfr_renamed_312() == 0) {
                this.cfr_renamed_1 = sprszd.cfr_renamed_341(spryte2, false);
            }
            n5 = ++n;
        }
    }

    public sprooe cfr_renamed_596() {
        return this.cfr_renamed_2;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprhie(spride spride2, sprtzd sprtzd2, sprooe sprooe2, sprnpe sprnpe2, sprszd sprszd2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhie sprhie2 = this;
        sprhie sprhie3 = this;
        sprhie sprhie4 = this;
        this.cfr_renamed_3 = new sprooe(1L);
        this.cfr_renamed_91 = arg0;
        sprhie3.cfr_renamed_0 = arg1;
        sprhie3.cfr_renamed_2 = arg2;
        sprhie2.cfr_renamed_4 = arg3;
        sprhie2.cfr_renamed_1 = sprszd2;
    }

    public sprtzd cfr_renamed_608() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprhie sprhie2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprhie2.cfr_renamed_91);
        if (sprhie2.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_587()) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_1));
        }
        return new sprpse(sprlre2);
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_1;
    }

    public spride cfr_renamed_592() {
        return this.cfr_renamed_91;
    }

    public static sprhie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhie) {
            return (sprhie)arg0;
        }
        if (arg0 != null) {
            return new sprhie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

