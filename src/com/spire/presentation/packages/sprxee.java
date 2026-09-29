/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprypk;
import java.io.IOException;

public class sprxee
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    public sprtzd cfr_renamed_4667() {
        return this.cfr_renamed_3;
    }

    public static sprxee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxee) {
            return (sprxee)arg0;
        }
        if (arg0 != null) {
            return new sprxee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprxee(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprypk.cfr_renamed_9("N\rhL\u007f\t}\u0019i\u0002o\t,\u001fe\u0016iV,")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = new sprtzd(((sprtzd)arg0.cfr_renamed_85(0)).cfr_renamed_19());
        try {
            this.cfr_renamed_4 = sprvva.cfr_renamed_184(arg0.cfr_renamed_85(1).cfr_renamed_119().cfr_renamed_104("DER"));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalStateException();
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxee(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprxee sprxee2 = this;
        sprxee2.cfr_renamed_3 = arg0;
        sprxee2.cfr_renamed_4 = spra2;
    }

    public spra cfr_renamed_4668() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }
}

