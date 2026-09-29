/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprwhh;

public class sprugh
extends sprfdh {
    public sprugh(sprszm arg0) {
        super(arg0);
    }

    public static sprugh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprugh) {
            return (sprugh)arg0;
        }
        if (arg0 instanceof sprfdh) {
            return new sprugh((sprfdh)arg0);
        }
        if (arg0 != null) {
            return new sprugh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprugh(sprvrg arg0, sprwhh arg1) {
        super(arg0, arg1);
    }

    private /* synthetic */ sprugh(sprfdh arg0) {
        super(arg0.cfr_renamed_5372(), arg0.cfr_renamed_4637());
    }
}

