/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprkjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvwg;

public class sprvch
extends sprkjh {
    public sprvch(sprbvg arg0, sprgmh arg1, sprdfh arg2, sprvwg arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public static sprvch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvch) {
            return (sprvch)arg0;
        }
        if (arg0 != null) {
            return new sprvch(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvch(sprszm arg0) {
        super(arg0);
    }
}

