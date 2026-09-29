/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprwhh;

public class sprimh
extends sprfdh {
    public sprimh(sprvrg arg0, sprwhh arg1) {
        super(arg0, arg1);
    }

    private /* synthetic */ sprimh(sprfdh arg0) {
        super(arg0.cfr_renamed_5372(), arg0.cfr_renamed_4637());
    }

    public sprimh(sprszm arg0) {
        super(arg0);
    }

    public static sprimh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprimh) {
            return (sprimh)arg0;
        }
        if (arg0 instanceof sprfdh) {
            return new sprimh((sprfdh)arg0);
        }
        if (arg0 != null) {
            return new sprimh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

