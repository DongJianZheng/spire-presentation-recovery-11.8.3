/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;

public class spryfh
extends sprqqe {
    private final String cfr_renamed_4;

    private /* synthetic */ spryfh(sprupm sprupm2) {
        this.cfr_renamed_4 = sprupm2.cfr_renamed_314();
    }

    public String cfr_renamed_8433() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprnrm(this.cfr_renamed_4);
    }

    public static spryfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryfh) {
            return (spryfh)arg0;
        }
        if (arg0 != null) {
            return new spryfh(sprupm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spryfh(String string) {
        this.cfr_renamed_4 = string;
    }
}

