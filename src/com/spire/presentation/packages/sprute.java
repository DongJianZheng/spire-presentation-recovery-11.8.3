/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlaq;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class sprute
extends sprkra {
    private sprooe cfr_renamed_2;
    private sprkme cfr_renamed_3;
    private sprtse cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4825(sprlre arg0, spra arg1) {
        if (arg1 != null) {
            arg0.cfr_renamed_49(arg1);
        }
    }

    public sprkme cfr_renamed_641() {
        return this.cfr_renamed_3;
    }

    public static sprute cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprute) {
            return (sprute)arg0;
        }
        if (arg0 != null) {
            return new sprute(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprute sprute2 = this;
        sprlre2.cfr_renamed_49(sprute2.cfr_renamed_3);
        sprute sprute3 = this;
        sprute3.cfr_renamed_4825(sprlre2, sprute3.cfr_renamed_2);
        sprute2.cfr_renamed_4825(sprlre2, sprute3.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprute(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_3 = sprkme.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            Object e = enumeration.nextElement();
            if (e instanceof sprooe) {
                this.cfr_renamed_2 = sprooe.cfr_renamed_23(e);
                continue;
            }
            this.cfr_renamed_4 = sprtse.cfr_renamed_23(e);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprute(sprkme sprkme2, sprooe sprooe2, sprtse sprtse2) {
        void arg2;
        void arg1;
        void arg0;
        if (sprkme2 == null) {
            throw new IllegalArgumentException(sprlaq.cfr_renamed_9("`;,\"\u0014?&?28\u000e%!$`k$*)%(?g)\"k)>+'"));
        }
        sprute sprute2 = this;
        sprute2.cfr_renamed_3 = arg0;
        sprute2.cfr_renamed_2 = arg1;
        this.cfr_renamed_4 = arg2;
    }

    public sprute(sprkme arg0) {
        this(arg0, null, null);
    }

    public sprooe cfr_renamed_4889() {
        return this.cfr_renamed_2;
    }

    public sprtse cfr_renamed_4890() {
        return this.cfr_renamed_4;
    }
}

