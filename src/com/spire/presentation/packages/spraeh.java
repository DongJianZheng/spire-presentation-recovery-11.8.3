/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprzgh;

public class spraeh
extends sprzgh {
    public spraeh(sprbvg arg0, sprmjh arg1) {
        super(arg0, arg1);
    }

    public static sprzgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzgh) {
            return (sprzgh)arg0;
        }
        if (arg0 != null) {
            return new spraeh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spraeh(sprszm arg0) {
        super(arg0);
    }
}

