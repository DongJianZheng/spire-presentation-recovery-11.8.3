/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprrge;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprnie
extends sprkra {
    private sprxue cfr_renamed_4;

    private /* synthetic */ sprnie(sprxue sprxue2) {
        this.cfr_renamed_4 = sprxue2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprnie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnie) {
            return (sprnie)arg0;
        }
        if (arg0 != null) {
            return new sprnie(sprxue.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnie(sprrlb sprrlb2) {
        void arg0;
        sprnie sprnie2 = this;
        sprnie2.cfr_renamed_4 = new sprlqe(sprrge.cfr_renamed_2512((sprrlb)arg0));
    }
}

