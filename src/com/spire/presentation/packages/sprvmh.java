/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwjh;

public class sprvmh
extends sprwjh {
    public sprvmh(sprmjh arg0) {
        super(arg0);
    }

    public sprvmh(sprszm arg0) {
        super(arg0);
    }

    public static sprvmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvmh) {
            return (sprvmh)arg0;
        }
        if (arg0 != null) {
            return new sprvmh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

