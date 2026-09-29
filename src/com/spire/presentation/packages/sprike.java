/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprrbe;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;

public class sprike
extends sprkra {
    private boolean cfr_renamed_3;
    private sprrbe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_3) {
            return sprume.cfr_renamed_3;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprike() {
        this.cfr_renamed_3 = true;
    }

    public sprrbe cfr_renamed_4657() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_4658() {
        return this.cfr_renamed_3;
    }

    public static sprike cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprike) {
            return (sprike)arg0;
        }
        if (arg0 instanceof sprcre || sprike.cfr_renamed_4659(arg0, 5)) {
            return new sprike();
        }
        if (arg0 != null) {
            return new sprike(sprrbe.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprike(sprrbe sprrbe2) {
        void arg0;
        sprike sprike2 = this;
        sprike2.cfr_renamed_4 = arg0;
        sprike2.cfr_renamed_3 = false;
    }
}

