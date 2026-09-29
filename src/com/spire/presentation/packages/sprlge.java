/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;

public class sprlge
extends sprkra {
    private sprice cfr_renamed_4;

    public static sprlge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlge) {
            return (sprlge)arg0;
        }
        if (arg0 != null) {
            return new sprlge(sprice.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprlge(String string) {
        this(new sprice((String)arg0));
        void arg0;
    }

    private /* synthetic */ sprlge(sprice sprice2) {
        this.cfr_renamed_4 = sprice2;
    }

    public sprice cfr_renamed_4635() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }
}

