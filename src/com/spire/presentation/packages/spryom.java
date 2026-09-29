/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class spryom
extends sprqqe {
    private sprqhm cfr_renamed_4;

    public sprqhm cfr_renamed_4635() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public static spryom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryom) {
            return (spryom)arg0;
        }
        if (arg0 != null) {
            return new spryom(sprqhm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spryom(String string) {
        this(new sprqhm((String)arg0));
        void arg0;
    }

    private /* synthetic */ spryom(sprqhm sprqhm2) {
        this.cfr_renamed_4 = sprqhm2;
    }
}

