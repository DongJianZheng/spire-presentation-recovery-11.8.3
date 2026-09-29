/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprreh;
import com.spire.presentation.packages.sprsdh;
import com.spire.presentation.packages.sprszm;

public class sprtlh
extends sprsdh {
    public sprtlh(sprszm arg0) {
        super(arg0);
    }

    public sprtlh(sprmjh arg0) {
        super(arg0);
    }

    public static sprtlh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprreh) {
            return (sprtlh)arg0;
        }
        if (arg0 != null) {
            return new sprtlh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

