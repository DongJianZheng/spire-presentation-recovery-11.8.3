/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtmh;

public class sprrch
extends sprtmh {
    public sprrch(sprmjh arg0) {
        super(arg0);
    }

    public sprrch(sprszm arg0) {
        super(arg0);
    }

    public static sprrch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrch) {
            return (sprrch)arg0;
        }
        if (arg0 != null) {
            return new sprrch(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

