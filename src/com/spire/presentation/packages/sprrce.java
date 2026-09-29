/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdty;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;

public class sprrce
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    public spra cfr_renamed_4665() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprrce(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdty.cfr_renamed_9("*r\f3\u001bv\u0019f\r}\u000bvH`\u0001i\r)H")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = (sprtzd)arg0.cfr_renamed_85(0);
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
    public sprrce(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprrce sprrce2 = this;
        sprrce2.cfr_renamed_3 = arg0;
        sprrce2.cfr_renamed_4 = spra2;
    }

    public static sprrce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrce) {
            return (sprrce)arg0;
        }
        if (arg0 != null) {
            return new sprrce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtzd cfr_renamed_4666() {
        return this.cfr_renamed_3;
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

