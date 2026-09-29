/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtmh;

public class sprwmh
extends sprtmh {
    public sprwmh(sprszm arg0) {
        super(arg0);
    }

    public sprwmh(sprmjh arg0) {
        super(arg0);
    }

    public static sprwmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwmh) {
            return (sprwmh)arg0;
        }
        if (arg0 != null) {
            return new sprwmh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

