/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class spryhe
extends sprkra {
    private sprrpe cfr_renamed_3;
    private sprrpe cfr_renamed_4;

    public sprrpe cfr_renamed_86() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ spryhe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            spryte spryte2 = (spryte)enumeration.nextElement();
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = sprrpe.cfr_renamed_341(spryte2, false);
                continue;
            }
            if (spryte2.cfr_renamed_312() != 1) continue;
            this.cfr_renamed_4 = sprrpe.cfr_renamed_341(spryte2, false);
        }
    }

    public static spryhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryhe) {
            return (spryhe)arg0;
        }
        if (arg0 != null) {
            return new spryhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    public sprrpe cfr_renamed_0() {
        return this.cfr_renamed_3;
    }
}

