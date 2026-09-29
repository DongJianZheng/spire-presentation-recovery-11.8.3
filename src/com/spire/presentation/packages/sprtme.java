/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkte;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprole;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqse;
import com.spire.presentation.packages.sprrio;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprtme
extends sprkra {
    private sprqse cfr_renamed_2;
    private sprkte cfr_renamed_3;
    private sprole cfr_renamed_4;

    public sprole cfr_renamed_4898() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprtme(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_2 = sprqse.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() >= 2) {
            if (arg0.cfr_renamed_84() == 2) {
                spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(1));
                if (spryte2.cfr_renamed_312() == 0) {
                    this.cfr_renamed_3 = sprkte.cfr_renamed_23(spryte2.cfr_renamed_2456());
                    return;
                }
                this.cfr_renamed_4 = sprole.cfr_renamed_23(spryte2.cfr_renamed_2456());
                return;
            }
            sprbne sprbne3 = arg0;
            this.cfr_renamed_3 = sprkte.cfr_renamed_23(spryte.cfr_renamed_23(sprbne3.cfr_renamed_85(1)));
            this.cfr_renamed_4 = sprole.cfr_renamed_23(spryte.cfr_renamed_23(sprbne3.cfr_renamed_85(2)));
        }
    }

    public static sprtme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtme) {
            return (sprtme)arg0;
        }
        if (arg0 != null) {
            return new sprtme(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtme(sprqse arg0) {
        this(arg0, null, null);
    }

    public sprqse cfr_renamed_4899() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprtme sprtme2 = this;
        sprlre2.cfr_renamed_49(sprtme2.cfr_renamed_2);
        if (sprtme2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtme(sprqse sprqse2, sprkte sprkte2, sprole sprole2) {
        void arg2;
        void arg1;
        void arg0;
        if (sprqse2 == null) {
            throw new IllegalArgumentException(sprrio.cfr_renamed_9("d\"&37\u000e1\u0004-\"\u0000$15da  -/,5c#&a-4/-"));
        }
        sprtme sprtme2 = this;
        sprtme2.cfr_renamed_2 = arg0;
        sprtme2.cfr_renamed_3 = arg1;
        this.cfr_renamed_4 = arg2;
    }

    public sprkte cfr_renamed_1369() {
        return this.cfr_renamed_3;
    }
}

