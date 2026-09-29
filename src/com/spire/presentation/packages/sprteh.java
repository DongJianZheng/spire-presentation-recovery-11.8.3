/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprteh
extends sprqqe {
    private final String cfr_renamed_4;

    public sprteh(String string) {
        this.cfr_renamed_4 = string;
    }

    public String cfr_renamed_3075() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprteh(sprml sprml2) {
        this.cfr_renamed_4 = sprml2.cfr_renamed_314();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new spraen(this.cfr_renamed_4);
    }

    public static sprteh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprteh) {
            return (sprteh)arg0;
        }
        if (arg0 != null) {
            return new sprteh(sprkgn.cfr_renamed_23(arg0));
        }
        return null;
    }
}

