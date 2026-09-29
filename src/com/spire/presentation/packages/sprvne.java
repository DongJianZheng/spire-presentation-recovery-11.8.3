/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlrl;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprvne
extends sprkra {
    private spruzd cfr_renamed_3;
    private spruzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvne(spruzd spruzd2, spruzd spruzd3) {
        void arg0;
        void arg1;
        if (spruzd2 == null && arg1 == null) {
            throw new IllegalArgumentException(sprlrl.cfr_renamed_9("@\t\u0001\u0011D\u001cR\t\u0001\u0012O\u0018\u0001\u0012G]O\u0012U?D\u001bN\u000fDRO\u0012U<G\tD\u000f\u0001\u0010T\u000eU]O\u0012U]C\u0018\u0001\u0013T\u0011MS"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprvne(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            spryte spryte2 = (spryte)enumeration.nextElement();
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = spruzd.cfr_renamed_341(spryte2, true);
                continue;
            }
            this.cfr_renamed_4 = spruzd.cfr_renamed_341(spryte2, true);
        }
    }

    public spruzd cfr_renamed_86() {
        return this.cfr_renamed_4;
    }

    public spruzd cfr_renamed_0() {
        return this.cfr_renamed_3;
    }

    public static sprvne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvne) {
            return (sprvne)arg0;
        }
        if (arg0 != null) {
            return new sprvne(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

