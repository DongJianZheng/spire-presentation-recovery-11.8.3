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

public class sprajh
extends sprxih {
    private /* synthetic */ sprajh(sprszm arg0) {
        super(arg0);
    }

    public sprajh(sprhmh arg0, sprvrg arg1, sprbvg arg2, sprvkh arg3) {
        super(arg0, arg1, sprbxm.cfr_renamed_4, arg2, arg3);
    }

    public static sprajh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprajh) {
            return (sprajh)arg0;
        }
        if (arg0 != null) {
            return new sprajh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

