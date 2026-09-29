/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class spreje
extends sprkra {
    public sprxue cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spreje(byte[] byArray) {
        this(new sprlqe((byte[])arg0));
        void arg0;
    }

    public static spreje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreje) {
            return (spreje)arg0;
        }
        if (arg0 != null) {
            return new spreje(sprxue.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprxue cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ spreje(sprxue sprxue2) {
        this.cfr_renamed_4 = sprxue2;
    }
}

