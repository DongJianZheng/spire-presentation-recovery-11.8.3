/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprccha;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprgge
extends sprkra {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_3));
        if (this.cfr_renamed_1 == 0) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
        } else {
            sprlre sprlre3;
            sprlre sprlre4 = sprlre3 = new sprlre();
            sprlre4.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
            sprlre4.cfr_renamed_49(new sprooe(this.cfr_renamed_1));
            sprlre4.cfr_renamed_49(new sprooe(this.cfr_renamed_4));
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        }
        return new sprpse(sprlre2);
    }

    public sprgge(int arg0, int arg1) {
        this(arg0, arg1, 0, 0);
    }

    public int cfr_renamed_2115() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_2117() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_2116() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgge(sprbne sprbne2) {
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_3 = sprooe.cfr_renamed_23(v0.cfr_renamed_85(0)).cfr_renamed_162().intValue();
        if (v0.cfr_renamed_85(1) instanceof sprooe) {
            this.cfr_renamed_2 = ((sprooe)arg0.cfr_renamed_85(1)).cfr_renamed_162().intValue();
            return;
        }
        if (arg0.cfr_renamed_85(1) instanceof sprbne) {
            sprbne sprbne3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(1));
            sprgge sprgge2 = this;
            sprbne sprbne4 = sprbne3;
            this.cfr_renamed_2 = sprooe.cfr_renamed_23(sprbne4.cfr_renamed_85(0)).cfr_renamed_162().intValue();
            sprgge2.cfr_renamed_1 = sprooe.cfr_renamed_23(sprbne4.cfr_renamed_85(1)).cfr_renamed_162().intValue();
            sprgge2.cfr_renamed_4 = sprooe.cfr_renamed_23(sprbne3.cfr_renamed_85(2)).cfr_renamed_162().intValue();
            return;
        }
        throw new IllegalArgumentException(sprccha.cfr_renamed_9("\u000b1\u000e6\u0007'D#\u0005!\u00176D6\u0016!\u000b!"));
    }

    /*
     * WARNING - void declaration
     */
    public sprgge(int n, int n2, int n3, int n4) {
        void arg2;
        void arg1;
        void arg0;
        sprgge sprgge2 = this;
        sprgge sprgge3 = this;
        sprgge3.cfr_renamed_3 = arg0;
        sprgge3.cfr_renamed_2 = arg1;
        sprgge2.cfr_renamed_1 = arg2;
        sprgge2.cfr_renamed_4 = n4;
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_3;
    }

    public static sprgge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgge) {
            return (sprgge)arg0;
        }
        if (arg0 != null) {
            return new sprgge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

