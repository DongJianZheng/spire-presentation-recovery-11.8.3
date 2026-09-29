/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlh;

public class sprbhh
extends sprtlh {
    public sprbhh(sprmjh arg0) {
        super(arg0);
    }

    public sprbhh(sprszm arg0) {
        super(arg0);
    }

    public static sprbhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbhh) {
            return (sprbhh)arg0;
        }
        if (arg0 != null) {
            return new sprbhh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

