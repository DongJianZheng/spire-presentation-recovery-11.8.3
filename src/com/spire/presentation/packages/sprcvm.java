/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprcvm
extends sprqqe {
    public sproug cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sproug cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    public static sprcvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcvm) {
            return (sprcvm)arg0;
        }
        if (arg0 != null) {
            return new sprcvm(sproug.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprcvm(byte[] byArray) {
        this(new sprfvg((byte[])arg0));
        void arg0;
    }

    private /* synthetic */ sprcvm(sproug sproug2) {
        this.cfr_renamed_4 = sproug2;
    }
}

