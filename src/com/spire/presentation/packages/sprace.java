/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class sprace
extends sprkra {
    public sprooe cfr_renamed_3;
    public spruhe cfr_renamed_4;

    public static sprace cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprace) {
            return (sprace)arg0;
        }
        if (arg0 != null) {
            return new sprace(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprace(sprbne sprbne2) {
        void arg0;
        sprace sprace2 = this;
        sprace2.cfr_renamed_4 = spruhe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprace2.cfr_renamed_3 = (sprooe)sprbne2.cfr_renamed_85(1);
    }

    public sprooe cfr_renamed_4602() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public spruhe cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprace(spruib spruib2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_4 = spruhe.cfr_renamed_23(spruib2.cfr_renamed_119());
        sprace sprace2 = this;
        this.cfr_renamed_3 = new sprooe((BigInteger)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprace(spruhe spruhe2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_4 = spruhe2;
        sprace sprace2 = this;
        this.cfr_renamed_3 = new sprooe((BigInteger)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprace(spruib spruib2, sprooe sprooe2) {
        void arg0;
        sprace sprace2 = this;
        sprace2.cfr_renamed_4 = spruhe.cfr_renamed_23(arg0.cfr_renamed_119());
        sprace2.cfr_renamed_3 = sprooe2;
    }
}

