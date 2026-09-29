/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;

public class sprxje
extends sprkra {
    private sprice cfr_renamed_4;

    public static sprxje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxje) {
            return (sprxje)arg0;
        }
        if (arg0 != null) {
            return new sprxje(sprice.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxje(String string) {
        void arg0;
        sprxje sprxje2 = this;
        sprxje2.cfr_renamed_4 = new sprice((String)arg0);
    }

    public sprice cfr_renamed_4617() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    private /* synthetic */ sprxje(sprice sprice2) {
        this.cfr_renamed_4 = sprice2;
    }
}

