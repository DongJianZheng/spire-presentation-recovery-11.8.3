/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprhmh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvkh;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxih;

public class sprzfh
extends sprxih {
    public sprzfh(sprhmh arg0, sprvrg arg1, sprbxm arg2, sprbvg arg3, sprvkh arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    public sprzfh(sprszm arg0) {
        super(arg0);
    }

    public static sprzfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzfh) {
            return (sprzfh)arg0;
        }
        if (arg0 != null) {
            return new sprzfh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

