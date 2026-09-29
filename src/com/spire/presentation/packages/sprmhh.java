/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprhjh;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvwg;

public class sprmhh
extends sprhjh {
    public sprmhh(sprhjh arg0) {
        this(arg0.cfr_renamed_3(), arg0.cfr_renamed_324(), arg0.cfr_renamed_102(), arg0.cfr_renamed_8295(), arg0.cfr_renamed_79());
    }

    public sprmhh(sprbvg arg0, sprlgh arg1, sprgmh arg2, sprdfh arg3, sprvwg arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    public static sprmhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmhh) {
            return (sprmhh)arg0;
        }
        if (arg0 != null) {
            return new sprmhh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmhh(sprszm arg0) {
        super(arg0);
    }
}

