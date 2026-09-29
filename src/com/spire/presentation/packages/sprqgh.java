/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;

public class sprqgh
extends sprqqe {
    private final String cfr_renamed_4;

    public sprqgh(String string) {
        this.cfr_renamed_4 = string;
    }

    private /* synthetic */ sprqgh(sprupm sprupm2) {
        this.cfr_renamed_4 = sprupm2.cfr_renamed_314();
    }

    public static sprqgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqgh) {
            return (sprqgh)arg0;
        }
        if (arg0 != null) {
            return new sprqgh(sprupm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprnrm(this.cfr_renamed_4);
    }

    public String cfr_renamed_8433() {
        return this.cfr_renamed_4;
    }
}

