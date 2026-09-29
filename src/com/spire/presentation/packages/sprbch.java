/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtmh;

public class sprbch
extends sprtmh {
    public sprbch(sprmjh arg0) {
        super(arg0);
    }

    public sprbch(sprszm arg0) {
        super(arg0);
    }

    public static sprbch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbch) {
            return (sprbch)arg0;
        }
        if (arg0 != null) {
            return new sprbch(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

