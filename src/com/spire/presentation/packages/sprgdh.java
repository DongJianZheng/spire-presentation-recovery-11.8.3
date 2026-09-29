/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwjh;

public class sprgdh
extends sprwjh {
    public sprgdh(sprszm arg0) {
        super(arg0);
    }

    public sprgdh(sprmjh arg0) {
        super(arg0);
    }

    public static sprgdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgdh) {
            return (sprgdh)arg0;
        }
        if (arg0 != null) {
            return new sprgdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

