/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprzgh;

public class sprsdh
extends sprzgh {
    public sprsdh(sprszm arg0) {
        super(arg0);
    }

    public sprsdh(sprbvg arg0, sprmjh arg1) {
        super(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprsdh(sprmjh sprmjh2) {
        super(new sprbvg(3), (sprmjh)arg0);
        void arg0;
    }

    public static sprsdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsdh) {
            return (sprsdh)arg0;
        }
        if (arg0 != null) {
            return new sprsdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

