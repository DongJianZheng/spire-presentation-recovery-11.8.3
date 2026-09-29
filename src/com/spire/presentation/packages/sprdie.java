/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjsr;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpde;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsbe;
import com.spire.presentation.packages.sprvva;

public class sprdie
extends sprkra {
    private sprpde cfr_renamed_3;
    private sprsbe cfr_renamed_4;

    public sprdie(sprsbe arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprdie(sprsbe sprsbe2, sprpde sprpde2) {
        void arg0;
        sprdie sprdie2 = this;
        sprdie2.cfr_renamed_4 = arg0;
        sprdie2.cfr_renamed_3 = sprpde2;
    }

    public static sprdie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdie) {
            return (sprdie)arg0;
        }
        if (arg0 != null) {
            return new sprdie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprpde cfr_renamed_4670() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdie(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjsr.cfr_renamed_9("\u0019\u0010?Q(\u0014*\u0004>\u001f8\u0014{\u00022\u000b>K{")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprsbe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprpde.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprsbe cfr_renamed_4671() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        if (null != this.cfr_renamed_3) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }
}

