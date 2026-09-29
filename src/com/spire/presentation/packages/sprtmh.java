/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprsdh;
import com.spire.presentation.packages.sprszm;

public class sprtmh
extends sprsdh {
    public sprtmh(sprmjh arg0) {
        super(arg0);
    }

    public static sprtmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtmh) {
            return (sprtmh)arg0;
        }
        if (arg0 != null) {
            return new sprtmh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtmh(sprszm arg0) {
        super(arg0);
    }
}

