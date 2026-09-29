/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkhfa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruce;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import java.util.Enumeration;

public class sprske
extends sprkra {
    private spruce cfr_renamed_3;
    private sprpee cfr_renamed_4;

    private /* synthetic */ sprske(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            spra spra2 = (spra)enumeration.nextElement();
            if (spra2 instanceof sprpee || spra2 instanceof sprx) {
                this.cfr_renamed_4 = sprpee.cfr_renamed_23(spra2);
                continue;
            }
            if (spra2 instanceof spruce || spra2 instanceof sprbne) {
                this.cfr_renamed_3 = spruce.cfr_renamed_23(spra2);
                continue;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprkhfa.cfr_renamed_9("<Z\u0003U\u0019]\u0011\u0014\u0010X\u0010Y\u0010Z\u0001\u0014\u001cZU\u0013&d G\u0010F;[\u0001]\u0016QR\u000eU")).append(spra2.getClass().getName()).toString());
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprske(spruce spruce2, sprpee sprpee2) {
        void arg0;
        sprske sprske2 = this;
        sprske2.cfr_renamed_3 = arg0;
        sprske2.cfr_renamed_4 = sprpee2;
    }

    public static sprske cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprske) {
            return (sprske)arg0;
        }
        if (arg0 != null) {
            return new sprske(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spruce cfr_renamed_4474() {
        return this.cfr_renamed_3;
    }

    public sprpee cfr_renamed_4473() {
        return this.cfr_renamed_4;
    }
}

